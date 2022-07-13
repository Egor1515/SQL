package db;

import java.sql.*;


public class DataBaseConnections {
    public static void mysql() {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {

            System.out.println("We're connected SQL");
        } catch (SQLException sql) {
            System.out.println("SQL exception");
        }
    }

    public static void shouldClearTables() {

        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();

            statement.executeUpdate("drop table auth_codes");
            statement.executeUpdate("drop table card_transactions");
            statement.executeUpdate("drop table cards");
            statement.executeUpdate("drop table users");
        }
        catch (SQLException exception){
            System.out.println("SQL exception");
        }
    }

    public static String shouldSendCode() {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";
        String  code = null;

        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT `code` FROM `auth_codes` LIMIT 1 ORDER BY `code` DESC");
            while (resultSet.next()) {
                code = resultSet.getString("code");
            }

        } catch (SQLException ex) {

            System.out.println("SQLException");



        }
        return code;
    }

}