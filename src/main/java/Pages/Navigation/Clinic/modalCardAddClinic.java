package Pages.Navigation.Clinic;

import Pages.Base.BasePage;
import com.codeborne.selenide.SelenideElement;

import static Common.Constants.*;
import static com.codeborne.selenide.Selenide.$x;

public class modalCardAddClinic extends BasePage {

    /**Поля модалки создания клиники*/
    private final SelenideElement clinicNameInput = $x("//input[@placeholder='Введите название']"); //Поле ввода названия клиники
    private final SelenideElement clinicTypeInput = $x("//input[@placeholder='Введите тип']"); //Поле ввода типа клиники
    private final SelenideElement clinicIsNetworkCheckbox = $x("//div[@class='v-input--selection-controls__ripple']"); //Чекбокс "Сетевая клиника" ввода типа клиники
    private final SelenideElement cityInput = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[2]/div[2]/div[1]/div/div/div/input"); //Поле ввода города
    private final SelenideElement addressInput = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[2]/div[2]/div[2]/div/div/div/input"); //Поле ввода адреса
    private final SelenideElement addressCommentInput = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[2]/div[2]/div[3]/div/div/div/input"); //Поле ввода комментария к адресу
    private final SelenideElement telNumberInput = $x("//input[@type = 'tel']"); //Поле ввода телефона
    private final SelenideElement telNumberCommentInput = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[2]/div[3]/div/div/div/div/input"); //Поле ввода комментария к телефону
    private final SelenideElement addExtraTelNumber = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[2]/button/span/i"); //Кнопка добавления дополнительного номера телефона
    private final SelenideElement siteInput = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[2]/div[4]/div/div/div/div/input"); //Поле ввода сайта
    private final SelenideElement addWorkRegime = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[3]/button[1]/span/i"); //Кнопка добавдения режима работы
    //добавить константы для режима работы
    private final SelenideElement saveButton = $x("//button[@type= 'submit']"); //Кнопка Сохранить
    private final SelenideElement cancelButton = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[3]/div/div[1]/button[2]"); //Кнопка Отменить


    public modalCardAddClinic enterClinicName() {
        clinicNameInput.setValue(getClinicName());
        return this;
    }

    public modalCardAddClinic enterClinicType() {
        clinicTypeInput.setValue(getClinicType());
        return this;
    }
    public modalCardAddClinic clinicIsNetwork() {
        clinicIsNetworkCheckbox.click();
        return this;
    }
    public modalCardAddClinic enterClinicCity() {
        cityInput.setValue(getClinicCity());
        return this;
    }
    public modalCardAddClinic enterClinicAddress() {
        addressInput.setValue(getClinicAddress());
        return this;
    }
    public modalCardAddClinic enterClinicAddressComment() {
        addressCommentInput.setValue(getCommentForAddress());
        return this;
    }
    public modalCardAddClinic enterClinicTelNumber() {
        telNumberInput.setValue(getTelNumber());
        return this;
    }
    public modalCardAddClinic enterClinicTelComment() {
        telNumberCommentInput.setValue(getCommentForAddress());
        return this;
    }
    public modalCardAddClinic addExtraTelNumber() {
        addExtraTelNumber.click();
        return this;
    }
    public modalCardAddClinic enterClinicSite() {
        siteInput.setValue(getSiteName());
        return this;
    }
    public modalCardAddClinic addWorkRegime() {
        addWorkRegime.click();
        return this;
    }
    public modalCardAddClinic saveClinic() {
        saveButton.click();
        return this;
    }
    public modalCardAddClinic cancelAddClinic() {
        cancelButton.click();
        return this;
    }
}
