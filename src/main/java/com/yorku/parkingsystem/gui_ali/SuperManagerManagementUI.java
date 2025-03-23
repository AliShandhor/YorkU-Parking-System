package com.yorku.parkingsystem.gui_ali;

import com.yorku.parkingsystem.management.ManagementTeam;
import com.yorku.parkingsystem.user.User;
import com.yorku.parkingsystem.management.ClientRegistration;
import com.yorku.parkingsystem.user.UserFactory;
import com.yorku.parkingsystem.management.SuperManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class SuperManagerManagementUI extends Application {
    private ClientRegistration clientRegistration;
    private User user;
    private ManagementTeam managementTeam;
    private ListView<String> userListView;
    private TextField teamManagementName, teamManagementPassword, userIDField;
    private Button addButton, removeButton, displayButton, addAnotherTeamButton, loginButton;
    private SuperManager superManager = SuperManager.getSuperManagerInstance("Gias Udin", "gias.udin@gmail.com", "eecs331");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        initializeObjects();
        Scene mainScene = createMainScene(primaryStage);
        primaryStage.setTitle("Super Manager | Management Teams Portal");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    private void initializeObjects() {
        managementTeam = new ManagementTeam();
        superManager.generateManagementTeamAccount(managementTeam);
        user = UserFactory.getUser("Student", "Ali Shandhor", "CWFZ590", "a.shanzoor@gmail.com", "Aa123456$");
        clientRegistration = new ClientRegistration();
        clientRegistration.registerClient(user, managementTeam); // later will be changed

    }

    private Scene createMainScene(Stage primaryStage) {
        VBox layout = new VBox(10);
        layout.setPadding(new javafx.geometry.Insets(20));

        Button generateAccountButton = new Button("Generate Team Management Account");
        generateAccountButton.setOnAction(e -> showTeamManagementFields());

        addAnotherTeamButton = new Button("Add Another Management Team");
        addAnotherTeamButton.setOnAction(e -> addNewManagementTeam());

        loginButton = new Button("Login to Management Team Account");
        loginButton.setOnAction(e -> loginToManagementTeamAccount(primaryStage));

        Button displayAllTeamsButton = new Button("Display All Management Teams");
        displayAllTeamsButton.setOnAction(e -> displayAllManagementTeams());



        initializeUIComponents();

        layout.getChildren().addAll(
                generateAccountButton, addAnotherTeamButton, loginButton, displayAllTeamsButton,
                new Label("Management Team Name:"), teamManagementName,
                new Label("Password:"), teamManagementPassword,
                new Label("User ID:"), userIDField
        );

        return new Scene(layout, 500, 500);
    }
    private void initializeUIComponents() {
        teamManagementName = new TextField(managementTeam.getName());
        teamManagementPassword = new TextField(managementTeam.getPassword());
        userIDField = new TextField(String.valueOf(managementTeam.getID()));

        hideManagementFields();

        userListView = new ListView<>();
        addButton = new Button("Add User");
        removeButton = new Button("Remove User");
        displayButton = new Button("Display Users");

        hideButtons();

        addButton.setOnAction(e -> managementTeam.addUser(user));
        removeButton.setOnAction(e ->  managementTeam.removeUser(user));
        displayButton.setOnAction(e -> managementTeam.displayUsers());
    }

    private void hideManagementFields() {
        teamManagementName.setVisible(false);
        teamManagementPassword.setVisible(false);
        userIDField.setVisible(false);
    }

    private void hideButtons() {
        addButton.setVisible(false);
        removeButton.setVisible(false);
        displayButton.setVisible(false);
    }

    private void showTeamManagementFields() {
        teamManagementName.setVisible(true);
        teamManagementPassword.setVisible(true);
        userIDField.setVisible(true);
        addButton.setVisible(true);
        removeButton.setVisible(true);
        displayButton.setVisible(true);
    }

    private void addNewManagementTeam() {
        ManagementTeam newTeam = new ManagementTeam();
        superManager.generateManagementTeamAccount(newTeam);

        teamManagementName.setText(newTeam.getName());
        teamManagementPassword.setText(newTeam.getPassword());
        userIDField.setText(String.valueOf(newTeam.getID()));

        showTeamManagementFields();

        // Show message when a new team is generated
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("New Management Team");
        alert.setHeaderText("Management Team Created");
        alert.setContentText("A new management team has been created successfully.");
        alert.showAndWait();
    }

    private void displayAllManagementTeams() {
        if (superManager.getManagementTeamKeys().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No Management Teams");
            alert.setHeaderText("No Management Teams Found");
            alert.setContentText("No management team accounts exist.");
            alert.showAndWait();
        } else {
            StringBuilder teamsInfo = new StringBuilder();

            for (ManagementTeam team : superManager.getManagementTeamKeys()) {
                teamsInfo.append(team).append("\n");
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("All Management Teams");
            alert.setHeaderText("Management Teams Information");
            alert.setContentText(teamsInfo.toString());
            alert.showAndWait();
        }
    }

    private void loginToManagementTeamAccount(Stage primaryStage) {
        VBox loginLayout = new VBox(10);
        loginLayout.setPadding(new javafx.geometry.Insets(20));

        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        Label statusLabel = new Label();

        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> authenticateUser(usernameField, passwordField, statusLabel, primaryStage));

        Button backButton = new Button("Back");
        backButton.setOnAction(e -> primaryStage.setScene(createMainScene(primaryStage)));

        loginLayout.getChildren().addAll(usernameField, passwordField, loginButton, backButton, statusLabel);
        primaryStage.setScene(new Scene(loginLayout, 300, 200));
    }

    private void authenticateUser(TextField usernameField, PasswordField passwordField, Label statusLabel, Stage primaryStage) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (superManager.authenticateManagementTeamAccount(username, password)) {
            statusLabel.setText("Login successful!");
            statusLabel.setStyle("-fx-text-fill: green;");
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Login successful!", ButtonType.OK);
            alert.showAndWait();
            primaryStage.setScene(createPostLoginScene(primaryStage));
        } else {
            statusLabel.setText("Invalid credentials");
            statusLabel.setStyle("-fx-text-fill: red;");
            Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid username or password.", ButtonType.OK);
            alert.show();
        }
    }

    private Scene createPostLoginScene(Stage primaryStage) {
        VBox postLoginLayout = new VBox(10);
        postLoginLayout.setPadding(new javafx.geometry.Insets(20));

        Button addUserButton = new Button("Add User");
        Button removeUserButton = new Button("Remove User");
        Button displayUserButton = new Button("Display Users");
        Button backButton = new Button("Back");
        Label statusLabel = new Label();

        addUserButton.setOnAction(e -> {
            managementTeam.addUser(user);
            statusLabel.setText("User added successfully!");
        });
        removeUserButton.setOnAction(e -> {
            managementTeam.removeUser(user);
            statusLabel.setText("User removed successfully!");
        });
        displayUserButton.setOnAction(e -> {
            managementTeam.displayUsers();
            statusLabel.setText("Displaying users.");
        });
        backButton.setOnAction(e -> primaryStage.setScene(createMainScene(primaryStage)));

        postLoginLayout.getChildren().addAll(addUserButton, removeUserButton, displayUserButton, backButton, statusLabel);
        return new Scene(postLoginLayout, 300, 200);
    }
}
