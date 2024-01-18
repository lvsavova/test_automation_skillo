package lecture23.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PopUp extends BasePage {
    @FindBy(className = "toast-message")
    WebElement toastMsg;

    public PopUp(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getMessage() {
        wait.until(ExpectedConditions.visibilityOf(toastMsg));
        return toastMsg.getText();
    }

}
