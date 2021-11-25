package com.globema;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ListChangeListener.Change;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    private ComboBox<Person> comboBox;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField surnameTextField;

    @FXML
    private Button addButton;

    @FXML
    private Button removeButton;

    private ObservableList<Person> personList;

    private ListProperty<Person> listProperty;

    private Person person;

    @FXML
    public void initialize() {

        List<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("John", "Rambo"));
        arrayList.add(new Person("Steven", "Seagal"));
        arrayList.add(new Person("Chuck", "Norris"));
        arrayList.add(new Person("John", "Snow"));

        personList = FXCollections.observableArrayList(arrayList);

        // List Properties który będzie zbindowany z comboboxem i ObservableList
        listProperty = new SimpleListProperty<>();
        listProperty.set(personList);

        comboBox.itemsProperty().bindBidirectional(listProperty);

        personList.addListener(Controller::onChange);
    }

    @FXML
    private void addPerson() {
        person = new Person(nameTextField.getText(), surnameTextField.getText());
        personList.add(person);
        System.out.println(personList);

    }

    @FXML
    private void deletePerson() {

        Person person = comboBox.getSelectionModel().getSelectedItem();
        personList.remove(person);
        System.out.println(personList);

    }

    //Metoda Listenera do listy
    private static void onChange(Change change){


        while (change.next()){
            if (change.wasRemoved()){
                System.out.println("Element został usunięty.");
            }else if (change.wasAdded()){
                System.out.println("Element został dodany.");
            }
        }
    }
}
