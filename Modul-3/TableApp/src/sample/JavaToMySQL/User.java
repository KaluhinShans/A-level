package sample.JavaToMySQL;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private DataBaseConnection dataBaseConnection = new DataBaseConnection();

    String name;
    String login;
    String password;

    public Table table = new Table();

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean registerUser(String name, String login, String password) {

        if(searchUser(login) == true){
            JOptionPane.showMessageDialog(null, "Пользователь с таким логином уже существует");
            return false;
        }else {

            String insert = "INSERT INTO " + Const.TABLE_USERS + "(" +
                    Const.USERS_NAME + "," +
                    Const.USERS_LOGIN + "," +
                    Const.USERS_PASSWORD + ")" +
                    "VALUES(?,?,?)";

            try {
                PreparedStatement prStm = dataBaseConnection.getDbConnection().prepareStatement(insert);
                prStm.setString(1, name);
                prStm.setString(2, login);
                prStm.setString(3, password);
                prStm.executeUpdate();
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
    }


    public boolean signUpUser() {

        String select = "SELECT * FROM " + Const.TABLE_USERS + " WHERE " +
                Const.USERS_LOGIN + "=? AND " +
                Const.USERS_PASSWORD + "=?";

        try {
            PreparedStatement prStm = dataBaseConnection.getDbConnection().prepareStatement(select);
            prStm.setString(1, login);
            prStm.setString(2, password);

            ResultSet rs = prStm.executeQuery();

            while (rs.next()){
                this.name = rs.getString(Const.USERS_NAME);
            }
            boolean result = prStm.executeQuery().next();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean searchUser(String login){

        String select = "SELECT * FROM " + Const.TABLE_USERS + " WHERE " +
                Const.USERS_LOGIN + "= ?";

        try {
            PreparedStatement prStm = dataBaseConnection.getDbConnection().prepareStatement(select);
            prStm.setString(1, login);

            boolean result = prStm.executeQuery().next();
            System.out.println(result);
            return result;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }
}

