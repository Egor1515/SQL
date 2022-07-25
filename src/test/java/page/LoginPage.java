package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement loginField = $("[data-test-id='login'] input");
    private final SelenideElement passField = $("[data-test-id='password'] input");
    private final SelenideElement buttonNext = $("[data-test-id='action-login']");

    public void authWithUser(String name, String pass) {

        loginField.setValue(name);
        passField.setValue(pass);
        buttonNext.click();
    }
}
