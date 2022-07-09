package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private static final SelenideElement heading = $("[data-extension-id='dlcobpjiigpikoobohmabehhmhfoodbb']");

    public static void shouldBeVisible() {
        heading.shouldBe(Condition.visible, Condition.text("Личный кабинет"));
    }
}
