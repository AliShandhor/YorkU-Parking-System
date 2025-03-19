package com.yorku.parkingsystem.parkingspot;

import java.util.Date;

public class ParkingSpot {

    private int parkingSpotID;
    private String location;
    private boolean isAvailable;
    private int bookingID;
    private Date bookingTime;
    private int duration;
    private String status;
    private float price;


    public void setPrice(float price) {
        this.price = price;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
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

    public int getBookingID() {
        return bookingID;
    }

    public String getStatus() {
        return status;
    }
    public boolean isAvailability() {
        return isAvailable;
    }


    public Date getBookingTime() {
        return bookingTime;
    }

    public float getPrice() {
        return price;
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
                ", bookingID=" + bookingID +
                ", bookingTime=" + bookingTime +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                ", price=" + price +
                '}';
    }
}
