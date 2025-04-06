package com.yorku.parkingsystem.parking.parkinglot;

import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.management.SuperManager;
import com.yorku.parkingsystem.parking.parkingspot.ParkingSpot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    ManagementTeam managementTeam;
    private ParkingLot parkingLot;
    private ParkingSpot parkingSpot1;
    private ParkingSpot parkingSpot2;
    private SuperManager superManager;

    @BeforeEach
    void setUp() {
        // create super manager to add, enable and disable parking lots & parking spots
        superManager = SuperManager.getSuperManagerInstance("Gias Uddin", "gias.uddin@yorku.com", "EECS3311$admin");
        // create management team
         managementTeam = new ManagementTeam();
        // register management team
        superManager.generateManagementTeamAccount(managementTeam);
        // create parking lot
        parkingLot = new ParkingLot("Main Lot", "York University");
        // create parking spot
        parkingSpot1 = new ParkingSpot();
        parkingSpot2 = new ParkingSpot();
    }
    // Enable, disable and add parking lots & parking spots through SuperManager
    @Test
    void testAddParkingSpot() {
        superManager.enableParkingLot(parkingLot);
        superManager.addParkingSpace(parkingLot, parkingSpot1);
        assertEquals(1, parkingLot.getNotAvailableParkingSpots(), "Parking spot should be added and non-available parking spot should increase");
        assertEquals(99, parkingLot.getAvailableParkingSpots(), "Available spots should decrease");
    }
    @Test
    void testParkingLotCapacity() {
        superManager.enableParkingLot(parkingLot);
        assertEquals(100, parkingLot.getParkingSpotsTotal(), "Parking Lot Capacity should be 100");
    }


    @Test
    void testDisableParkingSpot() {
        superManager.enableParkingLot(parkingLot);
        superManager.addParkingSpace(parkingLot, parkingSpot1);
        superManager.disableParkingSpot(parkingSpot1);
        assertFalse(parkingSpot1.isAvailable(), "Parking spot should be disabled");
    }

    @Test
    void testDisableParkingSpotInDisabledLot() {
        superManager.disableParkingLot(parkingLot);
        superManager.disableParkingSpot(parkingSpot1);
        assertFalse(parkingSpot1.isEnabled(), "Parking spot should be disabled");

        superManager.addParkingSpace(parkingLot, parkingSpot1);
        assertEquals(0, parkingLot.getNotAvailableParkingSpots(), "Parking spot should not be added since parking lot and parking sport are disabled");
        assertEquals(100, parkingLot.getAvailableParkingSpots(), "Available spots should remain the same since parking lot and parking spot are disabled");
    }

    @Test
    void testEnableParkingLot() {
        superManager.enableParkingLot(parkingLot);
        assertTrue(parkingLot.getIsEnabled(), "Parking lot should be enabled");
    }

    @Test
    void testDisableParkingLot() {
        superManager.disableParkingLot(parkingLot);
        assertFalse(parkingLot.getIsEnabled(), "Parking lot should be disabled");
    }

    @Test
    void testAddMultipleParkingSpots() {
        superManager.enableParkingLot(parkingLot);
        superManager.addParkingSpace(parkingLot, parkingSpot1);
        superManager.addParkingSpace(parkingLot, parkingSpot2);
        assertEquals(2, parkingLot.getNotAvailableParkingSpots(), "Two parking spots should be added");
        assertEquals(98, parkingLot.getAvailableParkingSpots(), "Available spots should decrease by two");
    }

    @Test
    void testDisableMultipleParkingSpots() {
        superManager.enableParkingLot(parkingLot);
        superManager.addParkingSpace(parkingLot, parkingSpot1);
        superManager.addParkingSpace(parkingLot, parkingSpot2);
        superManager.disableParkingSpot(parkingSpot1);
        superManager.disableParkingSpot(parkingSpot2);
        assertFalse(parkingSpot1.isEnabled(), "Parking spot should be disabled");
        assertFalse(parkingSpot2.isEnabled(), "Parking spot should be disabled");
    }

    @Test
    void testIfParkingSpotBelongsToParkingLot() {
        superManager.enableParkingLot(parkingLot);
        superManager.addParkingSpace(parkingLot, parkingSpot1);

        superManager.enableParkingSpot(parkingSpot2);
        superManager.addParkingSpace(parkingLot, parkingSpot2);
        assertTrue(parkingSpot1.isBelongedToParkingLot(), "Parking spot should belong to the parking lot");
        assertTrue(parkingSpot2.isBelongedToParkingLot(), "Parking spot should belong to the parking lot");

        ParkingSpot parkingSpot3NotBelongToParkingLot = new ParkingSpot();
        assertFalse(parkingSpot3NotBelongToParkingLot.isBelongedToParkingLot(), "Parking spot should not belong to the parking lot");
    }

    @Test
    void testAddParkingSpotBeyondCapacity() {
        superManager.enableParkingLot(parkingLot);

        // Add 100 parking spots
        for (int i = 0; i < 100; i++) {
            superManager.addParkingSpace(parkingLot, new ParkingSpot());
        }

        // Try to add 101st spot
        ParkingSpot extraSpot = new ParkingSpot();
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            superManager.addParkingSpace(parkingLot, extraSpot);
        });

        assertEquals("Cannot add more parking spots. Maximum capacity of 100 reached.", exception.getMessage());
        assertEquals(100, parkingLot.getNotAvailableParkingSpots(), "Parking spots should not exceed 100");
        assertEquals(0, parkingLot.getAvailableParkingSpots(), "No available spots should remain");
    }

    // Enable, disable and add parking lots and parking spots through management team
    @Test
    void testEnableParkingLotThroughManagementTeam() {
        managementTeam.enableParkingLot(parkingLot);
        assertTrue(parkingLot.getIsEnabled(), "Parking lot should be enabled");
    }

    @Test
    void testAddParkingLotThroughManagementTeam() {
        managementTeam.enableParkingLot(parkingLot);
        managementTeam.addParkingLot(parkingLot);
        assertTrue(managementTeam.getParkingLots().contains(parkingLot), "Parking lot should be added and enabled");
    }

    @Test
    void testDisableParkingLotThroughManagementTeam() {
        managementTeam.enableParkingLot(parkingLot);
        assertTrue(parkingLot.getIsEnabled(), "Parking lot should be enabled");

        managementTeam.disableParkingLot(parkingLot);
        assertFalse(parkingLot.getIsEnabled(), "Parking lot should be disabled");
    }

    @Test
    void testEnableParkingSpotThroughManagementTeam() {
        managementTeam.enableParkingLot(parkingLot);
        managementTeam.enableParkingSpot(parkingSpot1);
        managementTeam.enableParkingSpot(parkingSpot1);

        assertTrue(parkingSpot1.isEnabled(), "Parking spot should be enabled");

        managementTeam.disableParkingSpot(parkingSpot1);
        managementTeam.disableParkingSpot(parkingSpot1);
        assertFalse(parkingSpot1.isEnabled(), "Parking spot should be disabled");
    }

    @Test
    void testAddParkingSpotThroughManagementTeam() {
        managementTeam.enableParkingLot(parkingLot);
        managementTeam.addParkingLot(parkingLot);

        managementTeam.addParkingSpace(parkingLot, parkingSpot1);
        assertTrue(parkingSpot1.isBelongedToParkingLot(), "Parking spot should be belonged to the parking lot");
    }

    @Test
    void testDisableParkingSpotThroughManagementTeam() {
        managementTeam.enableParkingLot(parkingLot);
        managementTeam.enableParkingSpot(parkingSpot1);
        managementTeam.disableParkingSpot(parkingSpot1);
        assertFalse(parkingSpot1.isEnabled(), "Parking spot should be disabled");
    }






}