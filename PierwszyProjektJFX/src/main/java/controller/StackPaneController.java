package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;

public class StackPaneController {

    @FXML
    private Button button1;
    @FXML
    private Button button2;

    public StackPaneController() {
        System.out.println("Cześć tu kontroler.");
    }

    @FXML
    public void initialize() {
        button1.setText("Nowa nazwa przycisku");

        //handler eventu z poziomu Javy
        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("To jest handler");
            }
        };
        button2.addEventHandler(ActionEvent.ACTION, handler);

        //Handler eventu najechania myszą z poziomu Javy
        /*
        EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("To jest mouse handler");
            }
        };
        */
        // Handler eventu najechania myszą z poziomu Lambdy Java
        EventHandler<MouseEvent> mouseLambdaHandler = e -> {
            System.out.println("To jest mouse handler Lambda");
        };
        button2.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseLambdaHandler);

        //Dodanie handlera eventu poprzez lambę i metody setOn z JavyFx
        button2.setOnAction(actionEvent -> {
            System.out.println("To jest handler z lambdą i setOnAction");
        });
    }

    @FXML
    public void onActionButton1(ActionEvent e) {
        System.out.println("Tutaj metoda onActionButton1 - " + e.getSource());

        if (e.getSource() instanceof CheckBox) {
            System.out.println("Dodatkowa informacja od CheckBox.");
        }
    }


}
