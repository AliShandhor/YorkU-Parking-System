package com.yorku.parkingsystem.management;

import com.yorku.parkingsystem.user.User;

import java.util.ArrayList;

public class ClientRegistration {
    public ArrayList<User> registeredUsers;
    public int userID = 0;
    public ClientRegistration() {
        registeredUsers = new ArrayList<>();
    }

    // Method to register a new user based on client type
    public void registerClient(User newUser) {
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

//        // If the user is a student, faculty, or non-faculty staff, send for further validation
//        if (newUser.getClientType().equals("student") || newUser.getClientType().equals("FacultyMember") || newUser.getClientType().equals("NonFacultyMember") ||  newUser.getClientType().equals("VISITOR")) {
//            System.out.println("Registration successful!");
//
//        } else {
//            System.out.println("Registration successful!");
//        }

        // Print details of the registered user
        System.out.println("'" + newUser.getName() + "' has been successfully registered at YorkU Parking System.");

    }

    // register multiple users at once
    public void registerMultipleUsers(ArrayList<User> users){
        for (User user : users){
            registerClient(user);// Register each user individually

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

}

