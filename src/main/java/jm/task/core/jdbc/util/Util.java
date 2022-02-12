package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private Connection connection = null;

    public static  Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/newbd", "root", "root");
        }

        catch(SQLException e) {
            System.out.println("Connection Failed");
        }

        return connection;
    }
}
