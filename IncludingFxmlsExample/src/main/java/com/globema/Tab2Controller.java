package com.globema;

import javafx.fxml.FXML;

public class Tab2Controller {

    private String messageTab2 = "Tak, to jest Tab2 Controller!";

    public String getMessageTab2() {
        return messageTab2;
    }

    public void setMessageTab2(String messageTab2) {
        this.messageTab2 = messageTab2;
    }

    @FXML
    public void writeMessage() {
        System.out.println(messageTab2);
    }
}
