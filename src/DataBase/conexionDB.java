package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/ACME_ZONE";
    private static final String USER = "arleydev14";
    private static final String PASSWORD = "140512";

    public static Connection conectDB() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
