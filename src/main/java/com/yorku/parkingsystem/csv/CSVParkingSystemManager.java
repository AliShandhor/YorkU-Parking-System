package com.yorku.parkingsystem.csv;

import com.yorku.parkingsystem.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.system.ParkingSystem;
import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CSVParkingSystemManager {

    private static CSVParkingSystemManager instance;
    private static final String FILE_PATH = "parking_system.csv";

    private CSVParkingSystemManager() {
        ensureFileExists();
    }

    public static synchronized CSVParkingSystemManager getInstance() {
        if (instance == null) {
            instance = new CSVParkingSystemManager();
        }
        return instance;
    }

    private void ensureFileExists() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("CSV file created: " + FILE_PATH);
                    writeParkingSystem(new ParkingSystem()); // Initialize empty file
                }
            } catch (IOException e) {
                System.err.println("Error creating CSV file: " + e.getMessage());
            }
        }
    }

    public ParkingSystem readParkingSystem() {
        ParkingSystem parkingSystem = new ParkingSystem();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String clientType = data[0];
                int userID = Integer.parseInt(data[1]);
                String name = data[2];
                String licensePlate = data[3];

                User user = UserFactory.getUser(clientType, userID, name, licensePlate);

                int spotID = Integer.parseInt(data[4]);
                String location = data[5];
                boolean isAvailable = Boolean.parseBoolean(data[6]);
                int bookingID = Integer.parseInt(data[7]);
                Date bookingTime = new Date(data[9]);
                int duration = Integer.parseInt(data[9]);
                String status = data[10];
                float price = Float.parseFloat(data[11]);

                ParkingSpot spot = new ParkingSpot();
                spot.setParkingSpotID(spotID);
                spot.setLocation(location);
                spot.setAvailability(isAvailable);
                spot.setBookingID(bookingID);
                spot.setBookingTime(bookingTime);
                spot.setDuration(duration);
                spot.setStatus(status);
                spot.setPrice(price);

                parkingSystem.addUserParkingSpot(user, spot);
            }
        } catch (FileNotFoundException e) {
            System.err.println("CSV file not found.");
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
        return parkingSystem;
    }

    public void writeParkingSystem(ParkingSystem parkingSystem) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Map.Entry<User, ParkingSpot> entry : parkingSystem.parkingSystem.entrySet()) {
                User user = entry.getKey();
                ParkingSpot spot = entry.getValue();

                bw.write(user.getClass().getSimpleName().toUpperCase() + "," +
                        user.getUserID() + "," +
                        user.getName() + "," +
                        user.getLicensePlate() + "," +
                        spot.getParkingSpotID() + "," +
                        spot.getLocation() + "," +
                        spot.isAvailability() + "," +
                        spot.getBookingID() + "," +
                        spot.getBookingTime().toString() + "," +
                        spot.getDuration() + "," +
                        spot.getStatus() + "," +
                        spot.getPrice());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}
