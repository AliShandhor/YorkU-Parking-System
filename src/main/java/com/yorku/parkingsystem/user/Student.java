package com.yorku.parkingsystem.user;

public class Student extends User {

     protected Student(String name, String email, String password, String licensePlate, double ratePerHour){
         super(name, email, password, licensePlate, ratePerHour);
     }

     @Override
    public void displayClientDetails() {
        System.out.println("Student Details:");
        System.out.println("User ID: " + getUserID());
        System.out.println("Name: " + getName());
        System.out.println("Client Type: " + "Student");
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Rate per Hour: " + getRatePerHour());
     }
    @Override
	public void accept(UserVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}

    @Override
    public String getClientType() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Student {" +
                "ID=" + getUserID() +
                ", Name='" + getName() + '\'' +
                ", License Plate='" + getLicensePlate() + '\'' +
                ", Rate per Hour=$" + getRatePerHour() +
                '}';
    }
}

