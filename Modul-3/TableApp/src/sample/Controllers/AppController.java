package sample.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.JavaToMySQL.User;
import sample.Window;

import javax.swing.*;
import java.util.HashSet;

public class AppController {

    HashSet<TextField> needToSaveColum = new HashSet<>();
    private User user = new User();

    public void setUser(User user) {
        this.user = user;
        if (user.table.getName() != null) {
            editTableName.setText(user.table.getName());
        }
        updateColumns();
    }


    @FXML
    void initialize() {

        SaveTable.setOnAction(event -> {
            for (TextField dd : needToSaveColum) {

                user.table.saveColumn(dd.getId(), dd.getText(), user.getLogin());

            }
            JOptionPane.showMessageDialog(null, "Успех!");

        });

        backButton.setOnAction(event -> {
            backButton.getScene().getWindow().hide();
            Window window = new Window();
            window.callChoiceTableWindow(user);
        });

        VB1_Column_1.setOnMouseClicked(event -> needToSaveColum.add(VB1_Column_1));
        VB1_Column_2.setOnMouseClicked(event -> needToSaveColum.add(VB1_Column_2));
        VB1_Column_3.setOnMouseClicked(event -> needToSaveColum.add(VB1_Column_3));
        VB1_Column_4.setOnMouseClicked(event -> needToSaveColum.add(VB1_Column_4));
        VB1_Column_5.setOnMouseClicked(event -> needToSaveColum.add(VB1_Column_5));
        VB1_Column_6.setOnMouseClicked(event -> needToSaveColum.add(VB1_Column_6));
        VB1_Column_7.setOnMouseClicked(event -> needToSaveColum.add(VB1_Column_7));
        VB1_Column_8.setOnMouseClicked(event -> needToSaveColum.add(VB1_Column_8));
        VB1_Column_9.setOnMouseClicked(event -> needToSaveColum.add(VB1_Column_9));
        VB1_Column_10.setOnMouseClicked(event -> needToSaveColum.add(VB1_Column_10));

        VB2_Column_1.setOnMouseClicked(event -> needToSaveColum.add(VB2_Column_1));
        VB2_Column_2.setOnMouseClicked(event -> needToSaveColum.add(VB2_Column_2));
        VB2_Column_3.setOnMouseClicked(event -> needToSaveColum.add(VB2_Column_3));
        VB2_Column_4.setOnMouseClicked(event -> needToSaveColum.add(VB2_Column_4));
        VB2_Column_5.setOnMouseClicked(event -> needToSaveColum.add(VB2_Column_5));
        VB2_Column_6.setOnMouseClicked(event -> needToSaveColum.add(VB2_Column_6));
        VB2_Column_7.setOnMouseClicked(event -> needToSaveColum.add(VB2_Column_7));
        VB2_Column_8.setOnMouseClicked(event -> needToSaveColum.add(VB2_Column_8));
        VB2_Column_9.setOnMouseClicked(event -> needToSaveColum.add(VB2_Column_9));
        VB2_Column_10.setOnMouseClicked(event -> needToSaveColum.add(VB2_Column_10));

        VB3_Column_1.setOnMouseClicked(event -> needToSaveColum.add(VB3_Column_1));
        VB3_Column_2.setOnMouseClicked(event -> needToSaveColum.add(VB3_Column_2));
        VB3_Column_3.setOnMouseClicked(event -> needToSaveColum.add(VB3_Column_3));
        VB3_Column_4.setOnMouseClicked(event -> needToSaveColum.add(VB3_Column_4));
        VB3_Column_5.setOnMouseClicked(event -> needToSaveColum.add(VB3_Column_5));
        VB3_Column_6.setOnMouseClicked(event -> needToSaveColum.add(VB3_Column_6));
        VB3_Column_7.setOnMouseClicked(event -> needToSaveColum.add(VB3_Column_7));
        VB3_Column_8.setOnMouseClicked(event -> needToSaveColum.add(VB3_Column_8));
        VB3_Column_9.setOnMouseClicked(event -> needToSaveColum.add(VB3_Column_9));
        VB3_Column_10.setOnMouseClicked(event -> needToSaveColum.add(VB3_Column_10));

        VB4_Column_1.setOnMouseClicked(event -> needToSaveColum.add(VB4_Column_1));
        VB4_Column_2.setOnMouseClicked(event -> needToSaveColum.add(VB4_Column_2));
        VB4_Column_3.setOnMouseClicked(event -> needToSaveColum.add(VB4_Column_3));
        VB4_Column_4.setOnMouseClicked(event -> needToSaveColum.add(VB4_Column_4));
        VB4_Column_5.setOnMouseClicked(event -> needToSaveColum.add(VB4_Column_5));
        VB4_Column_6.setOnMouseClicked(event -> needToSaveColum.add(VB4_Column_6));
        VB4_Column_7.setOnMouseClicked(event -> needToSaveColum.add(VB4_Column_7));
        VB4_Column_8.setOnMouseClicked(event -> needToSaveColum.add(VB4_Column_8));
        VB4_Column_9.setOnMouseClicked(event -> needToSaveColum.add(VB4_Column_9));
        VB4_Column_10.setOnMouseClicked(event -> needToSaveColum.add(VB4_Column_10));

        VB5_Column_1.setOnMouseClicked(event -> needToSaveColum.add(VB5_Column_1));
        VB5_Column_2.setOnMouseClicked(event -> needToSaveColum.add(VB5_Column_2));
        VB5_Column_3.setOnMouseClicked(event -> needToSaveColum.add(VB5_Column_3));
        VB5_Column_4.setOnMouseClicked(event -> needToSaveColum.add(VB5_Column_4));
        VB5_Column_5.setOnMouseClicked(event -> needToSaveColum.add(VB5_Column_5));
        VB5_Column_6.setOnMouseClicked(event -> needToSaveColum.add(VB5_Column_6));
        VB5_Column_7.setOnMouseClicked(event -> needToSaveColum.add(VB5_Column_7));
        VB5_Column_8.setOnMouseClicked(event -> needToSaveColum.add(VB5_Column_8));
        VB5_Column_9.setOnMouseClicked(event -> needToSaveColum.add(VB5_Column_9));
        VB5_Column_10.setOnMouseClicked(event -> needToSaveColum.add(VB5_Column_10));

        VB6_Column_1.setOnMouseClicked(event -> needToSaveColum.add(VB6_Column_1));
        VB6_Column_2.setOnMouseClicked(event -> needToSaveColum.add(VB6_Column_2));
        VB6_Column_3.setOnMouseClicked(event -> needToSaveColum.add(VB6_Column_3));
        VB6_Column_4.setOnMouseClicked(event -> needToSaveColum.add(VB6_Column_4));
        VB6_Column_5.setOnMouseClicked(event -> needToSaveColum.add(VB6_Column_5));
        VB6_Column_6.setOnMouseClicked(event -> needToSaveColum.add(VB6_Column_6));
        VB6_Column_7.setOnMouseClicked(event -> needToSaveColum.add(VB6_Column_7));
        VB6_Column_8.setOnMouseClicked(event -> needToSaveColum.add(VB6_Column_8));
        VB6_Column_9.setOnMouseClicked(event -> needToSaveColum.add(VB6_Column_9));
        VB6_Column_10.setOnMouseClicked(event -> needToSaveColum.add(VB6_Column_10));

        VB7_Column_1.setOnMouseClicked(event -> needToSaveColum.add(VB7_Column_1));
        VB7_Column_2.setOnMouseClicked(event -> needToSaveColum.add(VB7_Column_2));
        VB7_Column_3.setOnMouseClicked(event -> needToSaveColum.add(VB7_Column_3));
        VB7_Column_4.setOnMouseClicked(event -> needToSaveColum.add(VB7_Column_4));
        VB7_Column_5.setOnMouseClicked(event -> needToSaveColum.add(VB7_Column_5));
        VB7_Column_6.setOnMouseClicked(event -> needToSaveColum.add(VB7_Column_6));
        VB7_Column_7.setOnMouseClicked(event -> needToSaveColum.add(VB7_Column_7));
        VB7_Column_8.setOnMouseClicked(event -> needToSaveColum.add(VB7_Column_8));
        VB7_Column_9.setOnMouseClicked(event -> needToSaveColum.add(VB7_Column_9));
        VB7_Column_10.setOnMouseClicked(event -> needToSaveColum.add(VB7_Column_10));

        VB8_Column_1.setOnMouseClicked(event -> needToSaveColum.add(VB8_Column_1));
        VB8_Column_2.setOnMouseClicked(event -> needToSaveColum.add(VB8_Column_2));
        VB8_Column_3.setOnMouseClicked(event -> needToSaveColum.add(VB8_Column_3));
        VB8_Column_4.setOnMouseClicked(event -> needToSaveColum.add(VB8_Column_4));
        VB8_Column_5.setOnMouseClicked(event -> needToSaveColum.add(VB8_Column_5));
        VB8_Column_6.setOnMouseClicked(event -> needToSaveColum.add(VB8_Column_6));
        VB8_Column_7.setOnMouseClicked(event -> needToSaveColum.add(VB8_Column_7));
        VB8_Column_8.setOnMouseClicked(event -> needToSaveColum.add(VB8_Column_8));
        VB8_Column_9.setOnMouseClicked(event -> needToSaveColum.add(VB8_Column_9));
        VB8_Column_10.setOnMouseClicked(event -> needToSaveColum.add(VB8_Column_10));

        VB9_Column_1.setOnMouseClicked(event -> needToSaveColum.add(VB9_Column_1));
        VB9_Column_2.setOnMouseClicked(event -> needToSaveColum.add(VB9_Column_2));
        VB9_Column_3.setOnMouseClicked(event -> needToSaveColum.add(VB9_Column_3));
        VB9_Column_4.setOnMouseClicked(event -> needToSaveColum.add(VB9_Column_4));
        VB9_Column_5.setOnMouseClicked(event -> needToSaveColum.add(VB9_Column_5));
        VB9_Column_6.setOnMouseClicked(event -> needToSaveColum.add(VB9_Column_6));
        VB9_Column_7.setOnMouseClicked(event -> needToSaveColum.add(VB9_Column_7));
        VB9_Column_8.setOnMouseClicked(event -> needToSaveColum.add(VB9_Column_8));
        VB9_Column_9.setOnMouseClicked(event -> needToSaveColum.add(VB9_Column_9));
        VB9_Column_10.setOnMouseClicked(event -> needToSaveColum.add(VB9_Column_10));

        VB10_Column_1.setOnMouseClicked(event -> needToSaveColum.add(VB10_Column_1));
        VB10_Column_2.setOnMouseClicked(event -> needToSaveColum.add(VB10_Column_2));
        VB10_Column_3.setOnMouseClicked(event -> needToSaveColum.add(VB10_Column_3));
        VB10_Column_4.setOnMouseClicked(event -> needToSaveColum.add(VB10_Column_4));
        VB10_Column_5.setOnMouseClicked(event -> needToSaveColum.add(VB10_Column_5));
        VB10_Column_6.setOnMouseClicked(event -> needToSaveColum.add(VB10_Column_6));
        VB10_Column_7.setOnMouseClicked(event -> needToSaveColum.add(VB10_Column_7));
        VB10_Column_8.setOnMouseClicked(event -> needToSaveColum.add(VB10_Column_8));
        VB10_Column_9.setOnMouseClicked(event -> needToSaveColum.add(VB10_Column_9));
        VB10_Column_10.setOnMouseClicked(event -> needToSaveColum.add(VB10_Column_10));
    }

