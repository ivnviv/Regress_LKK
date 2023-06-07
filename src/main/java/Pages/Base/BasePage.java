package Pages.Base;

import com.codeborne.selenide.Selenide;

public class BasePage {

    /**Открытие URL*/
    public void open(String url) {
        Selenide.open(url);
    }

    public BasePage() {
    }
}


