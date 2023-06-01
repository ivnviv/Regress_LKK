package Pages.Base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

import java.time.Duration;

import static Common.Config.*;
import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    protected WebElement navigationPart;

    //Переход к разделу

    public void open(String url) {
        Selenide.open(url);
    }

    public BasePage() {
    }
}


