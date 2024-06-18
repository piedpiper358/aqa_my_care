package epics.epic_1.UC_1_1;

import core.BaseTest;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import pages.AuthorizationPage;
import pages.RegistrationPage;

@Suite
@SelectClasses({RegistrationParameterisedValidTest.class})
public class RegistrationValidTest extends BaseTest {
    AuthorizationPage authPage;
    RegistrationPage regPage;
    @BeforeEach
    public void preconditions() {
        authPage = mainPage.clickEnterAccount();
        regPage = authPage.clickAccountQuestion();
    }
    @AfterAll
    public static void endTest(){
        driver.quit();
    }

    @Owner(value = "Миргалеев Денис")
    @DisplayName("Регистрация с валидными данными")
    @Test
    public void checkRegistration(){
        regPage.validDataRegistration();
    }
/*    @Owner(value = "Миргалеев Денис")
    @DisplayName("Регистрация с валидными данными")
    @Test
    public void checkValidDataRegistration(){
        regPage.clearField();
        regPage.sendDataToField();
    }

    public void validDataRegistration(){
        setFirstName("Иван");
        setLastName("Биван");
        setMiddleName("Диван");
        setPhoneNumber("8005553535");
        setBirthDate("11.11.1999");
        clickNextButton();
        setEmail("mail@mail.ru");
        setPassword("Pass_R1112");
        setRepeatPassword("Pass_R1112");
        clickAgreementCheckBox();
        clickRegistrationButton();
    }*/
}
