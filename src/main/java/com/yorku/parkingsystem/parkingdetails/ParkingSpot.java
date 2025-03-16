package com.yorku.parkingsystem.parkingdetails;

import java.util.Date;

 class ParkingSpot {
    // Inner class representing a parking spot with Builder Pattern
        private  int parkingSpotID;
        private  String location;
        private  boolean isAvailable;
        private  int bookingID;
        private Date bookingTime;
        private  int duration;
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
}

class parkingSpotBuilder{
     protected ParkingSpot parkingSpot;

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void buildNewParkingSpotDetails(){
        parkingSpot = new ParkingSpot();
    }
}
