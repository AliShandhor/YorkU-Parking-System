package com.yorku.parkingsystem.gui;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RoleRegistrationController {

    @FXML private TextField nameField;
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private ComboBox<String> roleBox;
    @FXML private Button registerButton;
    @FXML private Label statusLabel;

    @FXML
    public void initialize() {
        roleBox.getItems().addAll(
            "Super Manager",
            "Management Team",
            "Student",
            "Faculty",
            "Non-Faculty",
            "Visitor"
        );
    }

    @FXML
    private void handleRegister() {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String role = roleBox.getValue();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || role == null) {
            statusLabel.setText("All fields are required.");
            return;
        }

        statusLabel.setText("Registered as: " + role);
    }
}
