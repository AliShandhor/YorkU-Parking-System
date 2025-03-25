package com.yorku.parkingsystem.Controllers;

import com.yorku.parkingsystem.management.ClientRegistration;
import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.user.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ApproveUsersController {

    @FXML
    private TableView<User> pendingUserTable;

    @FXML
    private TableColumn<User, String> colName;

    @FXML
    private TableColumn<User, String> colType;

    @FXML
    private TableColumn<User, String> colEmail;

    @FXML
    private ComboBox<ManagementTeam> teamComboBox;

    @FXML
    private Button approveButton;

    @FXML
    private Label statusLabel;

    private final ClientRegistration clientRegistration = new ClientRegistration();
    private final SuperManager superManager = SuperManager.getSuperManagerInstance("Gias Udin", "gias.udin@gmail.com", "eecs331");

    private ObservableList<User> pendingUsers = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colName.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getName()));
        colType.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getClientType()));
        colEmail.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getEmail()));

        teamComboBox.setItems(FXCollections.observableArrayList(superManager.getManagementTeamKeys()));

        loadPendingUsers();
    }

    private void loadPendingUsers() {
        pendingUsers.clear();
        for (User user : clientRegistration.getRegisteredUsers()) {
            if (!user.isRegistered() && !user.getClientType().equalsIgnoreCase("VISITOR")) {
                pendingUsers.add(user);
            }
        }

        if (pendingUsers.isEmpty()) {
            statusLabel.setText("No pending users to approve.");
        } else {
            statusLabel.setText("Select a user and a team, then click Approve.");
        }

        pendingUserTable.setItems(pendingUsers);
    }

    @FXML
    private void handleApproveUser() {
        User selectedUser = pendingUserTable.getSelectionModel().getSelectedItem();
        ManagementTeam selectedTeam = teamComboBox.getValue();

        if (selectedUser == null || selectedTeam == null) {
            statusLabel.setText("❌ Please select both a user and a team.");
            return;
        }

        // Approve and assign the user
        clientRegistration.registerClient(selectedUser, selectedTeam);
        selectedTeam.addUser(selectedUser);

        statusLabel.setText("✅ User approved and added to team.");

        loadPendingUsers(); // refresh list
    }
}
