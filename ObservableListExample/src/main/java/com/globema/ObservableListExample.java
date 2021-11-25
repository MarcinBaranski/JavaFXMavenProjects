package com.globema;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ObservableListExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/ObservableListExample.fxml"));
        VBox vBox = loader.load();
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.setTitle("ObervableList Example");
        stage.show();
    }
}
