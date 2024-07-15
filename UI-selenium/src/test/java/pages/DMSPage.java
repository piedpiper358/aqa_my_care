package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.Keys.*;

public class DMSPage extends BasePage {

    @FindBy(xpath = "//a[@href='/insurance/dms/application-filling']")
    private WebElement applicationFillingButton;

    //------------------First stepper--------------------------
    @FindBy(xpath = "//input[@name='dateOfBirthOfInsured']")
    private WebElement dateOfBirthOfInsuredField;
    @FindBy(xpath = "//*[@id='demo-simple-select']")
    //@FindBy(xpath = "//input[@name='insuranceCity']")
    private WebElement insuranceCityField;

    @FindBy(xpath = "//input[@name='dentalCare']")
    private WebElement dentalCareCheckbox;
    @FindBy(xpath = "//input[@name='emergencyHospitalization']")
    private WebElement emergencyHospitalizationCheckbox;
    @FindBy(xpath = "//input[@name='emergencyMedicalCare']")
    private WebElement emergencyMedicalCareCheckbox;

    @FindBy(xpath = "//input[@name='paymentFrequency' and @value= '1']")
    private WebElement paymentFrequency1;
    @FindBy(xpath = "//input[@name='paymentFrequency' and @value= '3']")
    private WebElement paymentFrequency3;
    @FindBy(xpath = "//input[@name='paymentFrequency' and @value= '6']")
    private WebElement paymentFrequency6;
    @FindBy(xpath = "//input[@name='paymentFrequency' and @value= '12']")
    private WebElement paymentFrequency12;

    @FindBy(xpath = "//p[contains(text(), 'Точный расчет')]/span")
    private WebElement insuranceCost;
    @FindBy(xpath = "//button[contains(text(), 'Оформить заявку')]")
    private WebElement sendApplicationButton;

    //------------------Policyholder--------------------------
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameField;
    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    private WebElement hasMiddleNameCheckbox;
    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement middleNameField;
    @FindBy(xpath = "//input[@name='dateOfBirth']")
    private WebElement dateOfBirthField;
    @FindBy(xpath = "//*[@id='demo-simple-select' and following-sibling::input[@name='gender']]")
    private WebElement genderField;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement isInsuredPersonCheckbox;
    //------------------Insured person--------------------------
    @FindBy(xpath = "//input[@name='firstNameOfInsured']")
    private WebElement firstNameOfInsuredField;
    @FindBy(xpath = "//input[@name='lastNameOfInsured']")
    private WebElement lastNameOfInsuredField;
    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    private WebElement hasMiddleNameOfInsuredCheckbox;
    @FindBy(xpath = "//input[@name='middleNameOfInsured']")
    private WebElement middleNameOfInsuredField;
    @FindBy(xpath = "//input[@name='dateOfBirthOfInsured']")
    private WebElement dateOfBirthOfInsuredField2; //??
    @FindBy(xpath = "//*[@id='demo-simple-select' and following-sibling::input[@name='genderOfInsured']]")
    private WebElement genderOfInsuredField;
    //------------------Address--------------------------
    @FindBy(xpath = "//input[@name='region']")
    private WebElement regionField;
    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityField;
    @FindBy(xpath = "//input[@name='district']")
    private WebElement districtField;
    @FindBy(xpath = "//input[@name='street']")
    private WebElement streetField;
    @FindBy(xpath = "//input[@name='houseNumber']")
    private WebElement houseNumberField;
    @FindBy(xpath = "//input[@name='buildNumber']")
    private WebElement buildNumberField;
    @FindBy(xpath = "//input[@name='apartNumber']")
    private WebElement apartNumberField;
    //------------------Contact--------------------------
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    private WebElement phoneNumberField;
    //------------------Document--------------------------
    @FindBy(xpath = "//input[@name='nameFacilityIssued']")
    private WebElement nameFacilityIssuedField;
    @FindBy(xpath = "//input[@name='documentNum']")
    private WebElement documentNumField;
    @FindBy(xpath = "//input[@name='dateIssuedDocument']")
    private WebElement dateIssuedDocumentField;
    //------------------Dates--------------------------
    @FindBy(xpath = "//input[@name='insuranceStartDate']")
    private WebElement insuranceStartDateField;
    @FindBy(xpath = "//input[@name='insuranceEndDate']")
    private WebElement insuranceEndDateField;
    //----------------------------------------------------
    @FindBy(xpath = "//input[@name='agreement']")
    private WebElement agreementCheckbox;
    @FindBy(xpath = "//nav/button[@type='button']")
    private WebElement backButton;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement sendButton;
//----------------------------------------------

