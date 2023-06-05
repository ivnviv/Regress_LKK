package Pages.Navigation.Clinic;

import Pages.Base.BasePage;
import com.codeborne.selenide.SelenideElement;

import static Common.Constants.*;
import static com.codeborne.selenide.Selenide.$x;

public class modalCardAddClinic extends BasePage {
    private final SelenideElement clinicNameInput = $x("//input[@placeholder='Введите название']");
    private final SelenideElement clinicTypeInput = $x("//input[@placeholder='Введите тип']");
    private final SelenideElement clinicIsNetworkCheckbox = $x("//div[@class='v-input--selection-controls__ripple']");
    private final SelenideElement cityInput = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[2]/div[2]/div[1]/div/div/div/input");
    private final SelenideElement addressInput = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[2]/div[2]/div[2]/div/div/div/input");
    private final SelenideElement addressCommentInput = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[2]/div[2]/div[3]/div/div/div/input");
    private final SelenideElement telNumberInput = $x("//input[@type = 'tel']");
    private final SelenideElement telNumberCommentInput = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[2]/div[3]/div/div/div/div/input");
    private final SelenideElement addExtraTelNumber = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[2]/button/span/i");
    private final SelenideElement siteInput = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[2]/div[4]/div/div/div/div/input");
    private final SelenideElement addWorkRegime = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[2]/div[3]/button[1]/span/i");
    //добавить константы для режима работы
    private final SelenideElement saveButton = $x("//button[@type= 'submit']");
    private final SelenideElement cancelButton = $x("/html/body/div[1]/div/div[3]/div/div/div/form/div[3]/div/div[1]/button[2]");


    public modalCardAddClinic enterClinicName() {
        clinicNameInput.setValue(CLINIC_NAME);
        return this;
    }

    public modalCardAddClinic enterClinicType() {
        clinicTypeInput.setValue(CLINIC_TYPE);
        return this;
    }
    public modalCardAddClinic clinicIsNetwork() {
        clinicIsNetworkCheckbox.click();
        return this;
    }
    public modalCardAddClinic enterClinicCity() {
        cityInput.setValue(CLINIC_CITY);
        return this;
    }
    public modalCardAddClinic enterClinicAddress() {
        addressInput.setValue(CLINIC_ADDRESS);
        return this;
    }
    public modalCardAddClinic enterClinicAddressComment() {
        addressCommentInput.setValue(COMMENT_FOR_ADDRESS);
        return this;
    }
    public modalCardAddClinic enterClinicTelNumber() {
        telNumberInput.setValue(TEL_NUMBER);
        return this;
    }
    public modalCardAddClinic enterClinicTelComment() {
        telNumberCommentInput.setValue(COMMENT_FOR_TELL_NUMBER);
        return this;
    }
    public modalCardAddClinic addExtraTelNumber() {
        addExtraTelNumber.click();
        return this;
    }
    public modalCardAddClinic enterClinicSite() {
        siteInput.setValue(SITE_NAME);
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
