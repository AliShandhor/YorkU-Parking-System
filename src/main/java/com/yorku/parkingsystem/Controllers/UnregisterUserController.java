package com.yorku.parkingsystem.Controllers;

import com.yorku.parkingsystem.management.ClientRegistration;
import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.user.User;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UnregisterUserController {

    @FXML private TextField nameField;
    @FXML private Label feedbackLabel;

    private final SuperManager superManager = SuperManager.getSuperManagerInstance("Gias Udin", "gias.udin@gmail.com", "eecs331");
    private final ClientRegistration clientRegistration = new ClientRegistration();

    @FXML
    private void handleUnregister() {
        String name = nameField.getText();
        if (name == null || name.trim().isEmpty()) {
            feedbackLabel.setText("Name field cannot be empty.");
            return;
        }

        boolean found = false;

        for (ManagementTeam team : superManager.getManagementTeamKeys()) {
            for (User user : team.getRegisteredUsers()) {
                if (user.getName().equalsIgnoreCase(name)) {
                    superManager.unregisterClient(clientRegistration, user);  // actual backend logic
                    feedbackLabel.setText("User '" + name + "' unregistered successfully.");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            feedbackLabel.setText("User '" + name + "' not found in any team.");
        }
    }
}