    public void updateColumns() {

        VB1_Column_1.setText(user.table.getColumn(1, 1, user.getLogin()));
        VB1_Column_2.setText(user.table.getColumn(1, 2, user.getLogin()));
        VB1_Column_3.setText(user.table.getColumn(1, 3, user.getLogin()));
        VB1_Column_4.setText(user.table.getColumn(1, 4, user.getLogin()));
        VB1_Column_5.setText(user.table.getColumn(1, 5, user.getLogin()));
        VB1_Column_6.setText(user.table.getColumn(1, 6, user.getLogin()));
        VB1_Column_7.setText(user.table.getColumn(1, 7, user.getLogin()));
        VB1_Column_8.setText(user.table.getColumn(1, 8, user.getLogin()));
        VB1_Column_9.setText(user.table.getColumn(1, 9, user.getLogin()));
        VB1_Column_10.setText(user.table.getColumn(1,10, user.getLogin()));


        VB2_Column_1.setText(user.table.getColumn(2, 1, user.getLogin()));
        VB2_Column_2.setText(user.table.getColumn(2, 2, user.getLogin()));
        VB2_Column_3.setText(user.table.getColumn(2, 3, user.getLogin()));
        VB2_Column_4.setText(user.table.getColumn(2, 4, user.getLogin()));
        VB2_Column_5.setText(user.table.getColumn(2, 5, user.getLogin()));
        VB2_Column_6.setText(user.table.getColumn(2, 6, user.getLogin()));
        VB2_Column_7.setText(user.table.getColumn(2, 7, user.getLogin()));
        VB2_Column_8.setText(user.table.getColumn(2, 8, user.getLogin()));
        VB2_Column_9.setText(user.table.getColumn(2, 9, user.getLogin()));
        VB2_Column_10.setText(user.table.getColumn(2,10, user.getLogin()));


        VB3_Column_1.setText(user.table.getColumn(3, 1, user.getLogin()));
        VB3_Column_2.setText(user.table.getColumn(3, 2, user.getLogin()));
        VB3_Column_3.setText(user.table.getColumn(3, 3, user.getLogin()));
        VB3_Column_4.setText(user.table.getColumn(3, 4, user.getLogin()));
        VB3_Column_5.setText(user.table.getColumn(3, 5, user.getLogin()));
        VB3_Column_6.setText(user.table.getColumn(3, 6, user.getLogin()));
        VB3_Column_7.setText(user.table.getColumn(3, 7, user.getLogin()));
        VB3_Column_8.setText(user.table.getColumn(3, 8, user.getLogin()));
        VB3_Column_9.setText(user.table.getColumn(3, 9, user.getLogin()));
        VB3_Column_10.setText(user.table.getColumn(3,10, user.getLogin()));


        VB4_Column_1.setText(user.table.getColumn(4, 1, user.getLogin()));
        VB4_Column_2.setText(user.table.getColumn(4, 2, user.getLogin()));
        VB4_Column_3.setText(user.table.getColumn(4, 3, user.getLogin()));
        VB4_Column_4.setText(user.table.getColumn(4, 4, user.getLogin()));
        VB4_Column_5.setText(user.table.getColumn(4, 5, user.getLogin()));
        VB4_Column_6.setText(user.table.getColumn(4, 6, user.getLogin()));
        VB4_Column_7.setText(user.table.getColumn(4, 7, user.getLogin()));
        VB4_Column_8.setText(user.table.getColumn(4, 8, user.getLogin()));
        VB4_Column_9.setText(user.table.getColumn(4, 9, user.getLogin()));
        VB4_Column_10.setText(user.table.getColumn(4,10, user.getLogin()));


        VB5_Column_1.setText(user.table.getColumn(5, 1, user.getLogin()));
        VB5_Column_2.setText(user.table.getColumn(5, 2, user.getLogin()));
        VB5_Column_3.setText(user.table.getColumn(5, 3, user.getLogin()));
        VB5_Column_4.setText(user.table.getColumn(5, 4, user.getLogin()));
        VB5_Column_5.setText(user.table.getColumn(5, 5, user.getLogin()));
        VB5_Column_6.setText(user.table.getColumn(5, 6, user.getLogin()));
        VB5_Column_7.setText(user.table.getColumn(5, 7, user.getLogin()));
        VB5_Column_8.setText(user.table.getColumn(5, 8, user.getLogin()));
        VB5_Column_9.setText(user.table.getColumn(5, 9, user.getLogin()));
        VB5_Column_10.setText(user.table.getColumn(5,10, user.getLogin()));


        VB6_Column_1.setText(user.table.getColumn(6, 1, user.getLogin()));
        VB6_Column_2.setText(user.table.getColumn(6, 2, user.getLogin()));
        VB6_Column_3.setText(user.table.getColumn(6, 3, user.getLogin()));
        VB6_Column_4.setText(user.table.getColumn(6, 4, user.getLogin()));
        VB6_Column_5.setText(user.table.getColumn(6, 5, user.getLogin()));
        VB6_Column_6.setText(user.table.getColumn(6, 6, user.getLogin()));
        VB6_Column_7.setText(user.table.getColumn(6, 7, user.getLogin()));
        VB6_Column_8.setText(user.table.getColumn(6, 8, user.getLogin()));
        VB6_Column_9.setText(user.table.getColumn(6, 9, user.getLogin()));
        VB6_Column_10.setText(user.table.getColumn(6,10, user.getLogin()));


        VB7_Column_1.setText(user.table.getColumn(7, 1, user.getLogin()));
        VB7_Column_2.setText(user.table.getColumn(7, 2, user.getLogin()));
        VB7_Column_3.setText(user.table.getColumn(7, 3, user.getLogin()));
        VB7_Column_4.setText(user.table.getColumn(7, 4, user.getLogin()));
        VB7_Column_5.setText(user.table.getColumn(7, 5, user.getLogin()));
        VB7_Column_6.setText(user.table.getColumn(7, 6, user.getLogin()));
        VB7_Column_7.setText(user.table.getColumn(7, 7, user.getLogin()));
        VB7_Column_8.setText(user.table.getColumn(7, 8, user.getLogin()));
        VB7_Column_9.setText(user.table.getColumn(7, 9, user.getLogin()));
        VB7_Column_10.setText(user.table.getColumn(7,10, user.getLogin()));


        VB8_Column_1.setText(user.table.getColumn(8, 1, user.getLogin()));
        VB8_Column_2.setText(user.table.getColumn(8, 2, user.getLogin()));
        VB8_Column_3.setText(user.table.getColumn(8, 3, user.getLogin()));
        VB8_Column_4.setText(user.table.getColumn(8, 4, user.getLogin()));
        VB8_Column_5.setText(user.table.getColumn(8, 5, user.getLogin()));
        VB8_Column_6.setText(user.table.getColumn(8, 6, user.getLogin()));
        VB8_Column_7.setText(user.table.getColumn(8, 7, user.getLogin()));
        VB8_Column_8.setText(user.table.getColumn(8, 8, user.getLogin()));
        VB8_Column_9.setText(user.table.getColumn(8, 9, user.getLogin()));
        VB8_Column_10.setText(user.table.getColumn(8,10, user.getLogin()));


        VB9_Column_1.setText(user.table.getColumn(9, 1, user.getLogin()));
        VB9_Column_2.setText(user.table.getColumn(9, 2, user.getLogin()));
        VB9_Column_3.setText(user.table.getColumn(9, 3, user.getLogin()));
        VB9_Column_4.setText(user.table.getColumn(9, 4, user.getLogin()));
        VB9_Column_5.setText(user.table.getColumn(9, 5, user.getLogin()));
        VB9_Column_6.setText(user.table.getColumn(9, 6, user.getLogin()));
        VB9_Column_7.setText(user.table.getColumn(9, 7, user.getLogin()));
        VB9_Column_8.setText(user.table.getColumn(9, 8, user.getLogin()));
        VB9_Column_9.setText(user.table.getColumn(9, 9, user.getLogin()));
        VB9_Column_10.setText(user.table.getColumn(9,10, user.getLogin()));


        VB10_Column_1.setText(user.table.getColumn(10, 1, user.getLogin()));
        VB10_Column_2.setText(user.table.getColumn(10, 2, user.getLogin()));
        VB10_Column_3.setText(user.table.getColumn(10, 3, user.getLogin()));
        VB10_Column_4.setText(user.table.getColumn(10, 4, user.getLogin()));
        VB10_Column_5.setText(user.table.getColumn(10, 5, user.getLogin()));
        VB10_Column_6.setText(user.table.getColumn(10, 6, user.getLogin()));
        VB10_Column_7.setText(user.table.getColumn(10, 7, user.getLogin()));
        VB10_Column_8.setText(user.table.getColumn(10, 8, user.getLogin()));
        VB10_Column_9.setText(user.table.getColumn(10, 9, user.getLogin()));
        VB10_Column_10.setText(user.table.getColumn(10,10, user.getLogin()));
    }

