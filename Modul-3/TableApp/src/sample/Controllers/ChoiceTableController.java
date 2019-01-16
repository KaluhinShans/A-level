package sample.Controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import sample.JavaToMySQL.Const;
import sample.JavaToMySQL.DataBaseConnection;
import sample.JavaToMySQL.Table;
import sample.JavaToMySQL.User;
import sample.Window;

import javax.swing.*;


public class ChoiceTableController {
    private DataBaseConnection dataBaseConnection = new DataBaseConnection();

    private User user = new User();

    public void setUser(User user) {
        this.user = user;
        if (user.getName() != null) {
            editNameLabel.setText(user.getName());
        }
        updateComboBox();
    }

    @FXML
    void initialize() {

        deleteTable.setOnAction(event -> {
            Table table = new Table();
            table.setName(choiceTableBox.getValue());
            table.deleteTable(user);
            updateComboBox();
        });

        addTable.setOnAction(event -> {
            addTable.getScene().getWindow().hide();
            Window window = new Window();
            window.callNewTableWindow(user);
        });

        joinInAppButton.setOnAction(event -> {
            String nameTable = choiceTableBox.getValue();
            if(nameTable != null) {
                user.table.setName(nameTable);
                joinInAppButton.getScene().getWindow().hide();
                Window window = new Window();
                window.callAppWindow(user);
            }else{
                JOptionPane.showMessageDialog(null, "Таблица не выбранна, или поврежденна");
            }
        });

    }

    @FXML
    private ComboBox<String> choiceTableBox;

    @FXML
    private Button joinInAppButton;

    @FXML
    private Button addTable;

    @FXML
    private Button deleteTable;

    @FXML
    private Label editNameLabel;



    public void updateComboBox() {
        choiceTableBox.getItems().clear();

        String select = "SELECT (" + Const.TABLES_NAME + ") FROM " + Const.TABLE_TABLES + " WHERE " +
                Const.TABLES_OWNER_LOGIN + "=?";

        try {
            PreparedStatement prStm = dataBaseConnection.getDbConnection().prepareStatement(select);
            prStm.setString(1, user.getLogin());

            ResultSet rs = prStm.executeQuery();

            while (rs.next()) {
                choiceTableBox.getItems().addAll(rs.getString(Const.TABLES_NAME));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}