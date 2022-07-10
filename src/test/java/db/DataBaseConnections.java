package db;

import java.sql.*;


public class DataBaseConnections {
    public static void mysql() {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "9mREsvXDs9Gk89Ef";
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            System.out.println("We're connected");
        } catch (SQLException ex) {
            System.out.println("Exception SQL");
        }
    }

    public static void shouldClearTables() {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM auth_codes,cards,users,card_transactions");

        } catch (SQLException ex) {
            System.out.println("Exception SQL");
        }
    }

    public static String shouldSendCode() {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";
        String  code = null;
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM auth_codes");
            while (resultSet.next()) {
                code = resultSet.getString("code");
            }

        } catch (SQLException ex) {
            System.out.println("Exception SQL");
        }

        return code;
    }

}