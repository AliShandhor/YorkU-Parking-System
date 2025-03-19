package com.yorku.parkingsystem.gui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Welcome Label
        Label welcomeLabel = new Label("Welcome to YorkU Parking System");
        welcomeLabel.setFont(new Font("Arial", 24));
        welcomeLabel.setTextFill(Color.DARKBLUE);
        welcomeLabel.setStyle("-fx-font-weight: bold; -fx-text-fill: #2c3e50;");

        // Login Section
        Label loginLabel = new Label("Login");
        loginLabel.setFont(new Font("Arial", 18));
        loginLabel.setTextFill(Color.DARKBLUE);
        loginLabel.setStyle("-fx-font-weight: bold;");

        TextField loginUsername = new TextField();
        loginUsername.setPromptText("Enter your username");
        loginUsername.setStyle("-fx-font-size: 14px; -fx-padding: 10px; -fx-background-color: #ecf0f1; -fx-border-radius: 5px; -fx-border-color: #bdc3c7;");

        PasswordField loginPassword = new PasswordField();
        loginPassword.setPromptText("Enter your password");
        loginPassword.setStyle("-fx-font-size: 14px; -fx-padding: 10px; -fx-background-color: #ecf0f1; -fx-border-radius: 5px; -fx-border-color: #bdc3c7;");

        Button loginBtn = new Button("Login");
        loginBtn.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 16px; -fx-padding: 12px 24px; -fx-border-radius: 5px; -fx-font-weight: bold;");
        loginBtn.setOnAction(event -> System.out.println("Login Button Clicked!"));

        // Sign Up Section
        Label signupLabel = new Label("Sign Up");
        signupLabel.setFont(new Font("Arial", 18));
        signupLabel.setTextFill(Color.DARKBLUE);
        signupLabel.setStyle("-fx-font-weight: bold;");

        TextField signupUsername = new TextField();
        signupUsername.setPromptText("Enter your username");
        signupUsername.setStyle("-fx-font-size: 14px; -fx-padding: 10px; -fx-background-color: #ecf0f1; -fx-border-radius: 5px; -fx-border-color: #bdc3c7;");

        PasswordField signupPassword = new PasswordField();
        signupPassword.setPromptText("Enter your password");
        signupPassword.setStyle("-fx-font-size: 14px; -fx-padding: 10px; -fx-background-color: #ecf0f1; -fx-border-radius: 5px; -fx-border-color: #bdc3c7;");

        PasswordField confirmPassword = new PasswordField();
        confirmPassword.setPromptText("Confirm your password");
        confirmPassword.setStyle("-fx-font-size: 14px; -fx-padding: 10px; -fx-background-color: #ecf0f1; -fx-border-radius: 5px; -fx-border-color: #bdc3c7;");

        Button signupBtn = new Button("Sign Up");
        signupBtn.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white; -fx-font-size: 16px; -fx-padding: 12px 24px; -fx-border-radius: 5px; -fx-font-weight: bold;");
        signupBtn.setOnAction(event -> System.out.println("Sign Up Button Clicked!"));

        // Layout
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: #f9f9f9; -fx-padding: 30px; -fx-border-radius: 10px; -fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.2), 10, 0.5, 0, 5);");

        layout.getChildren().addAll(
                welcomeLabel,
                loginLabel, loginUsername, loginPassword, loginBtn,
                signupLabel, signupUsername, signupPassword, confirmPassword, signupBtn
        );

        // Scene
        Scene scene = new Scene(layout, 450, 600);

        // Stage settings
        primaryStage.setTitle("YorkU Parking System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
