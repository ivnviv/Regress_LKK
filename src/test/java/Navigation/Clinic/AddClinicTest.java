package Navigation.Clinic;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static Common.Constants.*;
import static com.codeborne.selenide.Selenide.open;

public class AddClinicTest extends BaseTest {

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

            /**Проверяем параметры созданной клиники*/
            String ClinicName = clinicContacts.getClinicName();              //Записываем название в переменную (название также содержит тип и плашку ожидания модерации
            String ClinicTel = clinicContacts.getClinicTel();
            String ClinicAddress = clinicContacts.getClinicAddress();



            Assert.assertTrue(ClinicName.contains(CLINIC_NAME));             //Проверка названия
            Assert.assertTrue(ClinicName.contains(CLINIC_TYPE));             //Проверка типа
            Assert.assertTrue(ClinicName.contains(WAITING_FOR_MODERATION));  //Проверка плашки "Ожидает модерации"
            Assert.assertTrue(ClinicTel.contains(TEL_NUMBER));               //Проверка номера телефона
            Assert.assertTrue(ClinicAddress.contains(CLINIC_ADDRESS));       //Проверка адреса
            Assert.assertTrue(ClinicAddress.contains(CLINIC_CITY));          //Проверка города

    }
}
