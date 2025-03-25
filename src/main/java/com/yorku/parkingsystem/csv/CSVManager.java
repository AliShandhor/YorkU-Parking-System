package com.yorku.parkingsystem.csv;

import com.yorku.parkingsystem.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.system.ParkingSystem;
import com.yorku.parkingsystem.user.UserFactory;
import com.yorku.parkingsystem.user.User;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class CSVManager {
    private static CSVManager instance;
    private static final String PARKING_SPOT_FILE = "parking_data.csv";
    private static final String PARKING_SYSTEM_FILE = "parking_system.csv";
    private static final String USER_FILE = "users_data.csv";

    private CSVManager() {
        ensureFileExists(PARKING_SPOT_FILE, "ID,Location,Availability,BookingID,BookingTime,Duration,Status,Price");
        ensureFileExists(PARKING_SYSTEM_FILE, "ClientType,UserID,Name,LicensePlate,SpotID,Location,Availability,BookingID,BookingTime,Duration,Status,Price");
        ensureFileExists(USER_FILE, "UserID,Name,ClientType,LicensePlate");
    }

    public static synchronized CSVManager getInstance() {
        if (instance == null) {
            instance = new CSVManager();
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

    public void writeParkingSpots(List<ParkingSpot> parkingSpots) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PARKING_SPOT_FILE))) {
            for (ParkingSpot space : parkingSpots) {
                bw.write(space.getParkingSpotID() + "," + space.getLocation() + "," + space.isAvailability() + "," + space.getBookingID() + "," + space.getBookingTime().toString() + "," + space.getDuration() + "," + space.getStatus() + "," + space.getPrice());

                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeParkingSystem(ParkingSystem parkingSystem) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PARKING_SYSTEM_FILE))) {
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

    public void writeUsers(List<User> users) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(USER_FILE))) {
            for (User user : users) {
                bw.write(user.getUserID() + "," + user.getName() + "," + user.getClass().getSimpleName().toUpperCase() + "," + user.getLicensePlate());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<ParkingSpot> readParkingSpots() {
        List<ParkingSpot> parkingSpaces = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(PARKING_SPOT_FILE))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String location = data[1];
                boolean availability = Boolean.parseBoolean(data[2]);
                int bookingID = Integer.parseInt(data[3]);
                //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date bookingTime = new Date(data[4]);
                int duration = Integer.parseInt(data[5]);
                String status = data[6];
                float price = Float.parseFloat(data[7]);

                ParkingSpot spot = new ParkingSpot(); // Create an empty ParkingSpot object
                spot.setParkingSpotID(id);
                spot.setLocation(location);
                spot.setAvailability(availability);
                spot.setBookingID(bookingID);
                spot.setBookingTime(bookingTime);
                spot.setDuration(duration);
                spot.setStatus(status);
                spot.setPrice(price);

                parkingSpaces.add(spot);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return parkingSpaces;
    }

    public ParkingSystem readParkingSystem() {
        ParkingSystem parkingSystem = new ParkingSystem();
        try (BufferedReader br = new BufferedReader(new FileReader(PARKING_SYSTEM_FILE))) {
            String line;
            br.readLine(); // Skip header
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

    public List<User> readUsers() {
        List<User> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int userID = Integer.parseInt(data[0]);
                String name = data[1];
                String clientType = data[2];
                String licensePlate = data[3];

                User user = UserFactory.getUser(clientType, userID, name, licensePlate);
                users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }


}
