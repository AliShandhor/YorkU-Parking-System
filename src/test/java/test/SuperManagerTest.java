package test;

import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;
import com.yorku.parkingsystem.management.ClientRegistration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SuperManagerTest {

    private SuperManager superManager;
    private ManagementTeam managementTeam;
    private User user;

    @BeforeEach
    void setUp() {
        superManager = SuperManager.getSuperManagerInstance("Gias Uddin", "gias.uddin@yorku.com", "EECS3311$admin");
        managementTeam = new ManagementTeam();
        user = UserFactory.getUser("STUDENT", "Ali Shandhor", "CWFZ590", "a.shanzoor@yorku.com", "Ali05585852454$");
    }

    @Test
    void testSingletonInstance() {
        SuperManager anotherInstance = SuperManager.getSuperManagerInstance("admin", "admin@example.com", "password123");
        assertSame(superManager, anotherInstance);
    }

    @Test
    void testAuthenticateSuperManager() {
        assertTrue(SuperManager.authenticateSuperManager("gias.uddin@yorku.com", "EECS3311$admin"));
        assertFalse(SuperManager.authenticateSuperManager("gias.uddin@yorku.com", "EECS3311$admin"));
    }

    @Test
    void testGenerateManagementTeamAccount() {
        superManager.generateManagementTeamAccount(managementTeam);
        assertTrue(SuperManager.getManagementTeamAccounts().containsKey(managementTeam));
    }

    @Test
    void testRemoveManagementTeam() {
        superManager.generateManagementTeamAccount(managementTeam);
        superManager.removeManagementTeam(managementTeam);
        assertFalse(SuperManager.getManagementTeamAccounts().containsKey(managementTeam));
    }

    @Test
    void testAddUserToManagementTeam() {
        superManager.generateManagementTeamAccount(managementTeam);
        superManager.addUserToManagementTeam(new ClientRegistration(), managementTeam, user);
        assertTrue(managementTeam.getRegisteredUsers().contains(user));
    }

    @Test
    void testRemoveUserFromManagementTeam() {
        superManager.generateManagementTeamAccount(managementTeam);
        superManager.addUserToManagementTeam(new ClientRegistration(), managementTeam, user);
        superManager.removeUserFromManagementTeam(managementTeam, user);
        assertFalse(managementTeam.getRegisteredUsers().contains(user));
    }
}