    @FXML
    private Button backButton;

    @FXML
    private Button SaveTable;

    @FXML
    private Label editTableName;

    @FXML
    private TextField VB1_Column_1;

    @FXML
    private TextField VB1_Column_2;

    @FXML
    private TextField VB1_Column_3;

    @FXML
    private TextField VB1_Column_4;

    @FXML
    private TextField VB1_Column_5;

    @FXML
    private TextField VB1_Column_6;

    @FXML
    private TextField VB1_Column_7;

    @FXML
    private TextField VB1_Column_8;

    @FXML
    private TextField VB1_Column_9;

    @FXML
    private TextField VB1_Column_10;

    @FXML
    private TextField VB2_Column_1;

    @FXML
    private TextField VB2_Column_2;

    @FXML
    private TextField VB2_Column_3;

    @FXML
    private TextField VB2_Column_4;

    @FXML
    private TextField VB2_Column_5;

    @FXML
    private TextField VB2_Column_6;

    @FXML
    private TextField VB2_Column_7;

    @FXML
    private TextField VB2_Column_8;

    @FXML
    private TextField VB2_Column_9;

    @FXML
    private TextField VB2_Column_10;

    @FXML
    private TextField VB3_Column_1;

    @FXML
    private TextField VB3_Column_2;

    @FXML
    private TextField VB3_Column_3;

