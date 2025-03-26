package com.yorku.parkingsystem.csvwriter;

import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.parking.parkinglot.ParkingLot;
import com.yorku.parkingsystem.parking.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.user.Booking;
import com.yorku.parkingsystem.user.User;

import java.io.*;
import java.util.List;

public class CSVWriting {
    private static CSVWriting instance;

    private CSVWriting() {
        // Private constructor to prevent instantiation
    }

    public static synchronized CSVWriting getInstance() {
        if (instance == null) {
            instance = new CSVWriting();
        }
        return instance;
    }

    private void ensureFileExists(String filePath, String header) {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("CSV file created: " + filePath);
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
                        bw.write(header);
                        bw.newLine();
                    }
                }
            } catch (IOException e) {
                System.err.println("Error creating CSV file: " + e.getMessage());
            }
        }
    }

    public void writeSuperManager(SuperManager superManager) {
        String superManagerFile = "super_manager.csv";
        ensureFileExists(superManagerFile, "Name,Email,Password");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(superManagerFile, true))) {
            bw.write(superManager.getSuperManagerName() + "," +
                    superManager.getSuperManagerEmail() + "," +
                    superManager.getSuperManagerPassword());
            bw.newLine();
            System.out.println("SuperManager data written to " + superManagerFile);
        } catch (IOException e) {
            System.err.println("Error writing SuperManager data: " + e.getMessage());
        }
    }

    public void writeManagementTeams(List<ManagementTeam> managementTeams, SuperManager superManager) {
        String managementTeamFile = "management_teams.csv";
        ensureFileExists(managementTeamFile, "TeamID,TeamName,Password,SuperManagerName");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(managementTeamFile, true))) {
            for (ManagementTeam team : managementTeams) {
                bw.write(team.getID() + "," + team.getName() + "," +
                        team.getPassword() + "," + superManager.getSuperManagerName());
                bw.newLine();
            }
            System.out.println("Management team data written to " + managementTeamFile);
        } catch (IOException e) {
            System.err.println("Error writing Management Team data: " + e.getMessage());
        }
    }

    public void writeParkingLots(List<ParkingLot> parkingLots) {
        String parkingLotFile = "parking_lots.csv";
        ensureFileExists(parkingLotFile, "ParkingLotID,Name,Location");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(parkingLotFile, true))) {
            for (ParkingLot lot : parkingLots) {
                bw.write(lot.getParkingLotID() + "," + lot.getName() + "," + lot.getLocation());
                bw.newLine();
            }
            System.out.println("Parking lot data written to " + parkingLotFile);
        } catch (IOException e) {
            System.err.println("Error writing Parking Lot data: " + e.getMessage());
        }
    }

    public void writeParkingSpots(List<ParkingSpot> parkingSpots) {
        String parkingSpotFile = "parking_spots.csv";
        ensureFileExists(parkingSpotFile, "ParkingSpotID,Location,IsAvailable,IsBelongedToParkingLot,IsEnabled,ParkingLotID,ParkingLotName,ParkingLotLocation");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(parkingSpotFile, true))) {
            for (ParkingSpot parkingSpot : parkingSpots) {
                ParkingLot parkingLot = (ParkingLot) parkingSpot.getParkingLot();

                bw.write(parkingSpot.getParkingSpotID() + "," +
                        parkingSpot.getLocation() + "," +
                        parkingSpot.isAvailable() + "," +
                        parkingSpot.isBelongedToParkingLot() + "," +
                        parkingSpot.isEnabled() + "," +
                        parkingLot.getParkingLotID() + "," +
                        parkingLot.getName() + "," +
                        parkingLot.getLocation());
                bw.newLine();
            }
            System.out.println("Parking spot data written to " + parkingSpotFile);
        } catch (IOException e) {
            System.err.println("Error writing Parking Spot data: " + e.getMessage());
        }
    }

    public void writeUsers(List<User> users) {
        String userFile = "users_data.csv";
        ensureFileExists(userFile, "UserID,Name,ClientType,LicensePlate,Email,Password,RatePerHour");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(userFile, true))) {
            for (User user : users) {
                bw.write(user.getUserID() + "," +
                        user.getName() + "," +
                        user.getClientType() + "," +
                        user.getLicensePlate() + "," +
                        user.getEmail() + "," +
                        user.getPassword() + "," +
                        user.getRatePerHour()
                );
                bw.newLine();
            }
            System.out.println("User data written to " + userFile);
        } catch (IOException e) {
            System.err.println("Error writing User data: " + e.getMessage());
        }
    }



    public void writeBookings(List<Booking> bookings) {
        String bookingFile = "bookings.csv";
        ensureFileExists(bookingFile, "BookingID,UserID,UserName,ParkingSpotID,BookingTime,Duration,NoShow,Checkin");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(bookingFile, true))) {
            for (Booking booking : bookings) {
                bw.write(booking.getBookingID() + "," +
                        booking.getUser().getUserID() + "," +
                        booking.getUser().getName() + "," +
                        booking.parkingSpot().getParkingSpotID() + "," +
                        booking.getBookingTime() + "," +
                        booking.getDuration() + "," +
                        booking.isNoShow() + "," +
                        booking.isCheckin()
                        );
                bw.newLine();
            }
            System.out.println("Booking data written to " + bookingFile);
        } catch (IOException e) {
            System.err.println("Error writing Booking data: " + e.getMessage());
        }
    }
}
