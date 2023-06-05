package Navigation.Clinic;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static Common.Constants.CLINIC_NAME;
import static com.codeborne.selenide.Selenide.open;

public class AddClinicTest extends BaseTest {


    private final static String BASE_URL = "http://profile.ivanov.polygon.dev-napopravku.ru";
    private final static String clinicNameInput = "Тестовая";
    private final static String clinicTypeInput = "Тестовый";
    private final static String cityInput = "Москва";
    private final static String addressInput = "Пушкина-колотушкина";
    private final static String addressCommentInput = "пояснялово";
    private final static String telNumberInput = "1111111111";
    private final static String numberCommentInput = "пояснялово2";
    private final static String siteInput = "facebook.com";

    @Test
    public void AddClinic(){

        /**Переходим в раздел "Клиника", нажимаем "Добавить клинику"*/
        clinicContacts
                .navigateToClinic()
                .clickAddClinic();
        /**Заполняем поля в модалке добавления клиники*/
        modalCardAddClinic
                .enterClinicName()
                .enterClinicType()
                //.clinicIsNetwork()
                .enterClinicCity()
                .enterClinicAddress()
                .enterClinicTelNumber()
                .enterClinicTelComment()
                .enterClinicSite()

                /**Сохраняем клинику*/
                .saveClinic();
    }

        @Test
        public void CheckAddedClinic() {
            clinicContacts
                    .navigateToClinic();

            String ClinicName = clinicContacts.getClinicName();
            Assert.assertTrue(ClinicName.contains(CLINIC_NAME));
            Assert.assertTrue(ClinicName.contains("(ожидает модерации)"));

    }
}
