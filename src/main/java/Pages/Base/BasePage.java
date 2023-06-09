package Pages.Base;

import com.codeborne.selenide.Selenide;

public class BasePage {

    /**
     * Открывает указанный URL.
     * @param url URL для открытия.
     */
    public void open(String url) {
        Selenide.open(url);
    }

}


