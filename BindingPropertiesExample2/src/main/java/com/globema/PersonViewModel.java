package com.globema;

import javafx.beans.binding.When;
import javafx.beans.property.*;

import java.time.LocalDate;

public class PersonViewModel {

    //NameTextField
    private StringProperty nameProperty = new SimpleStringProperty();

    //label name
    private BooleanProperty nameOkProperty = new SimpleBooleanProperty(false);

    //surname textField
    private StringProperty surnameProperty = new SimpleStringProperty();

    //wlącz/wyłącz pole surnameTextField
    private BooleanProperty disableSurnameProperty = new SimpleBooleanProperty(true);

    //surname TextField
    private BooleanProperty surnameOkProperty = new SimpleBooleanProperty(false);

    //year TextField
    private IntegerProperty yearProperty = new SimpleIntegerProperty();

    //CheckBox
    private BooleanProperty confirmProperty = new SimpleBooleanProperty(false);

    //Obliczony Wiek - label
    private StringProperty ageProperty = new SimpleStringProperty();

    //przycisk
    private BooleanProperty buttonProperty = new SimpleBooleanProperty(false);

    //Akutalny rok property
    private IntegerProperty actualYearProperty = new SimpleIntegerProperty(LocalDate.now().getYear());

    public PersonViewModel() {
        nameOkProperty.bind(nameProperty.isNotEmpty());
        surnameOkProperty.bind(surnameProperty.isNotEmpty());
        disableSurnameProperty.bind(nameProperty.isEmpty());
        buttonProperty.bind(confirmProperty.not());
        ageProperty.bind(new When(yearProperty.isNotEqualTo(0))
                .then(actualYearProperty.subtract(yearProperty).asString())
                .otherwise(""));

    }

    public StringProperty getNameProperty() {
        return nameProperty;
    }

    public void setNameProperty(StringProperty nameProperty) {
        this.nameProperty = nameProperty;
    }

    public BooleanProperty getNameOkProperty() {
        return nameOkProperty;
    }

    public void setNameOkProperty(BooleanProperty nameOkProperty) {
        this.nameOkProperty = nameOkProperty;
    }

    public StringProperty getSurnameProperty() {
        return surnameProperty;
    }

    public void setSurnameProperty(StringProperty surnameProperty) {
        this.surnameProperty = surnameProperty;
    }


    public BooleanProperty getDisableSurnameProperty() {
        return disableSurnameProperty;
    }

    public void setDisableSurnameProperty(BooleanProperty disableSurnameProperty) {
        this.disableSurnameProperty = disableSurnameProperty;
    }

    public BooleanProperty getSurnameOkProperty() {
        return surnameOkProperty;
    }

    public void setSurnameOkProperty(BooleanProperty surnameOkProperty) {
        this.surnameOkProperty = surnameOkProperty;
    }

    public IntegerProperty getYearProperty() {
        return yearProperty;
    }

    public void setYearProperty(IntegerProperty yearProperty) {
        this.yearProperty = yearProperty;
    }

    public BooleanProperty getConfirmProperty() {
        return confirmProperty;
    }

    public void setConfirmProperty(BooleanProperty confirmProperty) {
        this.confirmProperty = confirmProperty;
    }

    public StringProperty getAgeProperty() {
        return ageProperty;
    }

    public void setAgeProperty(StringProperty ageProperty) {
        this.ageProperty = ageProperty;
    }


    public BooleanProperty getButtonProperty() {
        return this.buttonProperty;
    }

    public void setButtonProperty(BooleanProperty buttonProperty) {
        this.buttonProperty = buttonProperty;
    }

    public IntegerProperty getActualYearProperty() {
        return actualYearProperty;
    }

    public void setActualYearProperty(IntegerProperty actualYearProperty) {
        this.actualYearProperty = actualYearProperty;
    }
}
