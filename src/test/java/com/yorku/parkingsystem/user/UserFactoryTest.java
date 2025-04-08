package com.yorku.parkingsystem.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {

    @Test
    void testCreateStudent() {
        User user = UserFactory.getUser("STUDENT", "Uzma", "A12345678", "uzma@yorku.ca", "uzma123");
        assertTrue(user instanceof Student, "User should be an instance of Student.");
        assertEquals("Uzma", user.getName(), "Name should be Uzma.");
        assertEquals("A12345678", user.getLicensePlate(), "License Plate should be A12345678.");
        assertEquals("uzma@yorku.ca", user.getEmail(), "Email should be uzma@yorku.ca.");
        assertEquals(5.0, user.getRatePerHour(), "Rate per Hour should be 5.0.");
    }

    @Test
    void testCreateFacultyMember() {
        User user = UserFactory.getUser("FacultyMember", "Ali", "B98765432", "ali@yorku.ca", "ali456");
        assertTrue(user instanceof FacultyMember, "User should be an instance of FacultyMember.");
        assertEquals("Ali", user.getName(), "Name should be Ali.");
        assertEquals("B98765432", user.getLicensePlate(), "License Plate should be B98765432.");
        assertEquals("ali@yorku.ca", user.getEmail(), "Email should be ali@yorku.ca.");
        assertEquals(8.0, user.getRatePerHour(), "Rate per Hour should be 8.0.");
    }

    @Test
    void testCreateNonFacultyMember() {
        User user = UserFactory.getUser("NonFacultyMember", "Ainaz", "C12345678", "ainaz@yorku.ca", "ainaz789");
        assertTrue(user instanceof NonFacultyMember, "User should be an instance of NonFacultyMember.");
        assertEquals("Ainaz", user.getName(), "Name should be Ainaz.");
        assertEquals("C12345678", user.getLicensePlate(), "License Plate should be C12345678.");
        assertEquals("ainaz@yorku.ca", user.getEmail(), "Email should be ainaz@yorku.ca.");
        assertEquals(10.0, user.getRatePerHour(), "Rate per Hour should be 10.0.");
    }

    @Test
    void testCreateVisitor() {
        User user = UserFactory.getUser("VISITOR", "Dan", "D98765432", "dan@yorku.ca", "dan321");
        assertTrue(user instanceof Visitor, "User should be an instance of Visitor.");
        assertEquals("Dan", user.getName(), "Name should be Dan.");
        assertEquals("D98765432", user.getLicensePlate(), "License Plate should be D98765432.");
        assertEquals("dan@yorku.ca", user.getEmail(), "Email should be dan@yorku.ca.");
        assertEquals(15.0, user.getRatePerHour(), "Rate per Hour should be 15.0.");
    }

    @Test
    void testInvalidClientType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserFactory.getUser("INVALID_TYPE", "Abhiroop", "E12345678", "abhiroop@yorku.ca", "abhiroop000");
        });
        assertEquals("Invalid client type: INVALID_TYPE", exception.getMessage(), "Exception message should match.");
    }


    @Test
    void testCreateStudentWithDifferentCases() {
        User user = UserFactory.getUser("student", "Uzma", "A12345678", "uzma@yorku.ca", "uzma123");
        assertTrue(user instanceof Student, "User should be an instance of Student.");
        assertEquals("Uzma", user.getName(), "Name should be Uzma.");
    }

    @Test
    void testCreateFacultyMemberWithSpaces() {
        String clientType = " FacultyMember ".trim();
        User user = UserFactory.getUser(clientType, "Ali", "B98765432", "ali@yorku.ca", "ali456");
        assertTrue(user instanceof FacultyMember, "User should be an instance of FacultyMember.");
        assertEquals("Ali", user.getName(), "Name should be Ali.");
    }

    @Test
    void testCreateVisitorWithEmptyPassword() {
        User user = UserFactory.getUser("VISITOR", "Dan", "D98765432", "dan@yorku.ca", "");
        assertTrue(user instanceof Visitor, "User should be an instance of Visitor.");
        assertEquals("", user.getPassword(), "Password should be empty.");
    }

    @Test
    void testCreateNonFacultyMemberWithNullEmail() {
        User user = UserFactory.getUser("NonFacultyMember", "Ainaz", "C12345678", null, "ainaz789");
        assertTrue(user instanceof NonFacultyMember, "User should be an instance of NonFacultyMember.");
        assertNull(user.getEmail(), "Email should be null.");
    }

    @Test
    void testCreateStudentWithSpecialCharactersInName() {
        User user = UserFactory.getUser("STUDENT", "Uzma@123", "A12345678", "uzma@yorku.ca", "uzma123");
        assertTrue(user instanceof Student, "User should be an instance of Student.");
        assertEquals("Uzma@123", user.getName(), "Name should be Uzma@123.");
    }
}