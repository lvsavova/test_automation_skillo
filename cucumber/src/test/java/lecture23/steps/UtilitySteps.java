package lecture23.steps;

import io.cucumber.java.en.And;
import lecture23.pages.PopUp;
import lecture23.utils.WebDriverHandler;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UtilitySteps {

    WebDriver driver;
    public UtilitySteps() {
        driver = WebDriverHandler.setupDriver();
    }

    @And("I should see a popup with text {string}")
    public void checkPopupMsg(String msg) {
        PopUp popUp = new PopUp(driver);
        String popMsg = popUp.getMessage();
        Assert.assertEquals(popMsg, msg, "Incorrect popup message!");
    }
}
