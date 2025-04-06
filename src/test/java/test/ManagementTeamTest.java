package test;

import com.yorku.parkingsystem.management.ClientRegistration;
import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.management.SuperManager;
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
        assertTrue(managementTeam.authenticateManagementTeamAccount(managementTeam.getName(), managementTeam.getPassword()));
        assertFalse(managementTeam.authenticateManagementTeamAccount("wrongUserName", "wrongPassword"));
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


}