    public DMSPage() {
        PageFactory.initElements(driver, this); //инициализируем данный класс
        open("http://172.17.1.83/insurance/dms/application-filling");
    }
    public void goToSecondStepper() {
        setDateOfBirthOfInsured("10.02.1998");
        setInsuranceCity("Санкт-Петербург");
        clickSendApplicationButton();
    }
    public void setValidData() {
        setDateOfBirthOfInsured("10.02.1998");
        setInsuranceCity("Санкт-Петербург");
        clickSendApplicationButton();
        setFirstName("Гомер");
        setMiddleName("Джей");
        setLastName("Симсон");
        setDateOfBirth("10.02.1998");
        setGenderToMale();
        setFirstNameOfInsured("Барт");
        setMiddleNameOfInsured("Джоджо");
        setLastNameOfInsured("Симсон");
        //setDateOfBirthOfInsured2("10.03.1997");
        setGenderOfInsuredToMale();
        setRegion("США");
        setCity("Спрингфилд");
        setDistrict("Спрингфилд");
        setStreet("Вечнозеленая аллея");
        setHouseNumber("742");
        setBuildNumber("1");
        setApartNumber("1");
        setEmail("bart@simsons.com");
        setPhoneNumber("9214347867");
        setNameFacilityIssued("ГУ МВД по г Спрингфилд");
        setDocumentNum("1234567890");
        setDateIssuedDocument("20.04.2020");
        setInsuranceStartDate("14.07.2024");
        /*clearFirstName();
        setFirstName("Антон");
        clearLastName();
        setLastName("Тонченко");
        clearMiddleName();
        setMiddleName("Антонович");
        setPhoneNumber("88005553535");
        setBirthDate("01.01.1993");
        clickNextButton();
        clearEmail();
        setEmail("mili@mail.ru");
        clearPassword();
        setPassword("PassW_r3333");
        clearRepeatPassword();
        setRepeatPassword("PassW_r3333");
        clickBackRegistrationButton();*/
    }

    //------------------First stepper--------------------------
    public void clickApplicationFillingButton(){
        applicationFillingButton.click();
    }

    public void setDateOfBirthOfInsured (String dateOfBirthOfInsured){
        //clearDateOfBirthOfInsured();
        dateOfBirthOfInsuredField.click();
        dateOfBirthOfInsuredField.sendKeys(dateOfBirthOfInsured);
    }
    public void clearDateOfBirthOfInsured (){ new Actions(driver).click(dateOfBirthOfInsuredField).keyDown(CONTROL).sendKeys(dateOfBirthOfInsuredField, "a").keyUp(CONTROL).sendKeys(firstNameField, DELETE).perform(); }
    public String getDateOfBirthOfInsuredErrorMessage(){ return driver.findElement(By.xpath("//input[@name='dateOfBirthOfInsured']/parent::div/parent::div/following-sibling::p")).getText(); }


    public void setInsuranceCity (String insuranceCity){
        insuranceCityField.click();
        driver.findElement(By.xpath("//li[text()='"+insuranceCity+"']")).click();
        //insuranceCityField.sendKeys(insuranceCity);
    }
    public void clickSendApplicationButton(){
        sendApplicationButton.click();
    }
    public boolean checkSendApplicationButtonIsEnabled(){
        return sendApplicationButton.isEnabled();
    }

    //------------------Policyholder--------------------------
    public void setFirstName (String firstName){
        clearFirstName();
        firstNameField.sendKeys(firstName);

    }
    public void clearFirstName (){ new Actions(driver).click(firstNameField).keyDown(CONTROL).sendKeys(firstNameField, "a").keyUp(CONTROL).sendKeys(firstNameField, DELETE).perform(); }
    //public void clearFirstName (){ new Actions(driver).click(firstNameField).sendKeys(firstNameField, CONTROL + "a").sendKeys(firstNameField, DELETE).perform(); }
    public String getFirstNameErrorMessage(){ return driver.findElement(By.xpath("//input[@name='firstName']/parent::div/following-sibling::p")).getText(); }
    public String getFirstName(){ return firstNameField.getAttribute("value"); }

