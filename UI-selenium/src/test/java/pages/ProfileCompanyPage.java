package pages;

import core.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.Keys.CONTROL;
import static org.openqa.selenium.Keys.DELETE;

@Getter
public class ProfileCompanyPage extends BasePage {

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
    @FindBy(xpath = "//input[@name='role']")
    private WebElement roleField;

    @FindBy(xpath = "//h4[text()='Личные данные']/following::button[text()='Сохранить']")
    private WebElement savePersonalInfoButton;
    @FindBy(xpath = "//h4[text()='Личные данные']/following::button[text()='Отменить']")
    private WebElement cancelPersonalInfoChangeButton;

    //------------------Passport--------------------------
    @FindBy(xpath = "//p[contains(.,'Добавьте паспортные данные')]")
    private WebElement addPassportButton;

    @FindBy(xpath = "//input[@name='documentSeries']")
    private WebElement passportSeriesField;
    @FindBy(xpath = "//input[@name='documentNumber']")
    private WebElement passportNumberField;
    @FindBy(xpath = "//input[@name='issuedDate']")
    private WebElement passportIssuedDateField;
    @FindBy(xpath = "//input[@name='documentDuration']")
    private WebElement passportDurationField; //???
    @FindBy(xpath = "//input[@name='issuedBy']")
    private WebElement passportIssuedByField;

    @FindBy(xpath = "//h4[text()='Паспортные данные']/following::button[text()='Сохранить']")
    private WebElement savePassportButton;
    @FindBy(xpath = "//h4[text()='Паспортные данные']/following::button[text()='Отменить']")
    private WebElement cancelPassportChangeButton;

    //------------------Basis Document--------------------------
    @FindBy(xpath = "//p[contains(.,'Добавьте \"документ - основание\"')]")
    private WebElement addDocumentButton;

    @FindBy(xpath = "//input[@name='basisType']")
    private WebElement documentTypeField;
    @FindBy(xpath = "//input[@name='basisNumber']")
    private WebElement documentNumberField;
    @FindBy(xpath = "//input[@name='basisStartDate']")
    private WebElement documentStartDateField;
    @FindBy(xpath = "//input[@name='basisEndDate']")
    private WebElement documentEndDateField;

    @FindBy(xpath = "//h4[text()='Добавьте \"документ - основание\"']/following::button[text()='Сохранить']")
    private WebElement saveDocumentButton;
    @FindBy(xpath = "//h4[text()='Добавьте \"документ - основание\"']/following::button[text()='Отменить']")
    private WebElement cancelDocumentChangeButton;


    //------------------Company Info--------------------------
    @FindBy(xpath = "//p[contains(.,'Добавьте данные компании')]")
    private WebElement addCompanyInfoButton;
    @FindBy(xpath = "//input[@name='fullName']")
    private WebElement companyFullNameField;
    @FindBy(xpath = "//input[@name='shortName']")
    private WebElement companyShortNameField;

    @FindBy(xpath = "//input[@name='INN']")
    private WebElement companyINNField;
    @FindBy(xpath = "//input[@name='OGRN']")
    private WebElement companyOGRNField;
    @FindBy(xpath = "//input[@name='KPP']")
    private WebElement companyKPPField;
    @FindBy(xpath = "//input[@name='bank']")
    private WebElement companyBankField;
    @FindBy(xpath = "//input[@name='accountNumber']")
    private WebElement companyAccountNumberField;

    @FindBy(xpath = "//input[@name='country']")
    private WebElement countryField;
    @FindBy(xpath = "//input[@name='region']")
    private WebElement regionField;
    @FindBy(xpath = "//input[@name='district']")
    private WebElement districtField;
    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityField;
    @FindBy(xpath = "//input[@name='street']")
    private WebElement streetField;
    @FindBy(xpath = "//input[@name='house']")
    private WebElement houseNumberField;
    @FindBy(xpath = "//input[@name='entrance']") //почему entrance?
    private WebElement buildNumberField;
    @FindBy(xpath = "//input[@name='office']")
    private WebElement officeNumberField;

    @FindBy(xpath = "//h4[text()='Данные компании']/following::button[text()='Сохранить']")
    private WebElement saveAddressButton;
    @FindBy(xpath = "//h4[text()='Данные компании']/following::button[text()='Отменить']")
    private WebElement cancelAddressChangeButton;

