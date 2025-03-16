package com.yorku.parkingsystem.parkingsystem;

import com.yorku.parkingsystem.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.user.User;

import java.util.HashMap;
import java.util.Map.Entry;

public class ParkingSystem {
    public HashMap<User, ParkingSpot> parkingSystem;

    public ParkingSystem() {
        parkingSystem = new HashMap<>();
    }

    // Method to display information about each parking spot and user
    public void displayInfo() {
        System.out.println("============All User & Spots details============");
        for (Entry<User, ParkingSpot> entry : parkingSystem.entrySet()) {
            User key = entry.getKey();
            ParkingSpot spot = entry.getValue();
            System.out.println("User ID: " + key.getUserID());
            System.out.println(spot);
        }
    }

    public void addUserParkingSpot(User user, ParkingSpot parkingSpot){
        parkingSystem.put(user, parkingSpot);
    }

}
