package Navigation.Clinic;

import base.BaseTest;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class AddClinicTest extends BaseTest {

    private final SelenideElement navigationClinic = $x("//input[@type='text']");
    private final static String BASE_URL = "http://profile.ivanov.polygon.dev-napopravku.ru";
    private final static String clinicNameInput = "Тестовая";
    private final static String clinicTypeInput = "Тестовый";
    private final static String cityInput = "Москва";
    private final static String addressInput = "Пушкина-колотушкина";
    private final static String addressCommentInput = "пояснялово";
    private final static String telNumberInput = "1111111111";
    private final static String numberCommentInput = "пояснялово2";
    private final static String siteInput = "facebook.com";

    @Test
    public void ClinicNameInput(){
        basePage.open(BASE_URL);
        navigationClinic.click();
    }
}
