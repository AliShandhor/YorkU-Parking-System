package com.yorku.parkingsystem.parking.parkinglot;

import com.yorku.parkingsystem.parking.parkinglot.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.parking.parkinglot.parkingspot.ParkingSpotBuilder;

import java.util.Date;

public class SensorMain {
    public static void main(String[] args) {
        // Create a ParkingSpot using ParkingSpotBuilder
        ParkingSpotBuilder builder = new ParkingSpotBuilder();
        ParkingSpot parkingSpot = builder
                .setLocation("Level 1, Zone A")
                .setAvailability(true)
                .build();

        // Create a Sensor object
        Sensor sensor = new Sensor();

        // Detect if a car is using the parking space
         sensor.detectCar(parkingSpot);

        // Send the essential information to the system
        sensor.sendInfoToSystem(parkingSpot);
    }
}