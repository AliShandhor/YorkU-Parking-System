package com.yorku.parkingsystem.csv;


import com.yorku.parkingsystem.parkingspot.ParkingSpot;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CSVParkingSpotManager {
    private static CSVParkingSpotManager instance;
    private static final String FILE_PATH = "parking_data.csv";

    private CSVParkingSpotManager() {
        ensureFileExists();
    }

    public static synchronized CSVParkingSpotManager getInstance() {
        if (instance == null) {
            instance = new CSVParkingSpotManager();
        }
        return instance;
    }

    private void ensureFileExists() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("CSV file created: " + FILE_PATH);
                    writeParkingSpaces(new ArrayList<>());
                }
            } catch (IOException e) {
                System.err.println("Error creating CSV file: " + e.getMessage());
            }
        }
    }

    public List<ParkingSpot> readParkingSpaces() {
        List<ParkingSpot> parkingSpaces = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String location = data[1];
                boolean availability = Boolean.parseBoolean(data[2]);
                int bookingID = Integer.parseInt(data[3]);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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

    public void writeParkingSpaces(List<ParkingSpot> parkingSpaces) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (ParkingSpot space : parkingSpaces) {
                bw.write(space.getParkingSpotID() + "," + space.getLocation() + "," + space.isAvailability() + "," + space.getBookingID() + "," + space.getBookingTime().toString() + "," + space.getDuration() + "," + space.getStatus() + "," + space.getPrice());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
