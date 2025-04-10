package com.yorku.parkingsystem.csvwriter;

import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.parking.parkinglot.ParkingLot;
import com.yorku.parkingsystem.parking.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.parking.parkingspot.ParkingSpotBuilder;
import com.yorku.parkingsystem.user.Booking;
import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CSVWritingTest {

    private CSVWriting csvWriting;

    @BeforeEach
    void setUp() {
        csvWriting = CSVWriting.getInstance();
        // Reset ID counters for predictable output.
        ParkingLot.resetIDCounter();
        ParkingSpot.resetIDCounter();

        // Delete CSV files from previous test runs.
        deleteFile("super_manager.csv");
        deleteFile("management_teams.csv");
        deleteFile("parking_lots.csv");
        deleteFile("parking_spots.csv");
        deleteFile("users_data.csv");
        deleteFile("bookings.csv");
    }

    @AfterEach
    void tearDown() {
        // Clean up created CSV files after tests.
        deleteFile("super_manager.csv");
        deleteFile("management_teams.csv");
        deleteFile("parking_lots.csv");
        deleteFile("parking_spots.csv");
        deleteFile("users_data.csv");
        deleteFile("bookings.csv");
    }

    private void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testWriteSuperManager() throws IOException {
        SuperManager superManager = SuperManager.getSuperManagerInstance("Jane Doe", "jane@doe.com", "pass456");
        csvWriting.writeSuperManager(superManager);

        File file = new File("super_manager.csv");
        assertTrue(file.exists(), "super_manager.csv should be created");

        List<String> lines = Files.readAllLines(Paths.get("super_manager.csv"));
        // Verify header and data.
        assertEquals("Name,Email,Password", lines.get(0).trim(), "Header should match");
        assertEquals("Jane Doe,jane@doe.com,pass456", lines.get(1).trim(), "Data should match");
    }

    @Test
    void testWriteManagementTeams() throws IOException {
        SuperManager superManager = SuperManager.getSuperManagerInstance("Jane Doe", "jane@doe.com", "pass456");
        ManagementTeam managementTeam = new ManagementTeam();
        // Register the management team using the provided SuperManager method.
        superManager.generateManagementTeamAccount(managementTeam);

        List<ManagementTeam> teams = new ArrayList<>();
        teams.add(managementTeam);
        csvWriting.writeManagementTeams(teams, superManager);

        File file = new File("management_teams.csv");
        assertTrue(file.exists(), "management_teams.csv should be created");

        List<String> lines = Files.readAllLines(Paths.get("management_teams.csv"));
        assertEquals("TeamID,TeamName,Password,SuperManagerName", lines.get(0).trim(), "Header should match");
        String teamLine = lines.get(1).trim();
        assertTrue(teamLine.contains(superManager.getSuperManagerName()),
                "Data line should contain super manager name");
    }

    @Test
    void testWriteParkingLots() throws IOException {
        // Create a ParkingLot using the proper constructor.
        ParkingLot lot = new ParkingLot("Lot1", "Location1");
        List<ParkingLot> lots = Collections.singletonList(lot);
        csvWriting.writeParkingLots(lots);

        File file = new File("parking_lots.csv");
        assertTrue(file.exists(), "parking_lots.csv should be created");

        List<String> lines = Files.readAllLines(Paths.get("parking_lots.csv"));
        assertEquals("ParkingLotID,Name,Location", lines.get(0).trim(), "Header should match");
        // With resetIDCounter() called, the first ParkingLot should have ID 1.
        String expectedData = "1,Lot1,Location1";
        assertEquals(expectedData, lines.get(1).trim(), "Data should match");
    }

    @Test
    void testWriteParkingSpots() throws IOException {
        // Create a ParkingLot and enable it so that parking spots can be added.
        ParkingLot lot = new ParkingLot("Lot2", "Location2");
        lot.setIsEnabled(true);

        // Create a ParkingSpot using the builder.
        ParkingSpotBuilder builder = new ParkingSpotBuilder();
        ParkingSpot spot = builder.setLocation("SpotLocation")
                .setAvailability(true)
                .build();
        spot.setEnabled(true);
        // Add the parking spot to the lot so it is associated with the lot.
        lot.addParkingSpot(spot);

        List<ParkingSpot> spots = Collections.singletonList(spot);
        csvWriting.writeParkingSpots(spots);

        File file = new File("parking_spots.csv");
        assertTrue(file.exists(), "parking_spots.csv should be created");

        List<String> lines = Files.readAllLines(Paths.get("parking_spots.csv"));
        String headerExpected = "ParkingSpotID,Location,IsAvailable,IsBelongedToParkingLot,IsEnabled,ParkingLotID,ParkingLotName,ParkingLotLocation";
        assertEquals(headerExpected, lines.get(0).trim(), "Header should match");

        // After adding, the ParkingSpot should have:
        // - a unique ID (reset to 1),
        // - its location as "SpotLocation",
        // - available set to true,
        // - isBelongedToParkingLot set to true via lot.addParkingSpot(),
        // - enabled true,
        // - and the associated ParkingLot details (ID 1, "Lot2", "Location2").
        String dataExpected = "1,SpotLocation,true,true,true,1,Lot2,Location2";
        assertEquals(dataExpected, lines.get(1).trim(), "Data should match");
    }

    @Test
    void testWriteUsers() throws IOException {
        User user = UserFactory.getUser("STUDENT", "Alice", "ABC123", "alice@yorku.com", "alicePass1$");
        List<User> users = Collections.singletonList(user);
        csvWriting.writeUsers(users);

        File file = new File("users_data.csv");
        assertTrue(file.exists(), "users_data.csv should be created");

        List<String> lines = Files.readAllLines(Paths.get("users_data.csv"));
        String headerExpected = "UserID,Name,ClientType,LicensePlate,Email,Password,RatePerHour";
        assertEquals(headerExpected, lines.get(0).trim(), "Header should match");
        // Update expected client type to "Student" and rate to 5.0
        String dataExpected = user.getUserID() + ",Alice,Student,ABC123,alice@yorku.com,alicePass1$,5.0";
        assertEquals(dataExpected, lines.get(1).trim(), "Data should match");
    }


    @Test
    void testWriteBookings() throws IOException {
        // Create a registered user.
        User user = UserFactory.getUser("VISITOR", "Bob", "XYZ789", "bob@yorku.com", "bobPass!2");
        user.register(true);
        // Create a ParkingLot and enable it.
        ParkingLot lot = new ParkingLot("Lot3", "Location3");
        lot.setIsEnabled(true);
        // Create a ParkingSpot using the builder and add it to the lot.
        ParkingSpotBuilder builder = new ParkingSpotBuilder();
        ParkingSpot spot = builder.setLocation("Spot2")
                .setAvailability(false)
                .build();
        spot.setEnabled(true);
        lot.addParkingSpot(spot);

        // Create a fixed booking time (using deprecated constructor for testing purposes).
        // The Date constructor: new Date(year-1900, month, date, hrs, min).
        @SuppressWarnings("deprecation")
        Date bookingTime = new Date(125, 3, 10, 10, 0); // Represents April 10, 2025, 10:00 AM.
        // Create a booking with bookingID 1 and a duration of 1 hour.
        Booking booking = new Booking(spot, 1, user, bookingTime, 1);

        List<Booking> bookings = Collections.singletonList(booking);
        csvWriting.writeBookings(bookings);

        File file = new File("bookings.csv");
        assertTrue(file.exists(), "bookings.csv should be created");

        List<String> lines = Files.readAllLines(Paths.get("bookings.csv"));
        String headerExpected = "BookingID,UserID,UserName,ParkingSpotID,BookingTime,Duration,NoShow,Checkin";
        assertEquals(headerExpected, lines.get(0).trim(), "Header should match");

        // Build expected data string using actual object values.
        String dataExpected = booking.getBookingID() + "," +
                user.getUserID() + "," +
                user.getName() + "," +
                spot.getParkingSpotID() + "," +
                booking.getBookingTime().toString() + "," +
                booking.getDuration() + "," +
                booking.isNoShow() + "," +
                booking.isCheckin();
        assertEquals(dataExpected, lines.get(1).trim(), "Data should match");
    }
}
