package com.yorku.parkingsystem.management;

import com.yorku.parkingsystem.parking.parkinglot.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.parking.parkinglot.parkingspot.ParkingSpotBuilder;
import com.yorku.parkingsystem.user.Booking;
import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;

import java.util.ArrayList;
import java.util.Date;

public class ManagementMain {
    public static void main(String[] args) {
        // Create Super Manager
        SuperManager superManager = SuperManager.getSuperManagerInstance("Gias Udin", "gias.udin@gmail.com", "eecs331");

        // Create Management Teams
        ManagementTeam managementTeam1 = new ManagementTeam();
        ManagementTeam managementTeam2 = new ManagementTeam();

        // Client Registration
        ClientRegistration clientRegistration = new ClientRegistration();

        // Create Users for management team 1 with updated passwords
        User user1 = UserFactory.getUser("Student", "Ali Shandhor", "CWFZ590", "a.shanzoor@gmail.com", "Aa123456$");
        User user2 = UserFactory.getUser("Student", "Emily Davis", "CWFZ 1111", "emily.davis@gmail.com", "123456789");
        // Registering the management teams
        superManager.generateManagementTeamAccount(managementTeam1);

        superManager.generateManagementTeamAccount(managementTeam2);

        clientRegistration.registerClient(user1, managementTeam1);
        clientRegistration.registerClient(user2, managementTeam2);

        System.out.println("Management Teams Creation:");
        System.out.println(managementTeam1);
        System.out.println(managementTeam2);

        // Adding users to management teams
        managementTeam1.addUser(user1);
        managementTeam2.addUser(user2);

        // Display users in each team
        System.out.println("Users in Management Team 1:");
        managementTeam1.displayUsers();

        System.out.println("Users in Management Team 2:");
        managementTeam2.displayUsers();


//        Booking booking = new Booking();


//        // Removing a user from management team 2
//        managementTeam2.removeUser(user4);
//
//        // Removing management team from Super Manager
//        superManager.removeManagementTeam(managementTeam2);
//        System.out.println("Management Team 2 after removal: " + managementTeam2);
//
//        // Authenticating a user
//       clientRegistration.authenticateUser("Emily Davis", "SA%a123456$");
//
//
//        // Displaying Super Manager Info
//        superManager.showSuperManagerInfo();
//        // Displaying Management Teams with Users
//        superManager.showManagementTeamsWithUsers();
//
//        // Add new User from Super Manger side
//
//        User user7 = UserFactory.getUser("Student", "Sarah Alex", "CWZ 812", "sarah.alex@yorku.ca", "SarahAlex123$");
//        // Add user7 using super manager
//        superManager.addUserToManagementTeam(clientRegistration, managementTeam1, user7); // not important for now
//
//        clientRegistration.unregisterClient(user4, null); // not important for now
//
//        clientRegistration.displayRegisteredUsers();
//
//        superManager.removeUserFromManagementTeam(managementTeam1, user7);
//
//        // Displaying Management Teams with Users
//        managementTeam1.displayUsers();
//
//        // Displaying Management Teams with Users
//        superManager.showUsersOfManagementTeam(managementTeam1);



    }
}
