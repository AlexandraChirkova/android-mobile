package tests;

import org.junit.jupiter.api.Test;
import pages.ArticlePage;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.back;

public class OpenArticleTests extends BaseTest {

    SearchPage searchPage = new SearchPage();
    ArticlePage articlePage = new ArticlePage();

    @Test
    void openAnyArticleTest() {
        back();
        searchPage
                .openSearch()
                .typeSearchQuery("Appium")
                .openFirstResult();

        articlePage.shouldBeOpened();
    }
}
