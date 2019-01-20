package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.JavaToMySQL.User;
import sample.Window;

import javax.swing.*;

public class LogoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField PasswordLable;

    @FXML
    private Button registerButton;

    @FXML
    private TextField LoginLabel;

    @FXML
    private Button signUpButton;

    @FXML
    void initialize() {
        signUpButton.setOnAction(event -> {

            String loginText = LoginLabel.getText().trim();
            String passwordText = PasswordLable.getText().trim();

            if (loginText.equals("") || passwordText.equals("")) {
                JOptionPane.showMessageDialog(null, "Какое-то поле не заполненно, попробуй еще раз");
            } else {
                User user = new User();
                user.setLogin(loginText);
                user.setPassword(passwordText);

                if (user.signUpUser() == true) {

                    registerButton.getScene().getWindow().hide();
                    Window window = new Window();
                    window.callChoiceTableWindow(user);

                } else {
                    JOptionPane.showMessageDialog(null, "Упс... Пользователь не найден...");
                }
            }
        });


        registerButton.setOnAction(event -> {
            registerButton.getScene().getWindow().hide();
            Window window = new Window();
            window.callRegisterWindow();
        });

    }

}