    //------------------Contact--------------------------
    @FindBy(xpath = "//p[contains(.,'Добавьте контакты')]")
    private WebElement addContactButton;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;



    @FindBy(xpath = "//input[@id='phone-profile-input' and @name='fax']")
    private static WebElement faxPhoneNumberField;
    @FindBy(xpath = "//input[@id='phone-profile-input' and @name='work']")
    private static WebElement workPhoneNumberField;
    @FindBy(xpath = "//input[@id='phone-profile-input' and @name='home']")
    private static WebElement homePhoneNumberField;
    @FindBy(xpath = "//input[@id='phone-profile-input' and @name='mob']")
    private static WebElement mobilePhoneNumberField;

    public enum PhoneType {
        //driver.findElement(
        FAX("fax", faxPhoneNumberField), WORK("work", workPhoneNumberField), HOME("home", homePhoneNumberField), MOB("mob", mobilePhoneNumberField) ;
        public final String label;
        public final WebElement element;

        private PhoneType(String type, WebElement element){
            this.label = type;
            this.element = element;
        }
    }

    @FindBy(xpath = "//h4[text()='Контактные данные']/following::button[text()='Добавить номер']")
    private WebElement addPhoneNumberButton;
    @FindBy(xpath = "//h4[text()='Контактные данные']/following::button[text()='Сохранить']")
    private WebElement saveContactButton;
    @FindBy(xpath = "//h4[text()='Контактные данные']/following::button[text()='Отменить']")
    private WebElement cancelContactInfoChangeButton;

    public ProfileCompanyPage() {
        PageFactory.initElements(driver, this); //инициализируем данный класс
        open("http://172.17.1.83/profile/legal");
    }
    public void openAllInfoBlocks(){
        getChangePersonalInfoButton().click();
        getAddPassportButton().click();
        getAddDocumentButton().click();
        getAddCompanyInfoButton().click();
        getAddContactButton().click();
    }

    public void setValidData(){
        getChangePersonalInfoButton().click();
        setFirstNameField("Чарльз");
        //Assertions.assertFalse(profileIndividualPage.getMiddleNameFieldErrorMessage().isEmpty());
        setLastNameField("Бёрнс");
        setMiddleNameField("Монтгомери");
        setDateOfBirthField("15.09.1890");
        setRoleField("Владелец");

        getAddPassportButton().click();
        setPassportSeriesField("1234");
        setPassportNumberField("567890");
        setPassportIssuedDateField("20.04.2020");
        setPassportIssuedByField("ГУ МВД по г Спрингфилд");

        getAddDocumentButton().click();
        setDocumentTypeField("proxy");
        setDocumentNumberField("567890"); //&&&
        setDocumentStartDateField("20.04.2020");
        setDocumentEndDateField("20.04.2025");
        
        getAddCompanyInfoButton().click();
        setCompanyShortNameField("Спрингфилдская АЭС");
        setCompanyFullNameField("Атомная электростанция города Спрингфилд");
        setCompanyINNField("123456789012");
        setCompanyOGRNField("1234567890123");
        setCompanyKPPField("123456789");
        setCompanyBankField("Банк города Спрингфилд");
        setCompanyAccountNumberField("12345678901234567890");

        setCountryField("США");
        setRegionField("Спрингфилд");
        setDistrictField("Спрингфилд");
        setCityField("Спрингфилд");
        setStreetField("Индустриальная дорога");
        setHouseNumberField("100");
        setBuildNumberField("1");
        setOfficeNumberField("1");

        getAddContactButton().click();
        setEmailField("homer@simsons.com");
        getAddPhoneNumberButton().click();
        setPhoneNumberField(PhoneType.FAX,"9214347867");
        getAddPhoneNumberButton().click();
        //setPhoneNumberField(1,"9214343498");
    }

