package page;

import com.codeborne.selenide.SelenideElement;
import dataHelper.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private final SelenideElement codeField = $("[data-test-id='code'] input");
    private final SelenideElement buttonNext = $("[data-test-id='action-verify']");

<<<<<<< HEAD
    public void sendVerificationCode() {
//        codeField.setValue(DataHelper.getVerificationCode().getCode());
=======

    public static void sendVerificationCode() {
        codeField.setValue(DataHelper.getVerificationCode().getCode());
>>>>>>> 4c7aecdc57cf7c50aa3bba8ff892fc50c665b5ab
        buttonNext.click();
    }
}
