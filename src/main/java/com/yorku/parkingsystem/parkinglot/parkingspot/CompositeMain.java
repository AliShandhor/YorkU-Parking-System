package com.yorku.parkingsystem.parkinglot.parkingspot;
import com.yorku.parkingsystem.parkinglot.ParkingLot;
import java.util.Date;

public class CompositeMain {
    public static void main(String[] args) {
        // Creating the first ParkingSpot using ParkingSpotBuilder
        ParkingSpotBuilder builder1 = new ParkingSpotBuilder();
        ParkingSpot parkingSpot1 = builder1.setParkingSpotID(101)
                .setLocation("Level 1, Zone A")
                .setAvailability(true)
                .setBookingTime(new Date())
                .setDuration(2)
                .setStatus("Booked")
                .build();

        // Creating the second ParkingSpot using ParkingSpotBuilder
        ParkingSpotBuilder builder2 = new ParkingSpotBuilder();
        ParkingSpot parkingSpot2 = builder2.setParkingSpotID(102)
                .setLocation("Level 2, Zone A")
                .setAvailability(true)
                .setBookingTime(new Date())
                .setDuration(3)
                .setStatus("Available")
                .build();

        ParkingLot parkingLot1 = new ParkingLot(1, "A", "York University");

        parkingLot1.shotDetails();

        parkingLot1.addParkingSpot(parkingSpot1);
        parkingLot1.addParkingSpot(parkingSpot2);

        System.out.println("Showing parking lot details for all parking spots");
        parkingLot1.shotDetails();

    }


}
