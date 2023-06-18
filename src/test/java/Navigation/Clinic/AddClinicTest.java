package Navigation.Clinic;

import Common.Constants;
import Pages.Navigation.LoginPage;
import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;

import static Common.Constants.getBaseUrl;

@Epic("Clinic Management") // Эпик - основная функциональность
@Feature("Add Clinic") // Функциональность - добавление клиники
public class AddClinicTest extends BaseTest {

    @Test
    @Story("User can add a clinic") // История - пользователь может добавить клинику
    @Description("This test case verifies that a user can successfully add a clinic") // Описание - этот тест проверяет, что пользователь может успешно добавить клинику
    public void testAddClinic() {



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

   // @Test
   // @Story("User can check the added clinic") // История - пользователь может проверить добавленную клинику
   // @Description("This test case verifies the parameters of the added clinic") // Описание - этот тест проверяет параметры добавленной клиники
   // public void testCheckAddedClinic() {
    //    clinicContacts
     //           .navigateToClinic();

      //  /**Проверяем параметры созданной клиники*/
     //   String ClinicName = clinicContacts.getClinicName();              //Записываем название в переменную (название также содержит тип и плашку ожидания модерации
     //   String ClinicTel = clinicContacts.getClinicTel();               //Записываем телефон в переменную
     //   String ClinicAddress = clinicContacts.getClinicAddress();       //Записываем адрес клиники в переменную

     //   Assert.assertTrue(ClinicName.contains(Constants.getClinicName()));                    // Проверка названия
     //   Assert.assertTrue(ClinicName.contains(Constants.getClinicType()));                    // Проверка типа
     //   Assert.assertTrue(ClinicName.contains(Constants.getWaitingForModeration()));         // Проверка плашки "Ожидает модерации"
        //Assert.assertTrue(ClinicTel.contains(Constants.getTelNumber()));                     // Проверка номера телефона
      //  Assert.assertTrue(ClinicAddress.contains(Constants.getClinicAddress()));              // Проверка адреса
      //  Assert.assertTrue(ClinicAddress.contains(Constants.getClinicCity()));                 // Проверка города
  //  }
}