    @FXML
    private TextField VB3_Column_4;

    @FXML
    private TextField VB3_Column_5;

    @FXML
    private TextField VB3_Column_6;

    @FXML
    private TextField VB3_Column_7;

    @FXML
    private TextField VB3_Column_8;

    @FXML
    private TextField VB3_Column_9;

    @FXML
    private TextField VB3_Column_10;

    @FXML
    private TextField VB4_Column_1;

    @FXML
    private TextField VB4_Column_2;

    @FXML
    private TextField VB4_Column_3;

    @FXML
    private TextField VB4_Column_4;

    @FXML
    private TextField VB4_Column_5;

    @FXML
    private TextField VB4_Column_6;

    @FXML
    private TextField VB4_Column_7;

    @FXML
    private TextField VB4_Column_8;

    @FXML
    private TextField VB4_Column_9;

    @FXML
    private TextField VB4_Column_10;

    @FXML
    private TextField VB5_Column_1;

    @FXML
    private TextField VB5_Column_2;

    @FXML
    private TextField VB5_Column_3;

    @FXML
    private TextField VB5_Column_4;

    @FXML
    private TextField VB5_Column_5;

    @FXML
    private TextField VB5_Column_6;

    @FXML
    private TextField VB5_Column_7;

    @FXML
    private TextField VB5_Column_8;

