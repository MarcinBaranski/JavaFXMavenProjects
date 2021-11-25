package com.globema.controllers;

import javafx.fxml.FXML;

public class OptionsController {
    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    public void backToMenu(){
        mainController.loadMenuScreen();
    }
}
