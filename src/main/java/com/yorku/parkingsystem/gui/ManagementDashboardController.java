package com.yorku.parkingsystem.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import java.io.IOException;

public class ManagementDashboardController {

    @FXML
    private BorderPane mainPane; // This is the main BorderPane in your FXML

    

    @FXML
    private Label centerLabel; // Optional label in center as a welcome message

    @FXML
    private void handleApproveUsers(ActionEvent event) throws IOException {
        Parent view = FXMLLoader.load(getClass().getResource("/com/yorku/parkingsystem/gui/approve_users.fxml"));
        mainPane.setCenter(view);
    }
    

    @FXML
    private void handleAddUser(ActionEvent event) throws IOException {
        Parent view = FXMLLoader.load(getClass().getResource("add_user.fxml"));
        mainPane.setCenter(view);
    }
    @FXML
    private void handleRemoveUser(ActionEvent event) throws IOException {
        Parent view = FXMLLoader.load(getClass().getResource("/com/yorku/parkingsystem/gui/remove_user.fxml"));
        mainPane.setCenter(view);
    }
    

    @FXML
    private void handleViewTeamUsers(ActionEvent event) throws IOException {
        loadView("view_team_users.fxml");
    }

    @FXML
    private void handleAuthenticateUser(ActionEvent event) throws IOException {
        loadView("authenticate_user.fxml");
    }

    @FXML
    private void handleViewAllRegistered(ActionEvent event) throws IOException {
        Parent view = FXMLLoader.load(getClass().getResource("/com/yorku/parkingsystem/gui/view_all_users.fxml"));
        mainPane.setCenter(view);
    }
    
    @FXML
    private void handleUnregisterUser(ActionEvent event) throws IOException {
        loadView("unregister_user.fxml");
    }

    // Reusable helper to load any FXML into the center pane
    private void loadView(String fxmlFileName) throws IOException {
        Parent view = FXMLLoader.load(getClass().getResource("/com/yorku/parkingsystem/gui/" + fxmlFileName));
        mainPane.setCenter(view);
    }
}

