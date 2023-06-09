package base;

import Pages.Base.BasePage;
import Pages.Navigation.Clinic.clinicContacts;
import Pages.Navigation.Clinic.modalCardAddClinic;
import Pages.Navigation.LoginPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static Common.Constants.getBaseUrl;

public class BaseTest {
    protected LoginPage loginPage = new LoginPage();
    protected BasePage basePage = new BasePage();
    protected clinicContacts clinicContacts = new clinicContacts();
    protected modalCardAddClinic modalCardAddClinic = new modalCardAddClinic();

    private static final Logger logger = LogManager.getLogger(BaseTest.class);

    @BeforeClass
    public static void setUpClass() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;

        logger.info("Setting up Selenide and opening the browser");

        // Perform authentication here
        LoginPage loginPage = new LoginPage();
        loginPage.open(getBaseUrl());
        loginPage.auth();
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
        logger.info("Closing the browser");
    }
}
