package com.yorku.parkingsystem.management;

import com.yorku.parkingsystem.user.User;
import java.security.SecureRandom;
import java.util.*;

public class SuperManager {
    private static SuperManager superManager; // only one time super manager (singleton pattern)
    private static String SUPER_MANAGER_NAME;
    private static String SUPER_MANAGER_EMAIL;
    private static String SUPER_MANAGER_PASSWORD;
    private static final Map<ManagementTeam, ArrayList<User>> managementTeamAccounts = new HashMap<>();
    private static int ID = 0;
    // Secure random generator for unique account name and password
    private static final SecureRandom secureRandom = new SecureRandom();

    private static final String CHAR_POOL_NAME = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final String CHAR_POOL_PASSWORD = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";

    private static final int PASSWORD_LENGTH = 12; // Password length, can be modified for stronger passwords
    private static final int ACCOUNT_NAME_LENGTH = 5; // Length for account name (5 characters), can be edited

    private SuperManager() {
        // Private constructor to prevent instantiation
    }

    // Singleton pattern: Ensures only one SuperManager instance exists
    public static SuperManager getSuperManagerInstance(String name, String email, String password) {
        if (superManager == null) {
            superManager = new SuperManager();
            SUPER_MANAGER_NAME = name;
            SUPER_MANAGER_EMAIL = email;
            SUPER_MANAGER_PASSWORD = password;
        }
        return superManager;
    }

    public String getSuperManagerName() {
        return SUPER_MANAGER_NAME;
    }

    public String getSuperManagerEmail() {
        return SUPER_MANAGER_EMAIL;
    }

    public String getSuperManagerPassword() {
        return SUPER_MANAGER_PASSWORD;
    }

    // Authenticate the super manager
    public static boolean authenticateSuperManager(String email, String password) {
        return SUPER_MANAGER_EMAIL != null && SUPER_MANAGER_PASSWORD != null
                && SUPER_MANAGER_EMAIL.equals(email) && SUPER_MANAGER_PASSWORD.equals(password);
    }

    public void generateManagementTeamAccount(ManagementTeam managementTeam) {
        // Authenticate the super manager before generating a new manager account
        if (!authenticateSuperManager(SUPER_MANAGER_EMAIL, SUPER_MANAGER_PASSWORD)) {
            System.out.println("Access Denied. Only the super manager can generate manager accounts.\nPlease enter the correct Super Manager credentials.");
            return;
        }

        // Check if the management team account already exists
        if (managementTeamAccounts.containsKey(managementTeam)) {
            System.out.println("Management team account already exists.");
            return;
        }

        // Automatically generates unique names and strong passwords for the new management team account
        String managementTeamName = generateManagementTeamAccountName();
        managementTeam.setName(managementTeamName);

        String managementTeamPassword = generateManagementTeamAccountPassword();
        managementTeam.setPassword(managementTeamPassword);

        // Register the management team
        managementTeam.register(true);

        // Set id
        ID++;
        managementTeam.setID(ID);


        // Create a list of users for the management team (initially empty)
        ArrayList<User> users = new ArrayList<>();

        // Add the management team and its user list to the map
        managementTeamAccounts.put(managementTeam, users);
    }

    // Method to generate a unique account name for the management team
    public String generateManagementTeamAccountName() {
        return generateRandomString(ACCOUNT_NAME_LENGTH, CHAR_POOL_NAME);
    }

    // Method to generate a strong password
    public String generateManagementTeamAccountPassword() {
        return generateRandomString(PASSWORD_LENGTH, CHAR_POOL_PASSWORD);
    }

    // Helper method to generate a random string (used for name & password)
    private static String generateRandomString(int length, String CHAR_POOL) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = secureRandom.nextInt(CHAR_POOL.length());
            sb.append(CHAR_POOL.charAt(index));
        }
        return sb.toString();
    }

    public void removeManagementTeam(ManagementTeam managementTeam) {
        // Authenticate the super manager before removing a management team
        if (!authenticateSuperManager(SUPER_MANAGER_EMAIL, SUPER_MANAGER_PASSWORD)) {
            System.out.println("Access Denied. Only the super manager can remove management teams.\nPlease enter the correct Super Manager credentials.");
            return;
        }

        // Check if the management team exists in the map
        if (!managementTeamAccounts.containsKey(managementTeam)) {
            System.out.println("This management team does not exist in the system.");
            return;
        }

        System.out.println("The management team '" + managementTeam.getName() + "' has been removed successfully from Super Manager");

        // Reset the attributes of the management team
        managementTeam.setName(null);
        managementTeam.setPassword(null);
        managementTeam.setID(0);
        managementTeam.register(false);

        // Remove the management team and its associated users from the map
        managementTeamAccounts.remove(managementTeam);
    }

    public void showDetails(){
        System.out.println("Super Manager Name: " + SUPER_MANAGER_NAME);
        System.out.println("Super Manager Email: " + SUPER_MANAGER_EMAIL);
        System.out.println("Super Manager Password: " + SUPER_MANAGER_PASSWORD);
    }




}
