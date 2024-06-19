package pages;

import core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;

import static org.openqa.selenium.Keys.*;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement middleNameField;
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

    public void setFirstName (String firstName){
        firstNameField.sendKeys(firstName);
    }
    public boolean checkFirstNameErrorFilling(){
        return driver.findElements(By.xpath("//input[@name='firstName']/parent::div/following-sibling::p")).isEmpty();
    }
    public void clearFieldFirstName (){
        firstNameField.sendKeys(SHIFT, HOME, DELETE);
    }
    public void setLastName (String lastName){
        lastNameField.sendKeys(lastName);
    }
    public boolean checkLastNameErrorFilling(){
        return driver.findElements(By.xpath("//input[@name='lastName']/parent::div/following-sibling::p")).isEmpty();
    }
    public void clearFieldLastName (){
        lastNameField.sendKeys(SHIFT, HOME, DELETE);
    }
    public void setMiddleName (String middleName){
        middleNameField.sendKeys(middleName);
    }
    public boolean checkMiddleNameErrorFilling(){
        return driver.findElements(By.xpath("//input[@name='middleName']/parent::div/following-sibling::p")).isEmpty();
    }
    public void clearFieldMiddleName (){
        middleNameField.sendKeys(SHIFT, HOME, DELETE);
    }
    public void setPhoneNumber (String phoneNumber){
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
    }
    public void setPhoneNumberParam (String phoneNumber){
        phoneNumberField.sendKeys(phoneNumber);
    }
    public boolean checkPhoneNumberErrorFilling(){
        return driver.findElements(By.xpath("//input[@name='phoneNumber']/parent::div/following-sibling::p")).isEmpty();
    }
    public void clearFieldPhoneNumber (){
        phoneNumberField.sendKeys(SHIFT, HOME, DELETE);
    }
    public void setBirthDate (String birthDate){
        birthDateField.click();
        birthDateField.sendKeys(birthDate);
    }
    public boolean checkBirthDateErrorFilling(){
        return driver.findElements(By.xpath("//input[@name='dateOfBirth']/parent::div/following-sibling::p")).isEmpty();
    }
    public void clearFieldBirthDate (){
        birthDateField.click();
        birthDateField.sendKeys(SHIFT, HOME, DELETE);
    }
    public void clickNextButton(){
        nextButton.click();
    }
    public void setEmail (String email){
        emailField.sendKeys(email);
    }
    public boolean checkEmailErrorFilling(){
        return driver.findElements(By.xpath("//input[@name='email']/parent::div/following-sibling::p")).isEmpty();
    }
    public void clearFieldEmail (){
        emailField.sendKeys(SHIFT, HOME, DELETE);
    }
    public void setPassword (String Password){
        passwordField.sendKeys(Password);
    }
    public boolean checkPasswordErrorFilling(){
        return driver.findElements(By.xpath("//input[@name='password']/parent::div/following-sibling::p")).isEmpty();
    }
    public void clearFieldPassword (){
        passwordField.sendKeys(SHIFT, HOME, DELETE);
    }
    public void setRepeatPassword (String RepeatPassword){
        repeatPasswordField.sendKeys(RepeatPassword);
    }
    public boolean checkRepeatPasswordErrorFilling(){
        return driver.findElements(By.xpath("//input[@name='repeatPassword']/parent::div/following-sibling::p")).isEmpty();
    }
    public void clearFieldRepeatPassword (){
        repeatPasswordField.sendKeys(SHIFT, HOME, DELETE);
    }
    public void clickAgreementCheckBox(){
        policyAgreementButton.click();
    }
    public void clickRegistrationButton(){
        registrationButton.click();
    }
    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}