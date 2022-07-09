package db;

import lombok.val;

import java.sql.*;


public class DataBaseConnections {
    public static void mysql() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "9mREsvXDs9Gk89Ef";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            System.out.println("We're connected");
        }
    }

    public static void shouldDropTables() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
            statement.execute("drop table auth_codes,card_transactions,cards,users");
        }
    }

    public static int shouldSendCode() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";
        Class.forName("com.mysql.jdbc.Driver");
        int code = 0;
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM auth_codes");
            while (resultSet.next()) {
                code = resultSet.getInt("code");
            }

        }

        return code;
    }

}