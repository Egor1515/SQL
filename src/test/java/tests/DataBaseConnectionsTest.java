package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import db.DataBaseConnections;
import org.junit.jupiter.api.Test;
import page.LoginPage;
import page.VerificationPage;

import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.open;

public class DataBaseConnectionsTest {

    @Test
    void shouldConnectMysql() throws SQLException, ClassNotFoundException {
        DataBaseConnections.mysql();
    }

    @Test
    void shouldAuthWithUser() {
        Configuration.holdBrowserOpen = true;
        LoginPage page = open("http://localhost:9999", LoginPage.class);
        page.authWithUser();
        VerificationPage.sendVerificationCode();
    }
}
