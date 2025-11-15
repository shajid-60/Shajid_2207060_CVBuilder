package com.shajid.app.shajid2207060.controller;
import com.shajid.app.shajid2207060.model.CVData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FormController {

    @FXML private TextField fullNameField;
    @FXML private TextField emailField;
    @FXML private TextField phoneField;
    @FXML private TextField addressField;

    @FXML private TextArea educationArea;
    @FXML private TextArea skillsArea;
    @FXML private TextArea experienceArea;
    @FXML private TextArea projectsArea;

    @FXML
    private void handleGenerateCV() {

        CVData.fullName = fullNameField.getText();
        CVData.email = emailField.getText();
        CVData.phone = phoneField.getText();
        CVData.address = addressField.getText();
        CVData.education = educationArea.getText();
        CVData.skills = skillsArea.getText();
        CVData.experience = experienceArea.getText();
        CVData.projects = projectsArea.getText();

        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/shajid/app/shajid2207060/Preview.fxml")
            );

            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load(), 900, 650));
            stage.setTitle("CV Preview");
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
