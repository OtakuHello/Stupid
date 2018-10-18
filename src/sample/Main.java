package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {
    DictionaryManagement a= new DictionaryManagement();
    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, 790, 560);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setTitle("DICTIONARY");
        primaryStage.setScene(scene);
        primaryStage.show();
        TextField a = new TextField();
        a.getText();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private class DictionaryManagement {
    }
}