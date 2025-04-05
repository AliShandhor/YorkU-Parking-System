package test;

import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;
import com.yorku.parkingsystem.management.ClientRegistration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SuperManagerTest {

    private SuperManager superManager;
    private ManagementTeam managementTeam;
    private User user;

    @BeforeEach
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
}
