package driver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetEdgeDriver {

    public static EdgeDriver getInstance() {
        return new EdgeDriver(setOptions());
    }

    private static EdgeOptions setOptions() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--no-gpu");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless=new");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-extensions");
        options.setAcceptInsecureCerts(true);
        options.addArguments("--disable-web-security");
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(ChromeOptions.CAPABILITY, options);
        cp.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        options.merge(cp);
        return options;
    }
}
