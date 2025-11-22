package com.shajid.app.shajid2207060.controller;

import com.shajid.app.shajid2207060.model.CVData;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class PreviewController {

    @FXML private Label fullNameLabel;
    @FXML private Label emailLabel;
    @FXML private Label phoneLabel;
    @FXML private Label addressLabel;

    @FXML private TextArea educationText;
    @FXML private TextArea skillsText;
    @FXML private TextArea experienceText;
    @FXML private TextArea projectsText;

    private CVData cv;

    public void setCVData(CVData cv) {
        this.cv = cv;

        fullNameLabel.setText("Full Name: " + cv.getFullName());
        emailLabel.setText("Email: " + cv.getEmail());
        phoneLabel.setText("Phone: " + cv.getPhone());
        addressLabel.setText("Address: " + cv.getAddress());

        educationText.setText(cv.getEducation());
        skillsText.setText(cv.getSkills());
        experienceText.setText(cv.getExperience());
        projectsText.setText(cv.getProjects());
    }

    @FXML
    private void handleClose() {
        Stage stage = (Stage) fullNameLabel.getScene().getWindow();
        stage.close();
    }
}
