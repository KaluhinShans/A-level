package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Controllers.AppController;
import sample.Controllers.ChoiceTableController;
import sample.Controllers.NewTableController;
import sample.JavaToMySQL.User;

import java.io.IOException;

public class Window {

    public void callRegisterWindow ()  {
        String resource = "/sample/FxmlFiles/Register.fxml";
        openWindowAndGetLoader(resource);
    }

    public void callLogoWindow(){
        String resource = "/sample/FxmlFiles/Logo.fxml";
        openWindowAndGetLoader(resource);
    }

    public void callChoiceTableWindow(User user){
        String resource = "/sample/FxmlFiles/ChoiceTable.fxml";
        FXMLLoader loader = openWindowAndGetLoader(resource);
        ChoiceTableController ctc = loader.getController();
        ctc.setUser(user);
    }

    public void callAppWindow(User user){
        String resource = "/sample/FxmlFiles/App.fxml";
        FXMLLoader loader = openWindowAndGetLoader(resource);
        AppController appController = loader.getController();
        appController.setUser(user);
    }

    public void callNewTableWindow(User user){
        String resource = "/sample/FxmlFiles/NewTable.fxml";
        FXMLLoader loader = openWindowAndGetLoader(resource);
        NewTableController ntc = loader.getController();
        ntc.setUser(user);
}

private FXMLLoader openWindowAndGetLoader(String resource){
    FXMLLoader loader = new FXMLLoader();

    loader.setLocation(getClass().getResource(resource));
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
    return loader;

}

}
