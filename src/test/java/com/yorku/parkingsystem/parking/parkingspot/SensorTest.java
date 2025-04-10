package com.yorku.parkingsystem.parking.parkingspot;

import com.yorku.parkingsystem.parking.Sensor;
import com.yorku.parkingsystem.user.Booking;
import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class SensorTest {

    private Sensor sensor;

    @BeforeEach
    void setUp() {
        sensor = new Sensor();
    }

    @Test
    void testSensorInitialState() {
        // Initially no car is detected and car info is empty.
        assertFalse(sensor.isCarPresent(), "Sensor should initially not detect a car");
        assertTrue(sensor.getCarInfo().isEmpty(), "Car info should initially be empty");
    }

    @Test
    void testDetectCar_WhenParkingSpotNotAvailable() {
        // Create a ParkingSpot that is not available.
        ParkingSpotBuilder builder = new ParkingSpotBuilder();
        ParkingSpot spot = builder.setLocation("TestLocation")
                .setAvailability(false)
                .build();
        spot.setEnabled(true);

        // Use additional ParkingSpot methods:
        spot.setBelongedToParkingLot(true);
        assertTrue(spot.isBelongedToParkingLot(), "Parking spot should indicate it belongs to a parking lot");
        String spotDetails = spot.toString();
        assertNotNull(spotDetails, "toString() should not return null");
        assertTrue(spotDetails.contains("TestLocation"), "toString() should include the location");

        sensor.detectCar(spot);
        assertTrue(sensor.isCarPresent(), "Sensor should detect a car when parking spot is not available");
    }

    @Test
    void testDetectCar_WhenParkingSpotAvailable() {
        // Create a ParkingSpot that is available.
        ParkingSpotBuilder builder = new ParkingSpotBuilder();
        ParkingSpot spot = builder.setLocation("TestLocation")
                .setAvailability(true)
                .build();
        spot.setEnabled(true);

        // Use more methods: call getLocation() and assert its value.
        assertEquals("TestLocation", spot.getLocation(), "getLocation() should return the correct location");
        spot.setBelongedToParkingLot(false);
        assertFalse(spot.isBelongedToParkingLot(), "Parking spot should not indicate belonging to a parking lot");

        sensor.detectCar(spot);
        assertFalse(sensor.isCarPresent(), "Sensor should not detect a car when parking spot is available");
    }

    @Test
    void testScanCarInfo_WhenCarDetected() {
        // Simulate detection of a car by using a not available parking spot.
        ParkingSpotBuilder builder = new ParkingSpotBuilder();
        ParkingSpot spot = builder.setLocation("TestLocation")
                .setAvailability(false)
                .build();
        spot.setEnabled(true);
        // Use additional methods from ParkingSpot:
        spot.setBelongedToParkingLot(true);
        // Call shotDetails() and capture its output to ensure that method works.
        ByteArrayOutputStream shotOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(shotOut));
        spot.shotDetails();
        System.setOut(originalOut);
        String shotDetailsOutput = shotOut.toString();
        assertTrue(shotDetailsOutput.contains("TestLocation"), "shotDetails() output should contain the location");

        sensor.detectCar(spot);

        // Create a registered user and a Booking.
        User user = UserFactory.getUser("VISITOR", "TestUser", "TEST123", "test@example.com", "TestPass");
        user.register(true);
        Date bookingTime = new Date();
        Booking booking = new Booking(spot, 1, user, bookingTime, 2);

        sensor.scanCarInfo(booking);

        String expectedInfo = "User ID: " + user.getUserID() + ", " +
                "License Plate: " + user.getLicensePlate() + ", " +
                "Booking ID: " + booking.getBookingID();
        assertEquals(expectedInfo, sensor.getCarInfo(), "Car info should be set correctly when car is detected");
    }

    @Test
    void testScanCarInfo_WhenNoCarDetected() {
        // Without detecting a car, scanning should leave carInfo empty.
        // Use ParkingSpot methods to demonstrate usage.
        ParkingSpotBuilder builder = new ParkingSpotBuilder();
        ParkingSpot spot = builder.setLocation("DummyLocation")
                .setAvailability(true)
                .build();
        spot.setEnabled(false);
        spot.setBelongedToParkingLot(false);

        // Capture shotDetails() output.
        ByteArrayOutputStream shotOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(shotOut));
        spot.shotDetails();
        System.setOut(originalOut);
        String detailsOutput = shotOut.toString();
        assertTrue(detailsOutput.contains("DummyLocation"), "shotDetails() output should include location");

        sensor.scanCarInfo(null);
        assertTrue(sensor.getCarInfo().isEmpty(), "Car info should remain empty when no car is detected");
    }

    @Test
    void testSendInfoToSystem_WhenDataIsPresent() {
        // Capture System.out output.
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Prepare sensor with detected car and car info.
        ParkingSpotBuilder builder = new ParkingSpotBuilder();
        ParkingSpot spot = builder.setLocation("TestLocation")
                .setAvailability(false)
                .build();
        spot.setEnabled(true);
        spot.setBelongedToParkingLot(true);
        sensor.detectCar(spot);

        // Use an additional ParkingSpot method:
        assertEquals("TestLocation", spot.getLocation(), "getLocation() should return TestLocation");

        User user = UserFactory.getUser("VISITOR", "TestUser", "TEST123", "test@example.com", "TestPass");
        user.register(true);
        Date bookingTime = new Date();
        Booking booking = new Booking(spot, 1, user, bookingTime, 2);
        sensor.scanCarInfo(booking);

        // Call toString() on ParkingSpot and verify it contains the location.
        String spotStr = spot.toString();
        assertTrue(spotStr.contains("TestLocation"), "toString() should include the location of the parking spot");

        // Now send the info to the system.
        sensor.sendInfoToSystem(spot);

        // Restore original System.out.
        System.setOut(originalOut);

        String output = outContent.toString();
        assertTrue(output.contains("Sending info to system for Parking Spot ID: " + spot.getParkingSpotID()),
                "Output should contain sending info message");
        assertTrue(output.contains("Data Sent: " + sensor.getCarInfo()),
                "Output should contain the data sent message");
    }

    @Test
    void testSendInfoToSystem_WhenNoData() {
        // Capture System.out output when there is no data.
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Create a ParkingSpot and use some getters to ensure its methods are used.
        ParkingSpotBuilder builder = new ParkingSpotBuilder();
        ParkingSpot spot = builder.setLocation("TestLocation")
                .setAvailability(true)
                .build();
        spot.setEnabled(false);
        spot.setBelongedToParkingLot(false);

        assertEquals("TestLocation", spot.getLocation(), "getLocation() should return TestLocation");
        assertTrue(spot.isAvailable(), "isAvailable() should return true as set");
        assertFalse(spot.isEnabled(), "isEnabled() should return false as set");

        sensor.sendInfoToSystem(spot);

        // Restore original System.out.
        System.setOut(originalOut);

        String output = outContent.toString();
        assertTrue(output.contains("No data to send."),
                "Output should indicate no data to send when sensor has no car info");
    }
}
