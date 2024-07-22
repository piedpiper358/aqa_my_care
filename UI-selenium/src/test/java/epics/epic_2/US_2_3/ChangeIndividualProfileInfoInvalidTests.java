package epics.epic_2.US_2_3;

import core.BaseTest;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.DMSPage;
import pages.ProfilePage;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ChangeIndividualProfileInfoInvalidTests extends BaseTest {
    static ProfilePage profilePage;
    @BeforeAll
    public static void preconditions() {
        profilePage = new ProfilePage();
        profilePage.setValidData();
    }

    //------------------Personal--------------------------
    @Order(1)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Имя")
    @ParameterizedTest
    @ValueSource(strings = {"Жене4ка", "Жене?ка", "ЖЕнечка", "ЖЕНЕЧКА", "Genexka", "Кто-то", "Кто--То", "Кто  то", "Еееееееееееееееееееееееееееееееееееееееее", ""})
    public void checkFirstNameField(String firstName){

        profilePage.setFirstNameField(firstName);
        Assertions.assertFalse(profilePage.getFirstNameFieldErrorMessage().isEmpty());
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
        profilePage.setLastNameField(lastName);
        Assertions.assertFalse(profilePage.getLastNameFieldErrorMessage().isEmpty());
    }
    @Order(3)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Отчество")
    @ParameterizedTest
    @ValueSource(strings = { "Жене4ка", "Жене?ка", "ЖЕнечка", "ЖЕНЕЧКА", "Genexka", "Кто-то", "Кто--То", "Кто  то", "Еееееееееееееееееееееееееееееееееееееееее"})
    public void checkMiddleNameField(String middleName){
        profilePage.setMiddleNameField(middleName);
        Assertions.assertFalse(profilePage.getMiddleNameFieldErrorMessage().isEmpty());
    }
    @Order(4)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Дата рождения")
    @ParameterizedTest
    @ValueSource(strings = {"01.01.1843", "01.01.2023", "01.01.2077", "","01.01.к077", "01.01.2?77", "31.02.2001"})
    public void checkBirthDateField(String birthDate){
        profilePage.setDateOfBirthField(birthDate);
        Assertions.assertFalse(profilePage.getDateOfBirthFieldErrorMessage().isEmpty());
    }
    //------------------Passport--------------------------

    @Order(5)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Серия паспорта")
    @ParameterizedTest
    @ValueSource(strings = {"Abcd", "12345678901", "12?4", "123A567890","123/567890", " ", ""})
    public void checkDocumentSeriesField(String documentNum){
        profilePage.setDocumentSeriesField(documentNum);
        Assertions.assertFalse(profilePage.getDocumentSeriesFieldErrorMessage().isEmpty());
    }
    @Order(6)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Номер паспорта")
    @ParameterizedTest
    @ValueSource(strings = {"123456789", "12345678901", "12?4", "123A567890","123/567890", " ", ""})
    public void checkDocumentNumberField(String documentNum){
        profilePage.setDocumentNumberField(documentNum);
        Assertions.assertFalse(profilePage.getDocumentNumberFieldErrorMessage().isEmpty());
    }
    @Order(7)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Дата выдачи")
    @ParameterizedTest
    @ValueSource(strings = {"01.01.1200","30.09.1997", "01.01.2025", "","01.01.к077", "01.01.2?77"})
    public void checkDateIssuedDocument(String dateIssuedDocument){
        profilePage.setIssuedDateField(dateIssuedDocument);
        Assertions.assertFalse(profilePage.getIssuedDateFieldErrorMessage().isEmpty());
    }
    @Order(8)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Кем выдан")
    @ParameterizedTest
    @ValueSource(strings = {"GU MVD of Russia", "", "ГУ МВД чего??", "ГУ МВД России ГУ МВД России ГУ МВД России ГУ МВД России ГУ МВД России ГУ МВД России ГУ МВД России ГУ "})
    public void checkNameFacilityIssued(String nameFacilityIssued){
        profilePage.setIssuedByField(nameFacilityIssued);
        Assertions.assertFalse(profilePage.getIssuedByFieldErrorMessage().isEmpty());
        //Опционально проверять что текст переводится в верхний регистр
    }

    //------------------Address--------------------------
    //Требования к полям не определены в документации, поэтому непонятно как тестировать
    /*@Order(9)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Адрес регистрации")
    @ParameterizedTest
    @ValueSource(strings = {"Моя 1 область", "Какая область?", "ВО какая область", "ВОТ ТАКАЯ ОБЛАСТЬ", "My Region", "Такая--то республика", "Такой-то  автономный округ", "Мой самый самый самый самый любимый регион", ""})
    public void checkRegionField(String region){
        profilePage.setAddressRegisterField(region);
        Assertions.assertFalse(profilePage.getAddressRegisterFieldErrorMessage().isEmpty());
    }
    @Order(10)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Адрес проживания")
    @ParameterizedTest
    @ValueSource(strings = {"Мой 1 город", "Какой город?", "ВО какой город", "ВОТ ТАКОЙ ГОРОД", "My City", "Какой--то город", "Такой-то  город", "Мой самый самый самый самый любимый город", ""})
    public void checkCityField(String city){
        profilePage.setAddressLivingField(city);
        Assertions.assertFalse(profilePage.getAddressLivingFieldErrorMessage().isEmpty());
    }*/
    //------------------Contact--------------------------
    @Order(11)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля Email")
    @ParameterizedTest
    @ValueSource(strings = {"чтотам@mail.ru",  "smth@мейл.ру", "", "smth.@mail.ru", ".smth@mail.ru", "smth@mail.ru.", "smth@mail..ru", "s@mail.ru", "smth@", "sgrjnmail.ru","smth@m@il.ru", "wqeqwe dfsd@mail.ru", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.ru"})
    public void checkEmailField(String email){
        profilePage.setEmailField(email);
        Assertions.assertFalse(profilePage.getEmailFieldErrorMessage().isEmpty());
    }
    @Order(12)
    @Owner(value = "Сапожников Борис")
    @DisplayName("Валидация поля номер телефона")
    @ParameterizedTest
    @ValueSource(strings = {"12345678901","123456789", "", "+71234567890", "123A567890","12345?7890", "12345 7890"})
    public void checkPhoneNumberField(String phoneNumber) {
        profilePage.getAddPhoneNumberButton().click();
        profilePage.setPhoneNumberField(0, phoneNumber);
        Assertions.assertFalse(profilePage.getPhoneNumberFieldErrorMessage(0).isEmpty());
    }
}