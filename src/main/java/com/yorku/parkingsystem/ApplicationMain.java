package com.yorku.parkingsystem;

import com.yorku.parkingsystem.management.ClientRegistration;
import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.parking.parkinglot.ParkingLot;
import com.yorku.parkingsystem.parking.Sensor;
import com.yorku.parkingsystem.parking.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.parking.parkingspot.ParkingSpotBuilder;
import com.yorku.parkingsystem.payment.CreditCard;
import com.yorku.parkingsystem.payment.Payment;
import com.yorku.parkingsystem.payment.PaymentStrategy;
import com.yorku.parkingsystem.user.*;

import java.util.Date;

public class ApplicationMain {
    public static void main(String[] args) {
        System.out.println("=================YorkU PARKING SYSTEM==================");
        System.out.println("=================MANAGEMENT SYSTEM==================");
        // Creating parking system object - Super Manager
        SuperManager superManager = SuperManager.getSuperManagerInstance("Gias Uddin", "gias.uddin@yorku.com", "eecs3311$SoftwareDesign");

        ManagementTeam managementTeam1 = new ManagementTeam();
        ManagementTeam managementTeam2 = new ManagementTeam();

        superManager.generateManagementTeamAccount(managementTeam1);
        superManager.generateManagementTeamAccount(managementTeam2);

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
        User student = UserFactory.getUser("STUDENT", "Ali Shandhor", "CWFZ590", "a.shanzoor@yorku.com", "Ali05585852454$");
        User facultyMember = UserFactory.getUser("FacultyMember", "Uzma Alam", "SDKE2312", "uzma.alam@yorku.com", "UzAlam123456789$");

        ClientRegistration clientRegistration = new ClientRegistration();
        clientRegistration.registerClient(student, managementTeam1);
        clientRegistration.registerClient(facultyMember, managementTeam2);

        // Create parking lot objects
        ParkingLot parkingLot1 = new ParkingLot("Parking Lot 1", "Keele Campus");
        ParkingLot parkingLot2 = new ParkingLot("Parking Lot 2", "Markham Campus");

        // Enable and add parking lots by super manager/management team (you can use both)
        managementTeam1.enableParkingLot(parkingLot1);
        managementTeam2.enableParkingLot(parkingLot2);
        managementTeam1.addParkingLot(parkingLot1);
        managementTeam2.addParkingLot(parkingLot2);

        // Enable and add parking spots to parking lots
        managementTeam1.enableParkingSpot(parkingSpot1);
        managementTeam2.enableParkingSpot(parkingSpot2);
        managementTeam1.addParkingSpace(parkingLot1, parkingSpot1);
        managementTeam2.addParkingSpace(parkingLot2, parkingSpot2);

        // Reserve Parking spot to a user
        managementTeam1.reserveParkingSpotForUser(student, parkingSpot1);
        managementTeam2.reserveParkingSpotForUser(facultyMember, parkingSpot2);

        // Add users to management team
        managementTeam1.addUser(student);
        managementTeam2.addUser(facultyMember);

        // Display all parking lots and their details from super manager
        superManager.displayAllParkingLotsDetails();

        // Display all parking lots and their parking spot details from management team
        managementTeam1.displayAllParkingLotsDetails();
        managementTeam2.displayAllParkingLotsDetails();

        // Display all users and their details from super manager
        superManager.displayAllUsersDetails();

        // Create bookings for users
        System.out.println("==================BOOKINGS===============");
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

        // Payment process for student
        System.out.println("=================Payment Process for Student===============");
        PaymentStrategy creditCardPaymentStudent = new CreditCard("Ali Shandhor", 3982745610928374L ,892, "12/25");
        Payment paymentStudent = new Payment(creditCardPaymentStudent);
        booking1.checkout(paymentStudent);

        System.out.println("=================Test for booking extension and deposit deducted for Student===============");
        // Test for booking extension and deposit deducted for student
        booking1.extendBooking(2);
        booking1.checkIn(); // Student checks in
        booking1.checkout(paymentStudent);

        // Payment process for faculty member
        System.out.println("=================Payment Process for Faculty Member===============");
        PaymentStrategy creditCardPaymentFaculty = new CreditCard("Mostafij", 6834275211853114L ,456, "11/24");
        Payment paymentFaculty = new Payment(creditCardPaymentFaculty);
        booking2.checkout(paymentFaculty);

        System.out.println("=================Test for booking extension and deposit deducted for Faculty Member===============");
        // Test for booking extension and deposit deducted for faculty member
        booking2.extendBooking(2);
        booking2.checkIn(); // Faculty member checks in
        booking2.checkout(paymentFaculty);

        // Sensor usage
        System.out.println("=================SENSOR USAGE===============");
        Sensor sensor1 = new Sensor();
        Sensor sensor2 = new Sensor();

        // Detect cars at parking spots
        sensor1.detectCar(parkingSpot1);
        sensor2.detectCar(parkingSpot2);

        // Scan car information
        sensor1.scanCarInfo(booking1);
        sensor2.scanCarInfo(booking2);

        // Send information to the system
        sensor1.sendInfoToSystem(parkingSpot1);
        sensor2.sendInfoToSystem(parkingSpot2);
    }
}