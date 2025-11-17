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

    @FXML
    public void initialize() {
        fullNameLabel.setText("Full Name: " + CVData.fullName);
        emailLabel.setText("Email: "        + CVData.email);
        phoneLabel.setText("Phone: "        + CVData.phone);
        addressLabel.setText("Address: "    + CVData.address);

        educationText.setText(CVData.education);
        skillsText.setText(CVData.skills);
        experienceText.setText(CVData.experience);
        projectsText.setText(CVData.projects);
    }

    @FXML
    private void handleClose() {
        Stage stage = (Stage) fullNameLabel.getScene().getWindow();
        stage.close();
    }
}
