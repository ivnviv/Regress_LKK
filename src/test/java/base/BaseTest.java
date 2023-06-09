package base;

import Pages.Base.BasePage;
import Pages.Navigation.Clinic.clinicContacts;
import Pages.Navigation.Clinic.modalCardAddClinic;
import Pages.Navigation.LoginPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static Common.Constants.BASE_URL;

public class BaseTest {
    protected LoginPage loginPage = new LoginPage();
    protected BasePage basePage = new BasePage();
    protected clinicContacts clinicContacts = new clinicContacts();
    protected modalCardAddClinic modalCardAddClinic = new modalCardAddClinic();

    private static final Logger logger = LogManager.getLogger(BaseTest.class);

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;

        logger.info("Настройка Selenide и открытие браузера");

       /**При setup будет также происходить переход по ссылке в ЛКК и авторизация.
        * На начальном этапе это ок, дальше требуется пересмотреть*/


       basePage.open(BASE_URL);
        loginPage.auth();
    }

    @Before
    public void init() {
        setUp();
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
        logger.info("Закрытие браузера");
    }
}
