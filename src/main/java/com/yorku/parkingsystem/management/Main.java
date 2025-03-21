package com.yorku.parkingsystem.management;

import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;

import java.util.ArrayList;

public class Main {
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
        User user2 = UserFactory.getUser("FacultyMember", "John Doe", "XYZ5678", "john.doe@yorku.ca", "sSss1111@");
        User user3 = UserFactory.getUser("NonFacultyMember", "Jane Smith", "LMN2345", "jane.smith@yorku.ca", "sSss119187%");

        // Create Users for management team 2 with updated passwords
        User user4 = UserFactory.getUser("Student", "Emily Davis", "JKL6789", "emily.davis@yorku.ca", "SA%a123456$");
        User user5 = UserFactory.getUser("FacultyMember", "Michael Brown", "PQR1234", "michael.brown@yorku.ca", "8s79a!sSs");
        User user6 = UserFactory.getUser("NonFacultyMember", "Sarah Johnson", "DEF9876", "sarah.johnson@yorku.ca", "Aaz867230$5");

        // Registering the users
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);

        for (User user : users) {
            clientRegistration.registerClient(user);
        }

        // Registering the management teams
        superManager.generateManagementTeamAccount(managementTeam1);
        superManager.generateManagementTeamAccount(managementTeam2);

        System.out.println("Management Teams Creation:");
        System.out.println(managementTeam1);
        System.out.println(managementTeam2);

        // Adding users to management teams
        managementTeam1.addUser(user1);
        managementTeam1.addUser(user2);
        managementTeam1.addUser(user3);

        managementTeam2.addUser(user4);
        managementTeam2.addUser(user5);
        managementTeam2.addUser(user6);

        // Display users in each team
        System.out.println("Users in Management Team 1:");
        managementTeam1.displayUsers();
        System.out.println("Users in Management Team 2:");
        managementTeam2.displayUsers();

        // Removing a user from management team 2
        managementTeam2.removeUser(user4);

        // Removing management team from Super Manager
        superManager.removeManagementTeam(managementTeam2);
        System.out.println("Management Team 2 after removal: " + managementTeam2);

        // Authenticating a user
       clientRegistration.authenticateUser("Ali Shandhor", "Aa123456$");


    }
}
