package tests;

import com.codeborne.selenide.Configuration;
import db.DataBaseConnections;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.DashboardPage;
import page.LoginPage;
import page.VerificationPage;

import static com.codeborne.selenide.Selenide.open;

public class DataBaseConnectionsTest {

    @BeforeAll
    static void shouldConnectMysql() {
        DataBaseConnections.mysql();
    }

    @Test
    void shouldAuthWithUser() {
        Configuration.holdBrowserOpen = true;
        LoginPage page = open("http://localhost:9999", LoginPage.class);
        page.authWithUser();
        VerificationPage.sendVerificationCode();
        DashboardPage.shouldBeVisible();
    }

    @AfterAll
    static void shouldClearTables() {
        DataBaseConnections.shouldClearTables();

    }
}