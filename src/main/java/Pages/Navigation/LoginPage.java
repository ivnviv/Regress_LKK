package Pages.Navigation;

import com.codeborne.selenide.SelenideElement;

import static Common.Constants.LOGIN;
import static Common.Constants.PASSWORD;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    /**Взаимодействие с элементами на странице авторизации*/
    private final SelenideElement loginInput = $x("//input[@type='text']");
    private final SelenideElement passwordInput = $x("//input[@type='password']");
    private final SelenideElement submitLogIn = $x("//span[@class='v-btn__content']");


    /**Метод для авторизации*/
    public void auth(){
        loginInput.setValue(LOGIN);
        passwordInput.setValue(PASSWORD);
        submitLogIn.click();
    }
}
