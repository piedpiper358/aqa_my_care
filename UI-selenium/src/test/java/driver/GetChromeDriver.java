package driver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetChromeDriver {
    public static ChromeDriver getInstance() {
        return new ChromeDriver(setOptionsLocalWebDriver());
    }
     private  static ChromeOptions setOptionsLocalWebDriver() {
        ChromeOptions options = new ChromeOptions();
         options.addArguments("enable-automation");
         options.addArguments("--remote-allow-origins=*");
         options.addArguments("--disable-gpu");
         options.addArguments("--no-sandbox");
         options.setAcceptInsecureCerts(true);
         options.addArguments("--disable-web-security");
         options.addArguments("--ignore-certificate-errors");
         options.addArguments("--silent");
         options.addArguments("window-size=1800x900");
//         options.addArguments("--headless");
         options.addArguments("--start-maximized");
         DesiredCapabilities cp = new DesiredCapabilities();
         cp.setPlatform(Platform.WINDOWS);
         cp.setCapability(ChromeOptions.CAPABILITY, options);
         cp.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
         options.merge(cp);
         return options;
     }
}