    //------------------Personal--------------------------
    public void setFirstNameField (String firstName){ clearFirstNameField(); firstNameField.sendKeys(firstName);}
    public void clearFirstNameField (){ new Actions(driver).click(firstNameField).keyDown(CONTROL).sendKeys(firstNameField, "a").keyUp(CONTROL).sendKeys(firstNameField, DELETE).perform(); }
    public String getFirstNameFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='firstName']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }
    public String getFirstNameField(){ return firstNameField.getAttribute("value"); }

    public void setLastNameField (String lastName){ clearLastNameField(); lastNameField.sendKeys(lastName); }
    public void clearLastNameField (){ new Actions(driver).click(lastNameField).keyDown(CONTROL).sendKeys(lastNameField, "a").keyUp(CONTROL).sendKeys(lastNameField, DELETE).perform(); }
    public String getLastNameFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='lastName']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setMiddleNameField (String middleName) { clearMiddleNameField(); middleNameField.sendKeys(middleName); }
    public void clearMiddleNameField (){ new Actions(driver).click(middleNameField).keyDown(CONTROL).sendKeys(middleNameField, "a").keyUp(CONTROL).sendKeys(middleNameField, DELETE).perform(); }
    public String getMiddleNameFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='middleName']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }


    public void setDateOfBirthField (String dateOfBirth){ clearDateOfBirthField(); birthDateField.sendKeys(dateOfBirth); }
    public void clearDateOfBirthField (){ new Actions(driver).click(birthDateField).keyDown(CONTROL).sendKeys(birthDateField, "a").keyUp(CONTROL).sendKeys(birthDateField, DELETE).perform(); }
    public String getDateOfBirthFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='birthDate']/parent::div/parent::div/following-sibling::span")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }


    public void setRoleField (String role){ clearRoleField(); roleField.sendKeys(role); }
    public void clearRoleField (){ new Actions(driver).click(roleField).keyDown(CONTROL).sendKeys(roleField, "a").keyUp(CONTROL).sendKeys(roleField, DELETE).perform(); }
    public String getRoleFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='role']/parent::div/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    //------------------Passport--------------------------

    public void setPassportSeriesField (String passportSeries){ clearPassportSeriesField (); passportSeriesField.sendKeys(passportSeries); }
    public void clearPassportSeriesField  (){ new Actions(driver).click(passportSeriesField).keyDown(CONTROL).sendKeys(passportSeriesField, "a").keyUp(CONTROL).sendKeys(passportSeriesField, DELETE).perform(); }
    public String getPassportSeriesFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='documentSeries']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setPassportNumberField (String documentNumber){ clearPassportNumberField(); passportNumberField.sendKeys(documentNumber); }
    public void clearPassportNumberField (){ new Actions(driver).click(passportNumberField).keyDown(CONTROL).sendKeys(passportNumberField, "a").keyUp(CONTROL).sendKeys(passportNumberField, DELETE).perform(); }
    public String getPassportNumberFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='documentNumber']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setPassportIssuedDateField (String passportIssuedDate){ clearPassportIssuedDateField(); passportIssuedDateField.sendKeys(passportIssuedDate); }
    public void clearPassportIssuedDateField (){ new Actions(driver).click(passportIssuedDateField).keyDown(CONTROL).sendKeys(passportIssuedDateField, "a").keyUp(CONTROL).sendKeys(passportIssuedDateField, DELETE).perform(); }
    public String getPassportIssuedDateFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='issuedDate']/parent::div/parent::div/following-sibling::span")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setPassportIssuedByField (String nameFacilityIssued){ clearPassportIssuedByField(); passportIssuedByField.sendKeys(nameFacilityIssued); }
    public void clearPassportIssuedByField (){ new Actions(driver).click(passportIssuedByField).keyDown(CONTROL).sendKeys(passportIssuedByField, "a").keyUp(CONTROL).sendKeys(passportIssuedByField, DELETE).perform(); }
    public String getPassportIssuedByFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='issuedBy']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    //------------------Basis Document--------------------------

    public void setDocumentTypeField (String documentType){ clearDocumentTypeField(); documentTypeField.sendKeys(documentType); }
    public void clearDocumentTypeField (){ new Actions(driver).click(documentTypeField).keyDown(CONTROL).sendKeys(documentTypeField, "a").keyUp(CONTROL).sendKeys(documentTypeField, DELETE).perform(); }
    public String getDocumentTypeFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='basisType']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setDocumentNumberField (String documentNumber){ clearDocumentNumberField(); documentNumberField.sendKeys(documentNumber); }
    public void clearDocumentNumberField (){ new Actions(driver).click(documentNumberField).keyDown(CONTROL).sendKeys(documentNumberField, "a").keyUp(CONTROL).sendKeys(documentNumberField, DELETE).perform(); }
    public String getDocumentNumberFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='basisNumber']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setDocumentStartDateField (String basisStartDate){ clearDocumentStartDateField(); documentStartDateField.sendKeys(basisStartDate); }
    public void clearDocumentStartDateField (){ new Actions(driver).click(documentStartDateField).keyDown(CONTROL).sendKeys(documentStartDateField, "a").keyUp(CONTROL).sendKeys(documentStartDateField, DELETE).perform(); }
    public String getDocumentStartDateFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='basisStartDate']/parent::div/parent::div/following-sibling::span")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setDocumentEndDateField (String basisEndDate){ clearDocumentEndDateField(); documentEndDateField.sendKeys(basisEndDate); }
    public void clearDocumentEndDateField (){ new Actions(driver).click(documentEndDateField).keyDown(CONTROL).sendKeys(documentEndDateField, "a").keyUp(CONTROL).sendKeys(documentEndDateField, DELETE).perform(); }
    public String getDocumentEndDateFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='basisEndDate']/parent::div/parent::div/following-sibling::span")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    //------------------Company Info------------------------------------------------------------------------------------------------------
    public void setCompanyFullNameField (String companyFullName){ clearCompanyFullNameField(); companyFullNameField.sendKeys(companyFullName); }
    public void clearCompanyFullNameField (){ new Actions(driver).click(companyFullNameField).keyDown(CONTROL).sendKeys(companyFullNameField, "a").keyUp(CONTROL).sendKeys(companyFullNameField, DELETE).perform(); }
    public String getCompanyFullNameFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='fullName']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setCompanyShortNameField (String companyShortName){ clearCompanyShortNameField(); companyShortNameField.sendKeys(companyShortName); }
    public void clearCompanyShortNameField (){ new Actions(driver).click(companyShortNameField).keyDown(CONTROL).sendKeys(companyShortNameField, "a").keyUp(CONTROL).sendKeys(companyShortNameField, DELETE).perform(); }
    public String getCompanyShortNameFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='shortName']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setCompanyINNField (String companyINN){ clearCompanyINNField(); companyINNField.sendKeys(companyINN); }
    public void clearCompanyINNField (){ new Actions(driver).click(companyINNField).keyDown(CONTROL).sendKeys(companyINNField, "a").keyUp(CONTROL).sendKeys(companyINNField, DELETE).perform(); }
    public String getCompanyINNFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='INN']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setCompanyOGRNField (String companyOGRN){ clearCompanyOGRNField(); companyOGRNField.sendKeys(companyOGRN); }
    public void clearCompanyOGRNField (){ new Actions(driver).click(companyOGRNField).keyDown(CONTROL).sendKeys(companyOGRNField, "a").keyUp(CONTROL).sendKeys(companyOGRNField, DELETE).perform(); }
    public String getCompanyOGRNFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='OGRN']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setCompanyKPPField (String companyKPP){ clearCompanyKPPField(); companyKPPField.sendKeys(companyKPP); }
    public void clearCompanyKPPField (){ new Actions(driver).click(companyKPPField).keyDown(CONTROL).sendKeys(companyKPPField, "a").keyUp(CONTROL).sendKeys(companyKPPField, DELETE).perform(); }
    public String getCompanyKPPFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='KPP']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setCompanyBankField (String companyBank){ clearCompanyBankField(); companyBankField.sendKeys(companyBank); }
    public void clearCompanyBankField (){ new Actions(driver).click(companyBankField).keyDown(CONTROL).sendKeys(companyBankField, "a").keyUp(CONTROL).sendKeys(companyBankField, DELETE).perform(); }
    public String getCompanyBankFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='bank']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }


    public void setCompanyAccountNumberField (String companyAccountNumber){ clearCompanyAccountNumberField(); companyAccountNumberField.sendKeys(companyAccountNumber); }
    public void clearCompanyAccountNumberField (){ new Actions(driver).click(companyAccountNumberField).keyDown(CONTROL).sendKeys(companyAccountNumberField, "a").keyUp(CONTROL).sendKeys(companyAccountNumberField, DELETE).perform(); }
    public String getCompanyAccountNumberFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='accountNumber']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    //----------------

    public void setCountryField (String country){ clearCountryField(); countryField.sendKeys(country); }
    public void clearCountryField (){ new Actions(driver).click(countryField).keyDown(CONTROL).sendKeys(countryField, "a").keyUp(CONTROL).sendKeys(countryField, DELETE).perform(); }
    public String getCountryFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='country']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }


    public void setRegionField (String region){ clearRegionField(); regionField.sendKeys(region); }
    public void clearRegionField (){ new Actions(driver).click(regionField).keyDown(CONTROL).sendKeys(regionField, "a").keyUp(CONTROL).sendKeys(regionField, DELETE).perform(); }
    public String getRegionFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='region']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setDistrictField (String district){ clearDistrictField(); districtField.sendKeys(district); }
    public void clearDistrictField (){ new Actions(driver).click(districtField).keyDown(CONTROL).sendKeys(districtField, "a").keyUp(CONTROL).sendKeys(districtField, DELETE).perform(); }
    public String getDistrictFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='district']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setCityField (String city){ clearCityField(); cityField.sendKeys(city); }
    public void clearCityField (){ new Actions(driver).click(cityField).keyDown(CONTROL).sendKeys(cityField, "a").keyUp(CONTROL).sendKeys(cityField, DELETE).perform(); }
    public String getCityFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='city']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }
   
    public void setStreetField (String street){ clearStreetField(); streetField.sendKeys(street); }
    public void clearStreetField (){ new Actions(driver).click(streetField).keyDown(CONTROL).sendKeys(streetField, "a").keyUp(CONTROL).sendKeys(streetField, DELETE).perform(); }
    public String getStreetFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='street']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setHouseNumberField (String houseNumber){ clearHouseNumberField(); houseNumberField.sendKeys(houseNumber); }
    public void clearHouseNumberField (){ new Actions(driver).click(houseNumberField).keyDown(CONTROL).sendKeys(houseNumberField, "a").keyUp(CONTROL).sendKeys(houseNumberField, DELETE).perform(); }
    public String getHouseNumberFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='house']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setBuildNumberField (String buildNumber){ clearBuildNumberField(); buildNumberField.sendKeys(buildNumber); }
    public void clearBuildNumberField (){ new Actions(driver).click(buildNumberField).keyDown(CONTROL).sendKeys(buildNumberField, "a").keyUp(CONTROL).sendKeys(buildNumberField, DELETE).perform(); }
    public String getBuildNumberFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='entrance']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setOfficeNumberField (String officeNumber){ clearOfficeNumberField(); officeNumberField.sendKeys(officeNumber); }
    public void clearOfficeNumberField (){ new Actions(driver).click(officeNumberField).keyDown(CONTROL).sendKeys(officeNumberField, "a").keyUp(CONTROL).sendKeys(officeNumberField, DELETE).perform(); }
    public String getOfficeNumberFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='office']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }



    //------------------Contact--------------------------
    public void setEmailField (String email){ clearEmailField(); emailField.sendKeys(email); }
    public void clearEmailField (){ new Actions(driver).click(emailField).keyDown(CONTROL).sendKeys(emailField, "a").keyUp(CONTROL).sendKeys(emailField, DELETE).perform(); }
    public String getEmailFieldErrorMessage(){
        try {
            return driver.findElement(By.xpath("//input[@name='email']/parent::div/following-sibling::p")).getText();
        }
        catch(NoSuchElementException e){ return ""; }
    }

    public void setPhoneNumberField (PhoneType phoneType, String phoneNumber){
        //WebElement phoneNumberField = driver.findElement(By.xpath("//input[id='phone-profile-input' and @name='"+phoneType.label+"']"));
        clearPhoneNumberField(phoneType); phoneType.element.sendKeys(phoneNumber);
    }
    public void clearPhoneNumberField (PhoneType phoneType){
        //WebElement phoneNumberField = driver.findElement(By.xpath("//input[@name='телефон#"+phoneType.label+"']"));
        new Actions(driver).click(phoneType.element).keyDown(CONTROL).sendKeys(phoneType.element, "a").keyUp(CONTROL).sendKeys(phoneType.element, DELETE).perform();
    }
    /*public String deletePhoneNumber(int fieldNumber){
        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@name='телефон#"+fieldNumber+"']/following::button[1]"));
       
        try {
            return driver.findElement(By.xpath("//input[@name='телефон#"+fieldNumber+"']/parent::div/following-sibling::p")).getText();
    }*/
    public String getPhoneNumberFieldErrorMessage(PhoneType phoneType) {
        try {
            return driver.findElement(By.xpath("//input[@id='phone-profile-input' and @name='" + phoneType.label + "']/parent::div/following-sibling::p")).getText();
        } catch (NoSuchElementException e) {
            return "";
        }
    }
}