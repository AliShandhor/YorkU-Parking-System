package com.yorku.parkingsystem.management;

import com.yorku.parkingsystem.user.User;

import java.util.ArrayList;

public class ManagementTeam {
    private String name;
    private String password;
    private int ID;
    private boolean registered;

    private final ArrayList<User> users;
    public ManagementTeam() {
        this.users = new ArrayList<>(); // Initialize the user list
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void register(boolean registered) {
        this.registered = registered;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addUser(User user) {
        if (!user.isRegistered()) {
            System.out.println("User: " + user.getName() + " cannot be added as they are not a registered user in the YorkU Parking System.");
            return;
        }

        // Check if the user is already in the list
        if (users.contains(user)) {
            System.out.println("This user " + user + " is already in the management team: " + name);
            return;
        }

        // If the user is not already in the list, add them
        users.add(user);
        System.out.println("User " + user + " has been added to the management team: " + name);
    }

    public void removeUser(User user) {
        if (!user.isRegistered()) {
            System.out.println("User: " + user.getName() + " cannot be removed as they are not a registered user in the YorkU Parking System.");
            return;
        }

        // Check if the user exists in the list
        if (!users.contains(user)) {
            System.out.println("This user " + user + " is not part of the management team: " + name);
            return;
        }

        // If the user exists in the list, remove them
        users.remove(user);
        System.out.println("User " + user + " has been removed from the management team: " + name);
    }


    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("The Management team does not have any users registered.");
            return;
        }
        System.out.println("========================\n" + this); // Print ManagementTeam details
        int index = 1;
        for (User user : users) {
            System.out.println("User #" + index +": " + user);; // Display each user's details
            index++;
        }
    }

    @Override
    public String toString() {
        return "ManagementTeam{" +
                "name='" + name +
                ", registered=" + registered +
                ", usersCount=" + users.size() + // Show count instead of full list
                '}';
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
