package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthorizationPage extends BasePage {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    @FindBy(xpath = "//a[text()='Нет аккаунта?']")
    private WebElement registrationButtonLocator;
    public AuthorizationPage() {
        PageFactory.initElements(driver, this); //инициализируем данный класс
    }

    public RegistrationPage clickAccountQuestion() {
        registrationButtonLocator.click();
        return new RegistrationPage();
    }
}