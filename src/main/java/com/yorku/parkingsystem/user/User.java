package com.yorku.parkingsystem.user;

abstract class User {
    private int userID;
    private String firstName;
    private String lastName;
    private String clientType;
    private String licensePlate;


    // Protected constructor to enforce instantiation via factory
    protected User(int userID, String firstName, String lastName, String clientType, String licensePlate) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientType = clientType;
        this.licensePlate = licensePlate;
    }
    abstract void displayClientDetails();

    public int getUserID() {
        return userID;
    }

    public String getClientType() {
        return clientType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }



}
