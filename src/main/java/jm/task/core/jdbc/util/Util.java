package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    static java.sql.Connection connection = null;

    public Util() {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            String URL = "jdbc:mysql://localhost:3306/new_schema";
            String USERNAME = "root";
            String PASSWORD = "root";
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Driver not found");
        }
        return connection;
    }
}
