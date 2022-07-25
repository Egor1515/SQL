package tests;

import com.codeborne.selenide.Configuration;
import com.mysql.cj.log.Log;
import dataHelper.DataHelper;
import db.DataBaseConnections;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import page.DashboardPage;
import page.LoginPage;
import page.VerificationPage;

import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataBaseConnectionsTest {

    @Test
    void shouldAuthWithUser() {
        Configuration.holdBrowserOpen = true;
        LoginPage login = open("http://localhost:9999", LoginPage.class);
        var verificationPage = login.authWithUser(DataHelper.getUser());
        var dashboardPage = verificationPage.sendVerificationCode(DataBaseConnections.getLastGeneratedCode());
        VerificationPage page = new VerificationPage();
        DashboardPage dash = new DashboardPage();
//        login.authWithUser(verificationPage);  //TODO Не совсем понял, что мы делаем, когда объявляем два объекта verificationPage и dashboardPage
//        page.sendVerificationCode(dashboardPage);
        dash.shouldBeVisible();
    }


    @AfterAll
    static void shouldClearTables() {
        DataBaseConnections.shouldClearTables();

    }

    @Test
    void shouldGetStatus() throws SQLException {

        DataBaseConnections.dbConnect();
        String expected = DataBaseConnections.getStatus();
        String actual = "active";
        assertEquals(expected, actual);
    }
    @Test

    void should() throws SQLException {
        DataBaseConnections.dbConnect();
    }
}
