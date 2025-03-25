package com.yorku.parkingsystem.Controllers;

import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.user.User;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RemoveUserController {

    @FXML
    private ComboBox<ManagementTeam> teamComboBox;

    @FXML
    private ComboBox<User> userComboBox;

    @FXML
    private Button removeButton;

    @FXML
    private Label statusLabel;

    private final SuperManager superManager = SuperManager.getSuperManagerInstance("Gias", "gias@gmail.com", "123");

    @FXML
    public void initialize() {
        // Load all available management teams
        teamComboBox.setItems(FXCollections.observableArrayList(superManager.getManagementTeamKeys()));

        // When a team is selected, load its users
        teamComboBox.setOnAction(event -> {
            ManagementTeam selectedTeam = teamComboBox.getValue();
            if (selectedTeam != null) {
                ObservableList<User> users = FXCollections.observableArrayList(selectedTeam.getRegisteredUsers());
                userComboBox.setItems(users);
            }
        });
    }

    @FXML
    private void handleRemoveUser() {
        ManagementTeam selectedTeam = teamComboBox.getValue();
        User selectedUser = userComboBox.getValue();

        if (selectedTeam == null || selectedUser == null) {
            statusLabel.setText("Please select both a team and a user.");
            return;
        }

        // Remove the user from the team
        selectedTeam.removeUser(selectedUser);
        statusLabel.setText("User removed from team.");

        // Refresh user list
        userComboBox.getItems().remove(selectedUser);
    }
}
