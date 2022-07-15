package db;

import java.sql.*;


public class DataBaseConnections {
    public static void dbConnect() {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {

            System.out.println("We're connected SQL");
        } catch (SQLException sql) {
            System.out.println("DB exception");
        }
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
        } catch (SQLException exception) {
            System.out.println("SQL exception");
        }
    }

    public static CharSequence getLastGeneratedCode ()  {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";
        int code=0;

        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT MAX(`code`) FROM auth_codes");
            while (resultSet.next()) {
                code = resultSet.getInt(1);
                System.out.println(code); // Добавил для себя, чтобы разобраться получше, т.к. хоть метод и работает, но он не правильный по всей видимости.
            }
        }
        catch (SQLException exception) {
            System.out.println("SQL exception");
        }
        return null;
    }

}