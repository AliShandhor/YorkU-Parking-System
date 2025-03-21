package com.yorku.parkingsystem.user;

public class UserFactory {

    // Factory method to create different types of users
    public static User getUser(String clientType, int userID, String name, String licensePlate) {
        // Check the clientType and return the corresponding user subclass
        if (clientType.equalsIgnoreCase("STUDENT")) {
            return new Student(userID, name, licensePlate, 5.0);
        }

        else if (clientType.equalsIgnoreCase("FACULTY")) {
            return new FacultyMember(userID, name, licensePlate, 8.0);
        }

        else if (clientType.equalsIgnoreCase("VISITOR")) {
            return new Visitor(userID, name, licensePlate, 10.0);
        }

        else if (clientType.equalsIgnoreCase("NON-FACULTY")) {
                return new NonFacultyMember(userID, name, licensePlate, 15.0);
            }

        else {
            // If the clientType is invalid, throw an exception or return null
            throw new IllegalArgumentException("Invalid client type: " + clientType);
        }
    }
}
