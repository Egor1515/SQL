package page;

import com.codeborne.selenide.SelenideElement;
import db.DataBaseConnections;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private final SelenideElement codeField = $("[data-test-id='code'] input");
    private final SelenideElement buttonNext = $("[data-test-id='action-verify']");


    public void sendVerificationCode(String code) {

        codeField.val(DataBaseConnections.getLastGeneratedCode());
        buttonNext.click();

    }
}
