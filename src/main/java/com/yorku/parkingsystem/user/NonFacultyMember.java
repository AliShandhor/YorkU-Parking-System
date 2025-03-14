package com.yorku.parkingsystem.user;

public class NonFacultyMember extends User{

    protected NonFacultyMember(int userID, String name, String clientType, String licensePlate) {
        super(userID, name, clientType, licensePlate);
    }

    @Override
    public void displayClientDetails() {
        System.out.println("Non-Faculty Member Details:");
        System.out.println("User ID: " + getUserID());
        System.out.println("Name: " + getName());
        System.out.println("Client Type: " + "Non-Faculty Member");
        System.out.println("License Plate: " + getLicensePlate());
    }
    @Override
	public void accept(UserVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}
}

