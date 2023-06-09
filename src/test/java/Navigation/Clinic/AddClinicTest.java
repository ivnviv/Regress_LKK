package Navigation.Clinic;

import Common.Constants;
import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class AddClinicTest extends BaseTest {

    /**Тест на добавление клиники*/
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

        /**Тест на проверку параметров созданной клиники*/
        @Test
        public void CheckAddedClinic() {
            clinicContacts
                    .navigateToClinic();

            /**Проверяем параметры созданной клиники*/
            String ClinicName = clinicContacts.getClinicName();              //Записываем название в переменную (название также содержит тип и плашку ожидания модерации
            String ClinicTel = clinicContacts.getClinicTel();               //Записываем телефон в переменную
            String ClinicAddress = clinicContacts.getClinicAddress();       //Записываем адрес клиники в переменную



            Assert.assertTrue(ClinicName.contains(Constants.getClinicName()));                    // Проверка названия
            Assert.assertTrue(ClinicName.contains(Constants.getClinicType()));                    // Проверка типа
            Assert.assertTrue(ClinicName.contains(Constants.getWaitingForModeration()));         // Проверка плашки "Ожидает модерации"
            Assert.assertTrue(ClinicTel.contains(Constants.getTelNumber()));                     // Проверка номера телефона
            Assert.assertTrue(ClinicAddress.contains(Constants.getClinicAddress()));              // Проверка адреса
            Assert.assertTrue(ClinicAddress.contains(Constants.getClinicCity()));                 // Проверка города


    }
        /**Тест на добавление филиала*/
        @Test
        public void AddClinicFilial() {
            clinicContacts
                .navigateToClinic();



    }
}
