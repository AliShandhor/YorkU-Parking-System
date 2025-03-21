package com.yorku.parkingsystem.user;

public class Visitor extends User{

    protected Visitor(int userID, String name, String licensePlate, double ratePerHour) {
        super(userID, name, licensePlate, ratePerHour);

    }

    @Override
    public void displayClientDetails() {
        System.out.println("Visitor Details:");
        System.out.println("User ID: " + getUserID());
        System.out.println("Name: " + getName());
        System.out.println("Client Type: " + "Visitor" );
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Rate per Hour: " + getRatePerHour());
    }
    @Override
	public void accept(UserVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}

    @Override
    public String toString() {
        return "Visitor {" +
                "ID=" + getUserID() +
                ", Name='" + getName() + '\'' +
                ", License Plate='" + getLicensePlate() + '\'' +
                ", Rate per Hour=$" + getRatePerHour() +
                '}';
    }
}

