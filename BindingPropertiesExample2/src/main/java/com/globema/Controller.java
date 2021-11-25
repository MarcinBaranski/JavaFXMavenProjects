package com.globema;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class Controller {
    @FXML
    private TextField nameTextField;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField surnameTextField;

    @FXML
    private Label surnameLabel;

    @FXML
    private TextField yearTextField;

    @FXML
    private Label ageLabel;

    @FXML
    private CheckBox confirmCheckBox;

    @FXML
    private Button loginButton;

    private PersonViewModel personViewModel = new PersonViewModel();

    @FXML
    public void initialize() {

        nameTextField.textProperty().bindBidirectional(personViewModel.getNameProperty());
        surnameTextField.textProperty().bindBidirectional(personViewModel.getSurnameProperty());
        surnameTextField.disableProperty().bindBidirectional(personViewModel.getDisableSurnameProperty());

        //Pole rok urodzenia
        StringConverter converter = new NumberStringConverter();
        yearTextField.textProperty().bindBidirectional(personViewModel.getYearProperty(), converter);


        confirmCheckBox.selectedProperty().bindBidirectional(personViewModel.getConfirmProperty());

        //age label
        ageLabel.textProperty().bind(personViewModel.getAgeProperty());

        nameLabel.visibleProperty().bind(personViewModel.getNameOkProperty());
        surnameLabel.visibleProperty().bind(personViewModel.getSurnameOkProperty());

        loginButton.disableProperty().bind(personViewModel.getButtonProperty());
    }
}
