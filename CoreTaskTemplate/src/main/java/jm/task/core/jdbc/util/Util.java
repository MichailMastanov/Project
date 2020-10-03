package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.Callable;

public class Util {

    private final static String url = "jdbc:mysql://localhost:3306?serverTimezone=UTC";
    private final static String user = "root";
    private final static String password = "89205392733mmm";

    public static Connection getConnect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }


}