    public void setLastName (String lastName){ clearLastName(); lastNameField.sendKeys(lastName); }
    public void clearLastName (){ new Actions(driver).click(lastNameField).keyDown(CONTROL).sendKeys(lastNameField, "a").keyUp(CONTROL).sendKeys(lastNameField, DELETE).perform(); }
    public String getLastNameErrorMessage(){ return driver.findElement(By.xpath("//input[@name='lastName']/parent::div/following-sibling::p")).getText(); }

    public void setMiddleName (String middleName) {
        if (!hasMiddleNameCheckbox.isSelected()) { hasMiddleNameCheckbox.click();  }
        clearMiddleName();
        middleNameField.sendKeys(middleName);
    }
    public void clearMiddleName (){ new Actions(driver).click(middleNameField).keyDown(CONTROL).sendKeys(middleNameField, "a").keyUp(CONTROL).sendKeys(middleNameField, DELETE).perform(); }
    public String getMiddleNameErrorMessage(){ return driver.findElement(By.xpath("//input[@name='middleName']/parent::div/following-sibling::p")).getText(); }

    public void setGenderToMale(){
        genderField.click();
        driver.findElement(By.xpath("//li[@data-value='MALE']")).click();
    }
    public void setGenderToFemale(){
        genderField.click();
        driver.findElement(By.xpath("//li[@data-value='FEMALE']")).click();
    }

    public void setDateOfBirth (String dateOfBirth){
        clearDateOfBirth();
        //dateOfBirthField.click();
        dateOfBirthField.sendKeys(dateOfBirth);
    }
    public void clearDateOfBirth (){ new Actions(driver).click(dateOfBirthField).keyDown(CONTROL).sendKeys(dateOfBirthField, "a").keyUp(CONTROL).sendKeys(dateOfBirthField, DELETE).perform(); }
    public String getDateOfBirthErrorMessage(){ return driver.findElement(By.xpath("//input[@name='dateOfBirth']/parent::div/parent::div/following-sibling::p")).getText(); }


    //------------------Insured person--------------------------
    public void setFirstNameOfInsured (String firstNameOfInsured){ clearFirstNameOfInsured(); firstNameOfInsuredField.sendKeys(firstNameOfInsured); }
    public void clearFirstNameOfInsured (){ new Actions(driver).click(firstNameOfInsuredField).keyDown(CONTROL).sendKeys(firstNameOfInsuredField, "a").keyUp(CONTROL).sendKeys(firstNameOfInsuredField, DELETE).perform(); }
    public String getFirstNameOfInsuredErrorMessage(){ return driver.findElement(By.xpath("//input[@name='firstNameOfInsured']/parent::div/following-sibling::p")).getText(); }

    public void setLastNameOfInsured (String lastNameOfInsured){ clearLastNameOfInsured(); lastNameOfInsuredField.sendKeys(lastNameOfInsured); }
    public void clearLastNameOfInsured (){ new Actions(driver).click(lastNameOfInsuredField).keyDown(CONTROL).sendKeys(lastNameOfInsuredField, "a").keyUp(CONTROL).sendKeys(lastNameOfInsuredField, DELETE).perform(); }
    public String getLastNameOfInsuredErrorMessage(){ return driver.findElement(By.xpath("//input[@name='lastNameOfInsured']/parent::div/following-sibling::p")).getText(); }

    public void setMiddleNameOfInsured (String middleNameOfInsured) {
        if (!hasMiddleNameOfInsuredCheckbox.isSelected()) { hasMiddleNameOfInsuredCheckbox.click(); }
        clearMiddleNameOfInsured();
        middleNameOfInsuredField.sendKeys(middleNameOfInsured);
    }
    public void clearMiddleNameOfInsured (){ new Actions(driver).click(middleNameOfInsuredField).keyDown(CONTROL).sendKeys(middleNameOfInsuredField, "a").keyUp(CONTROL).sendKeys(middleNameOfInsuredField, DELETE).perform();}
    public String getMiddleNameOfInsuredErrorMessage(){ return driver.findElement(By.xpath("//input[@name='middleNameOfInsured']/parent::div/following-sibling::p")).getText(); }

