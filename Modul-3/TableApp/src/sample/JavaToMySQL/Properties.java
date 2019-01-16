package sample.JavaToMySQL;

public class Properties {

    public final String URL = "jdbc:mysql://localhost:3306/orm_database"
            + "?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true"
            + "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public final String USER = "root";
    public final String PASSWORD = "niger777";

    public String getURL() {
        return URL;
    }

    public String getUSER() {
        return USER;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
}
