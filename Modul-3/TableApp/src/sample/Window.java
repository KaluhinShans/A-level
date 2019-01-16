package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import sample.Controllers.AppController;
import sample.Controllers.ChoiceTableController;
import sample.Controllers.NewTableController;
import sample.JavaToMySQL.User;

import java.io.IOException;

public class Window {

    public void callRegisterWindow ()  {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/sample/FxmlFiles/Register.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

    public void callLogoWindow(){
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/sample/FxmlFiles/Logo.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();

    }

    public void callChoiceTableWindow(User user){
       FXMLLoader loader = new FXMLLoader();


        loader.setLocation(getClass().getResource("/sample/FxmlFiles/ChoiceTable.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ChoiceTableController ctc = loader.getController();
        ctc.setUser(user);
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void callAppWindow(User user){
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/sample/FxmlFiles/App.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AppController appController = loader.getController();
        appController.setUser(user);
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();


    }

    public void callNewTableWindow(User user){
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/sample/FxmlFiles/NewTable.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        NewTableController ntc = loader.getController();
        ntc.setUser(user);
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }
}
