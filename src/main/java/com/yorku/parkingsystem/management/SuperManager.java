package com.yorku.parkingsystem.management;

import com.yorku.parkingsystem.user.FacultyMember;
import com.yorku.parkingsystem.user.User;
import java.security.SecureRandom;
import java.util.*;

public class SuperManager {
    private static SuperManager superManager; // Singleton pattern for SuperManager
    private static String SUPER_MANAGER_NAME;
    private static String SUPER_MANAGER_EMAIL;
    private static String SUPER_MANAGER_PASSWORD;



    private static final Map<ManagementTeam, ArrayList<User>> managementTeamAccounts = new HashMap<>();
    private static int ID = 0;
    private static final SecureRandom secureRandom = new SecureRandom();

    private static final String CHAR_POOL_NAME = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final String CHAR_POOL_PASSWORD = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";

    private static final int PASSWORD_LENGTH = 12; // Password length
    private static final int ACCOUNT_NAME_LENGTH = 5; // Length for account name

    private SuperManager() {
        // Private constructor to prevent instantiation
    }

    public static Map<ManagementTeam, ArrayList<User>> getManagementTeamAccounts() {
        return managementTeamAccounts;
    }

    // Singleton pattern: Ensures only one instance of SuperManager exists
    public static SuperManager getSuperManagerInstance(String name, String email, String password) {
        if (superManager == null) {
            superManager = new SuperManager();
            SUPER_MANAGER_NAME = name;
            SUPER_MANAGER_EMAIL = email;
            SUPER_MANAGER_PASSWORD = password;
        }
        return superManager;
    }

