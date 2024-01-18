package lecture23.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import lecture23.pages.*;
import lecture23.utils.WebDriverHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavigationSteps {

    WebDriver driver;

    public NavigationSteps() {
        driver = WebDriverHandler.setupDriver();
    }


    @Given("I open the iSkillo site")
    public void openSite() {
        HomePage homePage = new HomePage(driver);
        homePage.goTo();
    }

    @And("I navigate to {string} page")
    public void navigate(String page) {
        HeaderContainer headerContainer = new HeaderContainer(driver);
        switch (page) {
            case "Home":
                headerContainer.goToHome();
                break;
            case "Login":
                headerContainer.goToLogin();
                break;
            case "Profile":
                headerContainer.goToProfile();
                break;
            case "NewPost":
                headerContainer.goToNewPost();
                break;
            default: throw new RuntimeException("No implementation for page " + page);
        }
    }

    @Then("I should land/stay on/at {string} page")
    public void iShouldLandOnPage(String page) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        switch(page) {
            case "Home":
                wait.until(ExpectedConditions.urlToBe(HomePage.URL));
                break;
            case "Login":
                wait.until(ExpectedConditions.urlToBe(LoginPage.URL));
                break;
            case "Profile":
                wait.until(ExpectedConditions.urlContains(ProfilePage.URL));
                break;
            case "NewPost":
                wait.until(ExpectedConditions.urlContains(NewPostPage.URL));
                break;
            default: throw new RuntimeException("No implementation for page " + page);
        }
    }
}
