package com.shajid.app.shajid2207060.controller;

import com.shajid.app.shajid2207060.database.CVDAO;
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

        // Create a CVData object from the form values
        CVData cv = new CVData(
                fullNameField.getText(),
                emailField.getText(),
                phoneField.getText(),
                addressField.getText(),
                educationArea.getText(),
                skillsArea.getText(),
                experienceArea.getText(),
                projectsArea.getText()
        );

        // Save CV data into SQLite database
        CVDAO.insert(cv);

        // Open Preview window
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/shajid/app/shajid2207060/Preview.fxml")
            );

            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));
            stage.setTitle("CV Preview");
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
