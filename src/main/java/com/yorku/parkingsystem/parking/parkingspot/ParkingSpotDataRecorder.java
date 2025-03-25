package com.yorku.parkingsystem.parking.parkingspot;

import java.util.ArrayList;

public class ParkingSpotDataRecorder {
    // Singleton Pattern Implemented here
    private final ArrayList<ParkingSpot> parkingSpots;

    // Private static instance of ParkingSpotDataRecorder
    private static ParkingSpotDataRecorder instance;

    // Private constructor to prevent instantiation from outside
    private ParkingSpotDataRecorder() {
        this.parkingSpots = new ArrayList<>(); // Initialize the ArrayList
    }

    // Public static method to provide access to the instance
    public static ParkingSpotDataRecorder getInstance() {
        if (instance == null) {
            instance = new ParkingSpotDataRecorder();
        }
        return instance;
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }

    public void displayParkingSpotDetails(int parkingSpotID) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.getParkingSpotID() == parkingSpotID) {
                System.out.println(parkingSpot);
                return;
            }
        }
        // If no parking spot with the given ID is found
        System.out.println("Parking spot with ID " + parkingSpotID + " not found.");
    }

    public void displayAllParkingSpotsDetails() {
        if (parkingSpots.isEmpty()) {
            System.out.println("No parking spots have been added.");
        }
        for (ParkingSpot parkingSpot : parkingSpots) {
            System.out.println(parkingSpot);
        }
    }

    public ArrayList<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}
