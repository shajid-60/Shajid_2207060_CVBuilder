package com.shajid.app.shajid2207060;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.shajid.app.shajid2207060.database.DatabaseConnection;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        DatabaseConnection.createTable();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Home.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("CV Builder");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
