package epics.epic_1.UC_1_1;

import core.BaseTest;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;
import pages.AuthorizationPage;
import pages.RegistrationPage;

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
    public void validDataRegistration(){
        regPage.setFirstName("Иван");
        regPage.setLastName("Биван");
        regPage.setMiddleName("Диван");
        regPage.setPhoneNumber("8005553535");
        regPage.setBirthDate("11.11.1999");
        regPage.clickNextButton();
        regPage.setEmail("mail@mail.ru");
        regPage.setPassword("Pass_R1112");
        regPage.setRepeatPassword("Pass_R1112");
        regPage.clickAgreementCheckBox();
        regPage.clickRegistrationButton();
        Assertions.assertEquals("http://172.17.1.36:8080/auth", RegistrationPage.getCurrentUrl());
    }
}