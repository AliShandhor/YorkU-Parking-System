package com.yorku.parkingsystem.Controllers;


import com.yorku.parkingsystem.parking.parkinglot.parkingspot.ParkingSpot;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageParkingController {

    @FXML
    private TableView<ParkingSpot> parkingSpaceTable;
    @FXML
    private TableColumn<ParkingSpot, Integer> colSpotId;
    @FXML
    private TableColumn<ParkingSpot, Boolean> colAvailable;
    @FXML
    private TableColumn<ParkingSpot, Boolean> colEnabled;
    
    @FXML
    public void initialize() {
        // Bind regular Java getter methods
        colSpotId.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getParkingSpotID()));
        colAvailable.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().isAvailable()));
        colEnabled.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().isEnabled()));
    
        // Example to populate table (optional)
        ObservableList<ParkingSpot> sampleSpots = FXCollections.observableArrayList(
            new ParkingSpot(), new ParkingSpot(), new ParkingSpot()
        );
        parkingSpaceTable.setItems(sampleSpots);
    }
}    