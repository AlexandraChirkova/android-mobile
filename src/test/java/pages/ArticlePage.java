package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static io.appium.java_client.AppiumBy.xpath;

public class ArticlePage {

    @Step("Закрыть всплывающие окна на странице статьи (если есть)")
    public ArticlePage closePopupsIfPresent() {
        try {
            $(id("org.wikipedia:id/closeButton")).click();
        } catch (Exception ignored) {
        }
        return this;
    }

    @Step("Проверить, что статья открыта")
    public ArticlePage shouldBeOpened() {

        $(xpath("//*[contains(@text,'Appium')]"))
                .shouldBe(visible);

        return this;
    }
}
