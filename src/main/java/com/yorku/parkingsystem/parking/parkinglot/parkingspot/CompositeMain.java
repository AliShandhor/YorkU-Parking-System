package com.yorku.parkingsystem.parking.parkinglot.parkingspot;
import com.yorku.parkingsystem.parking.parkinglot.ParkingLot;
import java.util.Date;

public class CompositeMain {
    public static void main(String[] args) {
        // Creating the first ParkingSpot using ParkingSpotBuilder
        ParkingSpotBuilder builder1 = new ParkingSpotBuilder();
        ParkingSpot parkingSpot1 = builder1
                .setLocation("Level 1, Zone A")
                .setAvailability(true)
                .build();

        // Creating the second ParkingSpot using ParkingSpotBuilder
        ParkingSpotBuilder builder2 = new ParkingSpotBuilder();
        ParkingSpot parkingSpot2 = builder2
                .setLocation("Level 2, Zone A")
                .setAvailability(true)
                .build();

        ParkingLot parkingLot1 = new ParkingLot( "A", "York University");

        parkingLot1.shotDetails();

        parkingLot1.addParkingSpot(parkingSpot1);
        parkingLot1.addParkingSpot(parkingSpot2);

        System.out.println("Showing parking lot details for all parking spots");
        parkingLot1.shotDetails();

    }


}
