package pages;

import core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.Keys.*;

public class RegistrationPage extends BasePage {
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstNameFieldLocator;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameFieldLocator;
    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement middleFieldLocator;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    private WebElement phoneNumberFieldLocator;
    @FindBy(xpath = "//input[@name='dateOfBirth']")
    private WebElement birthDateFieldLocator;
    @FindBy(xpath = "//button[text()='Далее']")
    private WebElement nextButtonLocator;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailFieldLocator;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordFieldLocator;
    @FindBy(xpath = "//input[@name='repeatPassword']")
    private WebElement repeatPasswordFieldLocator;
    @FindBy(xpath = "//input[@name='agreement']")
    private WebElement policyAgreementButtonLocator;
    @FindBy(xpath = "//button[text()='Регистрация']")
    private WebElement registrationButtonLocator;
    @FindBy(xpath = "//input[@name='firstName']/parent::div/following-sibling::p")
    private WebElement firstNameBlockLocator;
    public RegistrationPage() {
        PageFactory.initElements(driver, this); //инициализируем данный класс
    }

    public void setFirstName (String firstName){
        firstNameFieldLocator.sendKeys(firstName);
    }
    public void setLastName (String lastName){
        lastNameFieldLocator.sendKeys(lastName);
    }
    public void setMiddleName (String middleName){
        middleFieldLocator.sendKeys(middleName);
    }
    public void setPhoneNumber (String phoneNumber){
        phoneNumberFieldLocator.click();
        phoneNumberFieldLocator.sendKeys(phoneNumber);
    }
    public void setBirthDate (String birthDate){
        birthDateFieldLocator.click();
        birthDateFieldLocator.sendKeys(birthDate);
    }
    public void clickNextButton(){
        nextButtonLocator.click();
    }
    public void setEmail (String email){

        emailFieldLocator.sendKeys(email);
    }
    public void setPassword (String Password){
        passwordFieldLocator.sendKeys(Password);
    }
    public void setRepeatPassword (String RepeatPassword){
        repeatPasswordFieldLocator.sendKeys(RepeatPassword);
    }
    public void clickAgreementCheckBox(){
        policyAgreementButtonLocator.click();
    }
    public void clickRegistrationButton(){
        registrationButtonLocator.click();
    }
    public void validDataRegistration(){
        setFirstName("Иван");
        setLastName("Биван");
        setMiddleName("Диван");
        setPhoneNumber("8005553535");
        setBirthDate("11.11.1999");
        clickNextButton();
        setEmail("mail@mail.ru");
        setPassword("Pass_R1112");
        setRepeatPassword("Pass_R1112");
        clickAgreementCheckBox();
        clickRegistrationButton();
    }

    public void checkFirstName (String firstName){
        firstNameFieldLocator.clear();
        firstNameFieldLocator.sendKeys(SHIFT, HOME, DELETE);
        firstNameFieldLocator.sendKeys(firstName);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='firstName']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkLastName (String secondName){
        lastNameFieldLocator.clear();
        lastNameFieldLocator.sendKeys(SHIFT, HOME, DELETE);
        lastNameFieldLocator.sendKeys(secondName);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='secondName']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkMiddleName (String middleName){
        middleFieldLocator.clear();
        middleFieldLocator.sendKeys(SHIFT, HOME, DELETE);
        middleFieldLocator.sendKeys(middleName);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='middleName']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkPhoneNumber (String number){
        phoneNumberFieldLocator.clear();
        phoneNumberFieldLocator.sendKeys(SHIFT, HOME, DELETE);
        phoneNumberFieldLocator.sendKeys(number);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='phoneNumber']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkBirthDate (String date){
        birthDateFieldLocator.clear();
        birthDateFieldLocator.sendKeys(SHIFT, HOME, DELETE);
        birthDateFieldLocator.sendKeys(date);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='dateOfBirth']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkEmail (String email){
        emailFieldLocator.clear();
        emailFieldLocator.sendKeys(SHIFT, HOME, DELETE);
        emailFieldLocator.sendKeys(email);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='email']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkPassword (String password){
        passwordFieldLocator.clear();
        passwordFieldLocator.sendKeys(SHIFT, HOME, DELETE);
        passwordFieldLocator.sendKeys(password);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='password']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkRepeatPassword (String password){
        repeatPasswordFieldLocator.clear();
        repeatPasswordFieldLocator.sendKeys(SHIFT, HOME, DELETE);
        repeatPasswordFieldLocator.sendKeys(password);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='repeatPassword']/parent::div/following-sibling::p")).isEmpty());
    }
}