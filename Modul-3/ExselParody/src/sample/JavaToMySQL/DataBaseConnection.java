package sample.JavaToMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    Connection connection = getDbConnection();

    public Connection getDbConnection() {
        Properties properties = new Properties();

        System.out.println("Connecting database...");
        try {
            Connection dbConnection = DriverManager.getConnection(
                    properties.getURL(),
                    properties.getUSER(),
                    properties.getPASSWORD());

            System.out.println("Success");
            return dbConnection;

        } catch (SQLException e) {
            System.out.println("Error: Connection is failed");
            e.printStackTrace();
            return null;
        }
    }






}
