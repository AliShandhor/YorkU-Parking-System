package com.yorku.parkingsystem.parking.parkingspot;

import com.yorku.parkingsystem.parking.ParkingComponent;

public class ParkingSpot implements ParkingComponent {

    private final int parkingSpotID;
    private String location;
    private ParkingComponent parkingLot;
    private boolean isAvailable;
    private boolean isBelongedToParkingLot;
    private boolean isEnabled;
    private static int idCounter = 0; // Static counter for unique ID generation


    public ParkingSpot() {
        this.parkingSpotID = ++idCounter; // Assign unique ID
    }

    @Override
    public void shotDetails() {
        System.out.println("Parking Spot ID: " + parkingSpotID);
        System.out.println("Location: " + location);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("Belonged to Parking Lot: " + (isBelongedToParkingLot ? "Yes" : "No"));
    }

    public void setParkingLot(ParkingComponent parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void setBelongedToParkingLot(boolean belongedToParkingLot) {
        isBelongedToParkingLot = belongedToParkingLot;
    }

    public boolean isBelongedToParkingLot() {
        return isBelongedToParkingLot;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    // Getters and setters...
    public int getParkingSpotID() {
        return parkingSpotID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ParkingComponent getParkingLot() {
        return parkingLot;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "ParkingSpot details: " +
                "\n  parkingSpotID=" + parkingSpotID +
                ",\n  location='" + location + '\'' +
                ",\n  parkingLot=" + parkingLot +
                ",\n  isAvailable=" + isAvailable +
                "\n";
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
    public static void resetIDCounter() {
        idCounter = 0;
    }

}