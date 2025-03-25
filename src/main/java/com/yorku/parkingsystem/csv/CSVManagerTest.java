package com.yorku.parkingsystem.csv;

import com.yorku.parkingsystem.csv.CSVManager;
import com.yorku.parkingsystem.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.parkingspot.ParkingSpotBuilder;
import com.yorku.parkingsystem.system.ParkingSystem;
import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CSVManagerTest {
    public static void main(String[] args) {
        CSVManager csvManager = CSVManager.getInstance();

        // Create ParkingSpot objects using ParkingSpotBuilder
        ParkingSpot parkingSpot1 = new ParkingSpotBuilder()
                .setParkingSpotID(1)
                .setLocation("Level 1, Zone A")
                .setAvailability(true)
                .setBookingID(101)
                .setBookingTime(new Date())
                .setDuration(60)
                .setStatus("Available")
                .setPrice(10.0f)
                .build();

        ParkingSpot parkingSpot2 = new ParkingSpotBuilder()
                .setParkingSpotID(2)
                .setLocation("Level 2, Zone B")
                .setAvailability(false)
                .setBookingID(102)
                .setBookingTime(new Date())
                .setDuration(120)
                .setStatus("Booked")
                .setPrice(15.0f)
                .build();

        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(parkingSpot1);
        parkingSpots.add(parkingSpot2);

        // Write ParkingSpot data to CSV
        csvManager.writeParkingSpots(parkingSpots);

        // Read ParkingSpot data from CSV
        List<ParkingSpot> readSpots = csvManager.readParkingSpots();
        System.out.println("Read ParkingSpots from CSV:");
        for (ParkingSpot spot : readSpots) {
            System.out.println(spot);
        }

        // Create User objects
        User user1 = UserFactory.getUser("REGULAR", 1, "John Doe", "ABC123");
        User user2 = UserFactory.getUser("VIP", 2, "Jane Smith", "XYZ789");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        // Write Users to CSV
        csvManager.writeUsers(users);

        // Read Users from CSV
        List<User> readUsers = csvManager.readUsers();
        System.out.println("\nRead Users from CSV:");
        for (User user : readUsers) {
            System.out.println(user);
        }

        // Create ParkingSystem and associate Users with ParkingSpots
        ParkingSystem parkingSystem = new ParkingSystem();
        parkingSystem.addUserParkingSpot(user1, parkingSpot1);
        parkingSystem.addUserParkingSpot(user2, parkingSpot2);

        // Write ParkingSystem data to CSV
        csvManager.writeParkingSystem(parkingSystem);

        // Read ParkingSystem data from CSV
        ParkingSystem readParkingSystem = csvManager.readParkingSystem();
        System.out.println("\nRead ParkingSystem from CSV:");
        System.out.println(readParkingSystem);
    }
}
