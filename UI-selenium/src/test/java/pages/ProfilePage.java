package pages;

import core.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.Keys.*;

@Getter
public class ProfilePage extends BasePage {

    //------------------Personal--------------------------
    @FindBy(xpath = "//h4[text()='Личные данные']/following::button[text()='Изменить']")
    private WebElement changePersonalInfoButton;
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement middleNameField;
    @FindBy(xpath = "//input[@name='birthDate']")
    private WebElement birthDateField;

    @FindBy(xpath = "//h4[text()='Личные данные']/following::button[text()='Сохранить']")
    private WebElement savePersonalInfoButton;
    @FindBy(xpath = "//h4[text()='Личные данные']/following::button[text()='Отменить']")
    private WebElement cancelPersonalInfoChangeButton;

    //------------------Passport--------------------------
    @FindBy(xpath = "//p[contains(.,'Добавьте паспортные данные')]")
    private WebElement addDocumentButton;

    @FindBy(xpath = "//input[@name='documentSeries']")
    private WebElement documentSeriesField;
    @FindBy(xpath = "//input[@name='documentNumber']")
    private WebElement documentNumberField;
    @FindBy(xpath = "//input[@name='issuedDate']")
    private WebElement issuedDateField;
    @FindBy(xpath = "//input[@name='documentDuration']")
    private WebElement documentDurationField; //???
    @FindBy(xpath = "//input[@name='issuedBy']")
    private WebElement issuedByField;

    @FindBy(xpath = "//h4[text()='Паспортные данные']/following::button[text()='Сохранить']")
    private WebElement saveDocumentButton;
    @FindBy(xpath = "//h4[text()='Паспортные данные']/following::button[text()='Отменить']")
    private WebElement cancelDocumentChangeButton;

    //------------------Address--------------------------
    @FindBy(xpath = "//p[contains(.,'Добавьте ваш адрес')]")
    private WebElement addAddressButton;
    @FindBy(xpath = "//input[@name='addressRegister']")
    private WebElement addressRegisterField;
    @FindBy(xpath = "//input[@name='addressLiving']")
    private WebElement addressLivingField;

    @FindBy(xpath = "//h4[text()='Адрес']/following::button[text()='Сохранить']")
    private WebElement saveAddressButton;
    @FindBy(xpath = "//h4[text()='Адрес']/following::button[text()='Отменить']")
    private WebElement cancelAddressChangeButton;

    //------------------Contact--------------------------
    @FindBy(xpath = "//p[contains(.,'Добавьте контакты')]")
    private WebElement addContactButton;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;
    //@FindBy(xpath = "//input[@name='телефон']")
    //private WebElement phoneNumberField;

    @FindBy(xpath = "//h4[text()='Контактные данные']/following::button[text()='Добавить номер']")
    private WebElement addPhoneNumberButton;
    @FindBy(xpath = "//h4[text()='Контактные данные']/following::button[text()='Сохранить']")
    private WebElement saveContactButton;
    @FindBy(xpath = "//h4[text()='Контактные данные']/following::button[text()='Отменить']")
    private WebElement cancelContactInfoChangeButton;

    public ProfilePage() {
        PageFactory.initElements(driver, this); //инициализируем данный класс
        open("http://172.17.1.83/profile");
    }

    public void setValidData(){
        getChangePersonalInfoButton().click();
        setFirstNameField("Гомер");
        setLastNameField("Симсон");
        setMiddleNameField("Джей");
        setDateOfBirthField("10.02.1998");
        getAddDocumentButton().click();
        setDocumentSeriesField("1234");
        setDocumentNumberField("567890");
        setIssuedDateField("20.04.2020");
        setIssuedByField("ГУ МВД по г Спрингфилд");
        getAddAddressButton().click();
        setAddressRegisterField("г. Спрингфилд, Вечнозеленая аллея, д. 742, к.1, кв. 1");
        setAddressLivingField("г. Спрингфилд, Вечнозеленая аллея, д. 742, к.1, кв. 1");
        getSaveAddressButton().click();
        setEmailField("homer@simsons.com");
        getAddPhoneNumberButton().click();
        setPhoneNumberField(0,"9214347867");
        getAddPhoneNumberButton().click();
        setPhoneNumberField(1,"9214343498");
    }

    //------------------Personal--------------------------
    public void setFirstNameField (String firstName){ clearFirstNameField(); firstNameField.sendKeys(firstName);}
    public void clearFirstNameField (){ new Actions(driver).click(firstNameField).keyDown(CONTROL).sendKeys(firstNameField, "a").keyUp(CONTROL).sendKeys(firstNameField, DELETE).perform(); }
    public String getFirstNameFieldErrorMessage(){ return driver.findElement(By.xpath("//input[@name='firstName']/parent::div/following-sibling::p")).getText(); }
    public String getFirstNameField(){ return firstNameField.getAttribute("value"); }

    public void setLastNameField (String lastName){ clearLastNameField(); lastNameField.sendKeys(lastName); }
    public void clearLastNameField (){ new Actions(driver).click(lastNameField).keyDown(CONTROL).sendKeys(lastNameField, "a").keyUp(CONTROL).sendKeys(lastNameField, DELETE).perform(); }
    public String getLastNameFieldErrorMessage(){ return driver.findElement(By.xpath("//input[@name='lastName']/parent::div/following-sibling::p")).getText(); }

    public void setMiddleNameField (String middleName) { clearMiddleNameField(); middleNameField.sendKeys(middleName); }
    public void clearMiddleNameField (){ new Actions(driver).click(middleNameField).keyDown(CONTROL).sendKeys(middleNameField, "a").keyUp(CONTROL).sendKeys(middleNameField, DELETE).perform(); }
    public String getMiddleNameFieldErrorMessage(){ return driver.findElement(By.xpath("//input[@name='middleName']/parent::div/following-sibling::p")).getText(); }

