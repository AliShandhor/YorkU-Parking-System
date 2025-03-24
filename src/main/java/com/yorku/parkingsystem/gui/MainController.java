package com.yorku.parkingsystem.gui;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.event.ActionEvent;

public class MainController {
    @FXML private ComboBox<String> parkingLotBox;

    @FXML
    public void initialize() {
        // Populate parking lot selection
        parkingLotBox.getItems().addAll("Lot A", "Lot B", "Lot C", "Lot D");
    }

    @FXML
    private void handleParkingLotSelection(ActionEvent event) {
        String selectedLot = parkingLotBox.getValue();
        System.out.println("Selected Parking Lot: " + selectedLot);
    }
}

