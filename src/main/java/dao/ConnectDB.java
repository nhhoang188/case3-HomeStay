package dao;

import java.sql.*;

public class ConnectDB {

    final String DB_URL = "jdbc:mysql://localhost:3306/homestay?serverTimezone=UTC";
    final String jdbc_USERNAME = "Hoang188";
    final String jdbc_PASSWORD = "hoang188";

    private static ConnectDB instance;

    public static ConnectDB getInstance() {
        if (instance == null) {
            instance = new ConnectDB();
            return instance;
        }
        return instance;
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, jdbc_USERNAME, jdbc_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
