package com.yorku.parkingsystem.user;

 class Student extends User {

    protected Student(int userID, String firstName, String lastName, String clientType, String licensePlate) {
        super(userID, firstName, lastName, clientType, licensePlate);
    }

    @Override
    public void displayClientDetails() {
        System.out.println("Student Details:");
        System.out.println("User ID: " + getUserID());
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Client Type: " + getClientType());
        System.out.println("License Plate: " + getLicensePlate());
    }
}
