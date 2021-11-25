package com.globema;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private StringProperty propertyTextField = new SimpleStringProperty(this,"nameProperty","John Snow");

    public StringProperty getPropertyTextField() {
        return propertyTextField;
    }

    public void setPropertyTextField(String propertyTextField) {
        this.propertyTextField.set(propertyTextField);
    }
}
