package epics.epic_1.UC_1_1;

import core.BaseTest;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.RegistrationPage;

import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RegistrationParameterisedUnvalidTest extends BaseTest {
    static RegistrationPage regPage;
    @BeforeAll
    public static void preconditions() {
        regPage = mainPage.clickEnterAccount().clickAccountQuestion();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        regPage.setValidData();
    }
    @AfterAll
    public static void endTest(){
        driver.quit();
    }

    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Имя")
    @ParameterizedTest
    @ValueSource(strings = {"еееееееееееееееееееееееееееееееееееееееее", "", "Жене4ка", "Жене?ка", "Genexka", "Кто--там", "Кто  там"})
    public void checkFirstNameField(String name){
        regPage.clearFieldFirstName();
        regPage.setFirstName(name);
        regPage.clickNextButton();
        Assertions.assertFalse(regPage.checkRegistrationButton());
        regPage.clearFieldFirstName();
        regPage.setFirstName("Иван");
    }
    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Фамилия")
    @ParameterizedTest
    @ValueSource(strings = {"еееееееееееееееееееееееееееееееееееееееее", "", "Жене4ка", "Жене?ка", "Genexka", "Кто--там", "Кто  там"})
    public void checkLastNameField(String name){
        regPage.clearFieldLastName();
        regPage.setLastName(name);
        regPage.clickNextButton();
        Assertions.assertFalse(regPage.checkRegistrationButton());
        regPage.clearFieldLastName();
        regPage.setLastName("Иван");
    }
    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Отчество")
    @ParameterizedTest
    @ValueSource(strings = {"еееееееееееееееееееееееееееееееееееееееее", "", "Жене4ка", "Жене?ка", "Genexka", "Кто--там", "Кто  там"})
    public void checkMiddleNameField(String name){
        regPage.clearFieldMiddleName();
        regPage.setMiddleName(name);
        regPage.clickNextButton();
        Assertions.assertFalse(regPage.checkRegistrationButton());
        regPage.clearFieldMiddleName();
        regPage.setMiddleName("Иван");
    }
    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля номер телефона")
    @ParameterizedTest
    @ValueSource(strings = {"80055535350", "999999999", "", "7999234444е", "79992 44444", "89542387145"})
    public void checkPhoneNumberField(String number){
        regPage.clearFieldPhoneNumber();
        regPage.setPhoneNumberParam(number);
        regPage.clickNextButton();
        Assertions.assertFalse(regPage.checkRegistrationButton());
        regPage.clearFieldPhoneNumber();
        regPage.setPhoneNumberParam("8005553535");
    }
    @Order(1)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Дата рождения")
    @ParameterizedTest
    @ValueSource(strings = {"01.01.1843", "01.01.2023", "01.01.2077", "","01.01.к077", "01.01.2?77", "31.02.2001"})
    public void checkBirthDateField(String date){
        regPage.setBirthDate(date);
        regPage.clickNextButton();
        Assertions.assertFalse(regPage.checkRegistrationButton());
        regPage.setBirthDate("01.01.1993");
    }
    @Order(2)
    @Test
    @DisplayName("Переход на вторую страницу формы")
    public void clickNext(){
        regPage.refreshPage();
        regPage.setValidData();
        regPage.clickNextButton();
    }
    @Order(3)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Email")
    @ParameterizedTest
    @ValueSource(strings = {"чтотам@mail.ru", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.ru", "", "trgherf.@mail.ru", "trgherf@mail.ru.", "trgherf@mail..ru.", "trgherf@ma@il..ru.", "z@mail.ru", "zrew@", "sgrjnmail.ru", "wqeqwe dfsd@mail.ru"})
    public void checkEmailField(String email){
        regPage.clearFieldEmail();
        regPage.setEmail(email);
        Assertions.assertFalse(regPage.checkEmailErrorFilling());
    }
    @Order(3)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Пароль")
    @ParameterizedTest
    @ValueSource(strings = {"Еуйцууц!2фвам", "Gre2@ew", "", "Zxc123###frtyughterd2", "zzxcfr5%dfs", "Nnsdbur%hisb", "NFDFENWHB$1ER", "Nnsdbur4hisb"})
    public void checkPasswordField(String password){
        regPage.clearFieldPassword();
        regPage.setPassword(password);
        Assertions.assertFalse(regPage.checkPasswordErrorFilling());
    }
    @Order(3)
    @Owner(value = "Миргалеев Денис")
    @DisplayName("Валидация поля Повторите пароль")
    @ParameterizedTest
    @ValueSource(strings = {"Еуйцууц!2фвам", "Gre2@ew", "", "Zxc123###frtyughterd2", "zzxcfr5%dfs", "Nnsdbur%hisb", "NFDFENWHB$1ER", "Nnsdbur4hisb"})
    public void checkRepeatPasswordField(String password){
        regPage.clearFieldRepeatPassword();
        regPage.setRepeatPassword(password);
        Assertions.assertFalse(regPage.checkRepeatPasswordErrorFilling());
    }
}