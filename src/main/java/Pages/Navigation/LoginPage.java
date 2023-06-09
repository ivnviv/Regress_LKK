package Pages.Navigation;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static Common.Constants.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    /**Взаимодействие с элементами на странице авторизации*/
    private final SelenideElement loginInput = $x("//input[@type='text']");
    private final SelenideElement passwordInput = $x("//input[@type='password']");
    private final SelenideElement submitLogIn = $x("//span[@class='v-btn__content']");


    /**Метод для авторизации*/
    public void auth(){
        loginInput.shouldBe(visible).setValue(getLogin());
        passwordInput.shouldBe(visible).setValue(getPassword());
        submitLogIn.shouldBe(visible).click();
    }
    public void open(String url) {
        Selenide.open(url);
    }

}
