package base;

import Pages.Base.BasePage;
import Pages.Navigation.LoginPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    protected LoginPage loginPage = new LoginPage();
    protected BasePage basePage = new BasePage();


    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
    }

    @Before
    public void init() {
        setUp();
        loginPage.auth();
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
