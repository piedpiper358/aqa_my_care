package epics.epic_2.US_2_3;

import core.BaseTest;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.ProfileCompanyPage;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ChangeCompanyProfileInfoInvalidTests extends BaseTest {
    static ProfileCompanyPage profileCompanyPage;
    @BeforeAll
    public static void preconditions() {
        profileCompanyPage = new ProfileCompanyPage();
        profileCompanyPage.openAllInfoBlocks();
    }

    //------------------Personal--------------------------
    @Order(1)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Имя")
    @ParameterizedTest
    @ValueSource(strings = {"Жене4ка", "Жене?ка", "ЖЕнечка", "ЖЕНЕЧКА", "Genexka", "Кто-то", "Кто--То", "Кто  то", "Еееееееееееееееееееееееееееееееееееееееее", ""})
    public void checkFirstNameField(String firstName){
        profileCompanyPage.setFirstNameField(firstName);
        Assertions.assertFalse(profileCompanyPage.getFirstNameFieldErrorMessage().isEmpty());
        /*1. Опционально проверять что значение поля совпадает с вводимым значением (прояверяем что поле не запрещает ввод каких-либо символов)
        Assertions.assertEquals(name, profilePage.getFirstName());*/
        /*2. Опционально проверять активность кнопки отправки (disabled) - нужна обработка исключений от Assertion
        Assertions.assertFalse(profilePage.checkSendButtonIsEnabled());
        profilePage.setFirstName("Гомер");*/
        /*3. Опционально проверять соответствие текста сообщения об ошибке ожидаемому
        Assertions.assertFalse(profilePage.getFirstNameErrorMessage().equals("Сообщение"));*/
    }
    @Order(2)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Фамилия")
    @ParameterizedTest
    @ValueSource(strings = {"Жене4ка", "Жене?ка", "ЖЕнечка", "ЖЕНЕЧКА", "Genexka", "Кто-то", "Кто--То", "Кто  то", "Еееееееееееееееееееееееееееееееееееееееее", ""})
    public void checkLastNameField(String lastName){
        profileCompanyPage.setLastNameField(lastName);
        Assertions.assertFalse(profileCompanyPage.getLastNameFieldErrorMessage().isEmpty());
    }
    @Order(3)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Отчество")
    @ParameterizedTest
    @ValueSource(strings = { "Жене4ка", "Жене?ка", "ЖЕнечка", "ЖЕНЕЧКА", "Genexka", "Кто-то", "Кто--То", "Кто  то", "Еееееееееееееееееееееееееееееееееееееееее"})
    public void checkMiddleNameField(String middleName){
        profileCompanyPage.setMiddleNameField(middleName);
        Assertions.assertFalse(profileCompanyPage.getMiddleNameFieldErrorMessage().isEmpty());
    }
    @Order(4)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Дата рождения")
    @ParameterizedTest
    @ValueSource(strings = {"01.01.1843", "01.01.2023", "01.01.2077", "","01.01.к077", "01.01.2?77", "31.02.2001"})
    public void checkBirthDateField(String birthDate){
        profileCompanyPage.setDateOfBirthField(birthDate);
        Assertions.assertFalse(profileCompanyPage.getDateOfBirthFieldErrorMessage().isEmpty());
    }
    //------------------Passport--------------------------

    @Order(5)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Серия паспорта")
    @ParameterizedTest
    @ValueSource(strings = {"Abcd", "12345678901", "12?4", "123A567890","123/567890", " ", ""})
    public void checkPassportSeriesField(String documentNum){
        profileCompanyPage.setPassportSeriesField(documentNum);
        Assertions.assertFalse(profileCompanyPage.getPassportSeriesFieldErrorMessage().isEmpty());
    }
    @Order(6)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Номер паспорта")
    @ParameterizedTest
    @ValueSource(strings = {"123456789", "12345678901", "12?4", "123A567890","123/567890", " ", ""})
    public void checkPassportNumberField(String documentNum){
        profileCompanyPage.setPassportNumberField(documentNum);
        Assertions.assertFalse(profileCompanyPage.getPassportNumberFieldErrorMessage().isEmpty());
    }
    @Order(7)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Дата выдачи")
    @ParameterizedTest
    @ValueSource(strings = {"01.01.1200","30.09.1997", "01.01.2025", "","01.01.к077", "01.01.2?77"})
    public void checkPassportIssuedDateField(String dateIssuedDocument){
        profileCompanyPage.setPassportIssuedDateField(dateIssuedDocument);
        Assertions.assertFalse(profileCompanyPage.getPassportIssuedDateFieldErrorMessage().isEmpty());
    }
    @Order(8)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Кем выдан")
    @ParameterizedTest
    @ValueSource(strings = {"GU MVD of Russia", "", "ГУ МВД чего??", "ГУ МВД России ГУ МВД России ГУ МВД России ГУ МВД России ГУ МВД России ГУ МВД России ГУ МВД России ГУ "})
    public void checkPassportIssuedByField(String nameFacilityIssued){
        profileCompanyPage.setPassportIssuedByField(nameFacilityIssued);
        Assertions.assertFalse(profileCompanyPage.getPassportIssuedByFieldErrorMessage().isEmpty());
        //Опционально проверять что текст переводится в верхний регистр
    }

    //------------------Basis Document--------------------------
    @Order(9)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Тип документа-основания")
    @ParameterizedTest
    @ValueSource(strings = {"Abcd", "12345678901", "12?4", "123A567890","123/567890", " ", ""})
    public void checkDocumentSeriesField(String documentNum){
        profileCompanyPage.setDocumentTypeField(documentNum);
        Assertions.assertFalse(profileCompanyPage.getDocumentTypeFieldErrorMessage().isEmpty());
    }
    @Order(10)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Номер документа-основания")
    @ParameterizedTest
    @ValueSource(strings = {"123456789", "12345678901", "12?4", "123A567890","123/567890", " ", ""})
    public void checkDocumentNumberField(String documentNum){
        profileCompanyPage.setDocumentNumberField(documentNum);
        Assertions.assertFalse(profileCompanyPage.getDocumentNumberFieldErrorMessage().isEmpty());
    }
    @Order(11)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Начало действия документа-основания")
    @ParameterizedTest
    @ValueSource(strings = {"01.01.1200","30.09.1997", "01.01.2025", "","01.01.к077", "01.01.2?77"})
    public void checkDateIssuedDocument(String dateIssuedDocument){
        profileCompanyPage.setDocumentStartDateField(dateIssuedDocument);
        Assertions.assertFalse(profileCompanyPage.getDocumentStartDateFieldErrorMessage().isEmpty());
    }
    @Order(12)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Окончание действия документа-основания")
    @ParameterizedTest
    @ValueSource(strings = {"01.01.1200","30.09.1997", "01.01.2025", "","01.01.к077", "01.01.2?77"})
    public void checkNameFacilityIssued(String nameFacilityIssued){
        profileCompanyPage.setDocumentEndDateField(nameFacilityIssued);
        Assertions.assertFalse(profileCompanyPage.getDocumentEndDateFieldErrorMessage().isEmpty());
        //Опционально проверять что текст переводится в верхний регистр
    }

    //------------------Company Info------------------------------------------------------------------------------------------------------
    @Order(13)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Полное наименование компании")
    @ParameterizedTest
    @ValueSource(strings = {"Springfield nuclear plant", "Атомная электростанция города Спрингфилд Атомная электростанция города Спрингфилд Атомная электростанция города Спрингфилд Атомная электростанция города Спрингфилд Атомная электростанция города Спрингфилд Атомная электростанция города Спрингфилд Атомная эл", ""})
    public void checkFullNameField(String fullName){
        profileCompanyPage.setCompanyFullNameField(fullName);
        Assertions.assertFalse(profileCompanyPage.getCompanyFullNameFieldErrorMessage().isEmpty());
    }
    @Order(14)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Краткое наименование компании")
    @ParameterizedTest
    @ValueSource(strings = {"Springfield nuclear plant", "Спрингфилдская АЭС Спрингфилдская АЭС Спрингфилдская АЭС Спрингфилдская АЭС Спрингфилдская АЭС Спрингфилдская АЭС Спрингфилдская АЭС Спрингфилдская АЭС Спрингфилдская АЭС Спрингфилдская АЭС Спрингфилдская АЭС Спрингфилдская АЭС Спрингфилдская АЭС Спрингфил", ""})
    public void checkShortNameField(String shortName){
        profileCompanyPage.setCompanyShortNameField(shortName);
        Assertions.assertFalse(profileCompanyPage.getCompanyShortNameFieldErrorMessage().isEmpty());
    }
    @Order(15)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля ИНН")
    @ParameterizedTest
    @ValueSource(strings = {"12345678901", "1234567890123",  "1234 56789012", "1234-56789012", "123A56789012", "одиндватри", ""})
    public void checkCompanyINNField(String companyINN){
        profileCompanyPage.setCompanyINNField(companyINN);
        Assertions.assertFalse(profileCompanyPage.getCompanyINNFieldErrorMessage().isEmpty());
    }
    @Order(16)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля ОГРН")
    @ParameterizedTest
    @ValueSource(strings = {"123456789012", "12345678901234",  "1234 567890123", "1234-567890123", "123A567890123", "одиндватри", ""})
    public void checkCompanyOGRNField(String companyOGRN){
        profileCompanyPage.setCompanyOGRNField(companyOGRN);
        Assertions.assertFalse(profileCompanyPage.getCompanyOGRNFieldErrorMessage().isEmpty());
    }
    @Order(17)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля КПП")
    @ParameterizedTest
    @ValueSource(strings = {"12345678", "1234567890",  "1234 56789", "1234-56789", "123A56789", "одиндватри", ""})
    public void checkCompanyKPPField(String companyKPP){
        profileCompanyPage.setCompanyKPPField(companyKPP);
        Assertions.assertFalse(profileCompanyPage.getCompanyKPPFieldErrorMessage().isEmpty());
    }
    @Order(18)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Банк")
    @ParameterizedTest

    @ValueSource(strings = {"ВаБанк 2", "ВаБанк ?", "Springfield Bank", "Банк города Спрингфилд Банк города Спрингфилд Банк города Спрингфилд Банк города Спрингфилд Банк горо", ""})
    public void checkCompanyBankField(String companyBank){
        profileCompanyPage.setCompanyBankField(companyBank);
        Assertions.assertFalse(profileCompanyPage.getCompanyBankFieldErrorMessage().isEmpty());
    }
    @Order(19)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Номер счета")
    @ParameterizedTest
    @ValueSource(strings = {"1234567890123456789", "123456789012345678901",  "1234 5678901234567890", "1234-5678901234567890", "123A5678901234567890", "одиндватри", ""})
    public void checkAccountNumberField(String accountNumber){
        profileCompanyPage.setCompanyAccountNumberField(accountNumber);
        Assertions.assertFalse(profileCompanyPage.getCompanyAccountNumberFieldErrorMessage().isEmpty());
    }

    @Order(20)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Страна")
    @ParameterizedTest
    @ValueSource(strings = {"Моя 1 область", "Какая область?", "ВО какая область", "ВОТ ТАКАЯ ОБЛАСТЬ", "My Region", "Такая--то республика", "Такой-то  автономный округ", "Мой самый самый самый самый любимый регион", ""})
    public void checkCountryField(String region){
        profileCompanyPage.setCountryField(region);
        Assertions.assertFalse(profileCompanyPage.getCountryFieldErrorMessage().isEmpty());
    }
    @Order(21)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Регион")
    @ParameterizedTest
    @ValueSource(strings = {"Моя 1 область", "Какая область?", "ВО какая область", "ВОТ ТАКАЯ ОБЛАСТЬ", "My Region", "Такая--то республика", "Такой-то  автономный округ", "Мой самый самый самый самый любимый регион", ""})
    public void checkRegionField(String region){
        profileCompanyPage.setRegionField(region);
        Assertions.assertFalse(profileCompanyPage.getRegionFieldErrorMessage().isEmpty());
    }

    @Order(22)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Район")
    @ParameterizedTest
    @ValueSource(strings = {"Мой 1 район", "Какой район?", "ВО какой район", "ВОТ ТАКОЙ район", "My District", "Какой--то район", "Такой-то  район", "Мой самый самый самый самый любимый район"})
    public void checkDistrictField(String district){
        profileCompanyPage.setDistrictField(district);
        Assertions.assertFalse(profileCompanyPage.getDistrictFieldErrorMessage().isEmpty());
    }
    @Order(23)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Город")
    @ParameterizedTest
    @ValueSource(strings = {"Мой 1 город", "Какой город?", "ВО какой город", "ВОТ ТАКОЙ ГОРОД", "My City", "Какой--то город", "Такой-то  город", "Мой самый самый самый самый любимый город", ""})
    public void checkCityField(String city){
        profileCompanyPage.setCityField(city);
        Assertions.assertFalse(profileCompanyPage.getCityFieldErrorMessage().isEmpty());
    }
    @Order(24)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Улица")
    @ParameterizedTest
    @ValueSource(strings = {"Моя 1 улица", "Какая улица?", "ВО какая улица", "ВОТ ТАКАЯ улица", "My Region", "Такая--то улица", "Такая-то  улица", "Моя самая самая самая самая любимая улица", ""})
    public void checkStreetField(String street){
        profileCompanyPage.setStreetField(street);
        Assertions.assertFalse(profileCompanyPage.getStreetFieldErrorMessage().isEmpty());
    }
    @Order(25)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Номер дома")
    @ParameterizedTest
    @ValueSource(strings = {"12345", "12?4", "A","12/4", "12-4", " ", ""})
    public void checkHouseNumberField(String houseNumber){
        profileCompanyPage.setHouseNumberField(houseNumber);
        Assertions.assertFalse(profileCompanyPage.getHouseNumberFieldErrorMessage().isEmpty());
    }
    @Order(26)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Корпус")
    @ParameterizedTest
    @ValueSource(strings = {"12345", "12?4","12/4", "12-4", " ", ""})
    public void checkBuildNumberField(String buildNumber){
        profileCompanyPage.setBuildNumberField(buildNumber);
        Assertions.assertFalse(profileCompanyPage.getBuildNumberFieldErrorMessage().isEmpty());
    }
    @Order(27)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Номер офиса")
    @ParameterizedTest
    @ValueSource(strings = {"12345", "12?4", "A","12/4", "12-4", " ", ""})
    public void checkApartNumberField(String apartNumber){
        profileCompanyPage.setOfficeNumberField(apartNumber);
        Assertions.assertFalse(profileCompanyPage.getOfficeNumberFieldErrorMessage().isEmpty());
    }
    //------------------Contact--------------------------
    @Order(28)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Email")
    @ParameterizedTest
    @ValueSource(strings = {"чтотам@mail.ru",  "smth@мейл.ру", "", "smth.@mail.ru", ".smth@mail.ru", "smth@mail.ru.", "smth@mail..ru", "s@mail.ru", "smth@", "sgrjnmail.ru","smth@m@il.ru", "wqeqwe dfsd@mail.ru", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.ru"})
    public void checkEmailField(String email){
        profileCompanyPage.setEmailField(email);
        Assertions.assertFalse(profileCompanyPage.getEmailFieldErrorMessage().isEmpty());
    }
    @Order(29)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация полей номер телефона")
    @ParameterizedTest
    @ValueSource(strings = {"12345678901","123456789", "", "+71234567890", "123A567890","12345?7890", "12345 7890"})
    public void checkPhoneNumberField(String phoneNumber) {
        profileCompanyPage.getAddPhoneNumberButton().click();
        profileCompanyPage.setPhoneNumberField(ProfileCompanyPage.PhoneType.FAX,phoneNumber);
        Assertions.assertFalse(profileCompanyPage.getPhoneNumberFieldErrorMessage(ProfileCompanyPage.PhoneType.FAX).isEmpty());
        profileCompanyPage.getAddPhoneNumberButton().click();
        profileCompanyPage.setPhoneNumberField(ProfileCompanyPage.PhoneType.WORK,phoneNumber);
        Assertions.assertFalse(profileCompanyPage.getPhoneNumberFieldErrorMessage(ProfileCompanyPage.PhoneType.WORK).isEmpty());
        profileCompanyPage.getAddPhoneNumberButton().click();
        profileCompanyPage.setPhoneNumberField(ProfileCompanyPage.PhoneType.HOME,phoneNumber);
        Assertions.assertFalse(profileCompanyPage.getPhoneNumberFieldErrorMessage(ProfileCompanyPage.PhoneType.HOME).isEmpty());
        profileCompanyPage.getAddPhoneNumberButton().click();
        profileCompanyPage.setPhoneNumberField(ProfileCompanyPage.PhoneType.MOB,phoneNumber);
        Assertions.assertFalse(profileCompanyPage.getPhoneNumberFieldErrorMessage(ProfileCompanyPage.PhoneType.MOB).isEmpty());

    }
}