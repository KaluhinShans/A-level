package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.JavaToMySQL.Table;
import sample.JavaToMySQL.User;
import sample.Window;

import javax.swing.*;

public class NewTableController {

    User user = new User();

    public void setUser(User user) {
        this.user = user;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button createdTableButton;

    @FXML
    private TextField nameTableLabel;

    @FXML
    void initialize() {


        createdTableButton.setOnAction(event -> {

            String name = nameTableLabel.getText().trim();
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Поле пустое, ты шо");
            } else {
                createdTableButton.getScene().getWindow().hide();
                Table table = new Table();
                table.registerTable(nameTableLabel.getText(), user);
                System.out.println(user.toString());
                Window window = new Window();
                window.callChoiceTableWindow(user);
            }


        });


    }


}
