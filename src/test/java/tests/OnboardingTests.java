package tests;

import org.junit.jupiter.api.Test;
import pages.OnboardingPage;

public class OnboardingTests extends BaseTest {

    OnboardingPage onboardingPage = new OnboardingPage();

    @Test
    void onboardingFlowTest() {
        onboardingPage
                .shouldHaveTitle("The Free Encyclopedia\n…in over 300 languages")
                .clickContinue()
                .shouldHaveTitle("New ways to explore")
                .clickContinue()
                .shouldHaveTitle("Reading lists")
                .clickContinue()
                .shouldHaveTitle("Data & Privacy")
                .clickGetStarted();
    }
}

