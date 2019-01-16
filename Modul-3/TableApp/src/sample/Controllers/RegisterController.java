package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import sample.JavaToMySQL.User;
import sample.Window;

import javax.swing.*;

public class RegisterController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BackButton;

    @FXML
    private PasswordField PasswordLabel;

    @FXML
    private TextField NameLabel;

    @FXML
    private Button registerButton;

    @FXML
    private TextField LoginLabel;

    @FXML
    void initialize() {

        BackButton.setOnAction(Event -> {
            registerButton.getScene().getWindow().hide();
            Window window = new Window();
            window.callLogoWindow();
        });

        registerButton.setOnAction(event -> {

            String nameText = NameLabel.getText().trim();
            String loginText = LoginLabel.getText().trim();
            String passwordText = PasswordLabel.getText().trim();

            if (nameText.equals("") || loginText.equals("") || passwordText.equals("")) {
                JOptionPane.showMessageDialog(null, "Какое-то поле не заполненно, попробуй еще раз");
            } else {
                User user = new User();
                boolean successRegister = user.registerUser(nameText, loginText, passwordText);

                if (successRegister == true){
                registerButton.getScene().getWindow().hide();
                Window window = new Window();
                window.callLogoWindow();
                }
            }
        });

    }
}
