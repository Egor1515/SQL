package tests;

import com.codeborne.selenide.Configuration;
import db.DataBaseConnections;
<<<<<<< HEAD
=======
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
>>>>>>> 4c7aecdc57cf7c50aa3bba8ff892fc50c665b5ab
import org.junit.jupiter.api.Test;
import page.DashboardPage;
import page.LoginPage;
import page.VerificationPage;

import static com.codeborne.selenide.Selenide.open;

public class DataBaseConnectionsTest {
    VerificationPage page = new VerificationPage();
    DashboardPage dash = new DashboardPage();

<<<<<<< HEAD
    @Test
    void shouldConnectMysql()  {
        DataBaseConnections.mysql();
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
        DataBaseConnections.shouldSendCode();
=======
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
>>>>>>> 4c7aecdc57cf7c50aa3bba8ff892fc50c665b5ab

    }
    @Test

    void shouldDropTables(){
        DataBaseConnections.shouldDropTables();
    }
}