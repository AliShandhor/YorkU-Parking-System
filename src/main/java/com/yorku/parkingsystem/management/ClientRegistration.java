package com.yorku.parkingsystem.management;

import com.yorku.parkingsystem.user.User;

import java.util.ArrayList;

public class ClientRegistration {
    private ArrayList<User> registeredUsers;
    private int userID = 0;

    public ClientRegistration() {
        registeredUsers = new ArrayList<>();
    }

    public ArrayList<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public int getUserID() {
        return userID;
    }

    // Method to register a new user based on client type
    public void registerClient(User newUser, ManagementTeam managementTeam) {
        // Check if the management team is registered first before registering a new user as a client to this management team
        if (!managementTeam.isRegistered()) {
            System.out.println("Management team is not registered. Please register the management team first.");
            return;
        }
        if (registeredUsers.contains(newUser)) {  // Added closing parenthesis here
            System.out.println("User already registered!");
            return;
        }

        // Validate user email
        if (!isValidEmail(newUser.getEmail())){
            System.out.println("Invalid email format. Please enter a valid email address - i.e. example@gmail.com.");
            return;
        }

        // Validate user password
        if (!isValidPassword(newUser.getPassword())){
            System.out.println("Hey '" + newUser.getName() + "', your password does not meet the strength requirements! Please ensure your password:");
            System.out.println("- Has at least one uppercase letter.");
            System.out.println("- Has at least one lowercase letter.");
            System.out.println("- Contains at least one number.");
            System.out.println("- Includes at least one special character (e.g., @$!%*?&).");
            return;
        }

        // Register the user
        newUser.register(true);

        // Increment the userID by 1 for each new user
        userID++;
        // Set the userID for the new user
        newUser.setUserID(userID);

        // Add the new user to the list of registered users
        registeredUsers.add(newUser);

        // Print details of the registered user
        System.out.println("'" + newUser.getName() + "' has been successfully registered at YorkU Parking System.");

    }

    public void unregisterClient(User user, ManagementTeam managementTeam) {
        // Check if the management team is registered before attempting to unregister a user
        if (managementTeam != null && !managementTeam.isRegistered()) {
            System.out.println("Management team is not registered. Please register the management team first.");
            return;
        }

        // Check if the user is registered with the management team
        if (!registeredUsers.contains(user)) {
            System.out.println("User is not registered in the system.");
            return;
        }

        // Unregister the user by setting their registration status to false
        user.register(false);

        // Remove the user from the registeredUsers list
        registeredUsers.remove(user);

        // If management team is not null, remove user from the management team
        if (managementTeam != null) {
            managementTeam.removeUser(user);
            System.out.println("'" + user.getName() + "' has been successfully unregistered from the YorkU Parking System and management team '" + managementTeam.getName() + "'.");
        } else {
            System.out.println("'" + user.getName() + "' has been successfully unregistered from the YorkU Parking System.");
        }
    }


    // register multiple users at once
    public void registerMultipleUsers(ArrayList<User> users, ManagementTeam managementTeam){
        // Check if the management team is registered first before registering set of new users as clients to this management team
        if (!managementTeam.isRegistered()) {
            System.out.println("Management team is not registered. Please register the management team first.");
            return;
        }
        for (User user : users){
            registerClient(user, managementTeam);// Register each user individually

        }
    }

    public void authenticateUser(String username, String password) {

        for (User user : registeredUsers) {
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                System.out.println("User '" + username + "' has been authenticated successfully.");
                return;
            }
        }
        System.out.println("Authentication failed. Please check your credentials.");
    }

    public boolean isValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }

    public boolean isValidPassword(String password) {
        // Ensure the password contains at least one lowercase, one uppercase letter,
        // one digit, and one special character, without specifying a minimum length.
        String passwordRegex = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[&@#^~$!%*?',|/])[A-Za-z\\d@$!%*?&]*";
        return password.matches(passwordRegex);
    }


    private void displayRegistrationRequirements() {
        System.out.println("Please ensure that your email and password meet the following requirements:");

        System.out.println("Email Requirements:");
        System.out.println("- The email should be in a valid format (e.g., user@example.com).");

        System.out.println("Password Requirements:");
        System.out.println("- Minimum 8 characters.");
        System.out.println("- Must contain at least one uppercase letter.");
        System.out.println("- Must contain at least one lowercase letter.");
        System.out.println("- Must contain at least one number.");
        System.out.println("- Must contain at least one special character (e.g., @$!%*?&).");
    }


    public void displayRegisteredUsers() {
        if (registeredUsers.isEmpty()) {
            System.out.println("There is no any registered user in the system.");
            return;
        }
        System.out.println("=============Registered Users===========");
        for (User user : registeredUsers) {
            System.out.println(user);;
        }
    }
}

