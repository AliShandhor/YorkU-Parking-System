package com.yorku.parkingsystem.user;

 class Student extends User {


     protected Student(int userID, String name, String clientType, String licensePlate) {
         super(userID, name, clientType, licensePlate);
     }

     @Override
    public void displayClientDetails() {
        System.out.println("Student Details:");
        System.out.println("User ID: " + getUserID());
        System.out.println("Name: " + getName());
        System.out.println("Client Type: " + "Student");
        System.out.println("License Plate: " + getLicensePlate());
    }
}
