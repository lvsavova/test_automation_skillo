package lecture23.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lecture23.pages.LoginPage;
import lecture23.utils.WebDriverHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    public LoginSteps() {
        driver = WebDriverHandler.setupDriver();
        loginPage = new LoginPage(driver);
    }


    @When("I enter username {string}")
    public void enterUsername(String username) {
        loginPage.populateUsername(username);
    }

    @And("I enter password {string}")
    public void enterPassword(String password) {
        loginPage.populatePassword(password);
    }

    @And("I click the Login button")
    public void clickTheLoginButton() {
        loginPage.clickSignIn();
    }
}
