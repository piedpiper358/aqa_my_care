package epics.epic_1.UC_1_1;

import core.BaseTest;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.AuthorizationPage;
import pages.RegistrationPage;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RegistrationParameterisedValidTest extends BaseTest {
    static RegistrationPage regPage;
    @BeforeAll
    public static void preconditions() {
        regPage = mainPage.clickEnterAccount().clickAccountQuestion();
    }
    @AfterAll
    public static void endTest(){
        driver.quit();
    }

    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Имя")
    @ParameterizedTest
    @ValueSource(strings = {"А", "АякиносовгагврГврыщарыгрк-шарыгкпврыиаоы", "Вадим"})
    public void checkFirstNameField(String name){
        regPage.checkFirstName(name);
    }

    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Фамилия")
    @ParameterizedTest
    @ValueSource(strings = {"А", "АякиносовгагврГврыщарыгрк-шарыгкпврыиаоы", "Вадим"})
    public void checkLastNameField(String name){
        regPage.checkLastName(name);
    }

    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Отчество")
    @ParameterizedTest
    @ValueSource(strings = {"А", "АякиносовгагврГврыщарыгркышарыгкпврыиаоы", "Вадим"})
    public void checkMiddleNameField(String name){
        regPage.checkMiddleName(name);
    }
    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Номер телефона")
    @ParameterizedTest
    @ValueSource(strings = {"0000000000", "9999999999"})
    public void checkPhoneNumberField(String number){
        regPage.checkPhoneNumber(number);
    }
    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Дата рождения")
    @ParameterizedTest
    @ValueSource(strings = {"01.01.1900", "11.11.1999", "31.12.2005"})
    public void checkBirthDateField(String date){
        regPage.checkBirthDate(date);
    }
    @Order(2)
    @Test
    @DisplayName("Переход на вторую страницу формы")
    public void clickNext(){
        regPage.clickNextButton();
    }
    @Order(3)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Email")
    @ParameterizedTest
    @ValueSource(strings = {"aa@ma.ru", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.ru"})
    public void checkEmailField(String email){
        regPage.checkEmail(email);
    }
    @Order(3)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Пароль")
    @ParameterizedTest
    @ValueSource(strings = {"Aloha19_", "1vzA-Z0-9#?!@$%^&*-_"})
    public void checkPasswordField(String password){
        regPage.checkPassword(password);
    }
    @Order(3)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Повторите пароль")
    @ParameterizedTest
    @ValueSource(strings = {"Aloha19_", "1vzA-Z0-9#?!@$%^&*-_"})
    public void checkRepeatPasswordField(String password){
        regPage.checkRepeatPassword(password);
    }
}
