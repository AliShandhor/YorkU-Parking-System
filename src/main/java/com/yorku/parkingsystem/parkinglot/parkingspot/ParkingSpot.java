package com.yorku.parkingsystem.parkinglot.parkingspot;

import com.yorku.parkingsystem.parkinglot.ParkingComponent;

import java.util.Date;

public class ParkingSpot implements ParkingComponent {

    private int parkingSpotID;
    private String location;
    private boolean isAvailable;
    private Date bookingTime;
    private int duration; // this needs to modified, it should be in hours, (removing it)
    private String status;


    @Override
    public void shotDetails() {
        System.out.println("Parking Spot ID: " + parkingSpotID);
        System.out.println("Location: " + location);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("Booking Time: " + (bookingTime != null ? bookingTime.toString() : "Not booked"));
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Status: " + status);
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

    public void setStatus(String status) {
        this.status = status;
    }

    public int getParkingSpotID() {
        return parkingSpotID;
    }

    public String getLocation() {
        return location;
    }


    public String getStatus() {
        return status;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

//    public float getPrice() {
//        return price;
//    }

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
                ", status='" + status + '\'' +
                '}';
    }
}
