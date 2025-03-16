package com.yorku.parkingsystem.parkingdetails;

import java.util.ArrayList;
import java.util.Date;

public class ParkingDetails {
    private final ArrayList<ParkingSpot> parkingDetails;

    public ParkingDetails() {
        this.parkingDetails = new ArrayList<>(); // Initialize the ArrayList
    }

//    public void addParkingSpot(int parkingSpotID, String location) {
//        ParkingSpot parkingSpot = new ParkingSpot.Builder(parkingSpotID, location).build();
//        parkingDetails.add(parkingSpot);
//    }

    public ArrayList<ParkingSpot> getParkingDetails() {
        return parkingDetails;
    }


}