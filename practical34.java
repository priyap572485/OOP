import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrationForm extends Application {
    @Override
    public void start(Stage stage) {
        Label rollLabel = new Label("Roll No:");
        Label nameLabel = new Label("Name:");
        Label ageLabel = new Label("Age:");
        Label emailLabel = new Label("Email:");
        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();
        Button submitButton = new Button("Submit");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);
        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);
        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);
        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);
        grid.add(submitButton, 1, 4);
        submitButton.setOnAction(e -> {
            try {
                int rollNo = Integer.parseInt(rollField.getText());
                int age = Integer.parseInt(ageField.getText());
                String name = nameField.getText();
                String email = emailField.getText();
                if (!email.contains("@") || !email.contains(".")) {
                    showError("Invalid Email! Email must contain @ and .");
                    return;
                }
                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Registration Successful");
                success.setHeaderText("Student Registered");
                success.setContentText(
                        "Roll No: " + rollNo +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                success.showAndWait();
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Registration Data");
                fileChooser.setInitialFileName("student_data.txt");
                File file = fileChooser.showSaveDialog(stage);
                if (file != null) {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write("Roll No: " + rollNo);
                    writer.newLine();
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Age: " + age);
                    writer.newLine();
                    writer.write("Email: " + email);
                    writer.close();
                }
            } catch (NumberFormatException ex) {
                showError("Roll No and Age must be integers.");
            } catch (IOException ex) {
                showError("Error saving file.");
            }
        });
        Scene scene = new Scene(grid, 400, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }
    private void showError(String message) {
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle("Validation Error");
        error.setHeaderText("Input Error");
        error.setContentText(message);
        error.showAndWait();
    }
    public static void main(String[] args) {
        launch(args);
    }
}