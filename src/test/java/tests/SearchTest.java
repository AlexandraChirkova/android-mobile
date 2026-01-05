package tests;

import org.junit.jupiter.api.Test;
import screens.SearchScreen;

import static com.codeborne.selenide.Selenide.back;

public class SearchTest extends BaseTest {

    SearchScreen searchPage = new SearchScreen();

    @Test
    void successfulSearchTest() {
        back();
        searchPage
                .openSearch()
                .typeSearchQuery("Appium")
                .shouldHaveResults();
    }
}
