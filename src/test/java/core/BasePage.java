package core;

import lombok.Setter;
import org.openqa.selenium.WebDriver;

public class BasePage {
    @Setter
    protected static WebDriver driver;
    public static void open(String url) {
        driver.get(url);
    }
    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
