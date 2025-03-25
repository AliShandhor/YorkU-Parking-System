package com.yorku.parkingsystem.additionalguifortesting;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ManagementDashboardUI extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        // Main Layout
        BorderPane mainPane = new BorderPane();

        // Header Label
        Label headerLabel = new Label("YorkU Parking – Management Dashboard");
        headerLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        mainPane.setTop(headerLabel);

        // Side Menu (Buttons)
        VBox sideMenu = new VBox(10);
        sideMenu.setPadding(new Insets(15));
        Button approveUsersBtn = new Button("Approve Pending Users");
        Button addUserBtn = new Button("Add User to Team");
        Button removeUserBtn = new Button("Remove User");
        Button viewTeamBtn = new Button("View Team User");
        Button authUserBtn = new Button("Authenticate User");
        Button viewUsersBtn = new Button("View All Registered");
        Button unregisterBtn = new Button("Unregister a User");

        // Back Button
        Button backButton = new Button("Back");
        backButton.setOnAction(e -> goBack());

        // Add Buttons to Side Menu
        sideMenu.getChildren().addAll(approveUsersBtn, addUserBtn, removeUserBtn, viewTeamBtn, authUserBtn, viewUsersBtn, unregisterBtn, backButton);
        mainPane.setLeft(sideMenu);

        // Welcome Message
        Label welcomeLabel = new Label("Welcome, please select an option from the menu.");
        welcomeLabel.setStyle("-fx-font-size: 18px;");
        mainPane.setCenter(welcomeLabel);

        // Scene and Stage
        Scene scene = new Scene(mainPane, 600, 400);
        primaryStage.setTitle("Management Dashboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void goBack() {
        // Reopen the SuperManagerRegisterUI
        Stage registerStage = new Stage();
        SuperManagerRegisterUI superManagerRegisterUI = new SuperManagerRegisterUI();
        superManagerRegisterUI.start(registerStage);

        // Close the current Management Dashboard UI
        primaryStage.close();
    }
}
