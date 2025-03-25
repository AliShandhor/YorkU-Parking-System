package com.yorku.parkingsystem.Controllers;

import com.yorku.parkingsystem.management.ClientRegistration;
import com.yorku.parkingsystem.user.User;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AuthenticateUserController {

    @FXML private TextField nameField;
    @FXML private PasswordField passwordField;
    @FXML private Label resultLabel;

    private final ClientRegistration clientRegistration = new ClientRegistration();

    @FXML
    private void handleAuthenticate() {
        String name = nameField.getText().trim();
        String password = passwordField.getText().trim();

        if (name.isEmpty() || password.isEmpty()) {
            resultLabel.setText("Please enter both name and password.");
            return;
        }

        boolean isAuthenticated = false;
        for (User user : clientRegistration.getRegisteredUsers()) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                resultLabel.setText("Authentication successful.");
                isAuthenticated = true;
                break;
            }
        }

        if (!isAuthenticated) {
            resultLabel.setText(" Authentication failed. Invalid credentials.");
        }
    }
}
