package lecture23.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PostModal extends BasePage {

    @FindBy(className = "post-user")
    WebElement postUserLink;

    @FindBy(className = "post-modal-container")
    WebElement postModal;

    public PostModal(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void waitForModalToAppear() {
        wait.until(ExpectedConditions.visibilityOf(postModal));
    }

    public String getPostUser() {
        waitForModalToAppear();
        return postUserLink.getText();
    }
}
