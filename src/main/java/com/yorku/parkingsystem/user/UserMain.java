package com.yorku.parkingsystem.user;

public class UserMain {
    public static void main(String[] args) {

        UserFactory userFactory = new UserFactory();
        // Create a Student user
        User student = userFactory.getUser("student", 1, "Ali", "Shandhor", "CWFZ590");
        student.displayClientDetails();
        System.out.println("================================");
        // Create a Faculty Member user
        User faculty = UserFactory.getUser("faculty", 2, "Uzma", "Alam", "XYZ789");
        faculty.displayClientDetails();
        System.out.println("================================");
        // Create a Visitor user
        User visitor = UserFactory.getUser("visitor", 3, "John", "Doe", "LMN456");
        visitor.displayClientDetails();
    }
}
