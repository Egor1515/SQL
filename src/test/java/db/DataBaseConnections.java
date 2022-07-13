package db;

import java.sql.*;


public class DataBaseConnections {
    public static void mysql() {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "9mREsvXDs9Gk89Ef";
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
<<<<<<< HEAD
            System.out.println("We're connected SQL");
        } catch (SQLException sql) {
            System.out.println("SQL exception");
        }
    }

    public static void shouldDropTables()  {
=======
            System.out.println("We're connected");
        } catch (SQLException ex) {
            System.out.println("Exception SQL");
        }
    }

    public static void shouldClearTables() {
>>>>>>> 4c7aecdc57cf7c50aa3bba8ff892fc50c665b5ab
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
<<<<<<< HEAD
            statement.executeUpdate("drop table auth_codes");
            statement.executeUpdate("drop table card_transactions");
            statement.executeUpdate("drop table cards");
            statement.executeUpdate("drop table users");
        }
        catch (SQLException exception){
            System.out.println("SQL exception");
        }
    }

    public static int shouldSendCode() {
        String url = "jdbc:mysql://localhost:3306/app";
        String userName = "app";
        String password = "pass";
        int code = 0;
=======
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
>>>>>>> 4c7aecdc57cf7c50aa3bba8ff892fc50c665b5ab
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT `code` FROM `auth_codes` LIMIT 1 ORDER BY `code` DESC");
            while (resultSet.next()) {
                code = resultSet.getString("code");
            }

        } catch (SQLException ex) {
<<<<<<< HEAD
            System.out.println("SQLException");
=======
            System.out.println("Exception SQL");
>>>>>>> 4c7aecdc57cf7c50aa3bba8ff892fc50c665b5ab
        }
        return code;
    }

}