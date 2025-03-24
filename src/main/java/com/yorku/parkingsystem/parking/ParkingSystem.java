package com.yorku.parkingsystem.parking;

import com.yorku.parkingsystem.parking.parkinglot.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.user.User;
import java.util.HashMap;
import java.util.Map.Entry;
// Super manager auto account generation (only 1)
// Parking System Managers (for parking system management)

public class ParkingSystem {
    public HashMap<User, ParkingSpot> parkingSystem;

    public ParkingSystem() {
        parkingSystem = new HashMap<User, ParkingSpot>();
    }

    // Method to display information about each parking spot and user
    public void displayInfo() {
        if (parkingSystem.isEmpty()) {
            System.out.println("No user has reserved any parking spot yet.");
            return;
        }
        System.out.println("============All User & Parking Spots details============");
        for (Entry<User, ParkingSpot> entry : parkingSystem.entrySet()) {
            User key = entry.getKey();
            ParkingSpot parkingSpot = entry.getValue();
            System.out.println("User ID: " + key.getUserID() + " \tName: " + key.getName());
            System.out.println(parkingSpot);
            System.out.println("=========================================================");
        }
    }


    public void reserveParkingSpotForUser(User user, ParkingSpot parkingSpot){
        // check if the parking spot does not belong to any parking lot
        if (parkingSpot.getParkingLot() == null) {
            throw new IllegalArgumentException("This parking spot: '" +  parkingSpot  + "'\ndoes not belong to any parking lot.");
        }

        // check if the user is not registered
        if (!user.isRegistered()){
            throw new IllegalArgumentException("User '" + user.getName() +"' must be registered to use the parking system.");
        }
        // After reserving the parking spot to a user, set the availability to false
        parkingSpot.setAvailability(false);
        parkingSystem.put(user, parkingSpot);
    }

    // Unreserve a parking spot for a user
    public void unreserveParkingSpotForUser(User user) {
        // Check if the user has a reserved parking spot
        if (!parkingSystem.containsKey(user)) {
            throw new IllegalArgumentException("User '" + user.getName() + "' does not have any reserved parking spot.");
        }

        // Get the parking spot associated with the user
        ParkingSpot parkingSpot = parkingSystem.get(user);

        // Set the parking spot's availability back to true
        parkingSpot.setAvailability(true);

        // Remove the user and their reserved parking spot from the system
        parkingSystem.remove(user);
        System.out.println("Parking spot has been successfully unreserved for user: " + user.getName());
    }
}

