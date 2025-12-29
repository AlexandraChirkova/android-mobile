package driver;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class EmulationDriver implements WebDriverProvider {

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {

        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")

                .setDeviceName(getEmulatorName())

                .setAppPackage("org.wikipedia")
                .setNoReset(false)
                .setAppWaitForLaunch(false)
                .setAppWaitActivity("*");

        return new AndroidDriver(getAppiumServerUrl(), options);
    }

    private URL getAppiumServerUrl() {
        try {
            return new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private String getEmulatorName() {
        return System.getProperty("deviceName", "Pixel_33");
    }
}

