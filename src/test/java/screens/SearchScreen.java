package screens;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchScreen {

    private final SelenideElement searchContainer =
            $(accessibilityId("Search Wikipedia"));

    private final SelenideElement searchInput =
            $(id("org.wikipedia:id/search_src_text"));

    private final ElementsCollection searchResults =
            $$(id("org.wikipedia:id/page_list_item_title"));

    @Step("Открыть поле поиска")
    public SearchScreen openSearch() {
        searchContainer.shouldBe(visible).click();
        return this;
    }

    @Step("Ввести текст поиска: {query}")
    public SearchScreen typeSearchQuery(String query) {
        searchInput.shouldBe(visible).sendKeys(query);
        return this;
    }

    @Step("Проверить, что результаты поиска найдены")
    public SearchScreen shouldHaveResults() {
        searchResults.shouldHave(sizeGreaterThan(0));
        return this;
    }

    @Step("Открыть первую найденную статью")
    public SearchScreen openFirstResult() {
        searchResults.first().click();
        return this;
    }
}
