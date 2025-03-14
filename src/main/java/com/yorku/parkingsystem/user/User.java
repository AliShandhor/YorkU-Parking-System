package com.yorku.parkingsystem.user;

public abstract class User {
    private int userID;
    private String name;
    private String licensePlate;

    // Protected constructor to enforce instantiation via factory
    protected User(int userID, String name, String clientType, String licensePlate) {
        this.userID = userID;
        this.name = name;
        this.licensePlate = licensePlate;
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



}
