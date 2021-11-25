package com.globema.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuController {

    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    public void runApplication() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/AppScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AppController appController = loader.getController();
        appController.setMainController(mainController);

        mainController.setScene(pane);
    }

    @FXML
    public void openOptions() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/OptionsScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        OptionsController optionsController = loader.getController();
        optionsController.setMainController(mainController);
        mainController.setScene(pane);
    }

    @FXML
    public void exit() {
        Platform.exit();
    }

}
