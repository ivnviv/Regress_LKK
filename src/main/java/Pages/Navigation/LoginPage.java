package Pages.Navigation;

import com.codeborne.selenide.SelenideElement;

import static Common.Config.LOGIN;
import static Common.Config.PASSWORD;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    //Для авторизации
    private final SelenideElement loginInput = $x("//input[@type='text']");
    private final SelenideElement passwordInput = $x("//input[@type='password']");
    private final SelenideElement submitLogIn = $x("//span[@class='v-btn__content']");

    public void auth(){
        loginInput.setValue(LOGIN);
        passwordInput.setValue(PASSWORD);
        submitLogIn.click();
    }
}