package com.yorku.parkingsystem.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonFacultyMemberTest {

    private NonFacultyMember nonFacultyMember;

    @BeforeEach
    void setup() {
        nonFacultyMember = new NonFacultyMember("Mahin", "mahin@yorku.ca", "mahin123", "B65432109", 10.0);
    }
    // Test cases for NonFacultyMember class
    @Test
    void testDisplayClientDetails() {
        assertDoesNotThrow(() -> nonFacultyMember.displayClientDetails());
    }

    @Test
    void testAcceptVisitor() {
        UserVisitor visitor = new BillingVisitor(null);
        assertDoesNotThrow(() -> nonFacultyMember.accept(visitor));
    }

    @Test
    void testGetClientType() {
        assertEquals("NON-FACULTY", nonFacultyMember.getClientType(), "Client type should be NON-FACULTY.");
    }

    @Test
    void testToString() {
        String expected = "Non Faculty Member {ID=0, Name='Mahin', License Plate='B65432109', Rate per Hour=$10.0}";
        assertEquals(expected, nonFacultyMember.toString(), "toString method is returned.");
    }

    @Test
    void testGetUserID() {
        assertEquals(0, nonFacultyMember.getUserID(), "User ID should be initialised to 0.");
    }

    @Test
    void testGetName() {
        assertEquals("Mahin", nonFacultyMember.getName(), "Name should be Mahin.");
    }

    @Test
    void testGetLicensePlate() {
        assertEquals("B65432109", nonFacultyMember.getLicensePlate(), "License Plate should be B65432109.");
    }

    @Test
    void testGetRatePerHour() {
        assertEquals(10.0, nonFacultyMember.getRatePerHour(), "Rate per Hour should be 10.0.");
    }

    @Test
    void testGetEmail() {
        assertEquals("mahin@yorku.ca", nonFacultyMember.getEmail(), "Email should be mahin@yorku.ca.");
    }

    @Test
    void testGetPassword() {
        assertEquals("mahin123", nonFacultyMember.getPassword(), "Password should be mahin123.");
    }

    @Test
    void testSetEmail() {
        nonFacultyMember.setEmail("newmahin@yorku.ca");
        assertEquals("newmahin@yorku.ca", nonFacultyMember.getEmail(), "Email should be set to newmahin@yorku.ca.");
    }

    @Test
    void testSetPassword() {
        nonFacultyMember.setPassword("mahin456");
        assertEquals("mahin456", nonFacultyMember.getPassword(), "Password should be set to mahin456.");
    }

    @Test
    void testSetName() {
        nonFacultyMember.setName("Mahin Alam");
        assertEquals("Mahin Alam", nonFacultyMember.getName(), "Name should be set to Mahin Alam.");
    }

    @Test
    void testSetLicensePlate() {
        nonFacultyMember.setLicensePlate("I83749201");
        assertEquals("I83749201", nonFacultyMember.getLicensePlate(), "License Plate should be set to I83749201.");
    }

    @Test
    void testRegister() {
        nonFacultyMember.register(true);
        assertTrue(nonFacultyMember.isRegistered(), "Non-faculty member should be registered.");
    }

    @Test
    void testIsRegistered() {
        assertFalse(nonFacultyMember.isRegistered(), "Non-faculty member should not be initially registered.");
        nonFacultyMember.register(true);
        assertTrue(nonFacultyMember.isRegistered(), "Faculty member should be registered after register is called true.");
    }
}