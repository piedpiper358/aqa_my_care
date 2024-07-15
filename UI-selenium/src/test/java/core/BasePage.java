package core;

import driver.CreateWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }
    public static void setDriver() {
        //driver = new ChromeDriver();
        driver = CreateWebDriver.getChrome();
    }
    public static void setHeadlessDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        driver = new ChromeDriver(options);
    }

    public void open(String url) {driver.get(url);}
    public static String getCurrentUrl() { return driver.getCurrentUrl(); }
    public void refreshPage(){ driver.navigate().refresh();}
}
