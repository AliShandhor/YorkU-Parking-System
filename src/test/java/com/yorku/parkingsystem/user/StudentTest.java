package com.yorku.parkingsystem.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;

    @BeforeEach
    void setup() {
        student = new Student("Uzma", "uzma@yorku.ca", "uzma123", "A12345678", 5.0);
    }
    // Test cases for Student class
    @Test
    void testDisplayClientDetails() {
        assertDoesNotThrow(() -> student.displayClientDetails());
    }

    @Test
    void testAcceptVisitor() {
        UserVisitor visitor = new BillingVisitor(null);
        assertDoesNotThrow(() -> student.accept(visitor));
    }

    @Test
    void testGetClientType() {
        assertEquals("Student", student.getClientType(), "Client type should be Student.");
    }

    @Test
    void testToString() {
        String expected = "Student {ID=0, Name='Uzma', License Plate='A12345678', Rate per Hour=$5.0}";
        assertEquals(expected, student.toString(), "toString method is returned.");
    }

    @Test
    void testGetUserID() {
        assertEquals(0, student.getUserID(), "User ID should be initialised to 0.");
    }

    @Test
    void testGetName() {
        assertEquals("Uzma", student.getName(), "Name should be Uzma.");
    }

    @Test
    void testGetLicensePlate() {
        assertEquals("A12345678", student.getLicensePlate(), "License Plate should be A12345678.");
    }

    @Test
    void testGetRatePerHour() {
        assertEquals(5.0, student.getRatePerHour(), "Rate per Hour should be 5.0.");
    }

    @Test
    void testGetEmail() {
        assertEquals("uzma@yorku.ca", student.getEmail(), "Email should be uzma@yorku.ca.");
    }

    @Test
    void testGetPassword() {
        assertEquals("uzma123", student.getPassword(), "Password should be uzma123.");
    }

    @Test
    void testSetEmail() {
        student.setEmail("newuzma@yorku.ca");
        assertEquals("newuzma@yorku.ca", student.getEmail(), "Email should be set to newuzma@yorku.ca.");
    }

    @Test
    void testSetPassword() {
        student.setPassword("uzma456");
        assertEquals("uzma456", student.getPassword(), "Password should be set to uzma456.");
    }

    @Test
    void testSetName() {
        student.setName("Uzma Alam");
        assertEquals("Uzma Alam", student.getName(), "Name should be set to Uzma Alam.");
    }

    @Test
    void testSetLicensePlate() {
        student.setLicensePlate("B12345678");
        assertEquals("B12345678", student.getLicensePlate(), "License Plate should be set to B12345678.");
    }

    @Test
    void testRegister() {
        student.register(true);
        assertTrue(student.isRegistered(), "Student should be registered.");
    }

    @Test
    void testIsRegistered() {
        assertFalse(student.isRegistered(), "Student should not be initially registered.");
        student.register(true);
        assertTrue(student.isRegistered(), "Student should be registered after register is called true.");
    }
}