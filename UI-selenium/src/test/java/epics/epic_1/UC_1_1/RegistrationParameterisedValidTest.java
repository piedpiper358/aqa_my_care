package epics.epic_1.UC_1_1;

import core.BaseTest;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.openqa.selenium.By;
import pages.AuthorizationPage;
import pages.RegistrationPage;

import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RegistrationParameterisedValidTest extends BaseTest {
    static RegistrationPage regPage;
    @BeforeAll
    public static void preconditions() {
        regPage = mainPage.clickEnterAccount().clickAccountQuestion();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
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
        regPage.clearFieldFirstName();
        regPage.setFirstName(name);
        Assertions.assertTrue(regPage.checkFirstNameErrorFilling());
    }
    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Фамилия")
    @ParameterizedTest
    @ValueSource(strings = {"А", "АякиносовгагврГврыщарыгрк-шарыгкпврыиаоы", "Вадим"})
    public void checkLastNameField(String name){
        regPage.clearFieldLastName();
        regPage.setLastName(name);
        Assertions.assertTrue(regPage.checkLastNameErrorFilling());
    }
    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Отчество")
    @ParameterizedTest
    @ValueSource(strings = {"А", "АякиносовгагврГврыщарыгркшарыгкпврыиаоы", "Вадим"})
    public void checkMiddleNameField(String name){
        regPage.clearFieldMiddleName();
        regPage.setMiddleName(name);
        Assertions.assertTrue(regPage.checkMiddleNameErrorFilling());
    }
    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля номер телефона")
    @ParameterizedTest
    @ValueSource(strings = {"8005553535", "9999999999"})
    public void checkPhoneNumberField(String number){
        regPage.clearFieldPhoneNumber();
        regPage.setPhoneNumberParam(number);
        Assertions.assertTrue(regPage.checkPhoneNumberErrorFilling());
    }
    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Дата рождения")
    @ParameterizedTest
    @ValueSource(strings = {"01.01.1900", "11.11.1999", "31.12.2005"})
    public void checkBirthDateField(String date){
        //regPage.clearFieldBirthDate();
        regPage.setBirthDate(date);
        Assertions.assertTrue(regPage.checkBirthDateErrorFilling());
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
        regPage.clearFieldEmail();
        regPage.setEmail(email);
        Assertions.assertTrue(regPage.checkEmailErrorFilling());
    }
    @Order(3)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Пароль")
    @ParameterizedTest
    @ValueSource(strings = {"Aloha19_", "1vzA-Z0-9#?!@$%^&*-_"})
    public void checkPasswordField(String password){
        regPage.clearFieldPassword();
        regPage.setPassword(password);
        Assertions.assertTrue(regPage.checkPasswordErrorFilling());
    }
    @Order(3)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Повторите пароль")
    @ParameterizedTest
    @ValueSource(strings = {"Aloha19_", "1vzA-Z0-9#?!@$%^&*-_"})
    public void checkRepeatPasswordField(String password){
        regPage.clearFieldRepeatPassword();
        regPage.setRepeatPassword(password);
        Assertions.assertTrue(regPage.checkRepeatPasswordErrorFilling());
    }
}