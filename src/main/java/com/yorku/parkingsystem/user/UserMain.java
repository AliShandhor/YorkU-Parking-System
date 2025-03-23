package com.yorku.parkingsystem.user;

import com.yorku.parkingsystem.management.ClientRegistration;
import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.parking.parkinglot.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.parking.parkinglot.parkingspot.ParkingSpotBuilder;
import com.yorku.parkingsystem.payment.CreditCard;
import com.yorku.parkingsystem.payment.Payment;
import com.yorku.parkingsystem.payment.PaymentStrategy;

import java.util.ArrayList;
import java.util.Date;
import java.util.prefs.Preferences;


public class UserMain {
    public static void main(String[] args) {
        SuperManager superManager = SuperManager.getSuperManagerInstance("Gias Uddin", "gias1234@gmail.com", "123456789");

        ManagementTeam managementTeam1 = new ManagementTeam();

        superManager.generateManagementTeamAccount(managementTeam1);
        ClientRegistration clientRegistration = new ClientRegistration();

        ArrayList<User> users = new ArrayList<>();

        // Create a Student user
        User student = UserFactory.getUser("STUDENT", "Ali", "CWFZ590", "ali@example.com", "Ali1234!");
        // Create a Faculty Member user
        User faculty = UserFactory.getUser("FacultyMember", "Uzma", "XYZ789", "uzma@example.com", "Uzma1234!");
        // Create a Visitor user
        User visitor = UserFactory.getUser("VISITOR", "John", "ABC123", "john@example.com", "John1234!");
        // Create a Non-Faculty user
        User nonFaculty = UserFactory.getUser("NonFacultyMember", "Sarah", "LMN456", "sarah@example.com", "Sarah1234!");
        System.out.println("================================");

        users.add(student);
        users.add(faculty);
        users.add(visitor);
        users.add(nonFaculty);

        for (User user: users) {
            clientRegistration.registerClient(user, managementTeam1);
        }

        // Create a parking spot
        // Creating the first ParkingSpot using ParkingSpotBuilder
        ParkingSpotBuilder builder1 = new ParkingSpotBuilder();
        ParkingSpot parkingSpot1 = builder1.setParkingSpotID(101)
                .setLocation("Level 1, Zone A")
                .setAvailability(true)
                .setBookingTime(new Date())
                .setDuration(2)
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



        //Test payment types using Strategy pattern
        //pay using credit card
        PaymentStrategy creditCardPayment = new CreditCard("Ali", 123456789, 123, "12/25");
        Payment payment = new Payment(creditCardPayment);
        //checkout and process the payment
        booking3.checkout(payment);

        //test for booking extension and deposit deducted
        booking1.extendBooking(2);
        booking1.checkIn(); // Student checks in
        booking1.checkout(payment);


    }
}
        
        