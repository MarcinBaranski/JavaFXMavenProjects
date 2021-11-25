package com.globema;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        Label loginLabel = new Label("Login");

        TextField loginTextField = new TextField();
        loginTextField.setPrefHeight(25);
        loginTextField.setPrefWidth(184);

        Label passwordLabel = new Label("Hasło");

        TextField passwordTextField = new TextField();
        passwordTextField.setPrefHeight(25);
        passwordTextField.setPrefWidth(184);

        CheckBox rememberMeCheckBox = new CheckBox("Zapamiętaj");

        Button loginButton = new Button("Zaloguj");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));


        //Metoda 1 na dodanie i rozmieszczenie elementów w GridPane

/*
        gridPane.getChildren().addAll(loginLabel,loginTextField,passwordLabel,passwordTextField,rememberMeCheckBox,loginButton);

        GridPane.setConstraints(loginLabel,0,0);
        GridPane.setConstraints(loginTextField,0,1);
        GridPane.setConstraints(passwordLabel,0,2);
        GridPane.setConstraints(passwordTextField,0,3);
        GridPane.setConstraints(rememberMeCheckBox,0,4,1,1, HPos.LEFT, VPos.CENTER);
        GridPane.setConstraints(loginButton,0,5,1,1, HPos.RIGHT, VPos.CENTER);
*/

        //Metoda 2 na dodanie i rozmieszczenie elementów w GridPane
        gridPane.addColumn(0, loginLabel, loginTextField, passwordLabel, passwordTextField, rememberMeCheckBox, loginButton);


        ColumnConstraints col1 = new ColumnConstraints(300);
        gridPane.getColumnConstraints().add(col1);

        RowConstraints row1 = new RowConstraints(50);
        row1.setValignment(VPos.BOTTOM);
        gridPane.getRowConstraints().add(row1);

        RowConstraints row2 = new RowConstraints(50);
        row2.setValignment(VPos.TOP);
        gridPane.getRowConstraints().add(row2);

        RowConstraints row3 = new RowConstraints(50);
        row3.setValignment(VPos.BOTTOM);
        gridPane.getRowConstraints().add(row3);

        RowConstraints row4 = new RowConstraints(50);
        row4.setValignment(VPos.TOP);
        gridPane.getRowConstraints().add(row4);

        RowConstraints row5 = new RowConstraints(50);
        gridPane.getRowConstraints().add(row5);

        RowConstraints row6 = new RowConstraints(50);
        gridPane.getRowConstraints().add(row6);

        GridPane.setHalignment(rememberMeCheckBox, HPos.LEFT);
        GridPane.setHalignment(loginButton, HPos.RIGHT);

        Scene scene = new Scene(gridPane);
        stage.setTitle("GridPane w JavaFx");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}