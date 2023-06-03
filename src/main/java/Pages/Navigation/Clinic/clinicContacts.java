package Pages.Navigation.Clinic;

import Pages.Base.BasePage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class clinicContacts extends BasePage {

    //Переход к разделу Клиника
    private final SelenideElement navigationClinic = $x("/html/body/div[1]/div/div/div/div/nav/ul/li[2]/div/a");
    private final SelenideElement addClinicButton = $x("//div[@class='page__title page__title--flex']/button");

    public clinicContacts navigateToClinic() {
        navigationClinic.click();
        return this;
    }
    public clinicContacts clickAddClinic() {
        addClinicButton.click();
        return this;
    }








}
