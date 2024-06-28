package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static constants.Constats.DEV_URL;

public class MainPage extends BasePage {

    @FindBy(xpath = "//a[@href='/login']")
    WebElement enterAccountButtonLocator;
    public MainPage() {
        driver.get(DEV_URL);
        PageFactory.initElements(driver, this); //инициализируем данный класс
    }
    public AuthorizationPage clickEnterAccount() {
        enterAccountButtonLocator.click();
        return new AuthorizationPage();
    }
}
