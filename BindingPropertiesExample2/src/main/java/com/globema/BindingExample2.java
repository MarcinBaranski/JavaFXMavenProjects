package com.globema;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BindingExample2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/Binding.fxml"));
        VBox vBox = loader.load();
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();
    }
}
