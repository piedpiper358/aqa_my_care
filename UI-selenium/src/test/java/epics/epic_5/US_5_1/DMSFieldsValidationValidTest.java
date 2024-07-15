package epics.epic_5.US_5_1;

import core.BaseTest;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import pages.DMSPage;


public class DMSFieldsValidationValidTest extends BaseTest {
    static DMSPage dmsPage;
    @BeforeAll
    public static void preconditions() {
        dmsPage = new DMSPage();
    }

    @Owner(value = "Сапожников Борис")
    @DisplayName("Оформление ДМС с валидными данными")
    @Test
    public void validDataRegistration(){
        //dmsPage.clickApplicationFillingButton();
        dmsPage.setDateOfBirthOfInsured("10.02.1998");
        dmsPage.setInsuranceCity("Санкт-Петербург");
        dmsPage.clickSendApplicationButton();
        dmsPage.setFirstName("Гомер");
        dmsPage.setLastName("Симсон");
        dmsPage.setMiddleName("Джей");
        dmsPage.setDateOfBirth("10.02.1998");
        dmsPage.setGenderToMale();
        dmsPage.setFirstNameOfInsured("Барт");
        dmsPage.setLastNameOfInsured("Симсон");
        dmsPage.setMiddleNameOfInsured("Джоджо");
        dmsPage.setDateOfBirthOfInsured2("10.03.1997");
        dmsPage.setGenderOfInsuredToMale();
        dmsPage.setRegion("США");
        dmsPage.setCity("Спрингфилд");
        dmsPage.setDistrict("Спрингфилд");
        dmsPage.setStreet("Вечнозеленая аллея");
        dmsPage.setHouseNumber("742");
        dmsPage.setBuildNumber("1");
        dmsPage.setApartNumber("1");
        dmsPage.setEmail("bart@simsons.com");
        dmsPage.setPhoneNumber("9214347867");
        dmsPage.setNameFacilityIssued("ГУ МВД по г Спрингфилд");
        dmsPage.setDocumentNum("1234567890");
        dmsPage.setDateIssuedDocument("20.04.2020");
        dmsPage.setInsuranceStartDate("30.07.2024");
        dmsPage.checkAgreementCheckbox();
        dmsPage.clickSendButton();
        Assertions.assertFalse(driver.findElements(By.xpath("//*[contains(.,'Заявка на оформление ДМС подана')]")).isEmpty());
    }
}