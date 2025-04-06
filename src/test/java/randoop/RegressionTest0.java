package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User[] userArray3 = new com.yorku.parkingsystem.user.User[] {};
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList4 = new java.util.ArrayList<com.yorku.parkingsystem.user.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.parkingsystem.user.User>) userList4, userArray3);
        com.yorku.parkingsystem.management.ManagementTeam managementTeam6 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList4, managementTeam6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.parkingsystem.user.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        com.yorku.parkingsystem.user.User[] userArray1 = new com.yorku.parkingsystem.user.User[] {};
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList2 = new java.util.ArrayList<com.yorku.parkingsystem.user.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.parkingsystem.user.User>) userList2, userArray1);
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList2, managementTeam4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userArray1);
        org.junit.Assert.assertArrayEquals(userArray1, new com.yorku.parkingsystem.user.User[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        java.lang.Class<?> wildcardClass3 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        java.lang.Class<?> wildcardClass6 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User[] userArray4 = new com.yorku.parkingsystem.user.User[] {};
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = new java.util.ArrayList<com.yorku.parkingsystem.user.User>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.yorku.parkingsystem.user.User>) userList5, userArray4);
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList5, managementTeam7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userArray4);
        org.junit.Assert.assertArrayEquals(userArray4, new com.yorku.parkingsystem.user.User[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration4 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean6 = clientRegistration4.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration4.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList7, managementTeam8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.lang.Class<?> wildcardClass5 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user3, managementTeam4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
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
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration5 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean7 = clientRegistration5.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration5.unregisterClient(user8, managementTeam9);
        boolean boolean12 = clientRegistration5.isValidEmail("");
        clientRegistration5.authenticateUser("hi!", "");
        boolean boolean17 = clientRegistration5.isValidPassword("");
        clientRegistration5.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration5.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "");
        java.lang.Class<?> wildcardClass10 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
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
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration3 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean5 = clientRegistration3.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration3.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList6, managementTeam7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration10 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean12 = clientRegistration10.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration10.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam14 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList13, managementTeam14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration6 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean8 = clientRegistration6.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration6.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam10 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList9, managementTeam10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList20, managementTeam21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        java.lang.Class<?> wildcardClass11 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration7 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean9 = clientRegistration7.isValidEmail("hi!");
        boolean boolean11 = clientRegistration7.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration7.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList12, managementTeam13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration10 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean12 = clientRegistration10.isValidEmail("hi!");
        boolean boolean14 = clientRegistration10.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration10.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList15, managementTeam16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.lang.Class<?> wildcardClass7 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        java.lang.Class<?> wildcardClass7 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration13 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean15 = clientRegistration13.isValidEmail("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration13.unregisterClient(user16, managementTeam17);
        int int19 = clientRegistration13.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration13.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration13.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList21, managementTeam22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        java.lang.Class<?> wildcardClass10 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
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
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidPassword("");
        java.lang.Class<?> wildcardClass8 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
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
        com.yorku.parkingsystem.management.ManagementTeam managementTeam14 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user13, managementTeam14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration23 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean25 = clientRegistration23.isValidEmail("");
        com.yorku.parkingsystem.user.User user26 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        clientRegistration23.unregisterClient(user26, managementTeam27);
        int int29 = clientRegistration23.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList30 = clientRegistration23.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList31 = clientRegistration23.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList31, managementTeam32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
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
        java.lang.Class<?> wildcardClass18 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        boolean boolean11 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration12 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean14 = clientRegistration12.isValidEmail("");
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration12.unregisterClient(user15, managementTeam16);
        int int18 = clientRegistration12.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration12.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration12.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList20, managementTeam21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        int int3 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user4, managementTeam5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration24 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean26 = clientRegistration24.isValidEmail("");
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration24.unregisterClient(user27, managementTeam28);
        boolean boolean31 = clientRegistration24.isValidEmail("");
        clientRegistration24.authenticateUser("hi!", "");
        boolean boolean36 = clientRegistration24.isValidPassword("");
        clientRegistration24.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList38 = clientRegistration24.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user39 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam40 = null;
        clientRegistration24.unregisterClient(user39, managementTeam40);
        com.yorku.parkingsystem.user.User user42 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam43 = null;
        clientRegistration24.unregisterClient(user42, managementTeam43);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList45 = clientRegistration24.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam46 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList45, managementTeam46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userList45);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user8, managementTeam9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration17 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean19 = clientRegistration17.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration17.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList20, managementTeam21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration5 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean7 = clientRegistration5.isValidEmail("");
        clientRegistration5.authenticateUser("hi!", "hi!");
        boolean boolean12 = clientRegistration5.isValidEmail("");
        boolean boolean14 = clientRegistration5.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration5.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList15, managementTeam16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        int int12 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
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
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user10, managementTeam11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user12, managementTeam13);
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
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
        java.lang.Class<?> wildcardClass18 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
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
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user17, managementTeam18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        java.lang.Class<?> wildcardClass10 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList6, managementTeam7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration6 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean8 = clientRegistration6.isValidEmail("");
        com.yorku.parkingsystem.user.User user9 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam10 = null;
        clientRegistration6.unregisterClient(user9, managementTeam10);
        boolean boolean13 = clientRegistration6.isValidEmail("");
        clientRegistration6.authenticateUser("hi!", "");
        clientRegistration6.authenticateUser("hi!", "");
        clientRegistration6.authenticateUser("", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration6.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList23, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
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
        java.lang.Class<?> wildcardClass23 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration18 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean20 = clientRegistration18.isValidEmail("");
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration18.unregisterClient(user21, managementTeam22);
        boolean boolean25 = clientRegistration18.isValidEmail("");
        clientRegistration18.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user29 = null;
        boolean boolean30 = clientRegistration18.hasValidLicensePlate(user29);
        boolean boolean32 = clientRegistration18.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList33 = clientRegistration18.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam34 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList33, managementTeam34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
        com.yorku.parkingsystem.user.User[] userArray21 = new com.yorku.parkingsystem.user.User[] {};
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = new java.util.ArrayList<com.yorku.parkingsystem.user.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.parkingsystem.user.User>) userList22, userArray21);
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList22, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userArray21);
        org.junit.Assert.assertArrayEquals(userArray21, new com.yorku.parkingsystem.user.User[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration5 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean7 = clientRegistration5.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration5.unregisterClient(user8, managementTeam9);
        boolean boolean12 = clientRegistration5.isValidEmail("");
        clientRegistration5.authenticateUser("hi!", "");
        clientRegistration5.authenticateUser("hi!", "");
        clientRegistration5.authenticateUser("", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration5.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList22, managementTeam23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration3 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean5 = clientRegistration3.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration3.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration3.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList7, managementTeam8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        java.lang.Class<?> wildcardClass4 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.authenticateUser("", "");
        java.lang.Class<?> wildcardClass12 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
        com.yorku.parkingsystem.user.User user16 = null;
        boolean boolean17 = clientRegistration0.hasValidLicensePlate(user16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        java.lang.Class<?> wildcardClass8 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration17 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean19 = clientRegistration17.isValidEmail("hi!");
        boolean boolean21 = clientRegistration17.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration17.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration17.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList23, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration10 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean12 = clientRegistration10.isValidEmail("hi!");
        clientRegistration10.authenticateUser("", "hi!");
        boolean boolean17 = clientRegistration10.isValidPassword("");
        boolean boolean19 = clientRegistration10.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration10.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList20, managementTeam21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
        java.lang.Class<?> wildcardClass13 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
        java.lang.Class<?> wildcardClass15 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
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
        java.lang.Class<?> wildcardClass18 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration0.unregisterClient(user8, managementTeam9);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration11 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean13 = clientRegistration11.isValidEmail("");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration11.unregisterClient(user14, managementTeam15);
        clientRegistration11.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration11.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList18, managementTeam19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user2 = null;
        boolean boolean3 = clientRegistration0.hasValidLicensePlate(user2);
        java.lang.Class<?> wildcardClass4 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
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
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
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
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass8 = userList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration7 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean9 = clientRegistration7.isValidEmail("");
        clientRegistration7.authenticateUser("hi!", "hi!");
        boolean boolean14 = clientRegistration7.isValidEmail("");
        boolean boolean16 = clientRegistration7.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration7.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList17, managementTeam18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        java.lang.Class<?> wildcardClass5 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
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
        boolean boolean19 = clientRegistration17.isValidEmail("");
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration17.unregisterClient(user20, managementTeam21);
        boolean boolean24 = clientRegistration17.isValidEmail("");
        int int25 = clientRegistration17.getUserID();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.lang.Class<?> wildcardClass11 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass8 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
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
        java.lang.Class<?> wildcardClass21 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidEmail("");
        java.lang.Class<?> wildcardClass13 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration19 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean21 = clientRegistration19.isValidEmail("");
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration19.unregisterClient(user22, managementTeam23);
        boolean boolean26 = clientRegistration19.isValidEmail("");
        clientRegistration19.authenticateUser("hi!", "");
        boolean boolean31 = clientRegistration19.isValidPassword("");
        clientRegistration19.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList33 = clientRegistration19.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user34 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam35 = null;
        clientRegistration19.unregisterClient(user34, managementTeam35);
        com.yorku.parkingsystem.user.User user37 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam38 = null;
        clientRegistration19.unregisterClient(user37, managementTeam38);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList40 = clientRegistration19.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam41 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList40, managementTeam41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration8 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean10 = clientRegistration8.isValidEmail("");
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration8.unregisterClient(user11, managementTeam12);
        boolean boolean15 = clientRegistration8.isValidEmail("");
        clientRegistration8.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user19 = null;
        boolean boolean20 = clientRegistration8.hasValidLicensePlate(user19);
        boolean boolean22 = clientRegistration8.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration8.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList23, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        boolean boolean12 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
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
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
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
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration19 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean21 = clientRegistration19.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration19.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList22, managementTeam23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        java.lang.Class<?> wildcardClass9 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass8 = userList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidEmail("hi!");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
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
        java.lang.Class<?> wildcardClass18 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration24 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean26 = clientRegistration24.isValidEmail("");
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration24.unregisterClient(user27, managementTeam28);
        int int30 = clientRegistration24.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList31 = clientRegistration24.getRegisteredUsers();
        clientRegistration24.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList35 = clientRegistration24.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass6 = userList5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration15 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean17 = clientRegistration15.isValidEmail("");
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration15.unregisterClient(user18, managementTeam19);
        clientRegistration15.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration15.unregisterClient(user22, managementTeam23);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration15.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration16 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean18 = clientRegistration16.isValidEmail("");
        clientRegistration16.displayRegisteredUsers();
        clientRegistration16.displayRegisteredUsers();
        clientRegistration16.authenticateUser("hi!", "");
        boolean boolean25 = clientRegistration16.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration16.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        int int10 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        boolean boolean10 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        int int4 = clientRegistration0.getUserID();
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
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean9 = clientRegistration0.isValidEmail("");
        java.lang.Class<?> wildcardClass10 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        int int10 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user6, managementTeam7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
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
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration14 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean16 = clientRegistration14.isValidEmail("hi!");
        boolean boolean18 = clientRegistration14.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration14.getRegisteredUsers();
        boolean boolean21 = clientRegistration14.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration14.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList22, managementTeam23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        boolean boolean7 = clientRegistration0.hasValidLicensePlate(user6);
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        clientRegistration0.displayRegisteredUsers();
        java.lang.Class<?> wildcardClass11 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration28 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean30 = clientRegistration28.isValidEmail("");
        com.yorku.parkingsystem.user.User user31 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        clientRegistration28.unregisterClient(user31, managementTeam32);
        int int34 = clientRegistration28.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList35 = clientRegistration28.getRegisteredUsers();
        clientRegistration28.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList39 = clientRegistration28.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration2 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean4 = clientRegistration2.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration2.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration2.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList6, managementTeam7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass7 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
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
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user23, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
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
        boolean boolean24 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
        clientRegistration0.unregisterClient(user20, managementTeam21);
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
        boolean boolean27 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        boolean boolean6 = clientRegistration0.isValidEmail("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
        com.yorku.parkingsystem.user.User[] userArray33 = new com.yorku.parkingsystem.user.User[] {};
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList34 = new java.util.ArrayList<com.yorku.parkingsystem.user.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.yorku.parkingsystem.user.User>) userList34, userArray33);
        com.yorku.parkingsystem.management.ManagementTeam managementTeam36 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList34, managementTeam36);
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
        org.junit.Assert.assertNotNull(userArray33);
        org.junit.Assert.assertArrayEquals(userArray33, new com.yorku.parkingsystem.user.User[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.authenticateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
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
        java.lang.Class<?> wildcardClass28 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
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
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user15, managementTeam16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration22 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean24 = clientRegistration22.isValidEmail("");
        com.yorku.parkingsystem.user.User user25 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        clientRegistration22.unregisterClient(user25, managementTeam26);
        int int28 = clientRegistration22.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList29 = clientRegistration22.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList30 = clientRegistration22.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam31 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList30, managementTeam31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
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
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        com.yorku.parkingsystem.user.User user5 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam6 = null;
        clientRegistration0.unregisterClient(user5, managementTeam6);
        boolean boolean9 = clientRegistration0.isValidEmail("");
        java.lang.Class<?> wildcardClass10 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration10 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean12 = clientRegistration10.isValidEmail("");
        clientRegistration10.displayRegisteredUsers();
        clientRegistration10.displayRegisteredUsers();
        clientRegistration10.authenticateUser("hi!", "");
        boolean boolean19 = clientRegistration10.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration10.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList20, managementTeam21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
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
        int int26 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration21 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean23 = clientRegistration21.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user24 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam25 = null;
        clientRegistration21.unregisterClient(user24, managementTeam25);
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration21.unregisterClient(user27, managementTeam28);
        clientRegistration21.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList31 = clientRegistration21.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList31, managementTeam32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
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
        int int26 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
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
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration12 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean14 = clientRegistration12.isValidEmail("hi!");
        clientRegistration12.authenticateUser("", "hi!");
        clientRegistration12.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration12.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList19, managementTeam20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
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
        java.lang.Class<?> wildcardClass26 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
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
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
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
        boolean boolean23 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        java.lang.Class<?> wildcardClass9 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
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
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
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
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        java.lang.Class<?> wildcardClass13 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
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
        java.lang.Class<?> wildcardClass22 = userList21.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        clientRegistration0.displayRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
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
        java.lang.Class<?> wildcardClass22 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration14 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean16 = clientRegistration14.isValidEmail("");
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        clientRegistration14.unregisterClient(user17, managementTeam18);
        int int20 = clientRegistration14.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration14.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList21, managementTeam22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration14 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean16 = clientRegistration14.isValidEmail("");
        clientRegistration14.authenticateUser("hi!", "hi!");
        int int20 = clientRegistration14.getUserID();
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration14.unregisterClient(user21, managementTeam22);
        com.yorku.parkingsystem.user.User user24 = null;
        boolean boolean25 = clientRegistration14.hasValidLicensePlate(user24);
        com.yorku.parkingsystem.user.User user26 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        clientRegistration14.unregisterClient(user26, managementTeam27);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList29 = clientRegistration14.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
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
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration18 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean20 = clientRegistration18.isValidEmail("");
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration18.unregisterClient(user21, managementTeam22);
        boolean boolean25 = clientRegistration18.isValidEmail("");
        clientRegistration18.authenticateUser("hi!", "");
        boolean boolean30 = clientRegistration18.isValidPassword("");
        clientRegistration18.displayRegisteredUsers();
        boolean boolean33 = clientRegistration18.isValidPassword("");
        com.yorku.parkingsystem.user.User user34 = null;
        boolean boolean35 = clientRegistration18.hasValidLicensePlate(user34);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList36 = clientRegistration18.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        java.lang.Class<?> wildcardClass13 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        clientRegistration0.displayRegisteredUsers();
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
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        int int14 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
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
        java.lang.Class<?> wildcardClass20 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
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
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        int int7 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration11 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean13 = clientRegistration11.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration11.unregisterClient(user14, managementTeam15);
        clientRegistration11.authenticateUser("", "");
        int int20 = clientRegistration11.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration11.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList21, managementTeam22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration18 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean20 = clientRegistration18.isValidEmail("hi!");
        clientRegistration18.authenticateUser("", "hi!");
        clientRegistration18.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration18.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
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
        int int17 = clientRegistration0.getUserID();
        java.lang.Class<?> wildcardClass18 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user5 = null;
        boolean boolean6 = clientRegistration0.hasValidLicensePlate(user5);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration9 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean11 = clientRegistration9.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList12, managementTeam13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
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
        java.lang.Class<?> wildcardClass23 = userList22.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        boolean boolean10 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration11 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean13 = clientRegistration11.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration11.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration11.unregisterClient(user15, managementTeam16);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration11.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList18, managementTeam19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
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
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean4 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user5 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam6 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user5, managementTeam6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
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
        java.lang.Class<?> wildcardClass20 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user18, managementTeam19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
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
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        clientRegistration0.unregisterClient(user26, managementTeam27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        java.lang.Class<?> wildcardClass3 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        int int12 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        int int7 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
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
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        com.yorku.parkingsystem.user.User user5 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam6 = null;
        clientRegistration0.unregisterClient(user5, managementTeam6);
        boolean boolean9 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList10, managementTeam11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
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
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        int int16 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
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
        com.yorku.parkingsystem.user.User user24 = null;
        boolean boolean25 = clientRegistration0.hasValidLicensePlate(user24);
        int int26 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
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
        com.yorku.parkingsystem.user.User user24 = null;
        boolean boolean25 = clientRegistration0.hasValidLicensePlate(user24);
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
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration6 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean8 = clientRegistration6.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration6.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration6.unregisterClient(user10, managementTeam11);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration6.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam14 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList13, managementTeam14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        clientRegistration0.authenticateUser("", "hi!");
        java.lang.Class<?> wildcardClass13 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration15 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean17 = clientRegistration15.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration15.unregisterClient(user18, managementTeam19);
        clientRegistration15.authenticateUser("", "");
        clientRegistration15.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList27 = clientRegistration15.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList27, managementTeam28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
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
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user2 = null;
        boolean boolean3 = clientRegistration0.hasValidLicensePlate(user2);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration5 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean7 = clientRegistration5.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration5.unregisterClient(user8, managementTeam9);
        boolean boolean12 = clientRegistration5.isValidEmail("");
        clientRegistration5.authenticateUser("hi!", "");
        boolean boolean17 = clientRegistration5.isValidPassword("");
        clientRegistration5.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration5.unregisterClient(user19, managementTeam20);
        clientRegistration5.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration5.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList23, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
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
        java.lang.Class<?> wildcardClass15 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
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
        java.lang.Class<?> wildcardClass11 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        boolean boolean15 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        int int6 = clientRegistration0.getUserID();
        boolean boolean8 = clientRegistration0.isValidPassword("");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
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
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
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
        java.lang.Class<?> wildcardClass12 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration14 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean16 = clientRegistration14.isValidEmail("");
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        clientRegistration14.unregisterClient(user17, managementTeam18);
        boolean boolean21 = clientRegistration14.isValidEmail("");
        int int22 = clientRegistration14.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration14.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList23, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration15 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean17 = clientRegistration15.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration15.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList18, managementTeam19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration12 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean14 = clientRegistration12.isValidEmail("");
        clientRegistration12.authenticateUser("hi!", "hi!");
        boolean boolean19 = clientRegistration12.isValidEmail("");
        boolean boolean21 = clientRegistration12.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration12.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList22, managementTeam23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
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
        boolean boolean18 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration19 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean21 = clientRegistration19.isValidEmail("");
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration19.unregisterClient(user22, managementTeam23);
        boolean boolean26 = clientRegistration19.isValidEmail("");
        clientRegistration19.authenticateUser("hi!", "");
        boolean boolean31 = clientRegistration19.isValidPassword("");
        clientRegistration19.displayRegisteredUsers();
        boolean boolean34 = clientRegistration19.isValidPassword("");
        com.yorku.parkingsystem.user.User user35 = null;
        boolean boolean36 = clientRegistration19.hasValidLicensePlate(user35);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList37 = clientRegistration19.getRegisteredUsers();
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
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(userList37);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration6 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean8 = clientRegistration6.isValidEmail("");
        clientRegistration6.authenticateUser("hi!", "hi!");
        boolean boolean13 = clientRegistration6.isValidEmail("");
        boolean boolean15 = clientRegistration6.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList16 = clientRegistration6.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration6.hasValidLicensePlate(user17);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration6.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList19, managementTeam20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
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
        boolean boolean21 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user6, managementTeam7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
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
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration23 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean25 = clientRegistration23.isValidEmail("");
        com.yorku.parkingsystem.user.User user26 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        clientRegistration23.unregisterClient(user26, managementTeam27);
        boolean boolean30 = clientRegistration23.isValidEmail("");
        clientRegistration23.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList34 = clientRegistration23.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
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
        java.lang.Class<?> wildcardClass21 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
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
        boolean boolean20 = clientRegistration0.isValidPassword("");
        int int21 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
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
        java.lang.Class<?> wildcardClass23 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean10 = clientRegistration0.isValidEmail("");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList29 = clientRegistration11.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam30 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList29, managementTeam30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration10 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean12 = clientRegistration10.isValidEmail("");
        com.yorku.parkingsystem.user.User user13 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam14 = null;
        clientRegistration10.unregisterClient(user13, managementTeam14);
        boolean boolean17 = clientRegistration10.isValidEmail("");
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
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        boolean boolean24 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
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
        boolean boolean28 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        boolean boolean6 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration19 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean21 = clientRegistration19.isValidEmail("");
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration19.unregisterClient(user22, managementTeam23);
        clientRegistration19.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user26 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        clientRegistration19.unregisterClient(user26, managementTeam27);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList29 = clientRegistration19.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam30 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList29, managementTeam30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
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
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
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
        boolean boolean20 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration21 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean23 = clientRegistration21.isValidEmail("");
        com.yorku.parkingsystem.user.User user24 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam25 = null;
        clientRegistration21.unregisterClient(user24, managementTeam25);
        boolean boolean28 = clientRegistration21.isValidEmail("");
        clientRegistration21.authenticateUser("hi!", "");
        boolean boolean33 = clientRegistration21.isValidPassword("");
        clientRegistration21.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList35 = clientRegistration21.getRegisteredUsers();
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
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
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
        int int25 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
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
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
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
        clientRegistration0.displayRegisteredUsers();
        java.lang.Class<?> wildcardClass18 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
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
        boolean boolean24 = clientRegistration0.hasValidLicensePlate(user23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration12 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean14 = clientRegistration12.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration12.unregisterClient(user15, managementTeam16);
        clientRegistration12.authenticateUser("", "");
        int int21 = clientRegistration12.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList22 = clientRegistration12.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList22, managementTeam23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration10 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean12 = clientRegistration10.isValidEmail("");
        com.yorku.parkingsystem.user.User user13 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam14 = null;
        clientRegistration10.unregisterClient(user13, managementTeam14);
        clientRegistration10.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration10.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList17, managementTeam18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
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
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        boolean boolean11 = clientRegistration0.isValidEmail("");
        java.lang.Class<?> wildcardClass12 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        java.lang.Class<?> wildcardClass9 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
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
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user17, managementTeam18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
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
        java.lang.Class<?> wildcardClass16 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration27 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean29 = clientRegistration27.isValidEmail("");
        com.yorku.parkingsystem.user.User user30 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam31 = null;
        clientRegistration27.unregisterClient(user30, managementTeam31);
        boolean boolean34 = clientRegistration27.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList35 = clientRegistration27.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
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
        int int22 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration11 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean13 = clientRegistration11.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration11.unregisterClient(user14, managementTeam15);
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        clientRegistration11.unregisterClient(user17, managementTeam18);
        clientRegistration11.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration11.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList21, managementTeam22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        java.lang.Class<?> wildcardClass9 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration5 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean7 = clientRegistration5.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration5.unregisterClient(user8, managementTeam9);
        boolean boolean12 = clientRegistration5.isValidEmail("");
        int int13 = clientRegistration5.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration5.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        boolean boolean10 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        java.lang.Class<?> wildcardClass14 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user3, managementTeam4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration22 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean24 = clientRegistration22.isValidEmail("");
        com.yorku.parkingsystem.user.User user25 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        clientRegistration22.unregisterClient(user25, managementTeam26);
        boolean boolean29 = clientRegistration22.isValidEmail("");
        clientRegistration22.authenticateUser("hi!", "");
        boolean boolean34 = clientRegistration22.isValidPassword("");
        clientRegistration22.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user36 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam37 = null;
        clientRegistration22.unregisterClient(user36, managementTeam37);
        clientRegistration22.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList40 = clientRegistration22.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam41 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList40, managementTeam41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
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
        boolean boolean28 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        boolean boolean11 = clientRegistration0.isValidPassword("hi!");
        boolean boolean13 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration14 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean16 = clientRegistration14.isValidEmail("");
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        clientRegistration14.unregisterClient(user17, managementTeam18);
        clientRegistration14.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration14.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList21, managementTeam22);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        boolean boolean11 = clientRegistration0.isValidPassword("");
        boolean boolean13 = clientRegistration0.isValidEmail("");
        boolean boolean15 = clientRegistration0.isValidEmail("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
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
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user22, managementTeam23);
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
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
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
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        int int22 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration23 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean25 = clientRegistration23.isValidEmail("hi!");
        clientRegistration23.authenticateUser("", "hi!");
        clientRegistration23.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList30 = clientRegistration23.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam31 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList30, managementTeam31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration12 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean14 = clientRegistration12.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration12.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList15, managementTeam16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        clientRegistration0.displayRegisteredUsers();
        boolean boolean15 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration16 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean18 = clientRegistration16.isValidEmail("hi!");
        clientRegistration16.authenticateUser("", "hi!");
        boolean boolean23 = clientRegistration16.isValidPassword("");
        clientRegistration16.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration16.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
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
        boolean boolean20 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user8, managementTeam9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
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
        int int20 = clientRegistration0.getUserID();
        boolean boolean22 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration15 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean17 = clientRegistration15.isValidEmail("hi!");
        boolean boolean19 = clientRegistration15.isValidEmail("hi!");
        clientRegistration15.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user21 = null;
        boolean boolean22 = clientRegistration15.hasValidLicensePlate(user21);
        boolean boolean24 = clientRegistration15.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration15.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        boolean boolean7 = clientRegistration0.hasValidLicensePlate(user6);
        int int8 = clientRegistration0.getUserID();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        boolean boolean10 = clientRegistration0.isValidPassword("");
        boolean boolean12 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration0.unregisterClient(user22, managementTeam23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration17 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean19 = clientRegistration17.isValidEmail("");
        clientRegistration17.authenticateUser("hi!", "hi!");
        boolean boolean24 = clientRegistration17.isValidEmail("");
        com.yorku.parkingsystem.user.User user25 = null;
        boolean boolean26 = clientRegistration17.hasValidLicensePlate(user25);
        boolean boolean28 = clientRegistration17.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user29 = null;
        boolean boolean30 = clientRegistration17.hasValidLicensePlate(user29);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList31 = clientRegistration17.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList31, managementTeam32);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration11 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean13 = clientRegistration11.isValidEmail("");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration11.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration11.isValidEmail("");
        clientRegistration11.authenticateUser("hi!", "");
        boolean boolean23 = clientRegistration11.isValidPassword("");
        clientRegistration11.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user25 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        clientRegistration11.unregisterClient(user25, managementTeam26);
        boolean boolean29 = clientRegistration11.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList30 = clientRegistration11.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam31 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList30, managementTeam31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        int int8 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass10 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration0.unregisterClient(user8, managementTeam9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        java.lang.Class<?> wildcardClass14 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration24 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean26 = clientRegistration24.isValidEmail("hi!");
        boolean boolean28 = clientRegistration24.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList29 = clientRegistration24.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList30 = clientRegistration24.getRegisteredUsers();
        boolean boolean32 = clientRegistration24.isValidPassword("");
        clientRegistration24.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList36 = clientRegistration24.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        com.yorku.parkingsystem.user.User user5 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam6 = null;
        clientRegistration0.unregisterClient(user5, managementTeam6);
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        boolean boolean6 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        java.lang.Class<?> wildcardClass8 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
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
        java.lang.Class<?> wildcardClass14 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration0.unregisterClient(user12, managementTeam13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration0.getRegisteredUsers();
        boolean boolean27 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        boolean boolean6 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        int int8 = clientRegistration0.getUserID();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
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
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        java.lang.Class<?> wildcardClass2 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        boolean boolean11 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration12 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean14 = clientRegistration12.isValidEmail("");
        clientRegistration12.authenticateUser("hi!", "hi!");
        int int18 = clientRegistration12.getUserID();
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration12.unregisterClient(user19, managementTeam20);
        com.yorku.parkingsystem.user.User user22 = null;
        boolean boolean23 = clientRegistration12.hasValidLicensePlate(user22);
        com.yorku.parkingsystem.user.User user24 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam25 = null;
        clientRegistration12.unregisterClient(user24, managementTeam25);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList27 = clientRegistration12.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
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
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration0.unregisterClient(user16, managementTeam17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
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
        clientRegistration0.unregisterClient(user20, managementTeam21);
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass27 = userList26.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration9 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean11 = clientRegistration9.isValidEmail("hi!");
        boolean boolean13 = clientRegistration9.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration9.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList15, managementTeam16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
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
        com.yorku.parkingsystem.user.User user26 = null;
        boolean boolean27 = clientRegistration0.hasValidLicensePlate(user26);
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
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList32 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam33 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList32, managementTeam33);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
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
        int int15 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
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
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
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
        java.lang.Class<?> wildcardClass17 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration16 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean18 = clientRegistration16.isValidEmail("");
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration16.unregisterClient(user19, managementTeam20);
        boolean boolean23 = clientRegistration16.isValidEmail("");
        clientRegistration16.authenticateUser("hi!", "");
        boolean boolean28 = clientRegistration16.isValidPassword("");
        clientRegistration16.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList30 = clientRegistration16.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user31 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        clientRegistration16.unregisterClient(user31, managementTeam32);
        com.yorku.parkingsystem.user.User user34 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam35 = null;
        clientRegistration16.unregisterClient(user34, managementTeam35);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList37 = clientRegistration16.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList37);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration28 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean30 = clientRegistration28.isValidEmail("");
        com.yorku.parkingsystem.user.User user31 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        clientRegistration28.unregisterClient(user31, managementTeam32);
        boolean boolean35 = clientRegistration28.isValidEmail("");
        clientRegistration28.authenticateUser("hi!", "");
        clientRegistration28.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList40 = clientRegistration28.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam41 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList40, managementTeam41);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
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
        int int35 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        int int10 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
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
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
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
        com.yorku.parkingsystem.user.User user20 = null;
        boolean boolean21 = clientRegistration0.hasValidLicensePlate(user20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
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
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration0.unregisterClient(user22, managementTeam23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
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
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user10, managementTeam11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
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
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
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
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration13 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean15 = clientRegistration13.isValidEmail("");
        clientRegistration13.displayRegisteredUsers();
        clientRegistration13.displayRegisteredUsers();
        clientRegistration13.authenticateUser("hi!", "");
        boolean boolean22 = clientRegistration13.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration13.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList23, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
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
        boolean boolean16 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration1 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean3 = clientRegistration1.isValidEmail("");
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration1.unregisterClient(user4, managementTeam5);
        boolean boolean8 = clientRegistration1.isValidEmail("");
        clientRegistration1.authenticateUser("hi!", "");
        boolean boolean13 = clientRegistration1.isValidPassword("");
        clientRegistration1.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration1.unregisterClient(user15, managementTeam16);
        clientRegistration1.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user19 = null;
        boolean boolean20 = clientRegistration1.hasValidLicensePlate(user19);
        boolean boolean22 = clientRegistration1.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList23 = clientRegistration1.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList23, managementTeam24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
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
        java.lang.Class<?> wildcardClass14 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidEmail("hi!");
        boolean boolean13 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
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
        boolean boolean14 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        boolean boolean11 = clientRegistration0.isValidEmail("");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration14 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean16 = clientRegistration14.isValidEmail("");
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        clientRegistration14.unregisterClient(user17, managementTeam18);
        boolean boolean21 = clientRegistration14.isValidEmail("");
        clientRegistration14.authenticateUser("hi!", "");
        clientRegistration14.authenticateUser("hi!", "");
        clientRegistration14.authenticateUser("", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList31 = clientRegistration14.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList31, managementTeam32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
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
        java.lang.Class<?> wildcardClass13 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        boolean boolean12 = clientRegistration0.isValidPassword("");
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
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
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
        boolean boolean15 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        com.yorku.parkingsystem.user.User user5 = null;
        boolean boolean6 = clientRegistration0.hasValidLicensePlate(user5);
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
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
        clientRegistration0.displayRegisteredUsers();
        int int19 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
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
        java.lang.Class<?> wildcardClass19 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
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
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user16, managementTeam17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration18 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean20 = clientRegistration18.isValidEmail("");
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration18.unregisterClient(user21, managementTeam22);
        boolean boolean25 = clientRegistration18.isValidEmail("");
        int int26 = clientRegistration18.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList27 = clientRegistration18.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList27, managementTeam28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration18 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean20 = clientRegistration18.isValidEmail("");
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration18.unregisterClient(user21, managementTeam22);
        boolean boolean25 = clientRegistration18.isValidEmail("");
        clientRegistration18.authenticateUser("hi!", "");
        clientRegistration18.authenticateUser("hi!", "");
        boolean boolean33 = clientRegistration18.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList34 = clientRegistration18.getRegisteredUsers();
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
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration21 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean23 = clientRegistration21.isValidEmail("hi!");
        boolean boolean25 = clientRegistration21.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration21.getRegisteredUsers();
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
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration19 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean21 = clientRegistration19.isValidEmail("");
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration19.unregisterClient(user22, managementTeam23);
        boolean boolean26 = clientRegistration19.isValidEmail("");
        clientRegistration19.authenticateUser("hi!", "");
        boolean boolean31 = clientRegistration19.isValidPassword("");
        clientRegistration19.displayRegisteredUsers();
        boolean boolean34 = clientRegistration19.isValidPassword("");
        com.yorku.parkingsystem.user.User user35 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam36 = null;
        clientRegistration19.unregisterClient(user35, managementTeam36);
        com.yorku.parkingsystem.user.User user38 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam39 = null;
        clientRegistration19.unregisterClient(user38, managementTeam39);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList41 = clientRegistration19.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam42 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList41, managementTeam42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList41);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
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
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        clientRegistration0.unregisterClient(user25, managementTeam26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration7 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean9 = clientRegistration7.isValidEmail("");
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration7.unregisterClient(user10, managementTeam11);
        boolean boolean14 = clientRegistration7.isValidEmail("");
        clientRegistration7.authenticateUser("hi!", "");
        clientRegistration7.authenticateUser("hi!", "");
        clientRegistration7.authenticateUser("", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList24 = clientRegistration7.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam25 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList24, managementTeam25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration14 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean16 = clientRegistration14.isValidEmail("");
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        clientRegistration14.unregisterClient(user17, managementTeam18);
        boolean boolean21 = clientRegistration14.isValidEmail("");
        clientRegistration14.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration14.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user26 = null;
        boolean boolean27 = clientRegistration14.hasValidLicensePlate(user26);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList28 = clientRegistration14.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
        com.yorku.parkingsystem.user.User user16 = null;
        boolean boolean17 = clientRegistration0.hasValidLicensePlate(user16);
        java.lang.Class<?> wildcardClass18 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
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
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
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
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        boolean boolean6 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        int int10 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration9 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean11 = clientRegistration9.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration9.hasValidLicensePlate(user12);
        boolean boolean15 = clientRegistration9.isValidEmail("");
        clientRegistration9.displayRegisteredUsers();
        int int17 = clientRegistration9.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList18, managementTeam19);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
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
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
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
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user18, managementTeam19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
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
        boolean boolean17 = clientRegistration0.isValidPassword("");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "");
        java.lang.Class<?> wildcardClass11 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        int int8 = clientRegistration0.getUserID();
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        boolean boolean11 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        int int12 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration13 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean15 = clientRegistration13.isValidEmail("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration13.unregisterClient(user16, managementTeam17);
        boolean boolean20 = clientRegistration13.isValidEmail("");
        clientRegistration13.authenticateUser("hi!", "");
        boolean boolean25 = clientRegistration13.isValidPassword("");
        clientRegistration13.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration13.unregisterClient(user27, managementTeam28);
        boolean boolean31 = clientRegistration13.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList32 = clientRegistration13.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user33 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam34 = null;
        clientRegistration13.unregisterClient(user33, managementTeam34);
        com.yorku.parkingsystem.user.User user36 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam37 = null;
        clientRegistration13.unregisterClient(user36, managementTeam37);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList39 = clientRegistration13.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user12 = null;
        boolean boolean13 = clientRegistration0.hasValidLicensePlate(user12);
        boolean boolean15 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        int int9 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
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
        clientRegistration0.authenticateUser("", "hi!");
        com.yorku.parkingsystem.user.User user36 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam37 = null;
        clientRegistration0.unregisterClient(user36, managementTeam37);
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
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
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
        java.lang.Class<?> wildcardClass23 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int1 = clientRegistration0.getUserID();
        clientRegistration0.displayRegisteredUsers();
        boolean boolean4 = clientRegistration0.isValidEmail("");
        int int5 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
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
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration0.unregisterClient(user27, managementTeam28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
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
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
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
        boolean boolean22 = clientRegistration0.isValidPassword("");
        boolean boolean24 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration19 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean21 = clientRegistration19.isValidEmail("");
        com.yorku.parkingsystem.user.User user22 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam23 = null;
        clientRegistration19.unregisterClient(user22, managementTeam23);
        int int25 = clientRegistration19.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration19.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList27 = clientRegistration19.getRegisteredUsers();
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
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        java.lang.Class<?> wildcardClass17 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user15 = null;
        boolean boolean16 = clientRegistration0.hasValidLicensePlate(user15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
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
        com.yorku.parkingsystem.user.User user20 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        clientRegistration0.unregisterClient(user20, managementTeam21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
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
        boolean boolean14 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration15 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean17 = clientRegistration15.isValidEmail("");
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration15.unregisterClient(user18, managementTeam19);
        boolean boolean22 = clientRegistration15.isValidEmail("");
        int int23 = clientRegistration15.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList24 = clientRegistration15.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam25 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList24, managementTeam25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration15 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean17 = clientRegistration15.isValidEmail("");
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration15.unregisterClient(user18, managementTeam19);
        boolean boolean22 = clientRegistration15.isValidEmail("");
        clientRegistration15.authenticateUser("hi!", "");
        clientRegistration15.authenticateUser("hi!", "");
        boolean boolean30 = clientRegistration15.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList31 = clientRegistration15.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList31, managementTeam32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        java.lang.Class<?> wildcardClass6 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration11 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean13 = clientRegistration11.isValidEmail("");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration11.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration11.isValidEmail("");
        clientRegistration11.authenticateUser("hi!", "");
        clientRegistration11.authenticateUser("hi!", "");
        clientRegistration11.authenticateUser("", "hi!");
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
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
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
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration18 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean20 = clientRegistration18.isValidEmail("");
        clientRegistration18.authenticateUser("hi!", "hi!");
        int int24 = clientRegistration18.getUserID();
        com.yorku.parkingsystem.user.User user25 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        clientRegistration18.unregisterClient(user25, managementTeam26);
        com.yorku.parkingsystem.user.User user28 = null;
        boolean boolean29 = clientRegistration18.hasValidLicensePlate(user28);
        com.yorku.parkingsystem.user.User user30 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam31 = null;
        clientRegistration18.unregisterClient(user30, managementTeam31);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList33 = clientRegistration18.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
        boolean boolean24 = clientRegistration0.hasValidLicensePlate(user23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
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
        com.yorku.parkingsystem.user.User user16 = null;
        boolean boolean17 = clientRegistration0.hasValidLicensePlate(user16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList16 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        java.lang.Class<?> wildcardClass19 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
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
        com.yorku.parkingsystem.user.User user14 = null;
        boolean boolean15 = clientRegistration0.hasValidLicensePlate(user14);
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
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        boolean boolean13 = clientRegistration0.isValidEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration9 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean11 = clientRegistration9.isValidEmail("");
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration9.unregisterClient(user12, managementTeam13);
        boolean boolean16 = clientRegistration9.isValidEmail("");
        clientRegistration9.authenticateUser("hi!", "");
        boolean boolean21 = clientRegistration9.isValidPassword("");
        clientRegistration9.displayRegisteredUsers();
        boolean boolean24 = clientRegistration9.isValidPassword("");
        com.yorku.parkingsystem.user.User user25 = null;
        boolean boolean26 = clientRegistration9.hasValidLicensePlate(user25);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList27 = clientRegistration9.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration24 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean26 = clientRegistration24.isValidEmail("");
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration24.unregisterClient(user27, managementTeam28);
        clientRegistration24.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList31 = clientRegistration24.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user32 = null;
        boolean boolean33 = clientRegistration24.hasValidLicensePlate(user32);
        int int34 = clientRegistration24.getUserID();
        clientRegistration24.authenticateUser("", "hi!");
        clientRegistration24.authenticateUser("hi!", "hi!");
        boolean boolean42 = clientRegistration24.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList43 = clientRegistration24.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam44 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList43, managementTeam44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
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
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        java.lang.Class<?> wildcardClass19 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
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
        int int23 = clientRegistration0.getUserID();
        java.lang.Class<?> wildcardClass24 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
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
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        boolean boolean27 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user28 = null;
        boolean boolean29 = clientRegistration0.hasValidLicensePlate(user28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.authenticateUser("", "");
        int int9 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass11 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass12 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean10 = clientRegistration0.isValidEmail("");
        java.lang.Class<?> wildcardClass11 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
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
        boolean boolean22 = clientRegistration0.hasValidLicensePlate(user21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList16 = clientRegistration0.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
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
        int int30 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user31 = null;
        boolean boolean32 = clientRegistration0.hasValidLicensePlate(user31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
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
        boolean boolean20 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user15, managementTeam16);
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
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
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
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
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
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
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
        java.lang.Class<?> wildcardClass17 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration6 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean8 = clientRegistration6.isValidEmail("");
        clientRegistration6.authenticateUser("hi!", "hi!");
        boolean boolean13 = clientRegistration6.isValidEmail("");
        boolean boolean15 = clientRegistration6.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList16 = clientRegistration6.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList16, managementTeam17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
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
        int int24 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        com.yorku.parkingsystem.user.User user5 = null;
        boolean boolean6 = clientRegistration0.hasValidLicensePlate(user5);
        int int7 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration8 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean10 = clientRegistration8.isValidEmail("hi!");
        boolean boolean12 = clientRegistration8.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList13 = clientRegistration8.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList14 = clientRegistration8.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList14, managementTeam15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("hi!", "");
        int int14 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration15 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean17 = clientRegistration15.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user18 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        clientRegistration15.unregisterClient(user18, managementTeam19);
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration15.unregisterClient(user21, managementTeam22);
        int int24 = clientRegistration15.getUserID();
        com.yorku.parkingsystem.user.User user25 = null;
        boolean boolean26 = clientRegistration15.hasValidLicensePlate(user25);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList27 = clientRegistration15.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration15 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean17 = clientRegistration15.isValidEmail("hi!");
        boolean boolean19 = clientRegistration15.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration15.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam21 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList20, managementTeam21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration9 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean11 = clientRegistration9.isValidEmail("hi!");
        clientRegistration9.authenticateUser("", "hi!");
        boolean boolean16 = clientRegistration9.isValidPassword("");
        int int17 = clientRegistration9.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList18 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam19 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList18, managementTeam19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        com.yorku.parkingsystem.user.User user5 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam6 = null;
        clientRegistration0.unregisterClient(user5, managementTeam6);
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        java.lang.Class<?> wildcardClass15 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        int int7 = clientRegistration0.getUserID();
        int int8 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
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
        boolean boolean24 = clientRegistration0.isValidPassword("");
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
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList16 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass17 = userList16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration0.unregisterClient(user12, managementTeam13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass8 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
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
        java.lang.Class<?> wildcardClass17 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
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
        clientRegistration0.authenticateUser("", "hi!");
        java.lang.Class<?> wildcardClass36 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
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
        boolean boolean17 = clientRegistration0.isValidPassword("");
        boolean boolean19 = clientRegistration0.isValidPassword("");
        int int20 = clientRegistration0.getUserID();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
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
        boolean boolean24 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        boolean boolean10 = clientRegistration0.isValidEmail("");
        int int11 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration12 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean14 = clientRegistration12.isValidEmail("");
        com.yorku.parkingsystem.user.User user15 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        clientRegistration12.unregisterClient(user15, managementTeam16);
        boolean boolean19 = clientRegistration12.isValidEmail("");
        int int20 = clientRegistration12.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList21 = clientRegistration12.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList21, managementTeam22);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
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
        java.lang.Class<?> wildcardClass12 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
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
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration18 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean20 = clientRegistration18.isValidEmail("");
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration18.unregisterClient(user21, managementTeam22);
        boolean boolean25 = clientRegistration18.isValidEmail("");
        clientRegistration18.authenticateUser("hi!", "");
        boolean boolean30 = clientRegistration18.isValidPassword("");
        clientRegistration18.displayRegisteredUsers();
        boolean boolean33 = clientRegistration18.isValidPassword("");
        com.yorku.parkingsystem.user.User user34 = null;
        boolean boolean35 = clientRegistration18.hasValidLicensePlate(user34);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList36 = clientRegistration18.getRegisteredUsers();
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
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
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
        java.lang.Class<?> wildcardClass14 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        int int8 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
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
        boolean boolean21 = clientRegistration0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
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
        com.yorku.parkingsystem.user.User user40 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam41 = null;
        clientRegistration25.unregisterClient(user40, managementTeam41);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList43 = clientRegistration25.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam44 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList43, managementTeam44);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
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
        com.yorku.parkingsystem.user.User user20 = null;
        boolean boolean21 = clientRegistration0.hasValidLicensePlate(user20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        int int7 = clientRegistration0.getUserID();
        int int8 = clientRegistration0.getUserID();
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
        clientRegistration9.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList31 = clientRegistration9.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam32 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList31, managementTeam32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
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
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
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
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration13 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean15 = clientRegistration13.isValidEmail("");
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration13.unregisterClient(user16, managementTeam17);
        boolean boolean20 = clientRegistration13.isValidEmail("");
        clientRegistration13.authenticateUser("hi!", "");
        boolean boolean25 = clientRegistration13.isValidPassword("");
        clientRegistration13.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user27 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam28 = null;
        clientRegistration13.unregisterClient(user27, managementTeam28);
        clientRegistration13.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user31 = null;
        boolean boolean32 = clientRegistration13.hasValidLicensePlate(user31);
        boolean boolean34 = clientRegistration13.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList35 = clientRegistration13.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList36 = clientRegistration13.getRegisteredUsers();
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
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
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
        java.lang.Class<?> wildcardClass15 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration0.unregisterClient(user8, managementTeam9);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass16 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass18 = userList17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user4 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam5 = null;
        clientRegistration0.unregisterClient(user4, managementTeam5);
        com.yorku.parkingsystem.user.User user7 = null;
        boolean boolean8 = clientRegistration0.hasValidLicensePlate(user7);
        com.yorku.parkingsystem.user.User user9 = null;
        boolean boolean10 = clientRegistration0.hasValidLicensePlate(user9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
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
        java.lang.Class<?> wildcardClass21 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
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
        boolean boolean19 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        int int12 = clientRegistration0.getUserID();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean18 = clientRegistration0.isValidPassword("");
        java.lang.Class<?> wildcardClass19 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration20 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean22 = clientRegistration20.isValidEmail("");
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration20.unregisterClient(user23, managementTeam24);
        boolean boolean27 = clientRegistration20.isValidEmail("");
        clientRegistration20.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user31 = null;
        boolean boolean32 = clientRegistration20.hasValidLicensePlate(user31);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList33 = clientRegistration20.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam34 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList33, managementTeam34);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        boolean boolean7 = clientRegistration0.hasValidLicensePlate(user6);
        clientRegistration0.displayRegisteredUsers();
        boolean boolean10 = clientRegistration0.isValidPassword("");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
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
        boolean boolean25 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user26 = null;
        boolean boolean27 = clientRegistration0.hasValidLicensePlate(user26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        boolean boolean11 = clientRegistration0.isValidPassword("");
        boolean boolean13 = clientRegistration0.isValidEmail("");
        boolean boolean15 = clientRegistration0.isValidEmail("hi!");
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
        boolean boolean34 = clientRegistration16.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList35 = clientRegistration16.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user36 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam37 = null;
        clientRegistration16.unregisterClient(user36, managementTeam37);
        com.yorku.parkingsystem.user.User user39 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam40 = null;
        clientRegistration16.unregisterClient(user39, managementTeam40);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList42 = clientRegistration16.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam43 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList42, managementTeam43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList42);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
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
        java.lang.Class<?> wildcardClass25 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
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
        int int11 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
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
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration18 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean20 = clientRegistration18.isValidEmail("");
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration18.unregisterClient(user21, managementTeam22);
        boolean boolean25 = clientRegistration18.isValidEmail("");
        int int26 = clientRegistration18.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList27 = clientRegistration18.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass7 = userList6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
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
        com.yorku.parkingsystem.user.User user23 = null;
        boolean boolean24 = clientRegistration0.hasValidLicensePlate(user23);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration25 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean27 = clientRegistration25.isValidEmail("hi!");
        boolean boolean29 = clientRegistration25.isValidEmail("hi!");
        clientRegistration25.displayRegisteredUsers();
        boolean boolean32 = clientRegistration25.isValidEmail("hi!");
        clientRegistration25.authenticateUser("", "");
        boolean boolean37 = clientRegistration25.isValidEmail("hi!");
        clientRegistration25.authenticateUser("", "hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList41 = clientRegistration25.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam42 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList41, managementTeam42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(userList41);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        boolean boolean10 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user11 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam12 = null;
        clientRegistration0.unregisterClient(user11, managementTeam12);
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        boolean boolean6 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        int int8 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList9 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user10 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam11 = null;
        clientRegistration0.unregisterClient(user10, managementTeam11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
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
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
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
        boolean boolean20 = clientRegistration0.isValidPassword("");
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
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
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
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        java.lang.Class<?> wildcardClass19 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
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
        com.yorku.parkingsystem.user.User user29 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam30 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerClient(user29, managementTeam30);
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
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
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
        java.lang.Class<?> wildcardClass20 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
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
        boolean boolean15 = clientRegistration0.isValidPassword("");
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
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user8 = null;
        boolean boolean9 = clientRegistration0.hasValidLicensePlate(user8);
        boolean boolean11 = clientRegistration0.isValidPassword("");
        boolean boolean13 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "");
        boolean boolean12 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user13 = null;
        boolean boolean14 = clientRegistration0.hasValidLicensePlate(user13);
        boolean boolean16 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
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
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        boolean boolean11 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
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
        com.yorku.parkingsystem.user.User user19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        clientRegistration0.unregisterClient(user19, managementTeam20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
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
        boolean boolean15 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        int int6 = clientRegistration0.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        boolean boolean10 = clientRegistration0.isValidEmail("");
        java.lang.Class<?> wildcardClass11 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
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
        java.lang.Class<?> wildcardClass28 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        clientRegistration0.displayRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList17, managementTeam18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user20 = null;
        boolean boolean21 = clientRegistration0.hasValidLicensePlate(user20);
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user11 = null;
        boolean boolean12 = clientRegistration0.hasValidLicensePlate(user11);
        boolean boolean14 = clientRegistration0.isValidEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
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
        int int15 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
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
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
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
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
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
        int int20 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user21 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam22 = null;
        clientRegistration0.unregisterClient(user21, managementTeam22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        boolean boolean7 = clientRegistration0.hasValidLicensePlate(user6);
        int int8 = clientRegistration0.getUserID();
        boolean boolean10 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration12 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean14 = clientRegistration12.isValidEmail("");
        clientRegistration12.authenticateUser("hi!", "hi!");
        boolean boolean19 = clientRegistration12.isValidEmail("");
        com.yorku.parkingsystem.user.User user20 = null;
        boolean boolean21 = clientRegistration12.hasValidLicensePlate(user20);
        boolean boolean23 = clientRegistration12.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user24 = null;
        boolean boolean25 = clientRegistration12.hasValidLicensePlate(user24);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration12.getRegisteredUsers();
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
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user5 = null;
        boolean boolean6 = clientRegistration0.hasValidLicensePlate(user5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        boolean boolean7 = clientRegistration0.hasValidLicensePlate(user6);
        boolean boolean9 = clientRegistration0.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList10 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass11 = userList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user3 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam4 = null;
        clientRegistration0.unregisterClient(user3, managementTeam4);
        clientRegistration0.displayRegisteredUsers();
        int int7 = clientRegistration0.getUserID();
        java.lang.Class<?> wildcardClass8 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
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
        com.yorku.parkingsystem.user.User user29 = null;
        boolean boolean30 = clientRegistration0.hasValidLicensePlate(user29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user3 = null;
        boolean boolean4 = clientRegistration0.hasValidLicensePlate(user3);
        boolean boolean6 = clientRegistration0.isValidEmail("");
        int int7 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
        boolean boolean13 = clientRegistration0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
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
        int int20 = clientRegistration0.getUserID();
        java.lang.Class<?> wildcardClass21 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.user.User user6 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam7 = null;
        clientRegistration0.unregisterClient(user6, managementTeam7);
        boolean boolean10 = clientRegistration0.isValidPassword("");
        boolean boolean12 = clientRegistration0.isValidPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        clientRegistration0.authenticateUser("", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList12 = clientRegistration0.getRegisteredUsers();
        boolean boolean14 = clientRegistration0.isValidPassword("");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration14 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean16 = clientRegistration14.isValidEmail("");
        com.yorku.parkingsystem.user.User user17 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam18 = null;
        clientRegistration14.unregisterClient(user17, managementTeam18);
        boolean boolean21 = clientRegistration14.isValidEmail("");
        clientRegistration14.authenticateUser("hi!", "");
        boolean boolean26 = clientRegistration14.isValidPassword("");
        clientRegistration14.displayRegisteredUsers();
        com.yorku.parkingsystem.user.User user28 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam29 = null;
        clientRegistration14.unregisterClient(user28, managementTeam29);
        boolean boolean32 = clientRegistration14.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList33 = clientRegistration14.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam34 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList33, managementTeam34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
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
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
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
        boolean boolean25 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
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
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration0.getRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
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
        boolean boolean14 = clientRegistration0.isValidPassword("");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        clientRegistration0.authenticateUser("", "");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration25 = new com.yorku.parkingsystem.management.ClientRegistration();
        int int26 = clientRegistration25.getUserID();
        com.yorku.parkingsystem.user.User user27 = null;
        boolean boolean28 = clientRegistration25.hasValidLicensePlate(user27);
        clientRegistration25.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList30 = clientRegistration25.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam31 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList30, managementTeam31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList6 = clientRegistration0.getRegisteredUsers();
        boolean boolean8 = clientRegistration0.isValidPassword("");
        boolean boolean10 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration11 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean13 = clientRegistration11.isValidEmail("");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration11.unregisterClient(user14, managementTeam15);
        boolean boolean18 = clientRegistration11.isValidEmail("");
        clientRegistration11.authenticateUser("hi!", "");
        boolean boolean23 = clientRegistration11.isValidPassword("");
        clientRegistration11.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration11.getRegisteredUsers();
        int int26 = clientRegistration11.getUserID();
        int int27 = clientRegistration11.getUserID();
        int int28 = clientRegistration11.getUserID();
        com.yorku.parkingsystem.user.User user29 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam30 = null;
        clientRegistration11.unregisterClient(user29, managementTeam30);
        boolean boolean33 = clientRegistration11.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList34 = clientRegistration11.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam35 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList34, managementTeam35);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration20 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean22 = clientRegistration20.isValidEmail("hi!");
        boolean boolean24 = clientRegistration20.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList25 = clientRegistration20.getRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList26 = clientRegistration20.getRegisteredUsers();
        boolean boolean28 = clientRegistration20.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList29 = clientRegistration20.getRegisteredUsers();
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
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean7 = clientRegistration0.isValidPassword("");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration0.unregisterClient(user8, managementTeam9);
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList11 = clientRegistration0.getRegisteredUsers();
        java.lang.Class<?> wildcardClass12 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean9 = clientRegistration0.isValidEmail("");
        com.yorku.parkingsystem.user.User user10 = null;
        boolean boolean11 = clientRegistration0.hasValidLicensePlate(user10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList17 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
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
        clientRegistration0.displayRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
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
        boolean boolean27 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList3 = clientRegistration0.getRegisteredUsers();
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration4 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean6 = clientRegistration4.isValidEmail("");
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration4.unregisterClient(user7, managementTeam8);
        boolean boolean11 = clientRegistration4.isValidEmail("");
        clientRegistration4.authenticateUser("hi!", "");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList15 = clientRegistration4.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam16 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList15, managementTeam16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
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
        java.lang.Class<?> wildcardClass35 = clientRegistration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        clientRegistration0.authenticateUser("hi!", "");
        com.yorku.parkingsystem.user.User user8 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam9 = null;
        clientRegistration0.unregisterClient(user8, managementTeam9);
        clientRegistration0.authenticateUser("hi!", "hi!");
        com.yorku.parkingsystem.user.User user14 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam15 = null;
        clientRegistration0.unregisterClient(user14, managementTeam15);
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
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
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
        clientRegistration0.displayRegisteredUsers();
        int int18 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
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
        com.yorku.parkingsystem.user.User user17 = null;
        boolean boolean18 = clientRegistration0.hasValidLicensePlate(user17);
        boolean boolean20 = clientRegistration0.isValidEmail("");
        boolean boolean22 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration22 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean24 = clientRegistration22.isValidEmail("");
        com.yorku.parkingsystem.user.User user25 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam26 = null;
        clientRegistration22.unregisterClient(user25, managementTeam26);
        boolean boolean29 = clientRegistration22.isValidEmail("");
        clientRegistration22.authenticateUser("hi!", "");
        clientRegistration22.authenticateUser("hi!", "");
        boolean boolean37 = clientRegistration22.isValidPassword("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList38 = clientRegistration22.getRegisteredUsers();
        com.yorku.parkingsystem.management.ManagementTeam managementTeam39 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList38, managementTeam39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
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
        com.yorku.parkingsystem.user.User user23 = null;
        boolean boolean24 = clientRegistration0.hasValidLicensePlate(user23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        clientRegistration0.displayRegisteredUsers();
        int int11 = clientRegistration0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        int int6 = clientRegistration0.getUserID();
        com.yorku.parkingsystem.user.User user7 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam8 = null;
        clientRegistration0.unregisterClient(user7, managementTeam8);
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration10 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean12 = clientRegistration10.isValidEmail("hi!");
        com.yorku.parkingsystem.user.User user13 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam14 = null;
        clientRegistration10.unregisterClient(user13, managementTeam14);
        com.yorku.parkingsystem.user.User user16 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam17 = null;
        clientRegistration10.unregisterClient(user16, managementTeam17);
        clientRegistration10.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList20 = clientRegistration10.getRegisteredUsers();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
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
        com.yorku.parkingsystem.user.User user16 = null;
        boolean boolean17 = clientRegistration0.hasValidLicensePlate(user16);
        com.yorku.parkingsystem.user.User user18 = null;
        boolean boolean19 = clientRegistration0.hasValidLicensePlate(user18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration16 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean18 = clientRegistration16.isValidEmail("hi!");
        clientRegistration16.authenticateUser("", "hi!");
        boolean boolean23 = clientRegistration16.isValidPassword("");
        boolean boolean25 = clientRegistration16.isValidPassword("hi!");
        com.yorku.parkingsystem.user.User user26 = null;
        boolean boolean27 = clientRegistration16.hasValidLicensePlate(user26);
        int int28 = clientRegistration16.getUserID();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList29 = clientRegistration16.getRegisteredUsers();
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
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
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
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList19 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam20 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRegistration0.registerMultipleUsers(userList19, managementTeam20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.parkingsystem.management.ManagementTeam.isRegistered()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
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
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration20 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean22 = clientRegistration20.isValidEmail("");
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration20.unregisterClient(user23, managementTeam24);
        boolean boolean27 = clientRegistration20.isValidEmail("");
        clientRegistration20.authenticateUser("hi!", "");
        clientRegistration20.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList32 = clientRegistration20.getRegisteredUsers();
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
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
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
        clientRegistration0.unregisterClient(user20, managementTeam21);
        com.yorku.parkingsystem.user.User user23 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam24 = null;
        clientRegistration0.unregisterClient(user23, managementTeam24);
        com.yorku.parkingsystem.user.User user26 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam27 = null;
        clientRegistration0.unregisterClient(user26, managementTeam27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("");
        clientRegistration0.authenticateUser("hi!", "hi!");
        boolean boolean7 = clientRegistration0.isValidEmail("");
        boolean boolean9 = clientRegistration0.isValidEmail("hi!");
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
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
        com.yorku.parkingsystem.user.User user28 = null;
        boolean boolean29 = clientRegistration0.hasValidLicensePlate(user28);
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
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
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
        com.yorku.parkingsystem.user.User user12 = null;
        com.yorku.parkingsystem.management.ManagementTeam managementTeam13 = null;
        clientRegistration0.unregisterClient(user12, managementTeam13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        boolean boolean7 = clientRegistration0.isValidPassword("");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList8 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.authenticateUser("", "hi!");
        boolean boolean13 = clientRegistration0.isValidPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.yorku.parkingsystem.management.ClientRegistration clientRegistration0 = new com.yorku.parkingsystem.management.ClientRegistration();
        boolean boolean2 = clientRegistration0.isValidEmail("hi!");
        boolean boolean4 = clientRegistration0.isValidEmail("hi!");
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList5 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        java.util.ArrayList<com.yorku.parkingsystem.user.User> userList7 = clientRegistration0.getRegisteredUsers();
        clientRegistration0.displayRegisteredUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList7);
    }
}

