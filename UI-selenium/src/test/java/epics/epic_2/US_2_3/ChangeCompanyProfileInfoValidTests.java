package epics.epic_2.US_2_3;

import core.BaseTest;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ProfileCompanyPage;
import pages.ProfileCompanyPage.PhoneType;

public class ChangeCompanyProfileInfoValidTests extends BaseTest {
    static ProfileCompanyPage profileCompanyPage;
    @BeforeAll
    public static void preconditions() {
        profileCompanyPage = new ProfileCompanyPage();
    }

    @Owner(value = "Сапожников Борис")
    @DisplayName("Изменение профиля Юрлица")
    @Test
    public void validDataRegistration(){
        //profileCompanyPage.setValidData();
        profileCompanyPage.getChangePersonalInfoButton().click();
        profileCompanyPage.setFirstNameField("Чарльз");
        Assertions.assertTrue(profileCompanyPage.getFirstNameFieldErrorMessage().isEmpty());
        //profileCompanyPage.setLastNameField("Бёрнс");
        profileCompanyPage.setLastNameField("Бернс");
        Assertions.assertTrue(profileCompanyPage.getLastNameFieldErrorMessage().isEmpty());
        profileCompanyPage.setMiddleNameField("Монтгомери");
        Assertions.assertTrue(profileCompanyPage.getMiddleNameFieldErrorMessage().isEmpty());
        profileCompanyPage.setDateOfBirthField("15.09.1890");
        Assertions.assertTrue(profileCompanyPage.getDateOfBirthFieldErrorMessage().isEmpty());
        profileCompanyPage.setRoleField("Владелец");
        Assertions.assertTrue(profileCompanyPage.getRoleFieldErrorMessage().isEmpty());


        profileCompanyPage.getAddPassportButton().click();
        profileCompanyPage.setPassportSeriesField("1234");
        Assertions.assertTrue(profileCompanyPage.getPassportSeriesFieldErrorMessage().isEmpty());
        profileCompanyPage.setPassportNumberField("567890");
        Assertions.assertTrue(profileCompanyPage.getPassportNumberFieldErrorMessage().isEmpty());
        profileCompanyPage.setPassportIssuedDateField("20.04.2020");
        Assertions.assertTrue(profileCompanyPage.getPassportIssuedDateFieldErrorMessage().isEmpty());
        profileCompanyPage.setPassportIssuedByField("ГУ МВД по г Спрингфилд");
        Assertions.assertTrue(profileCompanyPage.getPassportIssuedByFieldErrorMessage().isEmpty());


        profileCompanyPage.getAddDocumentButton().click();
        profileCompanyPage.setDocumentTypeField("proxy");
        Assertions.assertTrue(profileCompanyPage.getDocumentTypeFieldErrorMessage().isEmpty());
        profileCompanyPage.setDocumentNumberField("567890"); //&&&
        Assertions.assertTrue(profileCompanyPage.getDocumentNumberFieldErrorMessage().isEmpty());
        profileCompanyPage.setDocumentStartDateField("20.04.2020");
        Assertions.assertTrue(profileCompanyPage.getDocumentStartDateFieldErrorMessage().isEmpty());
        profileCompanyPage.setDocumentEndDateField("20.04.2025");
        Assertions.assertTrue(profileCompanyPage.getDocumentEndDateFieldErrorMessage().isEmpty());

        profileCompanyPage.setCompanyFullNameField("Атомная электростанция города Спрингфилд");
        Assertions.assertTrue(profileCompanyPage.getCompanyFullNameFieldErrorMessage().isEmpty());
        profileCompanyPage.getAddCompanyInfoButton().click();
        profileCompanyPage.setCompanyShortNameField("Спрингфилдская АЭС");
        Assertions.assertTrue(profileCompanyPage.getCompanyShortNameFieldErrorMessage().isEmpty());
        profileCompanyPage.setCompanyINNField("123456789012");
        Assertions.assertTrue(profileCompanyPage.getCompanyINNFieldErrorMessage().isEmpty());

        profileCompanyPage.setCompanyOGRNField("1234567890123");
        Assertions.assertTrue(profileCompanyPage.getCompanyOGRNFieldErrorMessage().isEmpty());
        profileCompanyPage.setCompanyKPPField("123456789");
        Assertions.assertTrue(profileCompanyPage.getCompanyKPPFieldErrorMessage().isEmpty());
        profileCompanyPage.setCompanyBankField("Банк города Спрингфилд");
        Assertions.assertTrue(profileCompanyPage.getCompanyBankFieldErrorMessage().isEmpty());
        profileCompanyPage.setCompanyAccountNumberField("12345678901234567890");
        Assertions.assertTrue(profileCompanyPage.getCompanyAccountNumberFieldErrorMessage().isEmpty());


        profileCompanyPage.setCountryField("США");
        Assertions.assertTrue(profileCompanyPage.getCountryFieldErrorMessage().isEmpty());
        profileCompanyPage.setRegionField("Спрингфилд");
        Assertions.assertTrue(profileCompanyPage.getRegionFieldErrorMessage().isEmpty());
        profileCompanyPage.setDistrictField("Спрингфилд");
        Assertions.assertTrue(profileCompanyPage.getDistrictFieldErrorMessage().isEmpty());
        profileCompanyPage.setCityField("Спрингфилд");
        Assertions.assertTrue(profileCompanyPage.getCityFieldErrorMessage().isEmpty());
        profileCompanyPage.setStreetField("Индустриальная дорога");
        Assertions.assertTrue(profileCompanyPage.getStreetFieldErrorMessage().isEmpty());
        profileCompanyPage.setHouseNumberField("100");
        Assertions.assertTrue(profileCompanyPage.getHouseNumberFieldErrorMessage().isEmpty());
        profileCompanyPage.setBuildNumberField("1");
        Assertions.assertTrue(profileCompanyPage.getBuildNumberFieldErrorMessage().isEmpty());
        profileCompanyPage.setOfficeNumberField("1");
        Assertions.assertTrue(profileCompanyPage.getOfficeNumberFieldErrorMessage().isEmpty());


        profileCompanyPage.getAddContactButton().click();
        profileCompanyPage.setEmailField("homer@simsons.com");
        profileCompanyPage.getAddPhoneNumberButton().click();
        profileCompanyPage.setPhoneNumberField(PhoneType.FAX,"9214347867");
        Assertions.assertTrue(profileCompanyPage.getPhoneNumberFieldErrorMessage(PhoneType.FAX).isEmpty());
        profileCompanyPage.getAddPhoneNumberButton().click();
        profileCompanyPage.setPhoneNumberField(PhoneType.WORK,"9214343498");
        Assertions.assertTrue(profileCompanyPage.getPhoneNumberFieldErrorMessage(PhoneType.WORK).isEmpty());
        profileCompanyPage.getAddPhoneNumberButton().click();
        profileCompanyPage.setPhoneNumberField(PhoneType.HOME,"9214343498");
        Assertions.assertTrue(profileCompanyPage.getPhoneNumberFieldErrorMessage(PhoneType.HOME).isEmpty());
        profileCompanyPage.getAddPhoneNumberButton().click();
        profileCompanyPage.setPhoneNumberField(PhoneType.MOB,"9214343498");
        Assertions.assertTrue(profileCompanyPage.getPhoneNumberFieldErrorMessage(PhoneType.MOB).isEmpty());

        profileCompanyPage.getSaveContactButton().click();

        /*try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){

        }*/
        //здесь должен быть Assert на то, что данные сохранены
    }
}