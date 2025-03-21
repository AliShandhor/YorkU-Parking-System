package com.yorku.parkingsystem.user;

public abstract class User {
    private final int userID;
    private final String name;
    private final String licensePlate;
    private final double ratePerHour;

    // Protected constructor to enforce instantiation via factory
    protected User(int userID, String name, String licensePlate, double ratePerHour) {
        this.userID = userID;
        this.name = name;
        this.licensePlate = licensePlate;
        this.ratePerHour = ratePerHour;
    }
    public abstract void displayClientDetails();

    public abstract void accept(UserVisitor visitor);

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }
    public void showDetails() {
        System.out.println("User Details:");
        System.out.println("ID: " + userID);
        System.out.println("Name: " + name);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Rate per Hour: $" + ratePerHour);
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", ratePerHour=" + ratePerHour +
                '}';
    }
}
