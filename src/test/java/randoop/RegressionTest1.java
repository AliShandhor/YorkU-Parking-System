package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass9 = userList8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean9 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        int int4 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user21, managementTeam22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        int int15 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user16, managementTeam17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        boolean boolean15 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration0.unregisterClient(user12, managementTeam13);
        boolean boolean16 = clientRegistration0.isValidPassword("");
        boolean boolean18 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        int int18 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        boolean boolean23 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean19 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration20 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean22 = clientRegistration20.isValidEmail("hi!");
        boolean boolean24 = clientRegistration20.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration20.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration20.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList26, managementTeam27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        boolean boolean20 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration21 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean23 = clientRegistration21.isValidEmail("");
        com.yorku.parkingsystem.user.User user24 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam25 = null;
        clientRegistration21.unregisterClient(user24, managementTeam25);
        boolean boolean28 = clientRegistration21.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList29 = clientRegistration21.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam30 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList29, managementTeam30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        boolean boolean7 = clientRegistration0.hasValidLicensePlate(user6);
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration9 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean11 = clientRegistration9.isValidEmail("");
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration9.unregisterClient(user12, managementTeam13);
        boolean boolean16 = clientRegistration9.isValidEmail("");
        clientRegistration9.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration9.getRegisteredUsers();
        boolean boolean22 = clientRegistration9.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user23 = null;
        boolean boolean24 = clientRegistration9.hasValidLicensePlate(user23);
        boolean boolean26 = clientRegistration9.isValidEmail("hi!");
        int int27 = clientRegistration9.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList28 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam29 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList28, managementTeam29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean10 = clientRegistration0.isValidEmail("");
        boolean boolean12 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        boolean boolean14 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        boolean boolean19 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        int int19 = clientRegistration0.getUserID();
        java.lang.Class<?> wildcardClass20 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass18 = userList17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        boolean boolean19 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user20, managementTeam21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        int int7 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration10 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean12 = clientRegistration10.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user13 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam14 = null;
        clientRegistration10.unregisterClient(user13, managementTeam14);
        clientRegistration10.authenticateUser("", "");
        clientRegistration10.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration10.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList22, managementTeam23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        boolean boolean17 = clientRegistration0.hasValidLicensePlate(user16);
        int int18 = clientRegistration0.getUserID();
        boolean boolean20 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration0.unregisterClient(user21, managementTeam22);
        com.yorku.parkingsystem.user.User user24 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam25 = null;
        clientRegistration0.unregisterClient(user24, managementTeam25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.user.User user25 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        clientRegistration0.unregisterClient(user25, managementTeam26);
        int int28 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration0.unregisterClient(user21, managementTeam22);
        clientRegistration0.authenticateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.displayRegisteredUsers();
        int int24 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration25 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean27 = clientRegistration25.isValidEmail("");
        com.yorku.parkingsystem.user.User user28 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam29 = null;
        clientRegistration25.unregisterClient(user28, managementTeam29);
        clientRegistration25.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList32 = clientRegistration25.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam33 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList32, managementTeam33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidPassword("");
        java.lang.Class<?> wildcardClass12 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration0.getRegisteredUsers();
        int int14 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidEmail("hi!");
        boolean boolean10 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        int int9 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean13 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "");
        boolean boolean11 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        boolean boolean6 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("", "hi!");
        int int17 = clientRegistration0.getUserID();
        boolean boolean19 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user20, managementTeam21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        boolean boolean19 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user22, managementTeam23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        boolean boolean16 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration0.getRegisteredUsers();
        int int18 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList4 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user5 = null;
        boolean boolean6 = clientRegistration0.hasValidLicensePlate(user5);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList7, managementTeam8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        boolean boolean22 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList24 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user25 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        clientRegistration0.unregisterClient(user25, managementTeam26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("", "");
        boolean boolean22 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration23 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean25 = clientRegistration23.isValidEmail("hi!");
        boolean boolean27 = clientRegistration23.isValidEmail("hi!");
        clientRegistration23.displayRegisteredUsers();
        clientRegistration23.authenticateUser("", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList32 = clientRegistration23.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam33 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList32, managementTeam33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user10, managementTeam11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("");
        java.lang.Class<?> wildcardClass20 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean9 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        int int11 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        boolean boolean20 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user21 = null;
        boolean boolean22 = clientRegistration0.hasValidLicensePlate(user21);
        boolean boolean24 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration25 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean27 = clientRegistration25.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList28 = clientRegistration25.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList29 = clientRegistration25.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam30 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList29, managementTeam30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration0.getRegisteredUsers();
        boolean boolean19 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean27 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration28 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean30 = clientRegistration28.isValidEmail("");
        com.yorku.parkingsystem.user.User user31 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        clientRegistration28.unregisterClient(user31, managementTeam32);
        int int34 = clientRegistration28.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList35 = clientRegistration28.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList36 = clientRegistration28.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam37 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList36, managementTeam37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        boolean boolean11 = clientRegistration0.isValidPassword("");
        boolean boolean13 = clientRegistration0.isValidEmail("");
        boolean boolean15 = clientRegistration0.isValidEmail("hi!");
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        com.yorku.parkingsystem.user.User user22 = null;
        boolean boolean23 = clientRegistration0.hasValidLicensePlate(user22);
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration0.unregisterClient(user27, managementTeam28);
        int int30 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList31 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user9 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam10 = null;
        clientRegistration0.unregisterClient(user9, managementTeam10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration0.getRegisteredUsers();
        boolean boolean20 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        boolean boolean27 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean25 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user26 = null;
        boolean boolean27 = clientRegistration0.hasValidLicensePlate(user26);
        boolean boolean29 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user30 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam31 = null;
        clientRegistration0.unregisterClient(user30, managementTeam31);
        boolean boolean34 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration0.unregisterClient(user8, managementTeam9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.user.User user9 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam10 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user9, managementTeam10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        int int15 = clientRegistration0.getUserID();
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user18, managementTeam19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        int int9 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        boolean boolean14 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration0.getRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        int int10 = clientRegistration0.getUserID();
        boolean boolean12 = clientRegistration0.isValidEmail("");
        java.lang.Class<?> wildcardClass13 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        boolean boolean22 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user23 = null;
        boolean boolean24 = clientRegistration0.hasValidLicensePlate(user23);
        com.yorku.parkingsystem.user.User user25 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user25, managementTeam26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        clientRegistration0.displayRegisteredUsers();
        int int10 = clientRegistration0.getUserID();
        boolean boolean12 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        int int25 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        boolean boolean23 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration24 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean26 = clientRegistration24.isValidEmail("");
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration24.unregisterClient(user27, managementTeam28);
        boolean boolean31 = clientRegistration24.isValidEmail("");
        clientRegistration24.authenticateUser("hi!", "");
        boolean boolean36 = clientRegistration24.isValidPassword("");
        clientRegistration24.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user38 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam39 = null;
        clientRegistration24.unregisterClient(user38, managementTeam39);
        com.yorku.parkingsystem.user.User user41 = null;
        boolean boolean42 = clientRegistration24.hasValidLicensePlate(user41);
        boolean boolean44 = clientRegistration24.isValidPassword("");
        com.yorku.parkingsystem.user.User user45 = null;
        boolean boolean46 = clientRegistration24.hasValidLicensePlate(user45);
        boolean boolean48 = clientRegistration24.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList49 = clientRegistration24.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam50 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList49, managementTeam50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(userList49);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        com.yorku.parkingsystem.user.User user22 = null;
        boolean boolean23 = clientRegistration0.hasValidLicensePlate(user22);
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration0.unregisterClient(user27, managementTeam28);
        int int30 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user15, managementTeam16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean4 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        boolean boolean10 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration11 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean13 = clientRegistration11.isValidEmail("");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration11.unregisterClient(user14, managementTeam15);
        int int17 = clientRegistration11.getUserID();
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration11.hasValidLicensePlate(user18);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration11.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList20, managementTeam21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        int int13 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration0.unregisterClient(user22, managementTeam23);
        java.lang.Class<?> wildcardClass25 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user2 = null;
        boolean boolean3 = clientRegistration0.hasValidLicensePlate(user2);
        clientRegistration0.displayRegisteredUsers();
        int int5 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        clientRegistration0.authenticateUser("hi!", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass23 = userList22.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration11 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean13 = clientRegistration11.isValidEmail("");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration11.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration11.isValidEmail("");
        clientRegistration11.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user22 = null;
        boolean boolean23 = clientRegistration11.hasValidLicensePlate(user22);
        boolean boolean25 = clientRegistration11.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration11.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList26, managementTeam27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "hi!");
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        int int7 = clientRegistration0.getUserID();
        int int8 = clientRegistration0.getUserID();
        boolean boolean10 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        boolean boolean10 = clientRegistration0.isValidPassword("");
        boolean boolean12 = clientRegistration0.isValidEmail("");
        boolean boolean14 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        clientRegistration0.authenticateUser("", "");
        boolean boolean14 = clientRegistration0.isValidPassword("");
        boolean boolean16 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user19, managementTeam20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user16 = null;
        boolean boolean17 = clientRegistration0.hasValidLicensePlate(user16);
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        com.yorku.parkingsystem.user.User user5 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam6 = null;
        clientRegistration0.unregisterClient(user5, managementTeam6);
        int int8 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        int int22 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user24 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam25 = null;
        clientRegistration0.unregisterClient(user24, managementTeam25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user2 = null;
        boolean boolean3 = clientRegistration0.hasValidLicensePlate(user2);
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass6 = userList5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        boolean boolean19 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        boolean boolean24 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean23 = clientRegistration0.isValidPassword("hi!");
        java.lang.Class<?> wildcardClass24 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        boolean boolean23 = clientRegistration0.isValidEmail("hi!");
        boolean boolean25 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration26 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean28 = clientRegistration26.isValidEmail("");
        clientRegistration26.displayRegisteredUsers();
        clientRegistration26.displayRegisteredUsers();
        clientRegistration26.authenticateUser("hi!", "");
        int int34 = clientRegistration26.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList35 = clientRegistration26.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam36 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList35, managementTeam36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.authenticateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        int int10 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        boolean boolean27 = clientRegistration0.isValidEmail("");
        int int28 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        boolean boolean10 = clientRegistration0.isValidEmail("");
        boolean boolean12 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        com.yorku.parkingsystem.user.User user22 = null;
        boolean boolean23 = clientRegistration0.hasValidLicensePlate(user22);
        com.yorku.parkingsystem.user.User user24 = null;
        boolean boolean25 = clientRegistration0.hasValidLicensePlate(user24);
        boolean boolean27 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        com.yorku.parkingsystem.user.User user31 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user31, managementTeam32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration11 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean13 = clientRegistration11.isValidEmail("hi!");
        clientRegistration11.authenticateUser("", "hi!");
        boolean boolean18 = clientRegistration11.isValidPassword("");
        boolean boolean20 = clientRegistration11.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration11.unregisterClient(user21, managementTeam22);
        clientRegistration11.displayRegisteredUsers();
        clientRegistration11.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList28 = clientRegistration11.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam29 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList28, managementTeam29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean25 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user26 = null;
        boolean boolean27 = clientRegistration0.hasValidLicensePlate(user26);
        boolean boolean29 = clientRegistration0.isValidEmail("hi!");
        int int30 = clientRegistration0.getUserID();
        boolean boolean32 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        int int15 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList16 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        com.yorku.parkingsystem.user.User user22 = null;
        boolean boolean23 = clientRegistration0.hasValidLicensePlate(user22);
        com.yorku.parkingsystem.user.User user24 = null;
        boolean boolean25 = clientRegistration0.hasValidLicensePlate(user24);
        boolean boolean27 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        com.yorku.parkingsystem.user.User user31 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        clientRegistration0.unregisterClient(user31, managementTeam32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "hi!");
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user23, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration7 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean9 = clientRegistration7.isValidEmail("");
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration7.unregisterClient(user10, managementTeam11);
        boolean boolean14 = clientRegistration7.isValidEmail("");
        clientRegistration7.authenticateUser("hi!", "");
        boolean boolean19 = clientRegistration7.isValidPassword("");
        clientRegistration7.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration7.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration7.unregisterClient(user22, managementTeam23);
        boolean boolean26 = clientRegistration7.isValidEmail("hi!");
        clientRegistration7.displayRegisteredUsers();
        clientRegistration7.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList29 = clientRegistration7.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam30 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList29, managementTeam30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        boolean boolean10 = clientRegistration0.isValidPassword("");
        boolean boolean12 = clientRegistration0.isValidEmail("");
        boolean boolean14 = clientRegistration0.isValidPassword("");
        int int15 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        clientRegistration0.authenticateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.authenticateUser("hi!", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user13 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam14 = null;
        clientRegistration0.unregisterClient(user13, managementTeam14);
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user23, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration14 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean16 = clientRegistration14.isValidEmail("hi!");
        boolean boolean18 = clientRegistration14.isValidEmail("hi!");
        clientRegistration14.displayRegisteredUsers();
        int int20 = clientRegistration14.getUserID();
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration14.unregisterClient(user21, managementTeam22);
        com.yorku.parkingsystem.user.User user24 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam25 = null;
        clientRegistration14.unregisterClient(user24, managementTeam25);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList27 = clientRegistration14.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList27, managementTeam28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user24 = null;
        boolean boolean25 = clientRegistration0.hasValidLicensePlate(user24);
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        java.lang.Class<?> wildcardClass18 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        com.yorku.parkingsystem.user.User user13 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam14 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user13, managementTeam14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user19 = null;
        boolean boolean20 = clientRegistration0.hasValidLicensePlate(user19);
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user17, managementTeam18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        boolean boolean11 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user14, managementTeam15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean12 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        com.yorku.parkingsystem.user.User user22 = null;
        boolean boolean23 = clientRegistration0.hasValidLicensePlate(user22);
        clientRegistration0.authenticateUser("hi!", "hi!");
        clientRegistration0.authenticateUser("hi!", "hi!");
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        clientRegistration0.authenticateUser("", "");
        boolean boolean24 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        int int15 = clientRegistration0.getUserID();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        boolean boolean22 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user23 = null;
        boolean boolean24 = clientRegistration0.hasValidLicensePlate(user23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration0.unregisterClient(user22, managementTeam23);
        com.yorku.parkingsystem.user.User user25 = null;
        boolean boolean26 = clientRegistration0.hasValidLicensePlate(user25);
        boolean boolean28 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration0.getRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration16 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean18 = clientRegistration16.isValidEmail("");
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration16.unregisterClient(user19, managementTeam20);
        boolean boolean23 = clientRegistration16.isValidEmail("");
        clientRegistration16.authenticateUser("hi!", "");
        boolean boolean28 = clientRegistration16.isValidPassword("");
        clientRegistration16.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user30 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam31 = null;
        clientRegistration16.unregisterClient(user30, managementTeam31);
        clientRegistration16.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList34 = clientRegistration16.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam35 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList34, managementTeam35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        int int7 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.authenticateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        clientRegistration0.authenticateUser("", "");
        boolean boolean30 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user31 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        clientRegistration0.unregisterClient(user31, managementTeam32);
        com.yorku.parkingsystem.user.User user34 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam35 = null;
        clientRegistration0.unregisterClient(user34, managementTeam35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean25 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user26 = null;
        boolean boolean27 = clientRegistration0.hasValidLicensePlate(user26);
        boolean boolean29 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user30 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam31 = null;
        clientRegistration0.unregisterClient(user30, managementTeam31);
        boolean boolean34 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user36 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam37 = null;
        clientRegistration0.unregisterClient(user36, managementTeam37);
        boolean boolean40 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidPassword("");
        java.lang.Class<?> wildcardClass14 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        boolean boolean17 = clientRegistration0.hasValidLicensePlate(user16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user18, managementTeam19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user14, managementTeam15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        clientRegistration0.authenticateUser("", "");
        int int23 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        int int26 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration0.unregisterClient(user27, managementTeam28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.authenticateUser("hi!", "hi!");
        clientRegistration0.authenticateUser("hi!", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        clientRegistration0.authenticateUser("", "");
        boolean boolean14 = clientRegistration0.isValidPassword("");
        boolean boolean16 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        clientRegistration0.displayRegisteredUsers();
        int int18 = clientRegistration0.getUserID();
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        com.yorku.parkingsystem.user.User user9 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam10 = null;
        clientRegistration0.unregisterClient(user9, managementTeam10);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration12 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean14 = clientRegistration12.isValidEmail("");
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration12.unregisterClient(user15, managementTeam16);
        boolean boolean19 = clientRegistration12.isValidEmail("");
        clientRegistration12.authenticateUser("hi!", "");
        clientRegistration12.authenticateUser("hi!", "");
        clientRegistration12.authenticateUser("", "hi!");
        int int29 = clientRegistration12.getUserID();
        boolean boolean31 = clientRegistration12.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList32 = clientRegistration12.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam33 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList32, managementTeam33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList14, managementTeam15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        int int13 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration0.unregisterClient(user22, managementTeam23);
        com.yorku.parkingsystem.user.User user25 = null;
        boolean boolean26 = clientRegistration0.hasValidLicensePlate(user25);
        boolean boolean28 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user29 = null;
        boolean boolean30 = clientRegistration0.hasValidLicensePlate(user29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean22 = clientRegistration0.isValidPassword("hi!");
        boolean boolean24 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration0.getRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user19, managementTeam20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        boolean boolean10 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user14, managementTeam15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        int int10 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        int int16 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration17 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean19 = clientRegistration17.isValidEmail("hi!");
        boolean boolean21 = clientRegistration17.isValidEmail("hi!");
        clientRegistration17.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user23 = null;
        boolean boolean24 = clientRegistration17.hasValidLicensePlate(user23);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration17.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList25, managementTeam26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        boolean boolean5 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        boolean boolean14 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        clientRegistration0.displayRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "");
        boolean boolean24 = clientRegistration0.isValidEmail("");
        boolean boolean26 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user9 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam10 = null;
        clientRegistration0.unregisterClient(user9, managementTeam10);
        boolean boolean13 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        clientRegistration0.displayRegisteredUsers();
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user19 = null;
        boolean boolean20 = clientRegistration0.hasValidLicensePlate(user19);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration0.unregisterClient(user22, managementTeam23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        boolean boolean10 = clientRegistration0.isValidEmail("");
        boolean boolean12 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration0.unregisterClient(user12, managementTeam13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        boolean boolean19 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration21 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean23 = clientRegistration21.isValidEmail("");
        clientRegistration21.authenticateUser("hi!", "hi!");
        int int27 = clientRegistration21.getUserID();
        com.yorku.parkingsystem.user.User user28 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam29 = null;
        clientRegistration21.unregisterClient(user28, managementTeam29);
        com.yorku.parkingsystem.user.User user31 = null;
        boolean boolean32 = clientRegistration21.hasValidLicensePlate(user31);
        com.yorku.parkingsystem.user.User user33 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam34 = null;
        clientRegistration21.unregisterClient(user33, managementTeam34);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList36 = clientRegistration21.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList37 = clientRegistration21.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam38 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList37, managementTeam38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList37);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        int int16 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "hi!");
        int int20 = clientRegistration0.getUserID();
        boolean boolean22 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        int int7 = clientRegistration0.getUserID();
        boolean boolean9 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("", "");
        java.lang.Class<?> wildcardClass13 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean27 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user28 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam29 = null;
        clientRegistration0.unregisterClient(user28, managementTeam29);
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user11, managementTeam12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration0.unregisterClient(user21, managementTeam22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean27 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user28 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam29 = null;
        clientRegistration0.unregisterClient(user28, managementTeam29);
        java.lang.Class<?> wildcardClass31 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        clientRegistration0.authenticateUser("", "");
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        int int18 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        int int9 = clientRegistration0.getUserID();
        int int10 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration11 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean13 = clientRegistration11.isValidEmail("");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration11.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration11.isValidEmail("");
        clientRegistration11.authenticateUser("hi!", "");
        boolean boolean23 = clientRegistration11.isValidPassword("");
        clientRegistration11.displayRegisteredUsers();
        boolean boolean26 = clientRegistration11.isValidPassword("");
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration11.unregisterClient(user27, managementTeam28);
        com.yorku.parkingsystem.user.User user30 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam31 = null;
        clientRegistration11.unregisterClient(user30, managementTeam31);
        com.yorku.parkingsystem.user.User user33 = null;
        boolean boolean34 = clientRegistration11.hasValidLicensePlate(user33);
        clientRegistration11.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user38 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam39 = null;
        clientRegistration11.unregisterClient(user38, managementTeam39);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList41 = clientRegistration11.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam42 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList41, managementTeam42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList41);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration0.unregisterClient(user21, managementTeam22);
        boolean boolean25 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        boolean boolean11 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        clientRegistration0.unregisterClient(user17, managementTeam18);
        boolean boolean21 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        clientRegistration0.authenticateUser("", "");
        int int29 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        boolean boolean10 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user24 = null;
        boolean boolean25 = clientRegistration0.hasValidLicensePlate(user24);
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.authenticateUser("", "");
        boolean boolean33 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        int int13 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        boolean boolean10 = clientRegistration0.isValidPassword("");
        boolean boolean12 = clientRegistration0.isValidEmail("");
        boolean boolean14 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user9 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam10 = null;
        clientRegistration0.unregisterClient(user9, managementTeam10);
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration0.unregisterClient(user12, managementTeam13);
        int int15 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        com.yorku.parkingsystem.user.User user5 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam6 = null;
        clientRegistration0.unregisterClient(user5, managementTeam6);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration9 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean11 = clientRegistration9.isValidEmail("");
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration9.unregisterClient(user12, managementTeam13);
        boolean boolean16 = clientRegistration9.isValidEmail("");
        clientRegistration9.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user20 = null;
        boolean boolean21 = clientRegistration9.hasValidLicensePlate(user20);
        boolean boolean23 = clientRegistration9.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList24 = clientRegistration9.getRegisteredUsers();
        boolean boolean26 = clientRegistration9.isValidPassword("hi!");
        int int27 = clientRegistration9.getUserID();
        com.yorku.parkingsystem.user.User user28 = null;
        boolean boolean29 = clientRegistration9.hasValidLicensePlate(user28);
        clientRegistration9.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList33 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam34 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList33, managementTeam34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration25 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean27 = clientRegistration25.isValidEmail("");
        com.yorku.parkingsystem.user.User user28 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam29 = null;
        clientRegistration25.unregisterClient(user28, managementTeam29);
        boolean boolean32 = clientRegistration25.isValidEmail("");
        clientRegistration25.authenticateUser("hi!", "");
        boolean boolean37 = clientRegistration25.isValidPassword("");
        clientRegistration25.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList39 = clientRegistration25.getRegisteredUsers();
        int int40 = clientRegistration25.getUserID();
        boolean boolean42 = clientRegistration25.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user43 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam44 = null;
        clientRegistration25.unregisterClient(user43, managementTeam44);
        boolean boolean47 = clientRegistration25.isValidEmail("");
        com.yorku.parkingsystem.user.User user48 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam49 = null;
        clientRegistration25.unregisterClient(user48, managementTeam49);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList51 = clientRegistration25.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam52 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList51, managementTeam52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(userList51);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        com.yorku.parkingsystem.user.User user1 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam2 = null;
        clientRegistration0.unregisterClient(user1, managementTeam2);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        com.yorku.parkingsystem.user.User user13 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam14 = null;
        clientRegistration0.unregisterClient(user13, managementTeam14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean15 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user19, managementTeam20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        boolean boolean20 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user21 = null;
        boolean boolean22 = clientRegistration0.hasValidLicensePlate(user21);
        boolean boolean24 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user25 = null;
        boolean boolean26 = clientRegistration0.hasValidLicensePlate(user25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        boolean boolean23 = clientRegistration0.isValidEmail("hi!");
        boolean boolean25 = clientRegistration0.isValidPassword("hi!");
        int int26 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration0.unregisterClient(user27, managementTeam28);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList30 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        java.lang.Class<?> wildcardClass32 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user14, managementTeam15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user9 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam10 = null;
        clientRegistration0.unregisterClient(user9, managementTeam10);
        boolean boolean13 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user14, managementTeam15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user24 = null;
        boolean boolean25 = clientRegistration0.hasValidLicensePlate(user24);
        com.yorku.parkingsystem.user.User user26 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        clientRegistration0.unregisterClient(user26, managementTeam27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        int int18 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        int int17 = clientRegistration0.getUserID();
        int int18 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        clientRegistration0.displayRegisteredUsers();
        boolean boolean19 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration20 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean22 = clientRegistration20.isValidEmail("");
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration20.unregisterClient(user23, managementTeam24);
        boolean boolean27 = clientRegistration20.isValidEmail("");
        clientRegistration20.authenticateUser("hi!", "");
        clientRegistration20.authenticateUser("hi!", "");
        boolean boolean35 = clientRegistration20.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList36 = clientRegistration20.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam37 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList36, managementTeam37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        clientRegistration0.authenticateUser("", "");
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        clientRegistration0.displayRegisteredUsers();
        boolean boolean19 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user20, managementTeam21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        int int15 = clientRegistration0.getUserID();
        int int16 = clientRegistration0.getUserID();
        int int17 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        boolean boolean21 = clientRegistration0.isValidPassword("hi!");
        int int22 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        clientRegistration0.displayRegisteredUsers();
        boolean boolean25 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass10 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user5 = null;
        boolean boolean6 = clientRegistration0.hasValidLicensePlate(user5);
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user9 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam10 = null;
        clientRegistration0.unregisterClient(user9, managementTeam10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        boolean boolean17 = clientRegistration0.hasValidLicensePlate(user16);
        int int18 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass24 = userList23.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        int int7 = clientRegistration0.getUserID();
        int int8 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user9 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam10 = null;
        clientRegistration0.unregisterClient(user9, managementTeam10);
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        boolean boolean14 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "");
        boolean boolean12 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        boolean boolean10 = clientRegistration0.isValidEmail("");
        java.lang.Class<?> wildcardClass11 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidEmail("hi!");
        boolean boolean16 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration17 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean19 = clientRegistration17.isValidEmail("");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration17.unregisterClient(user20, managementTeam21);
        boolean boolean24 = clientRegistration17.isValidEmail("");
        clientRegistration17.authenticateUser("hi!", "");
        boolean boolean29 = clientRegistration17.isValidPassword("");
        clientRegistration17.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user31 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        clientRegistration17.unregisterClient(user31, managementTeam32);
        boolean boolean35 = clientRegistration17.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList36 = clientRegistration17.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user37 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam38 = null;
        clientRegistration17.unregisterClient(user37, managementTeam38);
        com.yorku.parkingsystem.user.User user40 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam41 = null;
        clientRegistration17.unregisterClient(user40, managementTeam41);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList43 = clientRegistration17.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam44 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList43, managementTeam44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        int int18 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user19 = null;
        boolean boolean20 = clientRegistration0.hasValidLicensePlate(user19);
        clientRegistration0.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList24 = clientRegistration0.getRegisteredUsers();
        boolean boolean26 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration0.unregisterClient(user12, managementTeam13);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user16, managementTeam17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user9 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam10 = null;
        clientRegistration0.unregisterClient(user9, managementTeam10);
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration0.unregisterClient(user12, managementTeam13);
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user15, managementTeam16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        boolean boolean7 = clientRegistration0.hasValidLicensePlate(user6);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration9 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean11 = clientRegistration9.isValidEmail("");
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration9.unregisterClient(user12, managementTeam13);
        clientRegistration9.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration9.unregisterClient(user16, managementTeam17);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user20 = null;
        boolean boolean21 = clientRegistration9.hasValidLicensePlate(user20);
        boolean boolean23 = clientRegistration9.isValidEmail("hi!");
        boolean boolean25 = clientRegistration9.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList26, managementTeam27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        int int10 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        clientRegistration0.displayRegisteredUsers();
        boolean boolean19 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        int int8 = clientRegistration0.getUserID();
        int int9 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        java.lang.Class<?> wildcardClass11 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean15 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        int int17 = clientRegistration0.getUserID();
        int int18 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration0.getRegisteredUsers();
        boolean boolean28 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        boolean boolean19 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean23 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList24 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean23 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user24 = null;
        boolean boolean25 = clientRegistration0.hasValidLicensePlate(user24);
        boolean boolean27 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        clientRegistration0.displayRegisteredUsers();
        java.lang.Class<?> wildcardClass11 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        boolean boolean22 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration0.getRegisteredUsers();
        boolean boolean25 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        boolean boolean6 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration10 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int11 = clientRegistration10.getUserID();
        clientRegistration10.displayRegisteredUsers();
        boolean boolean14 = clientRegistration10.isValidEmail("");
        clientRegistration10.authenticateUser("", "hi!");
        int int18 = clientRegistration10.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration10.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList19, managementTeam20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        boolean boolean12 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration0.unregisterClient(user8, managementTeam9);
        int int11 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        boolean boolean14 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user18, managementTeam19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean4 = clientRegistration0.isValidEmail("");
        boolean boolean6 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        clientRegistration0.authenticateUser("", "");
        boolean boolean14 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int18 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user16, managementTeam17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        clientRegistration0.unregisterClient(user17, managementTeam18);
        com.yorku.parkingsystem.user.User user20 = null;
        boolean boolean21 = clientRegistration0.hasValidLicensePlate(user20);
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration0.unregisterClient(user22, managementTeam23);
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user24 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam25 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user24, managementTeam25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user19 = null;
        boolean boolean20 = clientRegistration0.hasValidLicensePlate(user19);
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user24 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam25 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user24, managementTeam25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration0.unregisterClient(user8, managementTeam9);
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user11, managementTeam12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        boolean boolean14 = clientRegistration0.isValidEmail("");
        int int15 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "");
        boolean boolean12 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        int int19 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        int int20 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration0.getRegisteredUsers();
        boolean boolean19 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean24 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration0.unregisterClient(user12, managementTeam13);
        boolean boolean16 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user19, managementTeam20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user5 = null;
        boolean boolean6 = clientRegistration0.hasValidLicensePlate(user5);
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean25 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user26 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        clientRegistration0.unregisterClient(user26, managementTeam27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        boolean boolean27 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        boolean boolean19 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        com.yorku.parkingsystem.user.User user23 = null;
        boolean boolean24 = clientRegistration0.hasValidLicensePlate(user23);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        int int14 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration0.getRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user16 = null;
        boolean boolean17 = clientRegistration0.hasValidLicensePlate(user16);
        boolean boolean19 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration0.unregisterClient(user8, managementTeam9);
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean15 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        boolean boolean24 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration0.getRegisteredUsers();
        boolean boolean27 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean24 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration9 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean11 = clientRegistration9.isValidEmail("");
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration9.unregisterClient(user12, managementTeam13);
        boolean boolean16 = clientRegistration9.isValidEmail("");
        clientRegistration9.authenticateUser("hi!", "");
        boolean boolean21 = clientRegistration9.isValidPassword("");
        clientRegistration9.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration9.unregisterClient(user23, managementTeam24);
        com.yorku.parkingsystem.user.User user26 = null;
        boolean boolean27 = clientRegistration9.hasValidLicensePlate(user26);
        boolean boolean29 = clientRegistration9.isValidPassword("");
        com.yorku.parkingsystem.user.User user30 = null;
        boolean boolean31 = clientRegistration9.hasValidLicensePlate(user30);
        boolean boolean33 = clientRegistration9.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList34 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam35 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList34, managementTeam35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user10, managementTeam11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        int int16 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration0.getRegisteredUsers();
        int int18 = clientRegistration0.getUserID();
        boolean boolean20 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean22 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        clientRegistration0.authenticateUser("", "");
        boolean boolean14 = clientRegistration0.isValidPassword("");
        boolean boolean16 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "");
        boolean boolean21 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean12 = clientRegistration0.isValidEmail("");
        java.lang.Class<?> wildcardClass13 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration0.unregisterClient(user22, managementTeam23);
        java.lang.Class<?> wildcardClass25 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration0.unregisterClient(user12, managementTeam13);
        boolean boolean16 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration17 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int18 = clientRegistration17.getUserID();
        clientRegistration17.displayRegisteredUsers();
        boolean boolean21 = clientRegistration17.isValidEmail("");
        clientRegistration17.authenticateUser("", "hi!");
        clientRegistration17.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration17.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList26, managementTeam27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user7, managementTeam8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        boolean boolean24 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user25 = null;
        boolean boolean26 = clientRegistration0.hasValidLicensePlate(user25);
        java.lang.Class<?> wildcardClass27 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        boolean boolean5 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "hi!");
        int int9 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        clientRegistration0.displayRegisteredUsers();
        int int16 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        boolean boolean15 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        int int10 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.authenticateUser("hi!", "hi!");
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        clientRegistration0.unregisterClient(user17, managementTeam18);
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user2 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam3 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user2, managementTeam3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        boolean boolean22 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList27 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        boolean boolean6 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        int int17 = clientRegistration0.getUserID();
        boolean boolean19 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user20, managementTeam21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        int int10 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.authenticateUser("hi!", "hi!");
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user25 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        clientRegistration0.unregisterClient(user25, managementTeam26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        int int17 = clientRegistration0.getUserID();
        int int18 = clientRegistration0.getUserID();
        int int19 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean25 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user26 = null;
        boolean boolean27 = clientRegistration0.hasValidLicensePlate(user26);
        boolean boolean29 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user30 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam31 = null;
        clientRegistration0.unregisterClient(user30, managementTeam31);
        boolean boolean34 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user35 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam36 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user35, managementTeam36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        int int9 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        clientRegistration0.authenticateUser("", "");
        boolean boolean14 = clientRegistration0.isValidPassword("");
        boolean boolean16 = clientRegistration0.isValidPassword("hi!");
        boolean boolean18 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration22 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean24 = clientRegistration22.isValidEmail("");
        com.yorku.parkingsystem.user.User user25 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        clientRegistration22.unregisterClient(user25, managementTeam26);
        boolean boolean29 = clientRegistration22.isValidEmail("");
        clientRegistration22.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user33 = null;
        boolean boolean34 = clientRegistration22.hasValidLicensePlate(user33);
        boolean boolean36 = clientRegistration22.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList37 = clientRegistration22.getRegisteredUsers();
        boolean boolean39 = clientRegistration22.isValidPassword("hi!");
        boolean boolean41 = clientRegistration22.isValidPassword("hi!");
        clientRegistration22.displayRegisteredUsers();
        boolean boolean44 = clientRegistration22.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList45 = clientRegistration22.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam46 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList45, managementTeam46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(userList45);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration0.unregisterClient(user8, managementTeam9);
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        int int9 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user10, managementTeam11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("");
        int int20 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user12, managementTeam13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean4 = clientRegistration0.isValidEmail("");
        int int5 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        boolean boolean23 = clientRegistration0.isValidEmail("hi!");
        boolean boolean25 = clientRegistration0.isValidPassword("hi!");
        int int26 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration0.unregisterClient(user27, managementTeam28);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList30 = clientRegistration0.getRegisteredUsers();
        int int31 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user9 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam10 = null;
        clientRegistration0.unregisterClient(user9, managementTeam10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        int int10 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean18 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        int int15 = clientRegistration0.getUserID();
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration0.getRegisteredUsers();
        int int21 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        clientRegistration0.displayRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        boolean boolean15 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        boolean boolean7 = clientRegistration0.hasValidLicensePlate(user6);
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration14 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean16 = clientRegistration14.isValidEmail("");
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        clientRegistration14.unregisterClient(user17, managementTeam18);
        boolean boolean21 = clientRegistration14.isValidEmail("");
        clientRegistration14.authenticateUser("hi!", "");
        boolean boolean26 = clientRegistration14.isValidPassword("");
        clientRegistration14.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList28 = clientRegistration14.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user29 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam30 = null;
        clientRegistration14.unregisterClient(user29, managementTeam30);
        boolean boolean33 = clientRegistration14.isValidEmail("hi!");
        clientRegistration14.displayRegisteredUsers();
        clientRegistration14.displayRegisteredUsers();
        boolean boolean37 = clientRegistration14.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList38 = clientRegistration14.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam39 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList38, managementTeam39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        boolean boolean20 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user21 = null;
        boolean boolean22 = clientRegistration0.hasValidLicensePlate(user21);
        boolean boolean24 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration0.getRegisteredUsers();
        boolean boolean27 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        boolean boolean6 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        boolean boolean17 = clientRegistration0.hasValidLicensePlate(user16);
        int int18 = clientRegistration0.getUserID();
        boolean boolean20 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration0.unregisterClient(user22, managementTeam23);
        com.yorku.parkingsystem.user.User user25 = null;
        boolean boolean26 = clientRegistration0.hasValidLicensePlate(user25);
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration0.unregisterClient(user27, managementTeam28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        int int10 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration11 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean13 = clientRegistration11.isValidEmail("");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration11.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration11.isValidEmail("");
        clientRegistration11.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration11.getRegisteredUsers();
        boolean boolean24 = clientRegistration11.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user25 = null;
        boolean boolean26 = clientRegistration11.hasValidLicensePlate(user25);
        boolean boolean28 = clientRegistration11.isValidEmail("hi!");
        boolean boolean30 = clientRegistration11.isValidPassword("");
        clientRegistration11.authenticateUser("", "");
        boolean boolean35 = clientRegistration11.isValidEmail("");
        boolean boolean37 = clientRegistration11.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList38 = clientRegistration11.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam39 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList38, managementTeam39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        boolean boolean16 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        int int7 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        boolean boolean22 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        clientRegistration0.displayRegisteredUsers();
        int int27 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user28 = null;
        boolean boolean29 = clientRegistration0.hasValidLicensePlate(user28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        int int10 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        int int16 = clientRegistration0.getUserID();
        java.lang.Class<?> wildcardClass17 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        int int3 = clientRegistration0.getUserID();
        java.lang.Class<?> wildcardClass4 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        boolean boolean10 = clientRegistration0.isValidPassword("");
        boolean boolean12 = clientRegistration0.isValidEmail("");
        boolean boolean14 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        int int7 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        boolean boolean21 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        boolean boolean19 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int21 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration0.unregisterClient(user22, managementTeam23);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        boolean boolean11 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration12 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean14 = clientRegistration12.isValidEmail("");
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration12.unregisterClient(user15, managementTeam16);
        boolean boolean19 = clientRegistration12.isValidEmail("");
        clientRegistration12.authenticateUser("hi!", "");
        boolean boolean24 = clientRegistration12.isValidPassword("");
        clientRegistration12.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration12.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration12.unregisterClient(user27, managementTeam28);
        boolean boolean31 = clientRegistration12.isValidEmail("hi!");
        clientRegistration12.displayRegisteredUsers();
        clientRegistration12.displayRegisteredUsers();
        boolean boolean35 = clientRegistration12.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList36 = clientRegistration12.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam37 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList36, managementTeam37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        boolean boolean11 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList12, managementTeam13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        boolean boolean10 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration0.unregisterClient(user12, managementTeam13);
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        boolean boolean10 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user11, managementTeam12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        com.yorku.parkingsystem.user.User user5 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam6 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user5, managementTeam6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration0.unregisterClient(user22, managementTeam23);
        clientRegistration0.authenticateUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        int int8 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "");
        boolean boolean24 = clientRegistration0.isValidEmail("");
        boolean boolean26 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList27 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user28 = null;
        boolean boolean29 = clientRegistration0.hasValidLicensePlate(user28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean25 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user26 = null;
        boolean boolean27 = clientRegistration0.hasValidLicensePlate(user26);
        boolean boolean29 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user30 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam31 = null;
        clientRegistration0.unregisterClient(user30, managementTeam31);
        com.yorku.parkingsystem.user.User user33 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam34 = null;
        clientRegistration0.unregisterClient(user33, managementTeam34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        boolean boolean14 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        int int16 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        int int8 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration9 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean11 = clientRegistration9.isValidEmail("");
        clientRegistration9.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam14 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList13, managementTeam14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        int int16 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        clientRegistration0.authenticateUser("", "");
        boolean boolean14 = clientRegistration0.isValidPassword("");
        boolean boolean16 = clientRegistration0.isValidPassword("hi!");
        boolean boolean18 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean23 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user15, managementTeam16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean26 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        int int12 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        clientRegistration0.unregisterClient(user17, managementTeam18);
        int int20 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        boolean boolean5 = clientRegistration0.hasValidLicensePlate(user4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        boolean boolean13 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration14 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean16 = clientRegistration14.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration14.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration14.unregisterClient(user18, managementTeam19);
        com.yorku.parkingsystem.user.User user21 = null;
        boolean boolean22 = clientRegistration14.hasValidLicensePlate(user21);
        boolean boolean24 = clientRegistration14.isValidEmail("");
        clientRegistration14.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration14.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList26, managementTeam27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass4 = userList3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        boolean boolean15 = clientRegistration0.isValidEmail("hi!");
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean10 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        boolean boolean6 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        boolean boolean11 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        int int10 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        boolean boolean19 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user23, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean10 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("", "hi!");
        int int14 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        boolean boolean10 = clientRegistration0.isValidPassword("");
        boolean boolean12 = clientRegistration0.isValidEmail("");
        int int13 = clientRegistration0.getUserID();
        int int14 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        int int11 = clientRegistration0.getUserID();
        int int12 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        int int18 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user19, managementTeam20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user18, managementTeam19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user21, managementTeam22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean4 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("", "hi!");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user19 = null;
        boolean boolean20 = clientRegistration0.hasValidLicensePlate(user19);
        clientRegistration0.authenticateUser("hi!", "");
        int int24 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        boolean boolean5 = clientRegistration0.isValidPassword("");
        int int6 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        int int8 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        clientRegistration0.authenticateUser("", "");
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        boolean boolean18 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        boolean boolean19 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean27 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        boolean boolean23 = clientRegistration0.isValidEmail("hi!");
        boolean boolean25 = clientRegistration0.isValidPassword("hi!");
        int int26 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean29 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user30 = null;
        boolean boolean31 = clientRegistration0.hasValidLicensePlate(user30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean10 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration0.getRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration0.unregisterClient(user8, managementTeam9);
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration18 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean20 = clientRegistration18.isValidEmail("hi!");
        boolean boolean22 = clientRegistration18.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration18.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList24 = clientRegistration18.getRegisteredUsers();
        boolean boolean26 = clientRegistration18.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList27 = clientRegistration18.getRegisteredUsers();
        int int28 = clientRegistration18.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList29 = clientRegistration18.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam30 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList29, managementTeam30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidEmail("");
        int int10 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        int int7 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        boolean boolean24 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user25 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        clientRegistration0.unregisterClient(user25, managementTeam26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user24 = null;
        boolean boolean25 = clientRegistration0.hasValidLicensePlate(user24);
        clientRegistration0.authenticateUser("", "");
        int int29 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        boolean boolean23 = clientRegistration0.isValidEmail("hi!");
        boolean boolean25 = clientRegistration0.isValidEmail("hi!");
        boolean boolean27 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        boolean boolean11 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration12 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean14 = clientRegistration12.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration12.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList16 = clientRegistration12.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList16, managementTeam17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration9 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean11 = clientRegistration9.isValidEmail("");
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration9.unregisterClient(user12, managementTeam13);
        boolean boolean16 = clientRegistration9.isValidEmail("");
        clientRegistration9.authenticateUser("hi!", "");
        boolean boolean21 = clientRegistration9.isValidPassword("");
        clientRegistration9.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user24 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam25 = null;
        clientRegistration9.unregisterClient(user24, managementTeam25);
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration9.unregisterClient(user27, managementTeam28);
        boolean boolean31 = clientRegistration9.isValidEmail("hi!");
        clientRegistration9.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList33 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam34 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList33, managementTeam34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        int int17 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        java.lang.Class<?> wildcardClass20 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean4 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean24 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration25 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean27 = clientRegistration25.isValidEmail("");
        com.yorku.parkingsystem.user.User user28 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam29 = null;
        clientRegistration25.unregisterClient(user28, managementTeam29);
        clientRegistration25.displayRegisteredUsers();
        boolean boolean33 = clientRegistration25.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList34 = clientRegistration25.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam35 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList34, managementTeam35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        int int16 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration0.getRegisteredUsers();
        int int18 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        int int26 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user27 = null;
        boolean boolean28 = clientRegistration0.hasValidLicensePlate(user27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        clientRegistration0.authenticateUser("", "");
        boolean boolean24 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        boolean boolean20 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user21 = null;
        boolean boolean22 = clientRegistration0.hasValidLicensePlate(user21);
        boolean boolean24 = clientRegistration0.isValidPassword("hi!");
        boolean boolean26 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        boolean boolean23 = clientRegistration0.isValidEmail("hi!");
        boolean boolean25 = clientRegistration0.isValidEmail("hi!");
        boolean boolean27 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration0.unregisterClient(user8, managementTeam9);
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user11, managementTeam12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        boolean boolean19 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration0.unregisterClient(user21, managementTeam22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        boolean boolean20 = clientRegistration0.isValidPassword("");
        int int21 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList4 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user5 = null;
        boolean boolean6 = clientRegistration0.hasValidLicensePlate(user5);
        boolean boolean8 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        com.yorku.parkingsystem.user.User user26 = null;
        boolean boolean27 = clientRegistration0.hasValidLicensePlate(user26);
        boolean boolean29 = clientRegistration0.isValidEmail("");
        boolean boolean31 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        int int8 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        com.yorku.parkingsystem.user.User user22 = null;
        boolean boolean23 = clientRegistration0.hasValidLicensePlate(user22);
        clientRegistration0.authenticateUser("hi!", "hi!");
        clientRegistration0.authenticateUser("hi!", "hi!");
        com.yorku.parkingsystem.user.User user30 = null;
        boolean boolean31 = clientRegistration0.hasValidLicensePlate(user30);
        boolean boolean33 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        int int17 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "hi!");
        com.yorku.parkingsystem.user.User user23 = null;
        boolean boolean24 = clientRegistration0.hasValidLicensePlate(user23);
        com.yorku.parkingsystem.user.User user25 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user25, managementTeam26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        boolean boolean10 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration12 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean14 = clientRegistration12.isValidEmail("hi!");
        boolean boolean16 = clientRegistration12.isValidEmail("hi!");
        clientRegistration12.displayRegisteredUsers();
        boolean boolean19 = clientRegistration12.isValidEmail("hi!");
        clientRegistration12.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration12.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList23, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass4 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        boolean boolean17 = clientRegistration0.hasValidLicensePlate(user16);
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        java.lang.Class<?> wildcardClass20 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        boolean boolean14 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList16 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        boolean boolean21 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user25 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        clientRegistration0.unregisterClient(user25, managementTeam26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        boolean boolean23 = clientRegistration0.isValidEmail("hi!");
        boolean boolean25 = clientRegistration0.isValidPassword("hi!");
        int int26 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user28 = null;
        boolean boolean29 = clientRegistration0.hasValidLicensePlate(user28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        int int15 = clientRegistration0.getUserID();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user23 = null;
        boolean boolean24 = clientRegistration0.hasValidLicensePlate(user23);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user26 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user26, managementTeam27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        clientRegistration0.authenticateUser("", "");
        boolean boolean14 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        java.lang.Class<?> wildcardClass14 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        boolean boolean22 = clientRegistration0.isValidEmail("hi!");
        boolean boolean24 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        int int10 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user11, managementTeam12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user19 = null;
        boolean boolean20 = clientRegistration0.hasValidLicensePlate(user19);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user22 = null;
        boolean boolean23 = clientRegistration0.hasValidLicensePlate(user22);
        boolean boolean25 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        boolean boolean20 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        int int15 = clientRegistration0.getUserID();
        int int16 = clientRegistration0.getUserID();
        int int17 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        boolean boolean22 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList24 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        boolean boolean8 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        int int10 = clientRegistration0.getUserID();
        boolean boolean12 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        boolean boolean6 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        int int10 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidPassword("");
        boolean boolean20 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean25 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user26 = null;
        boolean boolean27 = clientRegistration0.hasValidLicensePlate(user26);
        boolean boolean29 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user30 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam31 = null;
        clientRegistration0.unregisterClient(user30, managementTeam31);
        com.yorku.parkingsystem.user.User user33 = null;
        boolean boolean34 = clientRegistration0.hasValidLicensePlate(user33);
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user20 = null;
        boolean boolean21 = clientRegistration0.hasValidLicensePlate(user20);
        clientRegistration0.displayRegisteredUsers();
        int int23 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        int int9 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        java.lang.Class<?> wildcardClass13 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidEmail("");
        boolean boolean20 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test917");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration10 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean12 = clientRegistration10.isValidEmail("");
        com.yorku.parkingsystem.user.User user13 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam14 = null;
        clientRegistration10.unregisterClient(user13, managementTeam14);
        clientRegistration10.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        clientRegistration10.unregisterClient(user17, managementTeam18);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration10.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user21 = null;
        boolean boolean22 = clientRegistration10.hasValidLicensePlate(user21);
        boolean boolean24 = clientRegistration10.isValidEmail("hi!");
        boolean boolean26 = clientRegistration10.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList27 = clientRegistration10.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList27, managementTeam28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test918");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user22 = null;
        boolean boolean23 = clientRegistration0.hasValidLicensePlate(user22);
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration29 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean31 = clientRegistration29.isValidEmail("");
        com.yorku.parkingsystem.user.User user32 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam33 = null;
        clientRegistration29.unregisterClient(user32, managementTeam33);
        clientRegistration29.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user36 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam37 = null;
        clientRegistration29.unregisterClient(user36, managementTeam37);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList39 = clientRegistration29.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam40 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList39, managementTeam40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test919");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        int int15 = clientRegistration0.getUserID();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        boolean boolean22 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        com.yorku.parkingsystem.user.User user26 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        clientRegistration0.unregisterClient(user26, managementTeam27);
        com.yorku.parkingsystem.user.User user29 = null;
        boolean boolean30 = clientRegistration0.hasValidLicensePlate(user29);
        boolean boolean32 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test920");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        int int16 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        int int21 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration0.unregisterClient(user22, managementTeam23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test921");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        boolean boolean10 = clientRegistration0.isValidEmail("");
        int int11 = clientRegistration0.getUserID();
        int int12 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration13 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean15 = clientRegistration13.isValidEmail("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration13.unregisterClient(user16, managementTeam17);
        boolean boolean20 = clientRegistration13.isValidEmail("");
        clientRegistration13.authenticateUser("hi!", "");
        clientRegistration13.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration13.getRegisteredUsers();
        boolean boolean27 = clientRegistration13.isValidEmail("hi!");
        clientRegistration13.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList29 = clientRegistration13.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam30 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList29, managementTeam30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test922");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user2 = null;
        boolean boolean3 = clientRegistration0.hasValidLicensePlate(user2);
        clientRegistration0.authenticateUser("hi!", "hi!");
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test923");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        int int10 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user15, managementTeam16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test924");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user9 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam10 = null;
        clientRegistration0.unregisterClient(user9, managementTeam10);
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test925");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test926");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        clientRegistration0.authenticateUser("", "");
        int int16 = clientRegistration0.getUserID();
        boolean boolean18 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test927");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration0.unregisterClient(user15, managementTeam16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList27 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test928");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean4 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("", "hi!");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration10 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean12 = clientRegistration10.isValidEmail("");
        com.yorku.parkingsystem.user.User user13 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam14 = null;
        clientRegistration10.unregisterClient(user13, managementTeam14);
        boolean boolean17 = clientRegistration10.isValidEmail("");
        clientRegistration10.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration10.getRegisteredUsers();
        boolean boolean23 = clientRegistration10.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user24 = null;
        boolean boolean25 = clientRegistration10.hasValidLicensePlate(user24);
        int int26 = clientRegistration10.getUserID();
        clientRegistration10.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList28 = clientRegistration10.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam29 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList28, managementTeam29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test929");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        boolean boolean14 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test930");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        int int10 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        boolean boolean19 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test931");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user20 = null;
        boolean boolean21 = clientRegistration0.hasValidLicensePlate(user20);
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration0.unregisterClient(user22, managementTeam23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test932");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        boolean boolean7 = clientRegistration0.hasValidLicensePlate(user6);
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test933");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration0.unregisterClient(user12, managementTeam13);
        boolean boolean16 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test934");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        boolean boolean16 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test935");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        int int18 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test936");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration0.unregisterClient(user21, managementTeam22);
        java.lang.Class<?> wildcardClass24 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test937");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        clientRegistration0.displayRegisteredUsers();
        int int18 = clientRegistration0.getUserID();
        boolean boolean20 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test938");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        clientRegistration0.authenticateUser("", "");
        boolean boolean14 = clientRegistration0.isValidPassword("");
        boolean boolean16 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test939");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user16 = null;
        boolean boolean17 = clientRegistration0.hasValidLicensePlate(user16);
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration0.unregisterClient(user18, managementTeam19);
        boolean boolean22 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test940");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        boolean boolean15 = clientRegistration0.isValidEmail("");
        boolean boolean17 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test941");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user20 = null;
        boolean boolean21 = clientRegistration0.hasValidLicensePlate(user20);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user23, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test942");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration0.unregisterClient(user21, managementTeam22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test943");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test944");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        boolean boolean10 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test945");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration0.getRegisteredUsers();
        boolean boolean20 = clientRegistration0.isValidPassword("");
        int int21 = clientRegistration0.getUserID();
        boolean boolean23 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test946");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test947");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test948");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration0.isValidEmail("hi!");
        int int19 = clientRegistration0.getUserID();
        boolean boolean21 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test949");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test950");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration0.getRegisteredUsers();
        int int15 = clientRegistration0.getUserID();
        int int16 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test951");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        boolean boolean14 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean20 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test952");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        boolean boolean17 = clientRegistration0.isValidPassword("hi!");
        boolean boolean19 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user21 = null;
        boolean boolean22 = clientRegistration0.hasValidLicensePlate(user21);
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        int int26 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test953");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test954");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        int int7 = clientRegistration0.getUserID();
        boolean boolean9 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}

