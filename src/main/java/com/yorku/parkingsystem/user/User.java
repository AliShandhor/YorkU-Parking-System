package com.yorku.parkingsystem.user;

public abstract class User {
    private int userID;
    private String name;
    private String email;
    private String password;
    private String licensePlate;
    private final double ratePerHour;
    private boolean registered = false;
    private Booking booking;

    // Protected constructor to enforce instantiation via factory
    protected User(String name, String email, String password, String licensePlate, double ratePerHour) {
        this.userID = 0;
        this.name = name;
        this.email = email;
        this.password = password;
        this.licensePlate = licensePlate;
        this.ratePerHour = ratePerHour;
    }

    public Booking getBooking() {
        return booking;
    }

    public abstract void displayClientDetails();

    public abstract void accept(UserVisitor visitor);

    public abstract String getClientType();

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

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isRegistered(){
        return registered;
    }

    public void register(boolean registered) {
        this.registered = registered;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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
