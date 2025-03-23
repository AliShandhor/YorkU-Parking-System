package com.yorku.parkingsystem.parking.parkinglot;

import com.yorku.parkingsystem.parking.parkinglot.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.user.Booking;

public class Sensor {
    private boolean isCarPresent;
    private String carInfo;

    public Sensor() {
        this.isCarPresent = false;
        this.carInfo = "";
    }

    // detect if a car is using the parking space
    public void detectCar(ParkingSpot parkingSpot) {
            if (parkingSpot.isAvailable()){
                System.out.println("Detecting a car at the following park spot: " + parkingSpot);
            }
            else  {
                System.out.println("Car is not parking at this parking spot");
            }
    }

    public void scanCarInfo(Booking booking) {
            // needs to be completed
    }

    public void sendInfoToSystem(ParkingSpot parkingSpot) {
        if (isCarPresent && !carInfo.isEmpty()) {
            // Logic to send information to the system
            System.out.println("Sending info to system for Parking Spot ID: " + parkingSpot.getParkingSpotID());
        }
    }

    public boolean isCarPresent() {
        return isCarPresent;
    }

    public String getCarInfo() {
        return carInfo;
    }
}