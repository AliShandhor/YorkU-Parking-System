package com.yorku.parkingsystem.user;

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
    }
}
