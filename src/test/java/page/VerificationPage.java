package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private final SelenideElement codeField = $("[data-test-id='code'] input");
    private final SelenideElement buttonNext = $("[data-test-id='action-verify']");


    public DashboardPage sendVerificationCode(String code) {
        codeField.val(code);
        buttonNext.click();
        return new DashboardPage();

    }
}
