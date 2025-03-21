package com.yorku.parkingsystem.user;

import com.yorku.parkingsystem.parkinglot.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.parkinglot.parkingspot.ParkingSpotBuilder;

import java.util.Date;

public class UserMain {
    public static void main(String[] args) {

        // Create a Student user
        User student = UserFactory.getUser("STUDENT", "Ali", "CWFZ590", "ali@example.com", "Ali1234!");
        student.displayClientDetails();
        System.out.println("================================");

        // Create a Faculty Member user
        User faculty = UserFactory.getUser("FACULTY", "Uzma", "XYZ789", "uzma@example.com", "Uzma1234!");
        faculty.displayClientDetails();
        System.out.println("================================");

        // Create a Visitor user
        User visitor = UserFactory.getUser("VISITOR", "John", "ABC123", "john@example.com", "John1234!");
        visitor.displayClientDetails();
        System.out.println("================================");

        // Create a Non-Faculty user
        User nonFaculty = UserFactory.getUser("NON-FACULTY", "Sarah", "LMN456", "sarah@example.com", "Sarah1234!");
        nonFaculty.displayClientDetails();
        System.out.println("================================");

        visitor.displayClientDetails();

        // Create a parking spot
        // Creating the first ParkingSpot using ParkingSpotBuilder
        ParkingSpotBuilder builder1 = new ParkingSpotBuilder();
        ParkingSpot parkingSpot1 = builder1.setParkingSpotID(101)
                .setLocation("Level 1, Zone A")
                .setAvailability(true)
                .setBookingTime(new Date())
                .setDuration(2)
                .setStatus("Booked")
                .build();

        // create bookings for users
        Date bookingTime = new Date();
        Booking booking1 = new Booking(parkingSpot1, 5001, student, bookingTime, 2);
        Booking booking2 = new Booking(parkingSpot1, 5002, faculty, bookingTime, 2);
        Booking booking3 = new Booking(parkingSpot1, 5003, visitor, bookingTime, 2);

        System.out.println("=================VISITOR PATTERN===============");
        UserVisitor visitor1 = new BillingVisitor(booking1);
        UserVisitor visitor2 = new BillingVisitor(booking2);
        UserVisitor visitor3 = new BillingVisitor(booking3);

        // Visitors
        System.out.println("=================Client Type: Student===============");
        student.accept(visitor1);

        System.out.println("=================Client Type: Faculty Member===============");
        faculty.accept(visitor2);

        System.out.println("=================Client Type: Visitor===============");
        visitor.accept(visitor3);

    }
}
        
        