package com.yorku.parkingsystem;

import com.yorku.parkingsystem.management.ClientRegistration;
import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.parking.parkinglot.ParkingLot;
import com.yorku.parkingsystem.parking.parkinglot.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.parking.parkinglot.parkingspot.ParkingSpotBuilder;
import com.yorku.parkingsystem.payment.CreditCard;
import com.yorku.parkingsystem.payment.Payment;
import com.yorku.parkingsystem.payment.PaymentStrategy;
import com.yorku.parkingsystem.user.*;

import java.util.Date;

public class ApplicationMain {
    public static void main(String[] args) {
        // Creating parking system object
        SuperManager superManager = SuperManager.getSuperManagerInstance("SuperManager", "supermanager@gmail.com", "SuperManagerPassword");
        ManagementTeam managementTeam = new ManagementTeam();
        superManager.generateManagementTeamAccount(managementTeam);

        // Creating ParkingSpot objects using ParkingSpotBuilder
        ParkingSpot parkingSpot1 = new ParkingSpotBuilder()
                .setLocation("Level 1, Zone A")
                .setAvailability(true)
                .build();

        ParkingSpot parkingSpot2 = new ParkingSpotBuilder()
                .setLocation("Level 2, Zone B")
                .setAvailability(true)
                .build();

        // Creating and adding users to the parking system
        User student = UserFactory.getUser("STUDENT", "Ali Shandhor", "CWFZ590", "a.shanzoor@gmail.com", "Ali05585852454$");
        User facultyMember = UserFactory.getUser("FacultyMember", "Sarah Yasser", "CWFZ 1111", "sarah.yasser@gmail.com", "Aa12345678$");

        ClientRegistration clientRegistration = new ClientRegistration();
        clientRegistration.registerClient(student, managementTeam);
        clientRegistration.registerClient(facultyMember, managementTeam);

        // Create parking lot objects
        ParkingLot parkingLot1 = new ParkingLot("Parking Lot 1", "Curtis Lecture Hall");
        ParkingLot parkingLot2 = new ParkingLot("Parking Lot 2", "Lassonde School of Engineering");

        // Enable and add parking lots by super manager/management team (you can use both)
        managementTeam.enableParkingLot(parkingLot1);
        managementTeam.enableParkingLot(parkingLot2);
        managementTeam.addParkingLot(parkingLot1);
        managementTeam.addParkingLot(parkingLot2);

        // Enable and add parking spots to parking lots
        managementTeam.enableParkingSpot(parkingSpot1);
        managementTeam.enableParkingSpot(parkingSpot2);
        managementTeam.addParkingSpace(parkingLot1, parkingSpot1);
        managementTeam.addParkingSpace(parkingLot2, parkingSpot2);

        // Reserve Parking spot to a user
        managementTeam.reserveParkingSpotForUser(student, parkingSpot1);
        managementTeam.reserveParkingSpotForUser(facultyMember, parkingSpot2);

        // Add users to management team
        managementTeam.addUser(student);
        managementTeam.addUser(facultyMember);

        // Display all parking lots and their details from super manager
        superManager.displayAllParkingLotsDetails();

        // Display all users and their details from super manager
        superManager.displayAllUsersDetails();

        // Create bookings for users
        Date bookingTime = new Date();
        Booking booking1 = new Booking(parkingSpot1, 5001, student, bookingTime, 2);
        Booking booking2 = new Booking(parkingSpot2, 5002, facultyMember, bookingTime, 2);

        System.out.println("=================VISITOR PATTERN===============");
        UserVisitor visitor1 = new BillingVisitor(booking1);
        UserVisitor visitor2 = new BillingVisitor(booking2);

        // Visitors
        System.out.println("=================Client Type: Student===============");
        student.accept(visitor1);

        System.out.println("=================Client Type: Faculty Member===============");
        facultyMember.accept(visitor2);

        // Payment process
        PaymentStrategy creditCardPayment = new CreditCard("Ali", 123456789, 123, "12/25");
        Payment payment = new Payment(creditCardPayment);

        booking1.checkout(payment);

        // Test for booking extension and deposit deducted
        booking1.extendBooking(2);
        booking1.checkIn(); // Student checks in
        booking1.checkout(payment);
    }
}