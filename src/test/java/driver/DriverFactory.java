package driver;

import com.codeborne.selenide.WebDriverProvider;

public class DriverFactory {

    public static WebDriverProvider getDriver() {

        String deviceHost =
                System.getProperty("deviceHost", "emulation");

        switch (deviceHost) {
            case "browserstack":
                return new BrowserstackDriver();
            case "real":
                return new LocalDriver();
            case "emulation":
                return new EmulationDriver();
            default:
                throw new IllegalArgumentException(
                        "Unknown deviceHost: " + deviceHost);
        }
    }
}


