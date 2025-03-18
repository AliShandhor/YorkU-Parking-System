package com.yorku.parkingsystem.user;

import java.util.Date;

public class UserMain {
    public static void main(String[] args) {

        UserFactory userFactory = new UserFactory();
        // Create a Student user
        User student = userFactory.getUser("student", 1, "Ali", "CWFZ590");
        student.displayClientDetails();
        System.out.println("================================");
        // Create a Faculty Member user
        User faculty = UserFactory.getUser("faculty", 2, "Uzma", "XYZ789");
        faculty.displayClientDetails();
        System.out.println("================================");
        // Create a Visitor user
        User visitor = UserFactory.getUser("visitor", 3,  "Doe", "LMN456");
        visitor.displayClientDetails();
        
        UserVisitor visitor1 = new BillingVisitor();
        student.accept(visitor1);
        faculty.accept(visitor1);
        visitor.accept(visitor1);
        //nonFacultyMember.accept(visitor1);
        
        // Create a BillingVisitor for processing charges
        UserVisitor billingVisitor = new BillingVisitor();

        // Apply billing
        student.accept(billingVisitor);
        faculty.accept(billingVisitor);
        visitor.accept(billingVisitor);

        //test for booking
        Date bookingTime = new Date(); 
        Booking booking = new Booking(101, 5001, student, bookingTime, 2);
        
     // Simulate delay before cancellation
        try {
            Thread.sleep(4000); // 4 seconds delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // detect no show and refund is not deposited 
        System.out.println("================================");
        booking.cancel();

        
        booking.checkIn();
        System.out.println("================================");

        
        booking.cancel();
    }
}
        
        