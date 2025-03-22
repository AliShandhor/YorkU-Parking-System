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
        cardNumberField.setPromptText("Card Number");

        TextField cvvField = new TextField();
        cvvField.setPromptText("CVV");

        TextField expiryField = new TextField();
        expiryField.setPromptText("MM/YY");

        // Mobile Payment Details Input
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
                nameField, cardNumberField, cvvField, expiryField,
                phoneField, methodField, payButton, statusLabel
        );

        // Update visibility and button status
        paymentBox.setOnAction(e -> {
            boolean isCard = paymentBox.getValue().equals("Credit Card") || paymentBox.getValue().equals("Debit Card");
            nameField.setVisible(isCard);
            cardNumberField.setVisible(isCard);
            cvvField.setVisible(isCard);
            expiryField.setVisible(isCard);

            boolean isMobile = paymentBox.getValue().equals("Mobile Payment");
            phoneField.setVisible(isMobile);
            methodField.setVisible(isMobile);

            // Enable/Disable Pay button based on inputs
            payButton.setDisable(!isFormValid(isCard, isMobile, amountField, nameField, cardNumberField, cvvField, expiryField, phoneField, methodField));
        });

        // validate and update button state
        amountField.textProperty().addListener((observable, oldValue, newValue) -> {
            boolean isCard = paymentBox.getValue().equals("Credit Card") || paymentBox.getValue().equals("Debit Card");
            boolean isMobile = paymentBox.getValue().equals("Mobile Payment");
            payButton.setDisable(!isFormValid(isCard, isMobile, amountField, nameField, cardNumberField, cvvField, expiryField, phoneField, methodField));
        });

        // Payment Button
        payButton.setOnAction(e -> {
            try {
                double amount = parseAmount(amountField.getText());
                if (amount == -1) {
                    statusLabel.setTextFill(Color.RED);
                    statusLabel.setText("Invalid amount. Please enter a valid number.");
                    return;
                }
                PaymentStrategy strategy;

                switch (paymentBox.getValue()) {
                    case "Credit Card":
                    case "Debit Card":
                        if (nameField.getText().isEmpty()) {
                            statusLabel.setTextFill(Color.RED);
                            statusLabel.setText("Please enter the name on the card.");
                            return;
                        }
                        if (cardNumberField.getText().isEmpty() || !cardNumberField.getText().matches("\\d{16}")) {
                            statusLabel.setTextFill(Color.RED);
                            statusLabel.setText("Card number must be 16 digits.");
                            return;
                        }
                        if (cvvField.getText().isEmpty() || !cvvField.getText().matches("\\d{3}")) {
                            statusLabel.setTextFill(Color.RED);
                            statusLabel.setText("CVV must be 3 digits.");
                            return;
                        }
                        if (expiryField.getText().isEmpty() || !expiryField.getText().matches("(0[1-9]|1[0-2])/[0-9]{2}")) {
                            statusLabel.setTextFill(Color.RED);
                            statusLabel.setText("Expiry date must be in MM/YY format.");
                            return;
                        }
                        strategy = paymentBox.getValue().equals("Credit Card") ?
                                new CreditCard(nameField.getText(), Integer.parseInt(cardNumberField.getText()), Integer.parseInt(cvvField.getText()), expiryField.getText()) :
                                new DebitCard(nameField.getText(), Integer.parseInt(cardNumberField.getText()), Integer.parseInt(cvvField.getText()), expiryField.getText());
                        break;
                    case "Mobile Payment":
                        if (phoneField.getText().isEmpty() || !phoneField.getText().matches("\\+?[0-9]{10,15}")) {
                            statusLabel.setTextFill(Color.RED);
                            statusLabel.setText("Please enter a valid phone number.");
                            return;
                        }
                        if (methodField.getText().isEmpty()) {
                            statusLabel.setTextFill(Color.RED);
                            statusLabel.setText("Please enter the mobile payment method.");
                            return;
                        }
                        strategy = new MobilePayment(phoneField.getText(), methodField.getText());
                        break;
                    default:
                        statusLabel.setTextFill(Color.RED);
                        statusLabel.setText("Please select a payment method.");
                        return;
                }

                Payment payment = new Payment(strategy);
                payment.checkout(amount);
                statusLabel.setTextFill(Color.GREEN);
                statusLabel.setText("Payment Successful!");
            } catch (Exception ex) {
                statusLabel.setTextFill(Color.RED);
                statusLabel.setText("Payment Failed. Please check inputs.");
            }
        });

        primaryStage.setTitle("YorkU Parking System");
        primaryStage.setScene(new Scene(layout, 400, 500));
        primaryStage.show();
    }

    // Validate form
    private boolean isFormValid(boolean isCard, boolean isMobile, TextField amountField, TextField nameField, TextField cardNumberField, TextField cvvField, TextField expiryField, TextField phoneField, TextField methodField) {
        boolean isAmountValid = !amountField.getText().isEmpty() && parseAmount(amountField.getText()) > 0;

        if (isCard) {
            return isAmountValid && !nameField.getText().isEmpty() && !cardNumberField.getText().isEmpty() &&
                    !cvvField.getText().isEmpty() && !expiryField.getText().isEmpty();
        } else if (isMobile) {
            return isAmountValid && !phoneField.getText().isEmpty() && !methodField.getText().isEmpty();
        }
        return false;
    }

    //  parse the amount
    // ensures valid values to be processed for the payment
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
