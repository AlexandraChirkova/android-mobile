package tests;

import org.junit.jupiter.api.Test;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.back;

public class SearchTest extends BaseTest {

    SearchPage searchPage = new SearchPage();

    @Test
    void successfulSearchTest() {
        back();
        searchPage
                .openSearch()
                .typeSearchQuery("Appium")
                .shouldHaveResults();
    }
}
