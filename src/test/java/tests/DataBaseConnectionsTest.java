package tests;

import db.DataBaseConnections;
import org.junit.jupiter.api.Test;
import page.LoginPage;

import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.open;

public class DataBaseConnectionsTest {

    @Test
    void shouldConnectMysql() throws SQLException, ClassNotFoundException {
        DataBaseConnections.mysql();
    }

    @Test
    void shouldAuthWithUser() {
        LoginPage page = open("http://localhost:9999",LoginPage.class);
        page.authWithUser();
    }
}
