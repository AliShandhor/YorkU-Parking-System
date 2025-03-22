package com.yorku.parkingsystem.parking.parkinglot;

import java.util.ArrayList;

public class ParkingLot implements ParkingComponent {
    private ArrayList<ParkingComponent> parkingSpots = new ArrayList<>(); // leafs
    private final int ID;
    private final String Name;
    private final String location;
    private final int parkingSpotsTotal;
    private int availableParkingSpots;
    private int notAvailableParkingSpots;

  public ParkingLot(int parkingLogID, String parkingLotName, String location) {
          ArrayList<ParkingComponent> parkingLots;
          this.ID = parkingLogID;
          this.Name = parkingLotName;
          this.location = location;
          this.parkingSpotsTotal = 100;
          this.availableParkingSpots = parkingSpotsTotal;
          this.notAvailableParkingSpots = 0;
      }
    public void modifyParkingSpotsTotal(int parkingSpotsTotal) {
      if (parkingSpotsTotal > 100){
            System.out.println("Parking spots total cannot be more than 100");
            return;
      }
        this.availableParkingSpots = parkingSpotsTotal;
    }
    @Override
    public String toString() {
        return "ParkingLot{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", location='" + location + '\'' +
                ", parkingSpotsTotal=" + parkingSpotsTotal +
                ", availableParkingSpots=" + availableParkingSpots +
                ", notAvailableParkingSpots=" + notAvailableParkingSpots +
                '}';
    }

    @Override
    public void shotDetails() {
        System.out.println(this); // Parking Lot details
      for (ParkingComponent parkingSpot: parkingSpots) {
          parkingSpot.shotDetails();
          System.out.println("====================================");
      }
    }

    public void addParkingSpot(ParkingComponent parkingSpot) {
        parkingSpots.add(parkingSpot);
        availableParkingSpots--;
        notAvailableParkingSpots++;
    }

    public void removeParkingSpot(ParkingComponent parkingSpot) {
        parkingSpots.remove(parkingSpot);
        availableParkingSpots++;
        notAvailableParkingSpots--;
    }


    public int getAvailableParkingSpots() {
        return availableParkingSpots;
    }

    public int getNotAvailableParkingSpots() {
        return notAvailableParkingSpots;
    }

    public int getID() {
        return ID;
    }

    public int getParkingSpotsTotal() {
        return parkingSpotsTotal;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return Name;
    }


    public ArrayList<ParkingComponent> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(ArrayList<ParkingComponent> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}
