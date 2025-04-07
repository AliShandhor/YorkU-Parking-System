package com.yorku.parkingsystem.user;

import com.yorku.parkingsystem.parking.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.payment.CreditCard;
import com.yorku.parkingsystem.payment.Payment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    private ParkingSpot testSpot;
    private Date futureTime;
    private Date pastTime;
    private User registeredUser;
    private Booking booking;

    @BeforeEach
    void setup() {
        testSpot = new ParkingSpot();
        testSpot.setLocation("Level A1");
        futureTime = new Date(System.currentTimeMillis() + 3600 * 1000);
        pastTime = new Date(System.currentTimeMillis() - 3600 * 1000); // 1 hour befotr
        registeredUser = new Student("Uzma", "uzmaa@my.yorku.ca", "uzma123", "D12345678", 5.0);
        registeredUser.register(true);
        booking = new Booking(testSpot, 101, registeredUser, futureTime, 2);
    }
    // Test case to throw exception for unregistered user
    @Test
    void testBookingForUnregisteredUserThrowsException() {
        User unregisteredUser = new Student("Mahin", "mahin@yorku.ca", "mahin123", "K38472950", 5.0);
        unregisteredUser.register(false);
        assertThrows(IllegalArgumentException.class, () -> new Booking(testSpot, 102, unregisteredUser, futureTime, 2));
    }
    // Test case to validate check-in status
    @Test
    void testCheckInValidateCheckInStatus() {
        booking.checkIn();
        assertTrue(booking.isCheckin(), "User should be checked in.");
    }

    // Test case for no show detection if booking time is passed and check-in is not made
    @Test
    void testNoShowBeforeCheckIn() throws InterruptedException {
        // No check-in made
        // current time exceeds booking time
        booking = new Booking(testSpot, 102, registeredUser, pastTime, 1);
        Thread.sleep(1000); // Ensure current time is after pastTime
        booking.noShowDetector();
        assertTrue(booking.isNoShow(), "User should be marked as no show.");
    }
    // Test case to cancel booking before start time
    @Test
    void testCancelBookingBeforeStart() {
        booking.noShowDetector();
        booking.cancel();
        assertFalse(booking.isNoShow(), "Booking should be marked as no show.");
    }
    // Test case to cancel booking after start time
    @Test
    void testCancelBookingAfterStart() {
        booking.checkIn();
        booking.cancel();
        assertFalse(booking.isNoShow(), "Booking should not be marked as no show after check-in.");
    }
    // Test case for extending booking before expiration
    @Test
    void testExtendBookingBeforeExpiration() {
        booking.extendBooking(1);
        assertEquals(3, booking.getDuration(), "Duration should be extended by 1 hour.");
    }
    // Test case for extending booking after expiration
    @Test
    void testExtendBookingAfterExpiration() {
        booking = new Booking(testSpot, 103, registeredUser, pastTime, 1);
        booking.extendBooking(2);
        assertEquals(1, booking.getDuration(), "Booking should not be extended after expiration.");
    }
    // Test case for calculating cost
    @Test
    void testCalculateCost() {
        double cost = booking.calculateCost();
        assertEquals(10.0, cost, "Cost is calculated.");
    }
    // Test case for checking out with deposit
    @Test
    void testCheckoutDeposit() {
        booking.checkIn();
        Payment payment = new Payment(new CreditCard("Uzma Alam", 1234567890123456L, 123, "12/25"));
        booking.checkout(payment);

        assertDoesNotThrow(() -> booking.checkout(payment));
    }
    // Registered user
    @Test
    void testShowDetailsForRegisteredUser() {
        booking.checkIn();
        booking.showDetails();
    }
    // Unregistered user
    @Test
    void testShowDetailsForUnregisteredUser() {
        User unregisteredUser = new Student("Mahin", "mahin@yorku.ca", "mahin123", "K38472950", 4.0);
        unregisteredUser.register(false);
        assertThrows(IllegalArgumentException.class, () -> new Booking(testSpot, 104, unregisteredUser, futureTime, 2));
    }
    // Test case for confirming booking
    @Test
    void testConfirmBooking() {
        booking.checkIn();
        assertTrue(booking.isCheckin(), "Booking should be confirmed when checked in.");
    }

    // Test case for booking cancellation and refund
    @Test
    void testBookingCancelRefunded() {
        booking.cancel();
        assertFalse(booking.isNoShow(), "Booking should not be marked as no show and deposit refunded.");
    }
    // Test case for booking cancellation after check-in
    @Test
    void testCancelBookingAlreadyCheckedIn() {
        booking.checkIn();
        booking.cancel();
        assertFalse(booking.isNoShow(), "Booking should not be canceled after check-in.");
    }
    // Test case for booking cancellation after time elapsed
    @Test
    void testBookingCancelAfterTimeElapsed() {
        Date expiredStartTime = new Date(System.currentTimeMillis() - 3 * 3600 * 1000);
        booking = new Booking(testSpot, 105, registeredUser, expiredStartTime, 1);
        booking.noShowDetector();
        booking.cancel();
        assertTrue(booking.isNoShow(), "Booking should be marked as no show after expiration.");
    }
}