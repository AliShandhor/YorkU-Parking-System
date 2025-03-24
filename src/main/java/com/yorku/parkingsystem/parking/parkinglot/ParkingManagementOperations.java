package com.yorku.parkingsystem.parking.parkinglot;

import com.yorku.parkingsystem.parking.parkinglot.parkingspot.ParkingSpot;

public interface ParkingManagementOperations {
    // add, enable, disable parking lots
    void enableParkingLot(ParkingLot parkingLot);
    void disableParkingLot(ParkingLot parkingLot);
    void addParkingLot(ParkingLot parkingLot);

    // enable or disable a parking space due to maintenance issues
    void enableParkingSpot(ParkingSpot parkingSpot);
    void disableParkingSpot(ParkingSpot parkingSpot);
    void addParkingSpace(ParkingLot parkingLot, ParkingSpot parkingSpot);
}