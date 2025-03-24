package com.yorku.parkingsystem.parking.parkinglot.parkingspot;

public class ParkingSpotBuilder {
    private String location;
    private boolean isAvailable;

    public ParkingSpotBuilder setLocation(String location) {
        this.location = location;
        return this;
    }

    public ParkingSpotBuilder setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    public ParkingSpot build() {
        ParkingSpot parkingSpot = new ParkingSpot();
        parkingSpot.setLocation(location);
        parkingSpot.setAvailability(isAvailable);
        return parkingSpot;
    }
}