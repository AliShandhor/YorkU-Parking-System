package com.yorku.parkingsystem.user;

import com.yorku.parkingsystem.parking.parkingspot.ParkingSpot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class BillingVisitorTest {

    private ParkingSpot testSpot;
    private Date futureTime;
    private Booking booking;

    @BeforeEach
    void setup() {
        testSpot = new ParkingSpot();
        testSpot.setLocation("Level B2");
        futureTime = new Date(System.currentTimeMillis() + 3600 * 1000); // 1 hour later
    }
    // Test cases for BillingVisitor class
    @Test
    void testVisitStudentDoesNotThrow() {
        Student student = new Student("Uzma", "uzmaa@my.yorku.ca", "uz123", "D12345678", 5.0);
        student.register(true);
        booking = new Booking(testSpot, 101, student, futureTime, 2);
        BillingVisitor visitor = new BillingVisitor(booking);

        assertDoesNotThrow(() -> visitor.visit(student));
    }

    @Test
    void testVisitFacultyDoesNotThrow() {
        FacultyMember faculty = new FacultyMember("Faruque", "faruque@yorku.ca", "faruque123", "S98765432", 8.0);
        faculty.register(true);
        booking = new Booking(testSpot, 102, faculty, futureTime, 3);
        BillingVisitor visitor = new BillingVisitor(booking);

        assertDoesNotThrow(() -> visitor.visit(faculty));
    }

    @Test
    void testVisitNonFacultyDoesNotThrow() {
        NonFacultyMember nonFaculty = new NonFacultyMember("Mahin", "mahin@yorku.ca", "mahin123", "B65432109", 10.0);
        nonFaculty.register(true);
        booking = new Booking(testSpot, 103, nonFaculty, futureTime, 1);
        BillingVisitor visitor = new BillingVisitor(booking);

        assertDoesNotThrow(() -> visitor.visit(nonFaculty));
    }

    @Test
    void testVisitVisitorDoesNotThrow() {
        Visitor visitorUser = new Visitor("Saima", "saima@yorku.ca", "saima123", "K38472950", 15.0);
        visitorUser.register(true);
        booking = new Booking(testSpot, 104, visitorUser, futureTime, 2);
        BillingVisitor visitor = new BillingVisitor(booking);

        assertDoesNotThrow(() -> visitor.visit(visitorUser));
    }
    // Test cases for edge cases
    @Test
    void testVisitWithNullBooking() {
        Visitor visitorUser = new Visitor("sadia", "sadia@yorku.ca", "sadia123", "Z01928374", 15.0);
        visitorUser.register(true);
        BillingVisitor visitor = new BillingVisitor(null);

        assertDoesNotThrow(() -> visitor.visit(visitorUser));
    }


    @Test
    void testVisitWithZeroDurationBooking() {
        Student student = new Student("Nusayba", "nusayba@yorku.ca", "nusayba123", "H48572930", 5.0);
        student.register(true);
        booking = new Booking(testSpot, 105, student, futureTime, 0);
        BillingVisitor visitor = new BillingVisitor(booking);

        assertDoesNotThrow(() -> visitor.visit(student));
    }

    @Test
    void testVisitAfterCancel() {
        FacultyMember faculty = new FacultyMember("Shiah", "shiah@yorku.ca", "shiah123", "J17483920", 8.0);
        faculty.register(true);
        booking = new Booking(testSpot, 106, faculty, futureTime, 2);
        booking.cancel();
        BillingVisitor visitor = new BillingVisitor(booking);

        assertDoesNotThrow(() -> visitor.visit(faculty));
    }

    @Test
    void testVisitWithPastBooking() {
        Date pastTime = new Date(System.currentTimeMillis() - 2 * 60 * 60 * 1000); // 2 hours ago
        NonFacultyMember user = new NonFacultyMember("Raisa", "raisa@yorku.ca", "raisa123", "R95837260", 10.0);
        user.register(true);
        booking = new Booking(testSpot, 107, user, pastTime, 1);
        BillingVisitor visitor = new BillingVisitor(booking);

        assertDoesNotThrow(() -> visitor.visit(user));
    }

    @Test
    void testVisitWithNullUser() {
        Visitor visitorUser = new Visitor(null, null, null, null, 5.0);
        visitorUser.register(true);
        booking = new Booking(testSpot, 108, visitorUser, futureTime, 2);
        BillingVisitor visitor = new BillingVisitor(booking);

        assertDoesNotThrow(() -> visitor.visit(visitorUser));
    }

    @Test
    void testVisitWithNegativeRate() {
        FacultyMember faculty = new FacultyMember("Wareesha", "wareesha@yorku.ca", "wareesha123", "T57392018", -10.0);
        faculty.register(true);
        booking = new Booking(testSpot, 109, faculty, futureTime, 2);
        BillingVisitor visitor = new BillingVisitor(booking);

        assertDoesNotThrow(() -> visitor.visit(faculty));
    }
}