    public void setGenderOfInsuredToMale(){
        genderOfInsuredField.click();
        driver.findElement(By.xpath("//li[@data-value='MALE']")).click();
    }
    public void setGenderOfInsuredToFemale(){
        genderOfInsuredField.click();
        driver.findElement(By.xpath("//li[@data-value='FEMALE']")).click();
    }

    public void setDateOfBirthOfInsured2 (String dateOfBirthOfInsured2){
        clearDateOfBirthOfInsured2();
        dateOfBirthOfInsuredField2.sendKeys(dateOfBirthOfInsured2);
    }
    public void clearDateOfBirthOfInsured2 (){ new Actions(driver).click(dateOfBirthOfInsuredField2).keyDown(CONTROL).sendKeys(dateOfBirthOfInsuredField2, "a").keyUp(CONTROL).sendKeys(dateOfBirthOfInsuredField2, DELETE).perform(); }
    public String getDateOfBirthOfInsured2ErrorMessage(){ return driver.findElement(By.xpath("//input[@name='dateOfBirthOfInsured']/parent::div/parent::div/following-sibling::p")).getText(); }


    //------------------Address--------------------------
    public void setRegion (String region){ clearRegion(); regionField.sendKeys(region); }
    public void clearRegion (){ new Actions(driver).click(regionField).keyDown(CONTROL).sendKeys(regionField, "a").keyUp(CONTROL).sendKeys(regionField, DELETE).perform(); }
    public String getRegionErrorMessage(){ return driver.findElement(By.xpath("//input[@name='region']/parent::div/following-sibling::p")).getText(); }

    public void setCity (String city){ clearCity(); cityField.sendKeys(city); }
    public void clearCity (){ new Actions(driver).click(cityField).keyDown(CONTROL).sendKeys(cityField, "a").keyUp(CONTROL).sendKeys(cityField, DELETE).perform(); }
    public String getCityErrorMessage(){ return driver.findElement(By.xpath("//input[@name='city']/parent::div/following-sibling::p")).getText(); }

    public void setDistrict (String district){ clearDistrict(); districtField.sendKeys(district); }
    public void clearDistrict (){ new Actions(driver).click(districtField).keyDown(CONTROL).sendKeys(districtField, "a").keyUp(CONTROL).sendKeys(districtField, DELETE).perform(); }
    public String getDistrictErrorMessage(){ return driver.findElement(By.xpath("//input[@name='district']/parent::div/following-sibling::p")).getText(); }

    public void setStreet (String street){ clearStreet(); streetField.sendKeys(street); }
    public void clearStreet (){ new Actions(driver).click(streetField).keyDown(CONTROL).sendKeys(streetField, "a").keyUp(CONTROL).sendKeys(streetField, DELETE).perform(); }
    public String getStreetErrorMessage(){ return driver.findElement(By.xpath("//input[@name='street']/parent::div/following-sibling::p")).getText(); }

    public void setHouseNumber (String houseNumber){ clearHouseNumber(); houseNumberField.sendKeys(houseNumber); }
    public void clearHouseNumber (){ new Actions(driver).click(houseNumberField).keyDown(CONTROL).sendKeys(houseNumberField, "a").keyUp(CONTROL).sendKeys(houseNumberField, DELETE).perform(); }
    public String getHouseNumberErrorMessage(){ return driver.findElement(By.xpath("//input[@name='houseNumber']/parent::div/following-sibling::p")).getText(); }

    public void setBuildNumber (String buildNumber){ clearBuildNumber(); buildNumberField.sendKeys(buildNumber); }
    public void clearBuildNumber (){ new Actions(driver).click(buildNumberField).keyDown(CONTROL).sendKeys(buildNumberField, "a").keyUp(CONTROL).sendKeys(buildNumberField, DELETE).perform(); }
    public String getBuildNumberErrorMessage(){ return driver.findElement(By.xpath("//input[@name='buildNumber']/parent::div/following-sibling::p")).getText(); }

    public void setApartNumber (String apartNumber){ clearApartNumber(); apartNumberField.sendKeys(apartNumber); }
    public void clearApartNumber (){ new Actions(driver).click(apartNumberField).keyDown(CONTROL).sendKeys(apartNumberField, "a").keyUp(CONTROL).sendKeys(apartNumberField, DELETE).perform(); }
    public String getApartNumberErrorMessage(){ return driver.findElement(By.xpath("//input[@name='apartNumber']/parent::div/following-sibling::p")).getText(); }

