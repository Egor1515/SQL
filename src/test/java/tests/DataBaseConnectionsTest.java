package tests;

import com.codeborne.selenide.Configuration;
import db.DataBaseConnections;
import org.junit.jupiter.api.Test;
import page.DashboardPage;
import page.LoginPage;
import page.VerificationPage;

import static com.codeborne.selenide.Selenide.open;

public class DataBaseConnectionsTest {
    VerificationPage page = new VerificationPage();
    DashboardPage dash = new DashboardPage();
        @Test
    void shouldConnectMysql() {
        DataBaseConnections.dbConnect();
    }

    @Test
    void shouldAuthWithUser() {
        Configuration.holdBrowserOpen = true;
        LoginPage login = open("http://localhost:9999", LoginPage.class);
        login.authWithUser();
        page.sendVerificationCode();
        dash.shouldBeVisible();
    }

    @Test
    public void should() {
        DataBaseConnections.getLastGeneratedCode();
    }

    @Test
    void shouldClearTables() {
        DataBaseConnections.shouldClearTables();

    }
    @Test

    void shouldReturnFirstCode()  {
        DataBaseConnections.getLastGeneratedCode();
    }
}