    public void setDateOfBirthField (String dateOfBirth){
        clearDateOfBirthField();
        birthDateField.sendKeys(dateOfBirth);
    }
    public void clearDateOfBirthField (){ new Actions(driver).click(birthDateField).keyDown(CONTROL).sendKeys(birthDateField, "a").keyUp(CONTROL).sendKeys(birthDateField, DELETE).perform(); }
    public String getDateOfBirthFieldErrorMessage(){ return driver.findElement(By.xpath("//input[@name='dateOfBirth']/parent::div/parent::div/following-sibling::p")).getText(); }

    //------------------Passport--------------------------

    public void setDocumentSeriesField (String documentSeries){ clearDocumentSeriesField(); documentSeriesField.sendKeys(documentSeries); }
    public void clearDocumentSeriesField (){ new Actions(driver).click(documentSeriesField).keyDown(CONTROL).sendKeys(documentSeriesField, "a").keyUp(CONTROL).sendKeys(documentSeriesField, DELETE).perform(); }
    public String getDocumentSeriesFieldErrorMessage(){ return driver.findElement(By.xpath("//input[@name='documentSeries']/parent::div/following-sibling::p")).getText(); }

    public void setDocumentNumberField (String documentNumber){ clearDocumentNumberField(); documentNumberField.sendKeys(documentNumber); }
    public void clearDocumentNumberField (){ new Actions(driver).click(documentNumberField).keyDown(CONTROL).sendKeys(documentNumberField, "a").keyUp(CONTROL).sendKeys(documentNumberField, DELETE).perform(); }
    public String getDocumentNumberFieldErrorMessage(){ return driver.findElement(By.xpath("//input[@name='documentNumber']/parent::div/following-sibling::p")).getText(); }

    public void setIssuedDateField (String IssuedDate){ clearIssuedDateField(); issuedDateField.sendKeys(IssuedDate); }
    public void clearIssuedDateField (){ new Actions(driver).click(issuedDateField).keyDown(CONTROL).sendKeys(issuedDateField, "a").keyUp(CONTROL).sendKeys(issuedDateField, DELETE).perform(); }
    public String getIssuedDateFieldErrorMessage(){ return driver.findElement(By.xpath("//input[@name='issuedDate']/parent::div/parent::div/following-sibling::p")).getText(); }

    public void setIssuedByField (String nameFacilityIssued){ clearIssuedByField(); issuedByField.sendKeys(nameFacilityIssued); }
    public void clearIssuedByField (){ new Actions(driver).click(issuedByField).keyDown(CONTROL).sendKeys(issuedByField, "a").keyUp(CONTROL).sendKeys(issuedByField, DELETE).perform(); }
    public String getIssuedByFieldErrorMessage(){ return driver.findElement(By.xpath("//input[@name='nameFacilityIssued']/parent::div/following-sibling::p")).getText(); }

    //------------------Address--------------------------
    public void setAddressRegisterField (String addressRegister){ clearAddressRegisterField(); addressRegisterField.sendKeys(addressRegister); }
    public void clearAddressRegisterField (){ new Actions(driver).click(addressRegisterField).keyDown(CONTROL).sendKeys(addressRegisterField, "a").keyUp(CONTROL).sendKeys(addressRegisterField, DELETE).perform(); }
    public String getAddressRegisterFieldErrorMessage(){ return driver.findElement(By.xpath("//input[@name='addressRegister']/parent::div/following-sibling::p")).getText(); }

    public void setAddressLivingField (String addressLiving){ clearAddressLivingField(); addressLivingField.sendKeys(addressLiving); }
    public void clearAddressLivingField (){ new Actions(driver).click(addressLivingField).keyDown(CONTROL).sendKeys(addressLivingField, "a").keyUp(CONTROL).sendKeys(addressLivingField, DELETE).perform(); }
    public String getAddressLivingFieldErrorMessage(){ return driver.findElement(By.xpath("//input[@name='addressLiving']/parent::div/following-sibling::p")).getText(); }
    
    //------------------Contact--------------------------
    public void setEmailField (String email){ clearEmailField(); emailField.sendKeys(email); }
    public void clearEmailField (){ new Actions(driver).click(emailField).keyDown(CONTROL).sendKeys(emailField, "a").keyUp(CONTROL).sendKeys(emailField, DELETE).perform(); }
    public String getEmailFieldErrorMessage(){ return driver.findElement(By.xpath("//input[@name='email']/parent::div/following-sibling::p")).getText(); }

    public void setPhoneNumberField (int fieldNumber, String phoneNumber){
        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@name='телефон#"+fieldNumber+"']"));
        clearPhoneNumberField(fieldNumber); phoneNumberField.sendKeys(phoneNumber);
    }
    public void clearPhoneNumberField (int fieldNumber){
        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@name='телефон#"+fieldNumber+"']"));
        new Actions(driver).click(phoneNumberField).keyDown(CONTROL).sendKeys(phoneNumberField, "a").keyUp(CONTROL).sendKeys(phoneNumberField, DELETE).perform();
    }
    public String deletePhoneNumber(int fieldNumber){
        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@name='телефон#"+fieldNumber+"']/following::button[1]"));
        return driver.findElement(By.xpath("//input[@name='телефон#"+fieldNumber+"']/parent::div/following-sibling::p")).getText();
    }
    public String getPhoneNumberFieldErrorMessage(int fieldNumber){
        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@name='телефон#"+fieldNumber+"']"));
        return driver.findElement(By.xpath("//input[@name='телефон#"+fieldNumber+"']/parent::div/following-sibling::p")).getText();
    }
}