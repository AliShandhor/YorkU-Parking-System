package com.yorku.parkingsystem.user;

public class UserFactory {
    // Factory method to create different types of users
    public static User getUser(String clientType,  String name, String licensePlate, String email, String password) {

        // Check the clientType and return the corresponding user subclass
        if (clientType.equalsIgnoreCase("STUDENT")) {
            return new Student(name, email, password, licensePlate, 5.0);
        }

        else if (clientType.equalsIgnoreCase("FacultyMember")) {
            return new FacultyMember(name, email, password, licensePlate, 8.0);
        }

        else if (clientType.equalsIgnoreCase("NonFacultyMember")) {
            return new NonFacultyMember(name, email, password, licensePlate, 10.0);
        }

        else if (clientType.equalsIgnoreCase("VISITOR")) {
            return new Visitor(name, email, password, licensePlate,15.0);
        }

        else {
            // If the clientType is invalid, throw an exception
            throw new IllegalArgumentException("Invalid client type: " + clientType);
        }
    }
}
