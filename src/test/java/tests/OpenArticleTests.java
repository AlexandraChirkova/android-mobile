package tests;

import org.junit.jupiter.api.Test;
import screens.ArticleScreen;
import screens.SearchScreen;

import static com.codeborne.selenide.Selenide.back;

public class OpenArticleTests extends BaseTest {

    SearchScreen searchPage = new SearchScreen();
    ArticleScreen articlePage = new ArticleScreen();

    @Test
    void openAnyArticleTest() {
        back();
        searchPage
                .openSearch()
                .typeSearchQuery("Appium")
                .openFirstResult();

        articlePage
                .closePopupsIfPresent()
                .shouldBeOpened();
    }

}
