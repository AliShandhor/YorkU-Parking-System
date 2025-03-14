package com.yorku.parkingsystem.user;

public class Visitor extends User{

    protected Visitor(int userID, String name, String clientType, String licensePlate) {
        super(userID, name, clientType, licensePlate);
    }

    @Override
    public void displayClientDetails() {
        System.out.println("Visitor Details:");
        System.out.println("User ID: " + getUserID());
        System.out.println("Name: " + getName());
        System.out.println("Client Type: " + "Visitor" );
        System.out.println("License Plate: " + getLicensePlate());
    }
    @Override
	public void accept(UserVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}
}