    public boolean authenticateManagementTeamAccount(String userName, String password){
        for (ManagementTeam managementTeam : managementTeamAccounts.keySet()){
            // Compare the provided username with the team's name and password
            if (managementTeam.getName().equals(userName) && managementTeam.getPassword().equals(password)) {
                System.out.println("Authentication successful.");
                return true;
            }
        }
        System.out.println("Authentication failed. Please check your credentials.");
        return false;
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

    // Generate management team account
    public void generateManagementTeamAccount(ManagementTeam managementTeam) {
        if (!authenticateSuperManager(SUPER_MANAGER_EMAIL, SUPER_MANAGER_PASSWORD)) {
            System.out.println("Access Denied. Only the super manager can generate manager accounts.");
            return;
        }

        if (managementTeamAccounts.containsKey(managementTeam)) {
            System.out.println("Management team '" + managementTeam.getName() + "' already exists.");
            return;
        }

        String managementTeamName = generateManagementTeamAccountName();
        managementTeam.setName(managementTeamName);

        String managementTeamPassword = generateManagementTeamAccountPassword();
        managementTeam.setPassword(managementTeamPassword);

        managementTeam.register(true);

        ID++;
        managementTeam.setID(ID);

        ArrayList<User> users = managementTeam.getRegisteredUsers();
        managementTeamAccounts.put(managementTeam, users);
    }

    // Generate unique account name for the management team
    public String generateManagementTeamAccountName() {
        return generateRandomString(ACCOUNT_NAME_LENGTH, CHAR_POOL_NAME);
    }

    // Generate strong password for the management team
    public String generateManagementTeamAccountPassword() {
        return generateRandomString(PASSWORD_LENGTH, CHAR_POOL_PASSWORD);
    }

    // Helper method to generate random string for name and password
    private static String generateRandomString(int length, String CHAR_POOL) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = secureRandom.nextInt(CHAR_POOL.length());
            sb.append(CHAR_POOL.charAt(index));
        }
        return sb.toString();
    }

    // Remove management team
    public void removeManagementTeam(ManagementTeam managementTeam) {
        if (!authenticateSuperManager(SUPER_MANAGER_EMAIL, SUPER_MANAGER_PASSWORD)) {
            System.out.println("Access Denied. Only the super manager can remove management teams.");
            return;
        }

        if (!managementTeamAccounts.containsKey(managementTeam)) {
            System.out.println("This management team does not exist.");
            return;
        }

        System.out.println("The management team '" + managementTeam.getName() + "' has been removed successfully.");

        ArrayList<User> users = managementTeam.getRegisteredUsers();
        if (users != null) {
            for (User user : users) {
                user.register(false); // Unregister each user
            }
            users.clear(); // Clear user list
        }

        managementTeam.setName(null);
        managementTeam.setPassword(null);
        managementTeam.setID(0);
        managementTeam.register(false);

        managementTeamAccounts.remove(managementTeam);
    }

    // Show super manager info
    public void showSuperManagerInfo() {
        System.out.println("Super Manager Name: " + SUPER_MANAGER_NAME);
        System.out.println("Super Manager Email: " + SUPER_MANAGER_EMAIL);
        System.out.println("Super Manager Password: " + SUPER_MANAGER_PASSWORD);
    }

    // Show management teams and their users
    public void showManagementTeamsWithUsers() {
        if (managementTeamAccounts.isEmpty()) {
            System.out.println("No management teams are currently registered.");
            return;
        }

        System.out.println("===== Management Teams and Their Registered Users =====");
        for (Map.Entry<ManagementTeam, ArrayList<User>> entry : managementTeamAccounts.entrySet()) {
            ManagementTeam managementTeam = entry.getKey();
            ArrayList<User> users = managementTeam.getRegisteredUsers();

            System.out.println("\nManagement Team: " + managementTeam.getName() + "\tID: " + managementTeam.getID());
            if (users.isEmpty()) {
                System.out.println("  - No registered users.");
            } else {
                System.out.println("  - Registered Users:");
                for (User user : users) {
                    System.out.println("    * " + user.getName() + " (ID: " + user.getUserID() + ")");
                }
            }
        }
    }
    public Set<ManagementTeam> getManagementTeamKeys() {
        return managementTeamAccounts.keySet();
    }



    // Add user to management team
    public void addUserToManagementTeam(ClientRegistration clientRegistration, ManagementTeam managementTeam, User user) {
        if (!authenticateSuperManager(SUPER_MANAGER_EMAIL, SUPER_MANAGER_PASSWORD)) {
            System.out.println("Access Denied. Only the super manager can add users to management teams.");
            return;
        }

        if (!managementTeamAccounts.containsKey(managementTeam)) {
            System.out.println("Management team '" + managementTeam.getName() + "' does not exist.");
            return;
        }

        ArrayList<User> users = managementTeam.getRegisteredUsers();
        if (!users.contains(user)) {
            if (!user.isRegistered()) {
                clientRegistration.registerClient(user, managementTeam);
            }
            managementTeam.addUser(user);
            // Register user if not already present
            System.out.println(Arrays.toString(users.toArray()));
            System.out.println("User '" + user.getName() + "' has been successfully added to the management team '" + managementTeam.getName() + "'.");
        } else {
            System.out.println("User '" + user.getName() + "' is already part of the management team.");
        }
    }

    // Remove user from management team
    public void removeUserFromManagementTeam(ManagementTeam managementTeam, User user) {
        if (!authenticateSuperManager(SUPER_MANAGER_EMAIL, SUPER_MANAGER_PASSWORD)) {
            System.out.println("Access Denied. Only the super manager can remove users from management teams.");
            return;
        }

        if (!managementTeamAccounts.containsKey(managementTeam)) {
            System.out.println("Management team '" + managementTeam.getName() + "' does not exist.");
            return;
        }

        ArrayList<User> users = managementTeam.getRegisteredUsers();
        if (users.contains(user)) {
            managementTeam.removeUser(user);
            System.out.println("User '" + user.getName() + "' has been successfully removed from the management team '" + managementTeam.getName() + "'.");
        } else {
            System.out.println("User '" + user.getName() + "' is not part of the management team.");
        }
    }

    public void unregisterClient(ClientRegistration clientRegistration, User user) {
        boolean userFound = false;

        // Loop through all management teams to find the user
        for (Map.Entry<ManagementTeam, ArrayList<User>> entry : managementTeamAccounts.entrySet()) {
            ManagementTeam managementTeam = entry.getKey();
            ArrayList<User> users = managementTeam.getRegisteredUsers();  // Get the list of registered users in the team

            // Check if the user is in this management team's list of users
            if (users.contains(user)) {
                userFound = true;

                // Unregister the user
                clientRegistration.unregisterClient(user, managementTeam);

                // Remove the user from the management team’s list of registered users
                managementTeam.removeUser(user);

                // Print confirmation of successful unregistration
                System.out.println("'" + user.getName() + "' has been successfully unregistered from the YorkU Parking System in managementTeam '" + managementTeam.getName() + "'.");
                break; // Exit the loop after finding the user
            }
        }

        if (!userFound) {
            System.out.println("User is not registered in any management team.");
        }
    }


    // get users of a specific management team
    public void showUsersOfManagementTeam(ManagementTeam managementTeam) {
        // Fetch users using the method from the ManagementTeam class
        ArrayList<User> users = managementTeam.getRegisteredUsers();
        if (users.isEmpty()) {
            System.out.println("No users registered for this management team.");
        } else {
            System.out.println("===== Users in Management Team: " + managementTeam.getName() + " =====");
            for (User user : users) {
                System.out.println("User: " + user.getName() + " (ID: " + user.getUserID() + ")");
            }
        }
    }
}

