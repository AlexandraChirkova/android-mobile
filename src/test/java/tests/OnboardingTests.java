package tests;

import org.junit.jupiter.api.Test;
import screens.OnboardingScreen;

public class OnboardingTests extends BaseTest {

    OnboardingScreen onboardingPage = new OnboardingScreen();

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

