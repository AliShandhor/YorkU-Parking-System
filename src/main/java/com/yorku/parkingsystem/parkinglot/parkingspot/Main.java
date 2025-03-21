package com.yorku.parkingsystem.parkinglot.parkingspot;

import com.yorku.parkingsystem.system.ParkingSystem;
import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creating parking system object
        ParkingSystem parkingSystem = new ParkingSystem();

        // Getting the Singleton instance of ParkingSpotDataRecorder
        ParkingSpotDataRecorder parkingSpotDataRecorder = ParkingSpotDataRecorder.getInstance();

        // Creating the first ParkingSpot using ParkingSpotBuilder
        ParkingSpotBuilder builder1 = new ParkingSpotBuilder();
        ParkingSpot parkingSpot1 = builder1.setParkingSpotID(101)
                .setLocation("Level 1, Zone A")
                .setAvailability(true)
                .setBookingTime(new Date())
                .setDuration(2)
                .setStatus("Booked")
                .build();

        // Creating the second ParkingSpot using ParkingSpotBuilder
        ParkingSpotBuilder builder2 = new ParkingSpotBuilder();
        ParkingSpot parkingSpot2 = builder2.setParkingSpotID(102)
                .setLocation("Level 2, Zone B")
                .setAvailability(true)
                .setBookingTime(new Date())
                .setDuration(3)
                .setStatus("Available")
                .build();

        System.out.println("Displaying using parking spot id: 102");
        parkingSpotDataRecorder.displayParkingSpotDetails(102);
        System.out.println("Displaying all parking spot details");
        // Display all parking spot details from the ParkingSpotDataRecorder
        parkingSpotDataRecorder.displayAllParkingSpotsDetails();

        // Creating and adding users to the parking system
        User user1 = UserFactory.getUser("STUDENT", 1, "Ali Shandhor", "CWFZ 520");
        parkingSystem.addUserParkingSpot(user1, parkingSpot1);

        User user2 = UserFactory.getUser("VISITOR", 2, "Uzma Alam", "ASW 234");
        parkingSystem.addUserParkingSpot(user2, parkingSpot2);

        // Display user and parking spot information
        parkingSystem.displayInfo();
    }
}
