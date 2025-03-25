package com.yorku.parkingsystem.parking.parkinglot;

import com.yorku.parkingsystem.parking.ParkingComponent;
import com.yorku.parkingsystem.parking.parkingspot.ParkingSpot;

import java.util.ArrayList;

public class ParkingLot implements ParkingComponent {
    private static int idCounter = 0; // Static counter for unique ID generation
    private final int parkingLotID;
    private final String Name;
    private final String location;
    private final int parkingSpotsTotal;
    private int availableParkingSpots;
    private int notAvailableParkingSpots;
    private boolean isEnabled;

    private ArrayList<ParkingComponent> parkingSpots = new ArrayList<>(); // leafs

    public ParkingLot(String parkingLotName, String location) {
        this.parkingLotID = ++idCounter; // Assign unique ID
        this.Name = parkingLotName;
        this.location = location;
        this.parkingSpotsTotal = 100;
        this.availableParkingSpots = parkingSpotsTotal;
        this.notAvailableParkingSpots = 0;
    }

    public void modifyParkingSpotsTotal(int parkingSpotsTotal) {
        if (parkingSpotsTotal > 100) {
            System.out.println("Parking spots total cannot be more than 100");
            return;
        }
        this.availableParkingSpots = parkingSpotsTotal;
    }

    public void setIsEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "ID=" + parkingLotID +
                ", Name='" + Name + '\'' +
                ", location='" + location + '\'' +
                ", parkingSpotsTotal=" + parkingSpotsTotal +
                ", availableParkingSpots=" + availableParkingSpots +
                ", notAvailableParkingSpots=" + notAvailableParkingSpots +
                '}';
    }

    @Override
    public void shotDetails() {
        System.out.println(this); // Parking Lot details
        for (ParkingComponent parkingSpot : parkingSpots) {
            parkingSpot.shotDetails();
            System.out.println("====================================");
        }
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        // check if parking lot is enabled
        if (!this.isEnabled){
            System.out.println("Parking lot is not enabled. You cannot add parking spots. : Managers of the system can add, enable, or disable a parking lot. ");
            return;
        }

        // check if there are available parking spots
        if (availableParkingSpots == 0) {
            System.out.println("No available parking spots in this parking lot. You cannot add more parking spots.");
            return;
        }

        parkingSpot.setBelongedToParkingLot(true);
        parkingSpot.setParkingLot(this);

        parkingSpots.add(parkingSpot);
        availableParkingSpots--;
        notAvailableParkingSpots++;
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {

        // Check if the parking lot is enabled
        if (!isEnabled) {
            System.out.println("Parking lot is not enabled. You cannot remove parking spots.");
            return;
        }
        // check not available parking spots before removing
        if (notAvailableParkingSpots == 0) {
            System.out.println("No parking spots to remove.");
            return;
        }

        // Ensure the parking spot exists in the parking lot before attempting to remove
        if (!parkingSpots.contains(parkingSpot)) {
            System.out.println("The parking spot does not belong to this parking lot.");
            return;
        }


        // Remove the parking spot from parking lot
        parkingSpots.remove(parkingSpot);
        parkingSpot.setParkingLot(null);
        parkingSpot.setBelongedToParkingLot(false);

        availableParkingSpots++;
        notAvailableParkingSpots--;
    }

    public int getAvailableParkingSpots() {
        return availableParkingSpots;
    }

    public int getNotAvailableParkingSpots() {
        return notAvailableParkingSpots;
    }

    public int getParkingLotID() {
        return parkingLotID;
    }

    public int getParkingSpotsTotal() {
        return parkingSpotsTotal;
    }

    public String getLocation() {
        return location;
    }


    public String getName() {
        return Name;
    }

    public ArrayList<ParkingComponent> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(ArrayList<ParkingComponent> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

}