package test;

import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;
import com.yorku.parkingsystem.management.ClientRegistration;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SuperManagerTest {

    private SuperManager superManager;
    private ManagementTeam managementTeam;
    private User user;

    @Before
    public void setUp() {
        superManager = SuperManager.getSuperManagerInstance("Gias Uddin", "gias.uddin@yorku.com", "EECS3311$admin");
        managementTeam = new ManagementTeam();
        user = UserFactory.getUser("STUDENT", "Ali Shandhor", "CWFZ590", "a.shanzoor@yorku.com", "Ali05585852454$");
    }

    @Test
    public void testSingletonInstance() {
        SuperManager anotherInstance = SuperManager.getSuperManagerInstance("admin", "admin@example.com", "password123");
        assertSame(superManager, anotherInstance);
    }

    @Test
    public void testAuthenticateSuperManager() {
        // Test with correct credentials (email + password)
        assertTrue(SuperManager.authenticateSuperManager("gias.uddin@yorku.com", "EECS3311$admin"));
        // Test with incorrect credentials (wrong password)
        assertFalse(SuperManager.authenticateSuperManager("gias.uddin@yorku.com", "EECS3311$wrongAdmin"));
        // Test with incorrect credentials (wrong email)
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
}