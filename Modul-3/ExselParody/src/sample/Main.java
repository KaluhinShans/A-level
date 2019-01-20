package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("FxmlFiles/Logo.fxml"));
        primaryStage.setTitle("Table App");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
