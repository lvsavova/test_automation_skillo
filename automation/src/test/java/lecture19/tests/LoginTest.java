package lecture19.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lecture19.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
    }

    @Test
    public void login() {
        driver.get(LoginPage.URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.populateUsername("automation_user");
        loginPage.populatePassword("auto_pass");
        loginPage.clickSignIn();
    }

    @AfterMethod
    public void cleanup() {
        driver.close();
    }

}