    @FXML
    private TextField VB5_Column_9;

    @FXML
    private TextField VB5_Column_10;

    @FXML
    private TextField VB6_Column_1;

    @FXML
    private TextField VB6_Column_2;

    @FXML
    private TextField VB6_Column_3;

    @FXML
    private TextField VB6_Column_4;

    @FXML
    private TextField VB6_Column_5;

    @FXML
    private TextField VB6_Column_6;

    @FXML
    private TextField VB6_Column_7;

    @FXML
    private TextField VB6_Column_8;

    @FXML
    private TextField VB6_Column_9;

    @FXML
    private TextField VB6_Column_10;

    @FXML
    private TextField VB7_Column_1;

    @FXML
    private TextField VB7_Column_2;

    @FXML
    private TextField VB7_Column_3;

    @FXML
    private TextField VB7_Column_4;

    @FXML
    private TextField VB7_Column_5;

    @FXML
    private TextField VB7_Column_6;

    @FXML
    private TextField VB7_Column_7;

    @FXML
    private TextField VB7_Column_8;

    @FXML
    private TextField VB7_Column_9;

    @FXML
    private TextField VB7_Column_10;

    @FXML
    private TextField VB8_Column_1;

    @FXML
    private TextField VB8_Column_2;

    @FXML
    private TextField VB8_Column_3;

