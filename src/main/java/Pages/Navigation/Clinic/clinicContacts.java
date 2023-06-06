package Pages.Navigation.Clinic;

import Pages.Base.BasePage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class clinicContacts extends BasePage {

    //Переход к разделу Клиника
    private final SelenideElement navigationClinic = $x("//*[@id=\"app\"]/div/div/div/nav/ul/li[2]/div/a");
    private final SelenideElement addClinicButton = $x("//div[@class='page__title page__title--flex']/button");

    private final SelenideElement ClinicDetailFirst = $x("//div[@class = 'page__list page__list--full']/div[1]");
    private final SelenideElement detailFirstName = $x("/html/body/div[1]/div/div/div/main/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div");

    private final SelenideElement detailTelNumber = $x("/html/body/div[1]/div/div/div/main/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/ul/li[1]");
    private final SelenideElement detailAddress = $x("/html/body/div[1]/div/div/div/main/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/ul/li[2]");
    private final SelenideElement detailAddFilial = $x("/html/body/div[1]/div/div[1]/div/main/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/button/span");
    private final SelenideElement detailEdit = $x("/html/body/div[1]/div/div[1]/div/main/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/button/span");


    public clinicContacts navigateToClinic() {
        navigationClinic.shouldBe(visible).click();
        return this;
    }
    public clinicContacts clickAddClinic() {
        addClinicButton.shouldBe(visible).click();
        return this;
    }
    public String getClinicName() {
        return detailFirstName.getText();
    }
    public String getClinicTel() {
        return detailTelNumber.getText();
    }
    public String getClinicAddress() {
        return detailAddress.getText();
    }
    public void addFilialIsVisible(){
        detailAddFilial.shouldBe(visible);
    }
    public void clinicEditIsVisible(){
        detailEdit.shouldBe(visible);
    }

}
