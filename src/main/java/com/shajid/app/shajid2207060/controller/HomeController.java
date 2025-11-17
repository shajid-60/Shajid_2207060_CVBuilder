package com.shajid.app.shajid2207060.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;

public class HomeController {

    public void handleCreateCV(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    HomeController.class.getResource("/com/shajid/app/shajid2207060/Form.fxml")
            );

            Scene scene = new Scene(loader.load());

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
