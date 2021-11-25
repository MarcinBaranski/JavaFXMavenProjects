import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TextField textField = new TextField();
        CheckBox checkBox = new CheckBox("Zapamiętaj");
        Button button1 = new Button("Zapisz");
        Button button2 = new Button("Anuluj");

        AnchorPane anchorPane = new AnchorPane();

        anchorPane.setPrefHeight(300);
        anchorPane.setPrefWidth(500);

        anchorPane.getChildren().addAll(textField,checkBox,button1,button2);

        AnchorPane.setTopAnchor(textField,10.0);
        AnchorPane.setLeftAnchor(textField,10.0);
        AnchorPane.setRightAnchor(textField,10.0);
        AnchorPane.setBottomAnchor(textField,40.0);

        AnchorPane.setLeftAnchor(checkBox,10.0);
        AnchorPane.setBottomAnchor(checkBox,10.0);

        AnchorPane.setRightAnchor(button1,10.0);
        AnchorPane.setBottomAnchor(button1,10.0);

        AnchorPane.setRightAnchor(button2,70.0);
        AnchorPane.setBottomAnchor(button2,10.0);



        Scene scene = new Scene(anchorPane);
        stage.setTitle("AnchorPane Example");
        stage.setScene(scene);
        stage.show();
    }
}
