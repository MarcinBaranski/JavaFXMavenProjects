package com.globema;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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


    private BooleanProperty checkBoxProperty = new SimpleBooleanProperty();

    @FXML
    public void initialize() {

        //Bindowanie elementu confirmCheckBox z booleanProperty o nazwie checkBoxProperty
        confirmCheckBox.selectedProperty().bindBidirectional(checkBoxProperty);

        //Listener dodanu klasę anonimową (observable - odwołanie do podpiętego propertisa (czyli nameTExtField),
        //s - stara wartość, t1 - nowa wartość)
        nameTextField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                System.out.println("Stara wartość pola: " + s);
                System.out.println("nowa wartość pola: " + t1);

                if (t1.isEmpty()){
                    surnameTextField.setText("");
                }
            }
        });

        //Listener dodanu poprzez lambdę
        surnameTextField.focusedProperty().addListener((observableValue, oldValue, newValue) -> {
            if (newValue) {
                System.out.println("Jesteś w polu nazwisko.");
            } else {
                System.out.println("Byłeś w polu nazwisko.");
            }
        });

        //Listener dodanu poprzez własną metodę statyczną zdefiniowana w danej klasie
        yearTextField.textProperty().addListener(Controller::yearTextFieldListener);


        //Dodanie listenera na properties zdefiniowany w klasie bez podłączenia go do pola na formatce

        checkBoxProperty.addListener((observableValue, oldValue, newValue) ->
        {
            if(newValue){
                System.out.println("Zaznaczono");
            }else{
                System.out.println("Odznaczono");
            }
        });

    }


    //Własna metoda obsługująca zdarzenia Listenera o paramterach takich jak w przypadku podejścia z klasą anonimową
    private static void yearTextFieldListener(ObservableValue<? extends String> observableValue, String s, String t1) {
        System.out.println("Tutaj " + observableValue);
        System.out.println("Nowa wartość: " + t1);
    }
}
