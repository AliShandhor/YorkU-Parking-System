package com.yorku.parkingsystem.parking;

import com.yorku.parkingsystem.parking.parkingspot.ParkingSpot;
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
            if (!parkingSpot.isAvailable()){
                this.isCarPresent = true;
                System.out.println("Car detected at parking spot: " + parkingSpot.getParkingSpotID());
            }
            else  {
                isCarPresent = false;
                System.out.println("No car detected at parking spot: " + parkingSpot.getParkingSpotID());
            }
    }

    public void scanCarInfo(Booking booking) {
        if (isCarPresent) {
            carInfo = "User ID: " + booking.getUser().getUserID() + ", "
                    + "License Plate: " + booking.getUser().getLicensePlate() + ", "
                    + "Booking ID: " + booking.getBookingID();
            System.out.println("Car info scanned: " + carInfo);
        } else {
            System.out.println("No car present to scan.");
        }
    }

    public void sendInfoToSystem(ParkingSpot parkingSpot) {
        if (isCarPresent && !carInfo.isEmpty()) {
            System.out.println("Sending info to system for Parking Spot ID: "
                    + parkingSpot.getParkingSpotID());
            System.out.println("Data Sent: " + carInfo);
            // Add logic here to send data to the central system if needed
        } else {
            System.out.println("No data to send.");
        }
    }

    public boolean isCarPresent() {
        return isCarPresent;
    }

    public String getCarInfo() {
        return carInfo;
    }
}