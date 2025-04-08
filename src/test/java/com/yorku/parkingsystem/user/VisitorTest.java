package com.yorku.parkingsystem.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {

    private Visitor visitor;

    @BeforeEach
    void setup() {
        visitor = new Visitor("Saima", "saima@yorku.ca", "saima123", "K38472950", 15.0);
    }
    // Test cases for Visitor class
    @Test
    void testDisplayClientDetails() {
        assertDoesNotThrow(() -> visitor.displayClientDetails());
    }

    @Test
    void testAcceptVisitor() {
        UserVisitor userVisitor = new BillingVisitor(null);
        assertDoesNotThrow(() -> visitor.accept(userVisitor));
    }

    @Test
    void testGetClientType() {
        assertEquals("VISITOR", visitor.getClientType(), "Client type should be VISITOR.");
    }

    @Test
    void testToString() {
        String expected = "Visitor {ID=0, Name='Saima', License Plate='K38472950', Rate per Hour=$15.0}";
        assertEquals(expected, visitor.toString(), "toString method is returned.");
    }

    @Test
    void testGetUserID() {
        assertEquals(0, visitor.getUserID(), "User ID should be initialised to 0.");
    }

    @Test
    void testGetName() {
        assertEquals("Saima", visitor.getName(), "Name should be Saima.");
    }

    @Test
    void testGetLicensePlate() {
        assertEquals("K38472950", visitor.getLicensePlate(), "License Plate should be K38472950.");
    }

    @Test
    void testGetRatePerHour() {
        assertEquals(15.0, visitor.getRatePerHour(), "Rate per Hour should be 15.0.");
    }

    @Test
    void testGetEmail() {
        assertEquals("saima@yorku.ca", visitor.getEmail(), "Email should be saima@yorku.ca.");
    }

    @Test
    void testGetPassword() {
        assertEquals("saima123", visitor.getPassword(), "Password should be saima123.");
    }

    @Test
    void testSetEmail() {
        visitor.setEmail("newsaima@yorku.ca");
        assertEquals("newsaima@yorku.ca", visitor.getEmail(), "Email should be set to newsaima@yorku.ca.");
    }

    @Test
    void testSetPassword() {
        visitor.setPassword("saima456");
        assertEquals("saima456", visitor.getPassword(), "Password should be set to saima456.");
    }

    @Test
    void testSetName() {
        visitor.setName("Saima Anjum");
        assertEquals("Saima Anjum", visitor.getName(), "Name should be set to Saima Anjum.");
    }

    @Test
    void testSetLicensePlate() {
        visitor.setLicensePlate("W38472950");
        assertEquals("W38472950", visitor.getLicensePlate(), "License Plate should be set to W38472950.");
    }

    @Test
    void testRegister() {
        visitor.register(true);
        assertTrue(visitor.isRegistered(), "Visitor should be registered.");
    }

    @Test
    void testIsRegistered() {
        assertFalse(visitor.isRegistered(), "Visitor should not be initially registered.");
        visitor.register(true);
        assertTrue(visitor.isRegistered(), "Visitor should be registered after regiser is called true.");
    }
}