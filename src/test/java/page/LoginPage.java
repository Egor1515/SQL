package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import dataHelper.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement loginField = $("[data-test-id='login'] input");
    private final SelenideElement passField = $("[data-test-id='password'] input");
    private final SelenideElement buttonNext = $("[data-test-id='action-login']");

    public void authWithUser() {
        var registeredUser = new DataHelper().getUser();
        loginField.setValue(registeredUser.getUser());
        passField.setValue(registeredUser.getPass());
        buttonNext.click();
    }
}
