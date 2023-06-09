package Pages.Navigation.Clinic;

import Pages.Base.BasePage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class clinicContacts extends BasePage {

    /**Элементы для взаимодействия*/
    private final SelenideElement navigationClinic = $x("//*[@id=\"app\"]/div/div/div/nav/ul/li[2]/div/a"); //Раздел Клиника
    private final SelenideElement addClinicButton = $x("//div[@class='page__title page__title--flex']/button"); //Кнопка Добавить клинику

    private final SelenideElement ClinicDetailFirst = $x("//div[@class = 'page__list page__list--full']/div[1]"); //Деталька клиники в списке клиник (первая)
    private final SelenideElement detailFirstName = $x("/html/body/div[1]/div/div/div/main/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div");//Название первой клиники в списке (+тип и плашка "на модерации")

    /**Характеристики созданной клиники*/
    private final SelenideElement detailTelNumber = $x("/html/body/div[1]/div/div/div/main/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/ul/li[1]");//Телефон первой клиники в списке
    private final SelenideElement detailAddress = $x("/html/body/div[1]/div/div/div/main/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/ul/li[2]");//Адрес первой клиники в списке
    private final SelenideElement detailAddFilial = $x("/html/body/div[1]/div/div[1]/div/main/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/button/span");//Кнопка Добавить филиал у первой клиники в списке
    private final SelenideElement detailEdit = $x("/html/body/div[1]/div/div[1]/div/main/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/button/span"); //Кнопка Редкатировать филиал у первой клиники в списке


    /**Перейти к разделу Клиника*/
    public clinicContacts navigateToClinic() {
        navigationClinic.click();
        return this;
    }

    /**Клик по кнопке Добавить клинику*/
    public clinicContacts clickAddClinic() {
        addClinicButton.click();
        return this;
    }

    /**Получение параметров клиники после создания */
    public String getClinicName() {
        return detailFirstName.getText();
    } // Получаем название клиники
    public String getClinicTel() {
        return detailTelNumber.getText();
    } // Получаем телефон клиники
    public String getClinicAddress() {
        return detailAddress.getText();
    } // Получаем адрес клиники


    /**Проверка видимости кнопки Добавить филиал */
    public boolean isAddFilialVisible() {
        return detailAddFilial.is(visible);
    }

    /**Проверка видимости кнопки Редактировать клинику */
    public boolean isClinicEditVisible() {
        return detailEdit.is(visible);
    }



}
