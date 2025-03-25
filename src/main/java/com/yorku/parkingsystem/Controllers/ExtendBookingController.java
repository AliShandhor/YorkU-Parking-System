package com.yorku.parkingsystem.Controllers;

import com.yorku.parkingsystem.user.Booking;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.HashMap;
import java.util.Map;

public class ExtendBookingController {

    @FXML private TextField bookingIdField;
    @FXML private TextField extraHoursField;
    @FXML private Label feedbackLabel;

    // Temporary store — replace this with your actual BookingManager or booking list
    private static final Map<Integer, Booking> bookingStore = new HashMap<>();

    static {
        // Example only: preloading fake data
        // bookingStore.put(5001, new Booking(...));
    }

    public static void addBooking(Booking booking) {
        bookingStore.put(booking.getBookingID(), booking);
    }

    @FXML
    private void handleExtend() {
        String idInput = bookingIdField.getText().trim();
        String hoursInput = extraHoursField.getText().trim();

        if (idInput.isEmpty() || hoursInput.isEmpty()) {
            feedbackLabel.setText("Please fill in both fields.");
            return;
        }

        try {
            int bookingID = Integer.parseInt(idInput);
            int extraHours = Integer.parseInt(hoursInput);

            Booking booking = bookingStore.get(bookingID);

            if (booking == null) {
                feedbackLabel.setText("No booking found with ID " + bookingID);
                return;
            }

            booking.extendBooking(extraHours);  // ✅ Your actual backend logic
            feedbackLabel.setText("Booking extended by " + extraHours + " hours.");

        } catch (NumberFormatException e) {
            feedbackLabel.setText("Invalid number format.");
        } catch (Exception e) {
            feedbackLabel.setText("Error: " + e.getMessage());
        }
    }
}

