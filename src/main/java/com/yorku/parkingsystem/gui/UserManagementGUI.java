package com.yorku.parkingsystem.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.io.IOException;

public class UserManagementGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("User Registration");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Name
        Label nameLabel = new Label("Name:");
        GridPane.setConstraints(nameLabel, 0, 0);
        TextField nameInput = new TextField();
        GridPane.setConstraints(nameInput, 1, 0);

        // Email
        Label emailLabel = new Label("Email:");
        GridPane.setConstraints(emailLabel, 0, 1);
        TextField emailInput = new TextField();
        GridPane.setConstraints(emailInput, 1, 1);

        // Password
        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 2);
        PasswordField passwordInput = new PasswordField();
        GridPane.setConstraints(passwordInput, 1, 2);

        // License Plate
        Label licenseLabel = new Label("License Plate:");
        GridPane.setConstraints(licenseLabel, 0, 3);
        TextField licenseInput = new TextField();
        GridPane.setConstraints(licenseInput, 1, 3);

        // Client Type Dropdown
        Label clientTypeLabel = new Label("Client Type:");
        GridPane.setConstraints(clientTypeLabel, 0, 4);
        ComboBox<String> clientTypeDropdown = new ComboBox<>();
        clientTypeDropdown.getItems().addAll("Student", "Faculty Member", "Non-Faculty Staff", "Visitor");
        GridPane.setConstraints(clientTypeDropdown, 1, 4);

        // Register Button
        Button registerButton = new Button("Register");
        GridPane.setConstraints(registerButton, 1, 5);
        registerButton.setOnAction(e -> registerUser(nameInput.getText(), emailInput.getText(), passwordInput.getText(),
                licenseInput.getText(), clientTypeDropdown.getValue()));

        grid.getChildren().addAll(nameLabel, nameInput, emailLabel, emailInput, passwordLabel, passwordInput,
                licenseLabel, licenseInput, clientTypeLabel, clientTypeDropdown, registerButton);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void registerUser(String name, String email, String password, String license, String clientType) {
        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || license.isEmpty() || clientType == null) {
            showAlert("Error", "All fields must be filled.");
            return;
        }

        if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
            showAlert("Error", "Password must be strong: include A-Z, a-z, 0-9, and symbols.");
            return;
        }        

        try (FileWriter writer = new FileWriter("users.csv", true)) {
            writer.append(name).append(",").append(email).append(",").append(password)
                    .append(",").append(license).append(",").append(clientType).append("\n");
            showAlert("Success", "User registered successfully!");
        } catch (IOException e) {
            showAlert("Error", "Could not save user data.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
