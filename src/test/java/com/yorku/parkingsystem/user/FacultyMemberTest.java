package com.yorku.parkingsystem.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacultyMemberTest {

    private FacultyMember facultyMember;

    @BeforeEach
    void setup() {
        facultyMember = new FacultyMember("Faruque", "faruque@yorku.ca", "faruque123", "S98765432", 8.0);
    }
    // Test cases for FacultyMember class
    @Test
    void testDisplayClientDetails() {
        assertDoesNotThrow(() -> facultyMember.displayClientDetails());
    }

    @Test
    void testAcceptVisitor() {
        UserVisitor visitor = new BillingVisitor(null);
        assertDoesNotThrow(() -> facultyMember.accept(visitor));
    }

    @Test
    void testGetClientType() {
        assertEquals("FACULTY", facultyMember.getClientType(), "Client type should be FACULTY.");
    }

    @Test
    void testToString() {
        String expected = "Faculty Member {ID=0, Name='Faruque', License Plate='S98765432', Rate per Hour=$8.0}";
        assertEquals(expected, facultyMember.toString(), "toString method is returned.");
    }

    @Test
    void testGetUserID() {
        assertEquals(0, facultyMember.getUserID(), "User ID should be initialised as 0.");
    }

    @Test
    void testGetName() {
        assertEquals("Faruque", facultyMember.getName(), "Name should be Faruque.");
    }

    @Test
    void testGetLicensePlate() {
        assertEquals("S98765432", facultyMember.getLicensePlate(), "License Plate should be S98765432.");
    }

    @Test
    void testGetRatePerHour() {
        assertEquals(8.0, facultyMember.getRatePerHour(), "Rate per Hour should be 8.0.");
    }

    @Test
    void testGetEmail() {
        assertEquals("faruque@yorku.ca", facultyMember.getEmail(), "Email should be faruque@yorku.ca.");
    }

    @Test
    void testGetPassword() {
        assertEquals("faruque123", facultyMember.getPassword(), "Password should be faruque123.");
    }

    @Test
    void testSetEmail() {
        facultyMember.setEmail("faruquenew@yorku.ca");
        assertEquals("faruquenew@yorku.ca", facultyMember.getEmail(), "Email should be set to faruquenew@yorku.ca.");
    }

    @Test
    void testSetPassword() {
        facultyMember.setPassword("faruque456");
        assertEquals("faruque456", facultyMember.getPassword(), "Password should be set to faruque456.");
    }

    @Test
    void testSetName() {
        facultyMember.setName("Faruque Alam");
        assertEquals("Faruque Alam", facultyMember.getName(), "Name should be set to Faruque Alam.");
    }

    @Test
    void testSetLicensePlate() {
        facultyMember.setLicensePlate("P01928374");
        assertEquals("P01928374", facultyMember.getLicensePlate(), "License Plate should be set to P01928374.");
    }

    @Test
    void testRegister() {
        facultyMember.register(true);
        assertTrue(facultyMember.isRegistered(), "Faculty member should be registered.");
    }

    @Test
    void testIsRegistered() {
        assertFalse(facultyMember.isRegistered(), "Faculty member should not be initially registered.");
        facultyMember.register(true);
        assertTrue(facultyMember.isRegistered(), "Faculty member should be registered after register is called true.");
    }
}