package db;

import lombok.experimental.UtilityClass;

import java.sql.*;

@UtilityClass
public class DataBaseConnections {

    public Connection dbConnect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            return connection;
        }
    }


    public static String getLastGeneratedCode() {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";

        String code = null;
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT code FROM auth_codes LIMIT 1");
            while (resultSet.next()) {
                code = (resultSet.getString("code"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return code;
    }

    public static    String getStatus() {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";


        String status = null;
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT status FROM users");
            while (resultSet.next()) {
                status = (resultSet.getString("status"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return status;
    }

    public static void shouldClearTables() {

        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();

            statement.executeUpdate("delete from auth_codes");
            statement.executeUpdate("delete from card_transactions");
            statement.executeUpdate("delete from cards");
            statement.executeUpdate("delete from users");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}