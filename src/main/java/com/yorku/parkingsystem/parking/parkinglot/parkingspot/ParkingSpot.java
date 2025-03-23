package com.yorku.parkingsystem.parking.parkinglot.parkingspot;

import com.yorku.parkingsystem.parking.parkinglot.ParkingComponent;

import java.util.Date;

public class ParkingSpot implements ParkingComponent {

    private int parkingSpotID;
    private String location;
    private boolean isAvailable;
    private Date bookingTime;
    private int duration; // this needs to modified, it should be in hours, (removing it)




    @Override
    public void shotDetails() {
        System.out.println("Parking Spot ID: " + parkingSpotID);
        System.out.println("Location: " + location);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("Booking Time: " + (bookingTime != null ? bookingTime.toString() : "Not booked"));
        System.out.println("Duration: " + duration + " minutes");
    }


    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setParkingSpotID(int parkingSpotID) {
        this.parkingSpotID = parkingSpotID;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public int getParkingSpotID() {
        return parkingSpotID;
    }

    public String getLocation() {
        return location;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "parkingSpotID=" + parkingSpotID +
                ", location='" + location + '\'' +
                ", isAvailable=" + isAvailable +
                ", bookingTime=" + bookingTime +
                ", duration=" + duration +
                '}';
    }
}
