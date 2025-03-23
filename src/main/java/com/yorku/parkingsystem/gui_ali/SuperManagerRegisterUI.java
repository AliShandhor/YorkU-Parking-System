package com.yorku.parkingsystem.gui_ali;

import com.yorku.parkingsystem.management.SuperManager;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SuperManagerRegisterUI extends Application {

    private TextField nameField, emailField;
    private PasswordField passwordField;
    private Button managementTeamButton, userButton, goToUserManagementButton;
    private static boolean isAccountCreated = false; // Flag to check if the account has been created

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        Label nameLabel = new Label("Name:");
        nameField = new TextField();
        nameField.setPromptText("Enter name");

        Label emailLabel = new Label("Email:");
        emailField = new TextField();
        emailField.setPromptText("Enter email");

        Label passwordLabel = new Label("Password:");
        passwordField = new PasswordField();
        passwordField.setPromptText("Enter password");

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> handleSubmitButton());

        managementTeamButton = new Button("Go to Management Team");
        managementTeamButton.setOnAction(e -> goToManagementTeamUI());
        managementTeamButton.setDisable(true);  // Disable until registration is complete


        goToUserManagementButton = new Button("Go to Client Registration");
        goToUserManagementButton.setOnAction(e -> goToUserManagementGUI());
        goToUserManagementButton.setDisable(true);  // Disable until registration is complete

        VBox layout = new VBox(10, nameLabel, nameField, emailLabel, emailField, passwordLabel, passwordField, submitButton, managementTeamButton, goToUserManagementButton);
        layout.setPadding(new Insets(20));

        Scene scene = new Scene(layout, 300, 350);
        primaryStage.setTitle("Super Manager Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleSubmitButton() {
        // Check if the account has already been created
        if (isAccountCreated) {
            // Display message that the account has already been created
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Account Already Created");
            alert.setHeaderText("Account Creation Warning");
            alert.setContentText("You have already created your account.");
            alert.showAndWait();
            return;
        }

        // Retrieve data entered by the super manager
        String name = nameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();

        // Instantiate SuperManager with the entered data
        SuperManager superManager = SuperManager.getSuperManagerInstance(name, email, password);

        // Save data to CSV file
        saveManagerDataToCSV(name, email, password);

        // Set the flag to true so that further registrations are blocked
        isAccountCreated = true;

        // Enable the buttons after registration
        managementTeamButton.setDisable(false);
        userButton.setDisable(false);
        goToUserManagementButton.setDisable(false);

        // Display success message
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText("Super Manager Registered");
        alert.setContentText("Super Manager details saved successfully.");
        alert.showAndWait();
    }

    private void saveManagerDataToCSV(String name, String email, String password) {
        // CSV file path
        String csvFile = "super_manager_data.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile, true))) {
            // Check if the file is empty and write the header only if the file is empty
            File file = new File(csvFile);
            if (file.length() == 0) {
                writer.append("Name,Email,Password\n");
            }

            // Write the manager's data
            writer.append(name).append(",").append(email).append(",").append(password).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void goToManagementTeamUI() {
        // Logic to navigate to the Management Team UI
        System.out.println("Navigating to Management Team UI...");
        // You can add your code here to switch to the ManagementTeamUI
    }

    private void goToUserManagementGUI() {
        // Logic to navigate to the User Management UI
        System.out.println("Navigating to User Management UI...");
        clientRegistrationUI clientRegistrationUI = new clientRegistrationUI();
        Stage userManagementStage = new Stage();
        clientRegistrationUI.start(userManagementStage); // Start the User Management UI
        Stage currentStage = (Stage) goToUserManagementButton.getScene().getWindow();
        currentStage.close();  // Close the SuperManagerUI
    }
}
