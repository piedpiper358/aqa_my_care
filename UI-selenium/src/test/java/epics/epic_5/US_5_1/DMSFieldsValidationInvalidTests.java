package epics.epic_5.US_5_1;

import core.BasePage;
import core.BaseTest;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.DMSPage;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DMSFieldsValidationInvalidTests extends BaseTest {
    static DMSPage dmsPage;
    @BeforeAll
    public static void preconditions() {
        dmsPage = new DMSPage();
        dmsPage.setValidData();
        //dmsPage.goToSecondStepper();
    }

    //------------------Policyholder--------------------------
    @Order(1)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Имя страхователя")
    @ParameterizedTest
    @ValueSource(strings = {"Жене4ка", "Жене?ка", "ЖЕнечка", "ЖЕНЕЧКА", "Genexka", "Кто-то", "Кто--То", "Кто  то", "Еееееееееееееееееееееееееееееееееееееееее", ""})
    public void checkFirstNameField(String firstName){

        dmsPage.setFirstName(firstName);
        Assertions.assertFalse(dmsPage.getFirstNameErrorMessage().isEmpty());
        /*1. Опционально проверять что значение поля совпадает с вводимым значением (прояверяем что поле не запрещает ввод каких-либо символов)
        Assertions.assertEquals(name, dmsPage.getFirstName());*/
        /*2. Опционально проверять активность кнопки отправки (disabled) - нужна обработка исключений от Assertion
        Assertions.assertFalse(dmsPage.checkSendButtonIsEnabled());
        dmsPage.setFirstName("Гомер");*/
        /*3. Опционально проверять соответсвие текста сообщения об ошибке ожидаемому
        Assertions.assertFalse(dmsPage.getFirstNameErrorMessage().equals("Сообщение"));*/
    }
    @Order(2)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Фамилия страхователя")
    @ParameterizedTest
    @ValueSource(strings = {"Жене4ка", "Жене?ка", "ЖЕнечка", "ЖЕНЕЧКА", "Genexka", "Кто-то", "Кто--То", "Кто  то", "Еееееееееееееееееееееееееееееееееееееееее", ""})
    public void checkLastNameField(String lastName){
        dmsPage.setLastName(lastName);
        Assertions.assertFalse(dmsPage.getLastNameErrorMessage().isEmpty());
    }
    @Order(3)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Отчество страхователя")
    @ParameterizedTest
    @ValueSource(strings = { "Жене4ка", "Жене?ка", "ЖЕнечка", "ЖЕНЕЧКА", "Genexka", "Кто-то", "Кто--То", "Кто  то", "Еееееееееееееееееееееееееееееееееееееееее"})
    public void checkMiddleNameField(String middleName){
        dmsPage.setMiddleName(middleName);
        Assertions.assertFalse(dmsPage.getMiddleNameErrorMessage().isEmpty());
    }
    @Order(4)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Дата рождения страхователя")
    @ParameterizedTest
    @ValueSource(strings = {"01.01.1843", "01.01.2023", "01.01.2077", "","01.01.к077", "01.01.2?77", "31.02.2001"})
    public void checkBirthDateField(String birthDate){
        dmsPage.setDateOfBirth(birthDate);
        Assertions.assertFalse(dmsPage.getDateOfBirthErrorMessage().isEmpty());
    }
    //------------------Insured person--------------------------
    @Order(5)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Имя страхуемого")
    @ParameterizedTest
    @ValueSource(strings = {"Жене4ка", "Жене?ка", "ЖЕнечка", "ЖЕНЕЧКА", "Genexka", "Кто-то", "Кто--То", "Кто  то", "Еееееееееееееееееееееееееееееееееееееееее", ""})
    public void checkFirstNameOfInsuredField(String firstNameOfInsured){
        dmsPage.setFirstNameOfInsured(firstNameOfInsured);
        Assertions.assertFalse(dmsPage.getFirstNameOfInsuredErrorMessage().isEmpty());
    }
    @Order(6)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Фамилия страхуемого")
    @ParameterizedTest
    @ValueSource(strings = {"Жене4ка", "Жене?ка", "ЖЕнечка", "ЖЕНЕЧКА", "Genexka", "Кто-то", "Кто--То", "Кто  то", "Еееееееееееееееееееееееееееееееееееееееее", ""})
    public void checkLastNameOfInsuredField(String lastNameOfInsured){
        dmsPage.setLastNameOfInsured(lastNameOfInsured);
        Assertions.assertFalse(dmsPage.getLastNameOfInsuredErrorMessage().isEmpty());
    }
    @Order(7)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Отчество страхуемого")
    @ParameterizedTest
    @ValueSource(strings = { "Жене4ка", "Жене?ка", "ЖЕнечка", "ЖЕНЕЧКА", "Genexka", "Кто-то", "Кто--То", "Кто  то", "Еееееееееееееееееееееееееееееееееееееееее"})
    public void checkMiddleNameOfInsuredField(String middleNameOfInsured){
        dmsPage.setMiddleNameOfInsured(middleNameOfInsured);
        Assertions.assertFalse(dmsPage.getMiddleNameOfInsuredErrorMessage().isEmpty());
    }
    @Order(8)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Дата рождения страхуемого")
    @ParameterizedTest
    @ValueSource(strings = {"01.01.1843", "01.01.2023", "01.01.2077", "","01.01.к077", "01.01.2?77", "31.02.2001"})
    public void checkBirthDateOfInsuredField2(String birthDateOfInsured){
        dmsPage.setDateOfBirthOfInsured2(birthDateOfInsured);
        Assertions.assertFalse(dmsPage.getDateOfBirthOfInsured2ErrorMessage().isEmpty());
    }

    //------------------Address--------------------------
    @Order(9)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Регион")
    @ParameterizedTest
    @ValueSource(strings = {"Моя 1 область", "Какая область?", "ВО какая область", "ВОТ ТАКАЯ ОБЛАСТЬ", "My Region", "Такая--то республика", "Такой-то  автономный округ", "Мой самый самый самый самый любимый регион", ""})
    public void checkRegionField(String region){
        dmsPage.setRegion(region);
        Assertions.assertFalse(dmsPage.getFirstNameOfInsuredErrorMessage().isEmpty());
    }
    @Order(3)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Город")
    @ParameterizedTest
    @ValueSource(strings = {"Мой 1 город", "Какой город?", "ВО какой город", "ВОТ ТАКОЙ ГОРОД", "My City", "Какой--то город", "Такой-то  город", "Мой самый самый самый самый любимый город", ""})
    public void checkCityField(String city){
        dmsPage.setCity(city);
        Assertions.assertFalse(dmsPage.getCityErrorMessage().isEmpty());
    }
    @Order(10)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Район")
    @ParameterizedTest
    @ValueSource(strings = {"Мой 1 район", "Какой район?", "ВО какой район", "ВОТ ТАКОЙ район", "My District", "Какой--то район", "Такой-то  район", "Мой самый самый самый самый любимый район"})
    public void checkDistrictField(String district){
        dmsPage.setDistrict(district);
        Assertions.assertFalse(dmsPage.getDistrictErrorMessage().isEmpty());
    }
    @Order(11)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Улица")
    @ParameterizedTest
    @ValueSource(strings = {"Моя 1 улица", "Какая улица?", "ВО какая улица", "ВОТ ТАКАЯ улица", "My Region", "Такая--то улица", "Такая-то  улица", "Моя самая самая самая самая любимая улица", ""})
    public void checkStreetField(String street){
        dmsPage.setStreet(street);
        Assertions.assertFalse(dmsPage.getStreetErrorMessage().isEmpty());
    }
    @Order(12)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Номер дома")
    @ParameterizedTest
    @ValueSource(strings = {"12345", "12?4", "A","12/4", "12-4", " ", ""})
    public void checkHouseNumberField(String houseNumber){
        dmsPage.setHouseNumber(houseNumber);
        Assertions.assertFalse(dmsPage.getHouseNumberErrorMessage().isEmpty());
    }
    @Order(13)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Корпус")
    @ParameterizedTest
    @ValueSource(strings = {"12345", "12?4","12/4", "12-4", " ", ""})
    public void checkBuildNumberField(String buildNumber){
        dmsPage.setBuildNumber(buildNumber);
        Assertions.assertFalse(dmsPage.getBuildNumberErrorMessage().isEmpty());
    }
    @Order(14)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Квартира")
    @ParameterizedTest
    @ValueSource(strings = {"12345", "12?4", "A","12/4", "12-4", " ", ""})
    public void checkApartNumberField(String apartNumber){
        dmsPage.setApartNumber(apartNumber);
        Assertions.assertFalse(dmsPage.getApartNumberErrorMessage().isEmpty());
    }
    //------------------Contact--------------------------
    @Order(15)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Email")
    @ParameterizedTest
    @ValueSource(strings = {"чтотам@mail.ru",  "smth@мейл.ру", "", "smth.@mail.ru", ".smth@mail.ru", "smth@mail.ru.", "smth@mail..ru", "s@mail.ru", "smth@", "sgrjnmail.ru","smth@m@il.ru", "wqeqwe dfsd@mail.ru", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.ru"})
    public void checkEmailField(String email){
        dmsPage.setEmail(email);
        Assertions.assertFalse(dmsPage.getEmailErrorMessage().isEmpty());
    }
    @Order(16)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля номер телефона")
    @ParameterizedTest
    @ValueSource(strings = {"12345678901","123456789", "", "+71234567890", "123A567890","12345?7890", "12345 7890"})
    public void checkPhoneNumberField(String phoneNumber){
        dmsPage.setPhoneNumber(phoneNumber);
        Assertions.assertFalse(dmsPage.getPhoneNumberErrorMessage().isEmpty());
    }
    //------------------Document--------------------------
    @Order(17)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Кем выдан")
    @ParameterizedTest
    @ValueSource(strings = {"GU MVD of Russia", "", "ГУ МВД чего??", "ГУ МВД России ГУ МВД России ГУ МВД России ГУ МВД России ГУ МВД России ГУ МВД России ГУ МВД России ГУ "})
    public void checkNameFacilityIssued(String nameFacilityIssued){
        dmsPage.setNameFacilityIssued(nameFacilityIssued);
        Assertions.assertFalse(dmsPage.getNameFacilityIssuedErrorMessage().isEmpty());
        //Опционально проверять что текст переводится в верхний регистр
    }
    @Order(18)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Квартира")
    @ParameterizedTest
    @ValueSource(strings = {"123456789", "12345678901", "12?4", "123A567890","123/567890", " ", ""})
    public void checkDocumentNum(String documentNum){
        dmsPage.setDocumentNum(documentNum);
        Assertions.assertFalse(dmsPage.getDocumentNumErrorMessage().isEmpty());
    }
    @Order(19)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Дата выдачи")
    @ParameterizedTest
    @ValueSource(strings = {"01.01.1200","30.09.1997", "01.01.2025", "","01.01.к077", "01.01.2?77"})
    public void checkDateIssuedDocument(String dateIssuedDocument){
        dmsPage.setDateIssuedDocument(dateIssuedDocument);
        Assertions.assertFalse(dmsPage.getDateIssuedDocumentErrorMessage().isEmpty());
    }
    //------------------Dates--------------------------
    @Order(20)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Дата начала срока страхования")
    @ParameterizedTest
    @ValueSource(strings = {"01.01.1200", "14.07.2024", "","01.01.к077", "01.01.2?77"})
    public void checkInsuranceStartDate(String insuranceStartDate){
        dmsPage.setInsuranceStartDate(insuranceStartDate);
        Assertions.assertFalse(dmsPage.getInsuranceStartDateErrorMessage().isEmpty());
    }
    @Order(21)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация чекбокса согласия на обработку персональных данных")
    @Test
    public void checkAgreement(){
        dmsPage.checkAgreementCheckbox();
        dmsPage.uncheckAgreementCheckbox();
        Assertions.assertFalse(dmsPage.getInsuranceStartDateErrorMessage().isEmpty());
    }
}