package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import dataHelper.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement loginField = $("[data-test-id='login'] input");
    private final SelenideElement passField = $("[data-test-id='password'] input");
    private final SelenideElement buttonNext = $("[data-test-id='action-login']");
    private final SelenideElement heading = $("paragraph paragraph_theme_alfa-on-white");

    public void authWithUser() {
//        heading.shouldHave(Condition.text("Мы гарантируем безопасность ваших данных"));
        loginField.setValue(DataHelper.getAuthInfo().getUser());
        passField.setValue(DataHelper.getAuthInfo().getPass());
        buttonNext.click();
    }
}
