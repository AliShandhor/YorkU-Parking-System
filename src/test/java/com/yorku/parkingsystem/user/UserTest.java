package com.yorku.parkingsystem.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    @BeforeEach
    void setup() {
        user = new Student("Uzma", "uzma@yorku.ca", "uzma123", "A12345678", 5.0);
    }

    @Test
    void testGetUserID() {
        assertEquals(0, user.getUserID(), "User ID should be 0 initially.");
    }

    @Test
    void testSetUserID() {
        user.setUserID(101);
        assertEquals(101, user.getUserID(), "User ID should be updated to 101.");
    }

    @Test
    void testGetName() {
        assertEquals("Uzma", user.getName(), "Name should be Uzma.");
    }

    @Test
    void testSetName() {
        user.setName("Ainaz");
        assertEquals("Ainaz", user.getName(), "Name should be set to Ainaz.");
    }

    @Test
    void testGetEmail() {
        assertEquals("uzma@yorku.ca", user.getEmail(), "Email should be uzma@yorku.ca.");
    }

    @Test
    void testSetEmail() {
        user.setEmail("ainaz@yorku.ca");
        assertEquals("ainaz@yorku.ca", user.getEmail(), "Email should be set to ainaz@yorku.ca.");
    }

    @Test
    void testGetPassword() {
        assertEquals("uzma123", user.getPassword(), "Password should be uzma123.");
    }

    @Test
    void testSetPassword() {
        user.setPassword("uzma456");
        assertEquals("uzma456", user.getPassword(), "Password should be updated to uzma456.");
    }

    @Test
    void testGetLicensePlate() {
        assertEquals("A12345678", user.getLicensePlate(), "License Plate should be A12345678.");
    }

    @Test
    void testSetLicensePlate() {
        user.setLicensePlate("B98765432");
        assertEquals("B98765432", user.getLicensePlate(), "License Plate should be set to B98765432.");
    }

    @Test
    void testGetRatePerHour() {
        assertEquals(5.0, user.getRatePerHour(), "Rate per Hour should be 5.0.");
    }

    @Test
    void testIsRegistered() {
        assertFalse(user.isRegistered(), "User should not be registered initially.");
    }

    @Test
    void testRegister() {
        user.register(true);
        assertTrue(user.isRegistered(), "User should be registered after register is called true.");
    }

    @Test
    void testShowDetails() {
        assertDoesNotThrow(() -> user.showDetails());
    }

    @Test
    void testToString() {
        String expected = "Student {ID=0, Name='Uzma', License Plate='A12345678', Rate per Hour=$5.0}";
        assertEquals(expected, user.toString(), "toString method should be returned.");
    }
}