    @FXML
    private TextField VB8_Column_4;

    @FXML
    private TextField VB8_Column_5;

    @FXML
    private TextField VB8_Column_6;

    @FXML
    private TextField VB8_Column_7;

    @FXML
    private TextField VB8_Column_8;

    @FXML
    private TextField VB8_Column_9;

    @FXML
    private TextField VB8_Column_10;

    @FXML
    private TextField VB9_Column_1;

    @FXML
    private TextField VB9_Column_2;

    @FXML
    private TextField VB9_Column_3;

    @FXML
    private TextField VB9_Column_4;

    @FXML
    private TextField VB9_Column_5;

    @FXML
    private TextField VB9_Column_6;

    @FXML
    private TextField VB9_Column_7;

    @FXML
    private TextField VB9_Column_8;

    @FXML
    private TextField VB9_Column_9;

    @FXML
    private TextField VB9_Column_10;

    @FXML
    private TextField VB10_Column_1;

    @FXML
    private TextField VB10_Column_2;

    @FXML
    private TextField VB10_Column_3;

    @FXML
    private TextField VB10_Column_4;

    @FXML
    private TextField VB10_Column_5;

    @FXML
    private TextField VB10_Column_6;

    @FXML
    private TextField VB10_Column_7;

    @FXML
    private TextField VB10_Column_8;

    @FXML
    private TextField VB10_Column_9;

    @FXML
    private TextField VB10_Column_10;


}
