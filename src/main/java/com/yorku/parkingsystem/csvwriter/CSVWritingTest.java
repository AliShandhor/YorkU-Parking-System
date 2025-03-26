package com.yorku.parkingsystem.csvwriter;

import com.yorku.parkingsystem.management.ClientRegistration;
import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.parking.parkinglot.ParkingLot;
import com.yorku.parkingsystem.parking.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.parking.parkingspot.ParkingSpotBuilder;
import com.yorku.parkingsystem.user.Booking;
import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CSVWritingTest {
    public static void main(String[] args) {
        // Singelton pattern for CSVWriting
        CSVWriting csvWriting = CSVWriting.getInstance();
        SuperManager superManager = SuperManager.getSuperManagerInstance("Gias Uddin", "gias.uddin@yorku.com", "eecs3311$SoftwareDesign");

        List<ManagementTeam> managementTeams = new ArrayList<>();
        ManagementTeam managementTeam1 = new ManagementTeam();
        ManagementTeam managementTeam2 = new ManagementTeam();

        superManager.generateManagementTeamAccount(managementTeam1);
        superManager.generateManagementTeamAccount(managementTeam2);

        managementTeams.add(managementTeam1);
        managementTeams.add(managementTeam2);

        List<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot1 = new ParkingLot("Parking Lot 1", "Keele Campus");
        ParkingLot parkingLot2 = new ParkingLot("Parking Lot 2", "Markham Campus");
        parkingLots.add(parkingLot1);
        parkingLots.add(parkingLot2);

        List<ParkingSpot> parkingSpots = new ArrayList<>();
        ParkingSpot parkingSpot1 = new ParkingSpotBuilder()
                .setLocation("Level 1, Zone A")
                .setAvailability(true)
                .build();
        ParkingSpot parkingSpot2 = new ParkingSpotBuilder()
                .setLocation("Level 2, Zone B")
                .setAvailability(true)
                .build();
        parkingSpots.add(parkingSpot1);
        parkingSpots.add(parkingSpot2);


        managementTeam1.enableParkingLot(parkingLot1);
        managementTeam2.enableParkingLot(parkingLot2);

        parkingLot1.addParkingSpot(parkingSpot1);
        parkingLot2.addParkingSpot(parkingSpot2);

        List<User> users = new ArrayList<>();
        User student = UserFactory.getUser("Student", "Ali Shandhor", "CWFZ590", "a.shanzoor@yorku.com", "Ali05585852454$");
        User facultyMember = UserFactory.getUser("FacultyMember", "Uzma Alam", "SDKE2312", "uzma.alam@yorku.com", "UzAlam123456789$");
        users.add(student);
        users.add(facultyMember);

        ClientRegistration clientRegistration = new ClientRegistration();

        clientRegistration.registerClient(student, managementTeam1);
        clientRegistration.registerClient(facultyMember, managementTeam2);

        csvWriting.writeSuperManager(superManager);
        csvWriting.writeManagementTeams(managementTeams, superManager);
        csvWriting.writeParkingLots(parkingLots);
        csvWriting.writeParkingSpots(parkingSpots);
        csvWriting.writeUsers(users);

        // Create Booking objects
        Date bookingTime = new Date();
        Booking booking1 = new Booking(parkingSpot1, 5001, student, bookingTime, 2);
        Booking booking2 = new Booking(parkingSpot2, 5002, facultyMember, bookingTime, 2);

        // Add bookings to a list
        List<Booking> bookings = new ArrayList<>();
        bookings.add(booking1);
        bookings.add(booking2);

        // Write bookings to CSV
        csvWriting.writeBookings(bookings);

        System.out.println("CSV files have been created successfully.");

    }
}