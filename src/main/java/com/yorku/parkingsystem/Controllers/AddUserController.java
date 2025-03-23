package com.yorku.parkingsystem.Controllers;

import com.yorku.parkingsystem.management.ClientRegistration;
import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.user.UserFactory;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

public class AddUserController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField plateField;

    @FXML
    private ComboBox<String> userTypeComboBox;

    @FXML
    private ComboBox<ManagementTeam> teamComboBox;

    @FXML
    private Button registerButton;

    @FXML
    private Label statusLabel;

    private final ClientRegistration clientRegistration = new ClientRegistration();
    private final SuperManager superManager = SuperManager.getSuperManagerInstance(
        "Gias Udin", "gias.udin@gmail.com", "eecs331"
    );

    @FXML
    public void initialize() {
        // Initialize the dropdowns when view is loaded
        userTypeComboBox.setItems(FXCollections.observableArrayList(
            "STUDENT", "FacultyMember", "NonFacultyMember", "VISITOR"
        ));
        teamComboBox.setItems(FXCollections.observableArrayList(superManager.getManagementTeamKeys()));
    }

    @FXML
    private void handleRegisterUser(ActionEvent event) {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String password = passwordField.getText().trim();
        String plate = plateField.getText().trim();
        String type = userTypeComboBox.getValue();
        ManagementTeam selectedTeam = teamComboBox.getValue();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || plate.isEmpty() || type == null || selectedTeam == null) {
            statusLabel.setText("Please fill out all fields.");
            return;
        }

        try {
            User user = UserFactory.getUser(type, name, plate, email, password);
            clientRegistration.registerClient(user, selectedTeam);
            selectedTeam.addUser(user);
            statusLabel.setText("User registered and added to team.");
        } catch (IllegalArgumentException e) {
            statusLabel.setText("Error: " + e.getMessage());
        }
    }
}
