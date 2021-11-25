package com.globema;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label topLabel = new Label("Witaj w aplikacji");
        Label bottomLeftLabel = new Label("Status aplikacji OK");
        bottomLeftLabel.setAlignment(Pos.BASELINE_LEFT);

        TextArea textArea = new TextArea();
        AnchorPane anchorPaneCenter = new AnchorPane();
        anchorPaneCenter.getChildren().add(textArea);

        AnchorPane.setTopAnchor(textArea,0.0);
        AnchorPane.setLeftAnchor(textArea,0.0);
        AnchorPane.setRightAnchor(textArea,0.0);
        AnchorPane.setBottomAnchor(textArea,0.0);

        Button open = new Button("Otwórz");
        Button save = new Button("Zapisz");
        Button close = new Button("Zamknij");

        VBox vBoxLeft = new VBox();
        vBoxLeft.getChildren().addAll(open,save,close);
        vBoxLeft.setSpacing(10);
        vBoxLeft.setAlignment(Pos.TOP_CENTER);
        vBoxLeft.setPadding(new Insets(10));



        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topLabel);
        borderPane.setLeft(vBoxLeft);
        borderPane.setCenter(anchorPaneCenter);
        borderPane.setBottom(bottomLeftLabel);

        BorderPane.setAlignment(topLabel,Pos.TOP_CENTER);

        Scene scene = new Scene(borderPane,600,400);

        stage.setScene(scene);
        stage.setTitle("BorderPane Example");
        stage.show();
    }
}
