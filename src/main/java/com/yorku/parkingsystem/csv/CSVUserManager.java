package com.yorku.parkingsystem.csv;

import com.yorku.parkingsystem.user.UserFactory;
import com.yorku.parkingsystem.user.User;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class CSVUserManager {
    private static CSVUserManager instance;
    private static final String FILE_PATH = "users_data.csv";

    private CSVUserManager() {
        ensureFileExists();
    }

    public static synchronized CSVUserManager getInstance() {
        if (instance == null) {
            instance = new CSVUserManager();
        }
        return instance;
    }

    private void ensureFileExists() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("CSV file created: " + FILE_PATH);
                    writeUsers(new ArrayList<>());
                }
            } catch (IOException e) {
                System.err.println("Error creating CSV file: " + e.getMessage());
            }
        }
    }

    public List<User> readUsers() {
        List<User> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
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

    public void writeUsers(List<User> users) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (User user : users) {
                bw.write(user.getUserID() + "," + user.getName() + "," + user.getClass().getSimpleName().toUpperCase() + "," + user.getLicensePlate());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

