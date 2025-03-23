package com.yorku.parkingsystem.gui;


import com.yorku.parkingsystem.payment.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class PaymentGUI extends Application {


    @Override
    public void start(Stage primaryStage) {
        Label titleLabel = new Label("YorkU Parking Payment System");
        titleLabel.setFont(new Font("Arial", 24));
        titleLabel.setTextFill(Color.DARKBLUE);


        // Input the amount
        Label amountLabel = new Label("Enter Amount:");
        TextField amountField = new TextField();
        amountField.setPromptText("Amount in CAD");
        // Payment Selection
        Label paymentLabel = new Label("Select Payment Method:");
        ComboBox<String> paymentBox = new ComboBox<>();
        paymentBox.getItems().addAll("Credit Card", "Debit Card", "Mobile Payment");
        // Card Details Input
        TextField nameField = new TextField();
        nameField.setPromptText("Name on Card");


        TextField cardNumberField = new TextField();
        cardNumberField.setPromptText("Card Number (16 digits)");


        TextField cvvField = new TextField();
        cvvField.setPromptText("CVV (3 digits)");


        TextField dateOfExpiryField = new TextField();
        dateOfExpiryField.setPromptText("MM/YY");


        TextField phoneField = new TextField();
        phoneField.setPromptText("Phone Number");


        TextField methodField = new TextField();
        methodField.setPromptText("Payment Method");


        // Status Label
        Label statusLabel = new Label();
        statusLabel.setTextFill(Color.RED);


        // Payment Button
        Button payButton = new Button("Pay Now");
        payButton.setDisable(true);


        // Layout
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(
                titleLabel, amountLabel, amountField, paymentLabel, paymentBox,
                nameField, cardNumberField, cvvField, dateOfExpiryField,
                phoneField, methodField, payButton, statusLabel
        );


        nameField.setVisible(false);
        cardNumberField.setVisible(false);
        cvvField.setVisible(false);
        dateOfExpiryField.setVisible(false);
        phoneField.setVisible(false);
        methodField.setVisible(false);


        paymentBox.setOnAction(e -> updateVisibility(paymentBox, nameField, cardNumberField, cvvField, dateOfExpiryField, phoneField, methodField, payButton, amountField));
        amountField.textProperty().addListener((observable, oldValue, newValue) -> updateButtonState(paymentBox, amountField, nameField, cardNumberField, cvvField, dateOfExpiryField, phoneField, methodField, payButton));
        payButton.setOnAction(e -> handlePayment(paymentBox, amountField, nameField, cardNumberField, cvvField, dateOfExpiryField, phoneField, methodField, statusLabel));


        primaryStage.setTitle("YorkU Parking System");
        primaryStage.setScene(new Scene(layout, 400, 550));
        primaryStage.show();
    }


    private void updateVisibility(ComboBox<String> paymentBox, TextField nameField, TextField cardNumberField, TextField cvvField, TextField dateOfExpiryField, TextField phoneField, TextField methodField, Button payButton, TextField amountField) {
        if (paymentBox.getValue() == null) return;


        boolean isCard = paymentBox.getValue().equals("Credit Card") || paymentBox.getValue().equals("Debit Card");
        boolean isMobile = paymentBox.getValue().equals("Mobile Payment");


        nameField.setVisible(isCard);
        cardNumberField.setVisible(isCard);
        cvvField.setVisible(isCard);
        dateOfExpiryField.setVisible(isCard);


        phoneField.setVisible(isMobile);
        methodField.setVisible(isMobile);


        updateButtonState(paymentBox, amountField, nameField, cardNumberField, cvvField, dateOfExpiryField, phoneField, methodField, payButton);
    }


    private void updateButtonState(ComboBox<String> paymentBox, TextField amountField, TextField nameField, TextField cardNumberField, TextField cvvField, TextField dateOfExpiryField, TextField phoneField, TextField methodField, Button payButton) {
        payButton.setDisable(false);
    }

    /**
     * Payment strategy : credit card, debit card, mobile payment
     */


    private void handlePayment(ComboBox<String> paymentBox, TextField amountField, TextField nameField, TextField cardNumberField, TextField cvvField, TextField dateOfExpiryField, TextField phoneField, TextField methodField, Label statusLabel) {
        try {
            double amount = parseAmount(amountField.getText());
            if (amount <= 0) {
                statusLabel.setTextFill(Color.RED);
                statusLabel.setText("Invalid amount. Please enter a valid amount.");
                return;
            }


            PaymentStrategy strategy = null;


            // Handle Credit Card Payment
            if (paymentBox.getValue().equals("Credit Card")) {
                // Validate card
                String name = nameField.getText().trim();
                String cardNumber = cardNumberField.getText().trim();
                String cvv = cvvField.getText().trim();
                String dateOfExpiry = dateOfExpiryField.getText().trim();


                // Check if name is empty
                if (name.trim().isEmpty()) {
                    statusLabel.setTextFill(Color.RED);
                    statusLabel.setText("Name on card is required.");
                    return;
                }


                // Validate card number
                if (!cardNumber.matches("\\d{16}")) {
                    statusLabel.setTextFill(Color.RED);
                    statusLabel.setText("Invalid card number. It must be 16 digits.");
                    return;
                }


                // Validate CVV
                if (!cvv.matches("\\d{3}")) {
                    statusLabel.setTextFill(Color.RED);
                    statusLabel.setText("Invalid CVV. It must be 3 digits.");
                    return;
                }


                // Validate expiry date format (MM/YY)
                if (!dateOfExpiry.matches("(0[1-9]|1[0-2])/\\d{2}")) {
                    statusLabel.setTextFill(Color.RED);
                    statusLabel.setText("Invalid expiry date. It should be in MM/YY format.");
                    return;
                }


                // Parse cardNumber as long
                long cardNumberLong = Long.parseLong(cardNumber);


                // Create Credit Card strategy
                strategy = new CreditCard(name, cardNumberLong, Integer.parseInt(cvv), dateOfExpiry);
            }
            // Handle Debit Card Payment
            else if (paymentBox.getValue().equals("Debit Card")) {
                // Validate card
                String name = nameField.getText().trim();
                String cardNumber = cardNumberField.getText().trim();
                String cvv = cvvField.getText().trim();
                String dateOfExpiry = dateOfExpiryField.getText().trim();


                // Check if name is empty
                if (name.trim().isEmpty()) {
                    statusLabel.setTextFill(Color.RED);
                    statusLabel.setText("Name on card is required.");
                    return;
                }


                // Validate card number
                if (!cardNumber.matches("\\d{16}")) {
                    statusLabel.setTextFill(Color.RED);
                    statusLabel.setText("Invalid card number. It must be 16 digits.");
                    return;
                }


                // Validate CVV
                if (!cvv.matches("\\d{3}")) {
                    statusLabel.setTextFill(Color.RED);
                    statusLabel.setText("Invalid CVV. It must be 3 digits.");
                    return;
                }


                // Validate expiry date format (MM/YY)
                if (!dateOfExpiry.matches("(0[1-9]|1[0-2])/\\d{2}")) {
                    statusLabel.setTextFill(Color.RED);
                    statusLabel.setText("Invalid expiry date. It should be in MM/YY format.");
                    return;
                }


                // Parse cardNumber as long
                long cardNumberLong = Long.parseLong(cardNumber);


                // Create Debit Card strategy
                strategy = new DebitCard(name, cardNumberLong, Integer.parseInt(cvv), dateOfExpiry);
            }
            // Handle Mobile Payment
            else if (paymentBox.getValue().equals("Mobile Payment")) {
                // Validate mobile payment fields
                String phone = phoneField.getText().trim();
                String method = methodField.getText().trim();


                // Validate phone number
                if (!phone.matches("\\+?[0-9]{10,15}")) {
                    statusLabel.setTextFill(Color.RED);
                    statusLabel.setText("Invalid phone number. Please enter a valid number.");
                    return;
                }


               // Validate mobile payment method
                if (method.isEmpty()) {
                    statusLabel.setTextFill(Color.RED);
                    statusLabel.setText("Payment method is required.");
                    return;
                }


                // Create Mobile Payment strategy
                strategy = new MobilePayment(phone, method);
            } else {
                statusLabel.setTextFill(Color.RED);
                statusLabel.setText("Please select a payment method.");
                return;
            }


            /**
             * Payment process if successful or failed
             */
            Payment payment = new Payment(strategy);
            payment.checkout(amount);

            statusLabel.setTextFill(Color.GREEN);
            statusLabel.setText("Payment Successful!");


        } catch (Exception ex) {
            ex.printStackTrace();
            statusLabel.setTextFill(Color.RED);
            statusLabel.setText("Payment Failed. Please check inputs.");
        }
    }


    private double parseAmount(String amount) {
        try {
            return Double.parseDouble(amount);
        } catch (NumberFormatException e) {
            return -1;
        }
    }


    public static void main(String[] args) {
        launch(args);
    }


}