    //------------------Contact--------------------------
    public void setEmail (String email){
        clearEmail();
        emailField.sendKeys(email);
    }
    public void clearEmail (){ new Actions(driver).click(emailField).keyDown(CONTROL).sendKeys(emailField, "a").keyUp(CONTROL).sendKeys(emailField, DELETE).perform(); }
    public String getEmailErrorMessage(){ return driver.findElement(By.xpath("//input[@name='email']/parent::div/following-sibling::p")).getText(); }

    public void setPhoneNumber (String phoneNumber){
        clearPhoneNumber();
        phoneNumberField.sendKeys(phoneNumber);
    }
    public void clearPhoneNumber (){ new Actions(driver).click(phoneNumberField).keyDown(CONTROL).sendKeys(phoneNumberField, "a").keyUp(CONTROL).sendKeys(phoneNumberField, DELETE).perform(); }
    public String getPhoneNumberErrorMessage(){ return driver.findElement(By.xpath("//input[@name='phoneNumber']/parent::div/following-sibling::p")).getText(); }

    //------------------Document--------------------------
    public void setNameFacilityIssued (String nameFacilityIssued){ clearNameFacilityIssued(); nameFacilityIssuedField.sendKeys(nameFacilityIssued); }
    public void clearNameFacilityIssued (){ new Actions(driver).click(nameFacilityIssuedField).keyDown(CONTROL).sendKeys(nameFacilityIssuedField, "a").keyUp(CONTROL).sendKeys(nameFacilityIssuedField, DELETE).perform(); }
    public String getNameFacilityIssuedErrorMessage(){ return driver.findElement(By.xpath("//input[@name='nameFacilityIssued']/parent::div/following-sibling::p")).getText(); }

    public void setDocumentNum (String documentNum){ clearDocumentNum(); documentNumField.sendKeys(documentNum); }
    public void clearDocumentNum (){ new Actions(driver).click(documentNumField).keyDown(CONTROL).sendKeys(documentNumField, "a").keyUp(CONTROL).sendKeys(documentNumField, DELETE).perform(); }
    public String getDocumentNumErrorMessage(){ return driver.findElement(By.xpath("//input[@name='documentNum']/parent::div/following-sibling::p")).getText(); }

    public void setDateIssuedDocument (String dateIssuedDocument){
        clearDateIssuedDocument();
        dateIssuedDocumentField.sendKeys(dateIssuedDocument);
    }
    public void clearDateIssuedDocument (){ new Actions(driver).click(dateIssuedDocumentField).keyDown(CONTROL).sendKeys(dateIssuedDocumentField, "a").keyUp(CONTROL).sendKeys(dateIssuedDocumentField, DELETE).perform(); }
    public String getDateIssuedDocumentErrorMessage(){ return driver.findElement(By.xpath("//input[@name='dateIssuedDocument']/parent::div/parent::div/following-sibling::p")).getText(); }

    //------------------Dates--------------------------
    public void setInsuranceStartDate (String insuranceStartDate){
        clearInsuranceStartDate();
        //insuranceStartDateField.click();
        insuranceStartDateField.sendKeys(insuranceStartDate);
    }
    public void clearInsuranceStartDate (){ new Actions(driver).click(insuranceStartDateField).keyDown(CONTROL).sendKeys(insuranceStartDateField, "a").keyUp(CONTROL).sendKeys(insuranceStartDateField, DELETE).perform();}
    public String getInsuranceStartDateErrorMessage(){ return driver.findElement(By.xpath("//input[@name='insuranceStartDate']/parent::div/parent::div/following-sibling::p")).getText(); }

    //end date..

    public void checkAgreementCheckbox () {
        if (!agreementCheckbox.isSelected()) { agreementCheckbox.click(); }
    }
    public void uncheckAgreementCheckbox () {
        if (agreementCheckbox.isSelected()) { agreementCheckbox.click(); }
    }
    public String getAgreementCheckboxErrorMessage(){ return driver.findElement(By.xpath("//input[@name='agreement']/parent::span/parent::label/following-sibling::p")).getText(); }

    //-------------------------------------------------
    public void clickBackButton(){
        backButton.click();
    }
    public void clickSendButton(){
        sendButton.click();
    }
    public boolean checkSendButtonIsEnabled(){
        return sendButton.isEnabled();
    }
}