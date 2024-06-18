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
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement middleField;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    private WebElement phoneNumberField;
    @FindBy(xpath = "//input[@name='dateOfBirth']")
    private WebElement birthDateField;
    @FindBy(xpath = "//button[text()='Далее']")
    private WebElement nextButton;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@name='repeatPassword']")
    private WebElement repeatPasswordField;
    @FindBy(xpath = "//input[@name='agreement']")
    private WebElement policyAgreementButton;
    @FindBy(xpath = "//button[text()='Регистрация']")
    private WebElement registrationButton;
    @FindBy(xpath = "//input[@name='firstName']/parent::div/following-sibling::p")
    private WebElement firstNameBlock;
    public RegistrationPage() {
        PageFactory.initElements(driver, this); //инициализируем данный класс
    }
    public void clearField(WebElement element){
        element.sendKeys(SHIFT, HOME, DELETE);
    }
    public void sendDataToField(WebElement element, String data){
        element.sendKeys(data);
    }
    public void setFirstName (String firstName){
        firstNameField.sendKeys(firstName);
    }
    public void setLastName (String lastName){
        lastNameField.sendKeys(lastName);
    }
    public void setMiddleName (String middleName){
        middleField.sendKeys(middleName);
    }
    public void setPhoneNumber (String phoneNumber){
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
    }
    public void setBirthDate (String birthDate){
        birthDateField.click();
        birthDateField.sendKeys(birthDate);
    }
    public void clickNextButton(){
        nextButton.click();
    }
    public void setEmail (String email){

        emailField.sendKeys(email);
    }
    public void setPassword (String Password){
        passwordField.sendKeys(Password);
    }
    public void setRepeatPassword (String RepeatPassword){
        repeatPasswordField.sendKeys(RepeatPassword);
    }
    public void clickAgreementCheckBox(){
        policyAgreementButton.click();
    }
    public void clickRegistrationButton(){
        registrationButton.click();
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
        firstNameField.clear();
        firstNameField.sendKeys(SHIFT, HOME, DELETE);
        firstNameField.sendKeys(firstName);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='firstName']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkLastName (String secondName){
        lastNameField.clear();
        lastNameField.sendKeys(SHIFT, HOME, DELETE);
        lastNameField.sendKeys(secondName);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='secondName']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkMiddleName (String middleName){
        middleField.clear();
        middleField.sendKeys(SHIFT, HOME, DELETE);
        middleField.sendKeys(middleName);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='middleName']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkPhoneNumber (String number){
        phoneNumberField.clear();
        phoneNumberField.sendKeys(SHIFT, HOME, DELETE);
        phoneNumberField.sendKeys(number);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='phoneNumber']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkBirthDate (String date){
        birthDateField.clear();
        birthDateField.sendKeys(SHIFT, HOME, DELETE);
        birthDateField.sendKeys(date);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='dateOfBirth']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkEmail (String email){
        emailField.clear();
        emailField.sendKeys(SHIFT, HOME, DELETE);
        emailField.sendKeys(email);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='email']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkPassword (String password){
        passwordField.clear();
        passwordField.sendKeys(SHIFT, HOME, DELETE);
        passwordField.sendKeys(password);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='password']/parent::div/following-sibling::p")).isEmpty());
    }
    public void checkRepeatPassword (String password){
        repeatPasswordField.clear();
        repeatPasswordField.sendKeys(SHIFT, HOME, DELETE); //Команда для очистки формы
        repeatPasswordField.sendKeys(password);
        Assertions.assertTrue(driver.findElements(By.xpath("//input[@name='repeatPassword']/parent::div/following-sibling::p")).isEmpty());
    }
}