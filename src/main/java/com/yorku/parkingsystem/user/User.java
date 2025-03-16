package com.yorku.parkingsystem.user;

public abstract class User {
    private final int userID;
    private final String name;
    private final String licensePlate;

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
