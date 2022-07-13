package page;

import com.codeborne.selenide.SelenideElement;
import dataHelper.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private final SelenideElement codeField = $("[data-test-id='code'] input");
    private final SelenideElement buttonNext = $("[data-test-id='action-verify']");

    public void sendVerificationCode() {
//        codeField.setValue(DataHelper.getVerificationCode().getCode());
        buttonNext.click();
    }
}
