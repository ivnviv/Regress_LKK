package Pages.Base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static Common.Config.BASE_URL;
import static com.codeborne.selenide.Selenide.$x;

public class BasePage {

    private final SelenideElement loginInput = $x("//input[@type='text']");
    private final SelenideElement passwordInput = $x("//input[@type='password']");
    private final SelenideElement navigationMain = $x("/html/body/div[1]/div/div/div/div/nav/ul/li[2]/a/div");
    private final SelenideElement submitLogIn = $x("//span[@class='v-btn__content']");


    private final SelenideElement addClinicButtton = $x("//div[@class='page__title page__title--flex']/button");
    protected SelenideElement navigationPart = null;
    public BasePage(String url) {
        Selenide.open(url);
    }


    public void auth(String LkkLogin, String LkkPassword){
        BasePage basePage = new BasePage(BASE_URL);
        loginInput.setValue(LkkLogin);
        passwordInput.setValue(LkkPassword);
        submitLogIn.click();
    }
    public void navigateTo(SelenideElement navigationPart){

        this.navigationPart.click();
        
        
       //Пока отказываюсь, т.к может создать проблемы, когда разделы добавятся 
               /* switch (navigationPart) {
            case "Main" -> navigationMain.click();
            case "Clinic" -> navigationClinic.click();
            case "Doctors" -> navigationDoctors.click();
            case "Prices" -> navigationPrices.click();
            case "Promotions" -> navigationPromotions.click();
            case "Responses" -> navigationResponses.click();
            case "Cpa" -> navigationCpa.click();
            case "Receptions" -> navigationReceptions.click();
            case "Statistics" -> navigationStatistics.click();
            case "Docs" -> navigationDocs.click();
            case "Settings" -> navigationSettings.click();
        }*/
        
    }

    public BasePage() {
    }
}

