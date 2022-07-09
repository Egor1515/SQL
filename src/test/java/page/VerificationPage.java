package page;

import com.codeborne.selenide.SelenideElement;
import dataHelper.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private static final SelenideElement codeField = $("[data-test-id='code'] input");
    private static final SelenideElement buttonNext = $("[data-test-id='action-verify']");

    public static void sendVerificationCode() {
        codeField.setValue(DataHelper.getVerificationCode().getCode());
        buttonNext.click();
    }
}
