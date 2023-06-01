package Pages.Base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static Common.Config.*;
import static com.codeborne.selenide.Selenide.$x;

public class BasePage {

    //Для авторизации
    private final SelenideElement loginInput = $x("//input[@type='text']");
    private final SelenideElement passwordInput = $x("//input[@type='password']");
    private final SelenideElement submitLogIn = $x("//span[@class='v-btn__content']");

    //Переход к разделу
    protected SelenideElement navigationPart = null;

    public BasePage(String url) {
        Selenide.open(url);
        auth();
    }

    public void auth(){
        loginInput.setValue(LOGIN);
        passwordInput.setValue(PASSWORD);
        submitLogIn.click();
    }

    public void navigateTo(SelenideElement navigationPart){
        this.navigationPart.click();
    }

    public BasePage() {
    }
}


