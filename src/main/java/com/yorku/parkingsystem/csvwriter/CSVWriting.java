package com.yorku.parkingsystem.csvwriter;

import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.parking.parkinglot.ParkingLot;
import com.yorku.parkingsystem.parking.parkingspot.ParkingSpot;
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
            bw.write(superManager.getSuperManagerName() + "," + superManager.getSuperManagerEmail() + "," + superManager.getSuperManagerPassword());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeManagementTeams(List<ManagementTeam> managementTeams, SuperManager superManager) {
        String managementTeamFile = "management_teams.csv";
        ensureFileExists(managementTeamFile, "TeamID,TeamName,Password,SuperManagerName");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(managementTeamFile, true))) {
            for (ManagementTeam team : managementTeams) {
                bw.write(team.getID() + "," + team.getName() + "," + team.getPassword() + ","+superManager.getSuperManagerName());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeParkingSpots(List<ParkingSpot> parkingSpots) {
        String parkingSpotFile = "parking_spots.csv";
        ensureFileExists(parkingSpotFile, "ParkingSpotID,Location,IsAvailable,IsBelongedToParkingLot,IsEnabled");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(parkingSpotFile, true))) {
            for (ParkingSpot spot : parkingSpots) {
                bw.write(spot.getParkingSpotID() + "," +
                        spot.getLocation() + "," +
                        spot.isAvailable() + "," +
                        spot.isBelongedToParkingLot() + "," +
                        spot.isEnabled());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeUsers(List<User> users) {
        String userFile = "users_data.csv";
        ensureFileExists(userFile, "UserID,Name,ClientType,LicensePlate,Email,Password");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(userFile, true))) {
            for (User user : users) {
                bw.write(user.getUserID() + "," +
                        user.getName() + "," +
                        user.getClientType() + "," +
                        user.getLicensePlate() + "," +
                        user.getEmail() + "," +
                        user.getPassword());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}