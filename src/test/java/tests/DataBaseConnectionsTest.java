package tests;

import com.codeborne.selenide.Configuration;
import db.DataBaseConnections;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.DashboardPage;
import page.LoginPage;
import page.VerificationPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataBaseConnectionsTest {

    @Test
    void shouldAuthWithUser() {
        Configuration.holdBrowserOpen = true;
        var code = new DataBaseConnections();
        LoginPage login = open("http://localhost:9999", LoginPage.class);
        VerificationPage page = new VerificationPage();
        DashboardPage dash = new DashboardPage();
        login.authWithUser(code.getLastGeneratedName());
        page.sendVerificationCode(code.getLastGeneratedCode());
        dash.shouldBeVisible();
    }


    @AfterAll
    static void shouldClearTables() {
        DataBaseConnections.shouldClearTables();

    }

    @Test
    void shouldGetStatus() {

        var code = new DataBaseConnections();
        code.dbConnect();
        String expected = code.getStatus();
        String actual = "active";
        assertEquals(expected, actual);
    }
}