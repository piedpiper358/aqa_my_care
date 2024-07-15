package core;

import driver.CreateWebDriver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class BaseTest {
    protected static WebDriver driver;
    protected static MainPage mainPage;
    @BeforeAll
    public static void setUp() {
        driver = CreateWebDriver.getChrome();

        BasePage.setDriver(driver);
        mainPage = new MainPage();
    }
    @AfterAll
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}
