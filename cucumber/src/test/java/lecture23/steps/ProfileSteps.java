package lecture23.steps;

import io.cucumber.java.en.Then;
import lecture23.pages.ProfilePage;
import lecture23.utils.WebDriverHandler;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProfileSteps {
    WebDriver driver;
    public ProfileSteps() {
        driver = WebDriverHandler.setupDriver();
    }

    @Then("I see the username {string}")
    public void seeUsername(String username) {
        ProfilePage profilePage = new ProfilePage(driver);
        String usernameHeaderText =  profilePage.getUsernameHeaderText();
        Assert.assertEquals(usernameHeaderText, username, "Incorrect username!");
    }
}
