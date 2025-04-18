package com.yorku.parkingsystem.management;

import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagementTeamTest {
    private ManagementTeam managementTeam;
    private ClientRegistration clientRegistration;
    private User user1;
    private User user2;

    @BeforeEach
    void setUp() {

        SuperManager superManager = SuperManager.getSuperManagerInstance("Gias Uddin", "gias.uddin@yorku.com", "EECS3311$admin");
        clientRegistration = new ClientRegistration();
        managementTeam = new ManagementTeam();

        superManager.generateManagementTeamAccount(managementTeam);

        user1 = UserFactory.getUser("STUDENT", "Ali Shandhor", "CWFZ590", "a.shanzoor@yorku.com", "Ali05585852454$");
        user2 = UserFactory.getUser("VISITOR", "Uzma Alam", "CWSZ112", "ali2030@yorku.com", "Uu123456789!");
    }
    @Test
    void testAuthenticateManagementTeamAccount() {
        // Authenticate management team account with correct credentials
        assertTrue(managementTeam.authenticateManagementTeamAccount(managementTeam.getName(), managementTeam.getPassword()));

        // Authenticate management team account with incorrect credentials
        assertFalse(managementTeam.authenticateManagementTeamAccount("wrongUserName", "wrongPassword"));

        // Register and add user1
        clientRegistration.registerClient(user1, managementTeam);
        managementTeam.addUser(user1);

        // Attempt to authenticate user1 with invalid password
        boolean isAuthenticated = managementTeam.authenticateManagementTeamAccount(user1.getName(), "wrongPassword");
        assertFalse(isAuthenticated, "User should not be authenticated with wrong password");

        // Attempt to authenticate user1 with invalid username
        isAuthenticated = managementTeam.authenticateManagementTeamAccount("wrongUsername", user1.getPassword());
        assertFalse(isAuthenticated, "User should not be authenticated with wrong username");
    }

    @Test
    void testAddUser() {
        // register user1
        clientRegistration.registerClient(user1, managementTeam);
        // add user1
        managementTeam.addUser(user1);
        assertEquals(1, managementTeam.getUsersCount());
        assertTrue(managementTeam.getRegisteredUsers().contains(user1));
        // register user2
        clientRegistration.registerClient(user2, managementTeam);
        managementTeam.addUser(user2);
        assertEquals(2, managementTeam.getUsersCount());
    }

    @Test
    void testRemoveUser() {
        // register user1
        clientRegistration.registerClient(user1, managementTeam);
        // add user1
        managementTeam.addUser(user1);
        assertEquals(1, managementTeam.getUsersCount());
        // remove user1
        managementTeam.removeUser(user1);
        assertEquals(0, managementTeam.getUsersCount());

        managementTeam.removeUser(user2); // user2 is not in the list
        assertEquals(0, managementTeam.getUsersCount());

        // user1 should not be in the list
        assertFalse(managementTeam.getRegisteredUsers().contains(user1));

    }

    @Test
    void testDisplayUsers() {
        clientRegistration.registerClient(user1, managementTeam);
        clientRegistration.registerClient(user2, managementTeam);
        managementTeam.addUser(user1);
        managementTeam.addUser(user2);
        managementTeam.displayUsers(); // Should display user1 & user2 details
    }

    @Test
    void testGetUsersCount() {
        assertEquals(0, managementTeam.getUsersCount());

        clientRegistration.registerClient(user1, managementTeam);
        clientRegistration.registerClient(user2, managementTeam);

        managementTeam.addUser(user1);
        assertEquals(1, managementTeam.getUsersCount());

        managementTeam.addUser(user2);
        assertEquals(2, managementTeam.getUsersCount());
    }

    @Test
    void testIsRegistered() {
        assertTrue(managementTeam.isRegistered());
        managementTeam.register(false);
        assertFalse(managementTeam.isRegistered());
    }

    @Test
    void testAddDuplicateUser() {
        clientRegistration.registerClient(user1, managementTeam);
        managementTeam.addUser(user1);

        managementTeam.addUser(user1); // Adding the same user again
        assertEquals(1, managementTeam.getUsersCount()); // Should still be 1
    }

    @Test
    void testRemoveNonExistentUser() {
        managementTeam.removeUser(user1); // Removing a user that was never added
        assertEquals(0, managementTeam.getUsersCount());
    }


    @Test
    void testReAddUser() {
        // Register and add user1
        clientRegistration.registerClient(user1, managementTeam);
        managementTeam.addUser(user1);
        assertEquals(1, managementTeam.getUsersCount());
        assertTrue(managementTeam.getRegisteredUsers().contains(user1));

        // Remove user1
        managementTeam.removeUser(user1);
        assertEquals(0, managementTeam.getUsersCount());
        assertFalse(managementTeam.getRegisteredUsers().contains(user1));

        // Re-add user1
        managementTeam.addUser(user1);
        assertEquals(1, managementTeam.getUsersCount());
        assertTrue(managementTeam.getRegisteredUsers().contains(user1));
    }


    @Test
    void testGetRegisteredUsers() {
        // Initially, the list should be empty
        assertTrue(managementTeam.getRegisteredUsers().isEmpty());

        // Register and add user1
        clientRegistration.registerClient(user1, managementTeam);
        managementTeam.addUser(user1);
        assertEquals(1, managementTeam.getRegisteredUsers().size());
        assertTrue(managementTeam.getRegisteredUsers().contains(user1));

        // Register and add user2
        clientRegistration.registerClient(user2, managementTeam);
        managementTeam.addUser(user2);
        assertEquals(2, managementTeam.getRegisteredUsers().size());
        assertTrue(managementTeam.getRegisteredUsers().contains(user2));
    }

    @Test
    void testAddUnregisteredUser() {
        // Create a user who is not registered in the system; we do not use 'clientRegistration.registerClient()' to register this user
        User unregisteredUser = UserFactory.getUser("STUDENT", "John Doe", "XYZ123", "john.doe@yorku.com", "Password123!");

        // Attempt to add the unregistered user to the management team
        managementTeam.addUser(unregisteredUser);

        // Verify that the unregistered user is not added to the management team
        assertEquals(0, managementTeam.getUsersCount(), "Unregistered user should not be added to the management team");
        assertFalse(managementTeam.getRegisteredUsers().contains(unregisteredUser), "Unregistered user should not be in the registered users list");
    }

    @Test
    void testReset() {
        // Register and add user1
        clientRegistration.registerClient(user1, managementTeam);
        managementTeam.addUser(user1);
        managementTeam.setName("TestName");
        managementTeam.setPassword("TestPassword");
        managementTeam.setID(123);

        // Reset the management team
        managementTeam.reset();

        // Verify that all fields are reset
        assertNull(managementTeam.getName());
        assertNull(managementTeam.getPassword());
        assertEquals(0, managementTeam.getID());
        assertFalse(managementTeam.isRegistered());
        assertTrue(managementTeam.getRegisteredUsers().isEmpty());
    }

    @Test
    void testToString() {
        managementTeam.setName("TestName");
        managementTeam.setPassword("TestPassword");
        managementTeam.register(true);

        String expected = "ManagementTeam{name='TestName'password= TestPassword, registered= true, usersCount=0}";
        assertEquals(expected, managementTeam.toString());
    }

    @Test
    void testSetName() {
        managementTeam.setName("NewName");
        assertEquals("NewName", managementTeam.getName());
    }

    @Test
    void testSetPassword() {
        managementTeam.setPassword("NewPassword");
        assertEquals("NewPassword", managementTeam.getPassword());
    }

    @Test
    void testSetID() {
        managementTeam.setID(456);
        assertEquals(456, managementTeam.getID());
    }

    @Test
    void testGetID() {
        managementTeam.setID(789);
        assertEquals(789, managementTeam.getID());
    }


}