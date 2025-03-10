package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/mtg-library";
    private static final String USER = "root";
    private static final String PASSWORD = "Esp-m50Marshall";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        System.out.println("Connection Created");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
