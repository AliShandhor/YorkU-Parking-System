package com.yorku.parkingsystem.user;

public class UserFactory {

    // Factory method to create different types of users
    public static User getUser(String clientType, int userID, String name, String licensePlate) {
        // Check the clientType and return the corresponding user subclass
        if (clientType.equalsIgnoreCase("STUDENT")) {
            return new Student(userID, name, clientType, licensePlate);
        } else if (clientType.equalsIgnoreCase("FACULTY")) {
            return new FacultyMember(userID, name, clientType, licensePlate);
        } else if (clientType.equalsIgnoreCase("VISITOR")) {
            return new Visitor(userID, name, clientType, licensePlate);
        } else {
            // If the clientType is invalid, throw an exception or return null
            throw new IllegalArgumentException("Invalid client type: " + clientType);
        }
    }
}
