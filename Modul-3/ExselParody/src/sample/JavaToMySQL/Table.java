package sample.JavaToMySQL;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Table {

    private DataBaseConnection dataBaseConnection = new DataBaseConnection();
    private Connection connection = dataBaseConnection.getDbConnection();

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void registerTable(String name, User user) {

        String insert = "INSERT INTO " + Const.TABLE_TABLES + "(" +
                Const.TABLES_NAME + "," +
                Const.TABLES_OWNER_LOGIN + ")" +
                "VALUES(?,?)";

        try {
            PreparedStatement prStm = connection.prepareStatement(insert);
            prStm.setString(1, name);
            prStm.setString(2, user.getLogin());
            prStm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTable(User user) {
        if (name == null) {
            JOptionPane.showMessageDialog(null, "Таблица не выбранна");
        } else {
            String deleted = "DELETE FROM " + Const.TABLE_TABLES + " WHERE "
                    + Const.TABLES_NAME + "=? AND " + Const.TABLES_OWNER_LOGIN + "=?";

            try {
                deleteColumns(user);
                PreparedStatement prStm = connection.prepareStatement(deleted);
                prStm.setString(1, name);
                prStm.setString(2, user.getLogin());
                prStm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Таблица " + name + " удаленна");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void deleteColumns(User user) throws SQLException{

        for (int i = 1; i <= 10; i++) {
            String deleted = "DELETE FROM " + Const.TABLE_VBOX + i + " WHERE "
                    + Const.VBOX_TABLE_NAME + "=? AND " + Const.VBOX_OWNER_LOGIN + "=?";

            PreparedStatement prStm = connection.prepareStatement(deleted);
            prStm.setString(1, name);
            prStm.setString(2, user.getLogin());
            prStm.executeUpdate();
        }
    }

    public void saveColumn(String columnName, String text, String userLogin) {
        String[] subStr;
        subStr = columnName.split("_");
        String boxNumber = subStr[0].replaceAll("[^0-9?!\\.]", "");
        String columnNumber = subStr[2];

        String insert = "INSERT INTO " + Const.TABLE_VBOX + boxNumber + "(" +
                Const.VBOX_TABLE_NAME + "," +
                Const.VBOX_OWNER_LOGIN + "," +
                Const.VBOX_COLUMN + columnNumber + ")" +
                "VALUES(?,?,?) " + "ON DUPLICATE KEY UPDATE " +
                Const.VBOX_COLUMN + columnNumber + " = ?";

        try {
            PreparedStatement prStm = connection.prepareStatement(insert);
            prStm.setString(1, name);
            prStm.setString(2, userLogin);
            prStm.setString(3, text);
            prStm.setString(4, text);
            prStm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getColumn(int vBoxNumber, int columnNumber, String userLogin) {

        String select = "SELECT " + Const.VBOX_COLUMN + columnNumber +
                " FROM " + Const.TABLE_VBOX + vBoxNumber + " WHERE " +
                Const.VBOX_TABLE_NAME + "=? AND " +
                Const.VBOX_OWNER_LOGIN + "=?";

        try {
            PreparedStatement prStm = connection.prepareStatement(select);
            prStm.setString(1, name);
            prStm.setString(2, userLogin);

            if (prStm.executeQuery().next() == true) {
                ResultSet rs = prStm.executeQuery();
                while(rs.next()){
                    return rs.getString(Const.VBOX_COLUMN + columnNumber);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
