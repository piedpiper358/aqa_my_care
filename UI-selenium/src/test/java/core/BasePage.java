package core;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected static WebDriver driver;
    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }
    public static void open(String url) {driver.get(url);}
    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
