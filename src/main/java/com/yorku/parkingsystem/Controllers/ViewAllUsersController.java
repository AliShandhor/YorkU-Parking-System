package com.yorku.parkingsystem.Controllers;

import com.yorku.parkingsystem.management.ClientRegistration;
import com.yorku.parkingsystem.user.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ViewAllUsersController {

    @FXML private TableView<User> userTable;
    @FXML private TableColumn<User, Integer> colId;
    @FXML private TableColumn<User, String> colName;
    @FXML private TableColumn<User, String> colPlate;
    @FXML private TableColumn<User, String> colType;
    @FXML private TableColumn<User, Double> colRate;
    @FXML private Label statusLabel;

    private final ClientRegistration clientRegistration = new ClientRegistration();

    @FXML
    public void initialize() {
        // Connect each column to the User class's getter
        colId.setCellValueFactory(cellData -> new javafx.beans.property.SimpleIntegerProperty(cellData.getValue().getUserID()).asObject());
        colName.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getName()));
        colPlate.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getLicensePlate()));
        colType.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getClientType()));
        colRate.setCellValueFactory(cellData -> new javafx.beans.property.SimpleDoubleProperty(cellData.getValue().getRatePerHour()).asObject());

        loadUserData();
    }

    private void loadUserData() {
        ObservableList<User> users = FXCollections.observableArrayList(clientRegistration.getRegisteredUsers());

        if (users.isEmpty()) {
            statusLabel.setText( "No users registered.");
        } else {
            statusLabel.setText( users.size() + " user(s) found.");
            userTable.setItems(users);
        }
    }
}
