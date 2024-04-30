package core;

import driver.CreateWebDriver;
import org.openqa.selenium.WebDriver;

import static constants.Constats.BASE_URL;

public class BaseTest {
    protected static WebDriver driver;
    public static void setUp() {
        driver = CreateWebDriver.getChrome();
        BasePage.setDriver(driver);
        driver.get(BASE_URL);
    }
}
