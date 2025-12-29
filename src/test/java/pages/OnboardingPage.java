package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingPage {

    private final SelenideElement title =
            $(id("org.wikipedia:id/primaryTextView"));

    private final SelenideElement continueButton =
            $(id("org.wikipedia:id/fragment_onboarding_forward_button"));

    private final SelenideElement getStartedButton =
            $(id("org.wikipedia:id/fragment_onboarding_done_button"));

    @Step("Проверить текст onboarding экрана: {expectedText}")
    public OnboardingPage shouldHaveTitle(String expectedText) {
        title.shouldBe(visible).shouldHave(com.codeborne.selenide.Condition.text(expectedText));
        return this;
    }

    @Step("Нажать Continue")
    public OnboardingPage clickContinue() {
        continueButton.shouldBe(visible).click();
        return this;
    }

    @Step("Нажать Get started")
    public void clickGetStarted() {
        getStartedButton.shouldBe(visible).click();
    }
}

