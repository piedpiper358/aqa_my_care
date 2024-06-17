package driver;


import constants.BrowserType;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class CreateWebDriver {

    public static WebDriver getDriver (BrowserType browserType) {
        WebDriver driver =
        switch (browserType) {
            case CHROME -> GetChromeDriver.getInstance();
            case FIREFOX -> GetFireFoxDriver.getInstance();
            case EDGE -> GetEdgeDriver.getInstance();
            default -> null;
        };

        assert driver != null;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }
    public static WebDriver getChrome() {
        return getDriver(BrowserType.CHROME);
    }
    public static WebDriver getFirefox() {
        return getDriver(BrowserType.FIREFOX);
    }
    public static WebDriver getEdge() {
        return getDriver(BrowserType.EDGE);
    }
}