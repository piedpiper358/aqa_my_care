package epics.epic_2.US_2_3;

import core.BaseTest;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.ProfilePage;


public class ChangeIndividualProfileInfoValidTests extends BaseTest {
    static ProfilePage profilePage;
    @BeforeAll
    public static void preconditions() {
        profilePage = new ProfilePage();
    }

    @Owner(value = "Сапожников Борис")
    @DisplayName("Оформление ДМС с валидными данными")
    @Test
    public void validDataRegistration(){
        profilePage.clickChangePersonalInfoButton();
        profilePage.setFirstNameField("Гомер");
        profilePage.setLastNameField("Симсон");
        profilePage.setMiddleNameField("Джей");
        profilePage.setDateOfBirthField("10.02.1998");
        profilePage.clickSavePersonalInfoButton();
        //здесь должен быть Assert на то, что данные сохранены
        profilePage.clickAddDocumentButton();
        profilePage.setDocumentSeriesField("1234");
        profilePage.setDocumentNumberField("567890");
        profilePage.setIssuedDateField("20.04.2020");
        profilePage.setIssuedByField("ГУ МВД по г Спрингфилд");
        profilePage.clickSavePassportInfoButton();
        //здесь должен быть Assert на то, что данные сохранены
        profilePage.clickAddAddressButton();
        profilePage.setAddressRegisterField("г. Спрингфилд, Вечнозеленая аллея, д. 742, к.1, кв. 1");
        profilePage.setAddressLivingField("г. Спрингфилд, Вечнозеленая аллея, д. 742, к.1, кв. 1");
        profilePage.clickSaveAddressButton();
        //здесь должен быть Assert на то, что данные сохранены
        profilePage.clickAddContactButton();
        profilePage.setEmailField("homer@simsons.com");
        profilePage.clickAddPhoneNumberButton();
        profilePage.setPhoneNumberField(0,"9214347867");
        profilePage.clickAddPhoneNumberButton();
        profilePage.setPhoneNumberField(1,"9214343498");
        profilePage.clickSaveContactButton();
        //здесь должен быть Assert на то, что данные сохранены
    }
}