package Navigation.Clinic;

import org.junit.Test;

public class AddClinicTest {

    private final static String LkkLogin = "i.ivanov.napopravku@gmail.com";
    private final static String LkkPassword = "Xkxzqu2FGi5Hrmt";
    private final static String BASE_URL = "http://profile.ivanov.polygon.dev-napopravku.ru/clinic";
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
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.auth(LkkLogin,LkkPassword);
        mainPage.clickOnAddClinic();

        AddClinicModalWindow addClinicModalWindow = new AddClinicModalWindow();
        addClinicModalWindow.fillAddClinicWindow(clinicNameInput, clinicTypeInput,cityInput,addressInput,addressCommentInput,telNumberInput, numberCommentInput);
    }
}
