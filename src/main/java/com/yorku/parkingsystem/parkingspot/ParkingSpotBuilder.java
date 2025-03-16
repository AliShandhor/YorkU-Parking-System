package com.yorku.parkingsystem.parkingspot;

import java.util.Date;

public class ParkingSpotBuilder {
    // Builder Pattern Implemented here
    private final ParkingSpot parkingSpot;

    public ParkingSpotBuilder() {
        this.parkingSpot = new ParkingSpot();
    }

    public ParkingSpotBuilder setParkingSpotID(int parkingSpotID) {
        parkingSpot.setParkingSpotID(parkingSpotID);
        return this;
    }

    public ParkingSpotBuilder setLocation(String location) {
        parkingSpot.setLocation(location);
        return this;
    }

    public ParkingSpotBuilder setAvailability(boolean isAvailable) {
        parkingSpot.setAvailability(isAvailable);
        return this;
    }

    public ParkingSpotBuilder setBookingID(int bookingID) {
        parkingSpot.setBookingID(bookingID);
        return this;
    }

    public ParkingSpotBuilder setBookingTime(Date bookingTime) {
        parkingSpot.setBookingTime(bookingTime);
        return this;
    }

    public ParkingSpotBuilder setDuration(int duration) {
        parkingSpot.setDuration(duration);
        return this;
    }

    public ParkingSpotBuilder setStatus(String status) {
        parkingSpot.setStatus(status);
        return this;
    }

    public ParkingSpotBuilder setPrice(float price) {
        parkingSpot.setPrice(price);
        return this;
    }

    // Build method and add the created parking spot to the singleton recorder
    public ParkingSpot build() {
        // Add the created ParkingSpot to the ParkingSpotDataRecorder
        ParkingSpotDataRecorder.getInstance().addParkingSpot(parkingSpot);

        return parkingSpot;
    }
}
