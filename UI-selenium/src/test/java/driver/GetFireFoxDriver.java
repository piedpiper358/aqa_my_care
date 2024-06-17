package driver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetFireFoxDriver {
    public static FirefoxDriver getInstance() {
        return new FirefoxDriver();
    }
}