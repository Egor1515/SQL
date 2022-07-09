package tests;

import com.codeborne.selenide.Configuration;
import db.DataBaseConnections;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import page.DashboardPage;
import page.LoginPage;
import page.VerificationPage;

import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.open;

public class DataBaseConnectionsTest {

//    @Test
//    void shouldConnectMysql() throws SQLException, ClassNotFoundException {
//        DataBaseConnections.mysql();
//    }
//
//    @Test
//    void shouldAuthWithUser() throws SQLException, ClassNotFoundException {
//        Configuration.holdBrowserOpen = true;
//        LoginPage page = open("http://localhost:9999", LoginPage.class);
//        page.authWithUser();
//        VerificationPage.sendVerificationCode();
//        DashboardPage.shouldBeVisible();
//    }
    @Test
    public void should() throws SQLException, ClassNotFoundException {
        DataBaseConnections.shouldSendCode();

    }
}