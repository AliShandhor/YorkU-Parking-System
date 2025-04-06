package com.yorku.parkingsystem.management;

import com.yorku.parkingsystem.parking.parkinglot.ParkingLot;
import com.yorku.parkingsystem.parking.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.parking.parkingspot.ParkingSpotBuilder;
import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SuperManagerTest {

    private SuperManager superManager;
    private ManagementTeam managementTeam;
    private ClientRegistration clientRegistration;
    private User user;
    private ParkingLot parkingLot;
    private ParkingSpot parkingSpot;

    @BeforeEach
    public void setUp() {
        // creating super manager object
        superManager = SuperManager.getSuperManagerInstance("Gias Uddin", "gias.uddin@yorku.com", "EECS3311$admin");
        // creating management team object
        managementTeam = new ManagementTeam();
        // creating Client Registration object
        clientRegistration = new ClientRegistration();
        // creating user object
        user = UserFactory.getUser("STUDENT", "Ali Shandhor", "CWFZ590", "a.shanzoor@yorku.com", "Ali05585852454$");
        // Creating ParkingSpot objects using ParkingSpotBuilder
         parkingSpot = new ParkingSpotBuilder()
                .setLocation("Level 1, Zone A")
                .setAvailability(true)
                .build();
        // Create parking lot object
        parkingLot = new ParkingLot("Parking Lot 1", "Keele Campus");
    }

    @Test
    public void testSingletonInstance() {
        SuperManager anotherInstance = SuperManager.getSuperManagerInstance("admin", "admin@example.com", "password123");
        assertSame(superManager, anotherInstance);
    }

    @Test
    public void testAuthenticateSuperManager() {
        assertTrue(SuperManager.authenticateSuperManager("gias.uddin@yorku.com", "EECS3311$admin"));
        assertFalse(SuperManager.authenticateSuperManager("gias.uddin@yorku.com", "EECS3311$wrongAdmin"));
        assertFalse(SuperManager.authenticateSuperManager("uddin@yorku.com", "EECS3311$admin"));
    }

    @Test
    public void testGenerateManagementTeamAccount() {
        superManager.generateManagementTeamAccount(managementTeam);
        assertTrue(SuperManager.getManagementTeamAccounts().containsKey(managementTeam));
    }

    @Test
    public void testRemoveManagementTeam() {
        superManager.generateManagementTeamAccount(managementTeam);
        superManager.removeManagementTeam(managementTeam);
        assertFalse(SuperManager.getManagementTeamAccounts().containsKey(managementTeam));
    }

    @Test
    public void testAddUserToManagementTeam() {
        superManager.generateManagementTeamAccount(managementTeam);
        superManager.addUserToManagementTeam(new ClientRegistration(), managementTeam, user);
        assertTrue(managementTeam.getRegisteredUsers().contains(user));
    }

    @Test
    public void testRemoveUserFromManagementTeam() {
        superManager.generateManagementTeamAccount(managementTeam);
        superManager.addUserToManagementTeam(new ClientRegistration(), managementTeam, user);
        superManager.removeUserFromManagementTeam(managementTeam, user);
        assertFalse(managementTeam.getRegisteredUsers().contains(user));
    }

    @Test
    public void testGetManagementTeamAccounts() {
        superManager.generateManagementTeamAccount(managementTeam);
        assertTrue(SuperManager.getManagementTeamAccounts().containsKey(managementTeam));
    }

    @Test
    public void testGenerateStrongPasswordForManagementTeam() {
        String password = superManager.generateManagementTeamAccountPassword();
        assertNotNull(password);
        assertEquals(12, password.length());
    }

    @Test
    public void testGenerateUniqueUserNameForManagementTeam() {
        String userName = superManager.generateManagementTeamAccountName();
        assertNotNull(userName);
        assertEquals(5, userName.length());
    }

    @Test
    public void testAuthenticateManagementTeamAccount_Success() {
        superManager.generateManagementTeamAccount(managementTeam);
        String name = managementTeam.getName();
        String pass = managementTeam.getPassword();
        assertTrue(superManager.authenticateManagementTeamAccount(name, pass));
    }

    @Test
    public void testAuthenticateManagementTeamAccount_Fail() {
        superManager.generateManagementTeamAccount(managementTeam);
        assertFalse(superManager.authenticateManagementTeamAccount("wrongUserName", managementTeam.getPassword()));
        assertFalse(superManager.authenticateManagementTeamAccount(managementTeam.getName(), "wrongPassword"));
        assertTrue(superManager.authenticateManagementTeamAccount(managementTeam.getName(), managementTeam.getPassword()));
    }
    @Test
    public void testReserveAndUnreserveParkingSpot() {
        superManager.generateManagementTeamAccount(managementTeam);
        clientRegistration.registerClient(user, managementTeam);

        superManager.enableParkingLot(parkingLot);
        superManager.addParkingLot(parkingLot);

        superManager.enableParkingSpot(parkingSpot);
        superManager.addParkingSpace(parkingLot, parkingSpot);

        superManager.reserveParkingSpotForUser(user, parkingSpot);
        assertFalse(parkingSpot.isAvailable());

        assertTrue(superManager.getUserParkingMap().containsKey(user));

        superManager.unreserveParkingSpotForUser(user);
        assertTrue(parkingSpot.isAvailable());
        assertFalse(superManager.getUserParkingMap().containsKey(user));



        assertDoesNotThrow(() -> superManager.reserveParkingSpotForUser(user, parkingSpot));

        assertTrue(superManager.getUserParkingMap().containsKey(user));
        assertFalse(parkingSpot.isAvailable());

        assertThrows(NullPointerException.class, () ->
                superManager.reserveParkingSpotForUser(null, parkingSpot)
        );
        assertThrows(NullPointerException.class, () ->
                superManager.reserveParkingSpotForUser(user, null)
        );

    }


}
