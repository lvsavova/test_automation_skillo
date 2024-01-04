package lecture19.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;

public class NewPostPage extends BasePage {
    public static final String URL = "http://training.skillo-bg.com:4200/posts/create";
    @FindBy(className = "file")
    WebElement fileInput;

    @FindBy(name = "caption")
    WebElement captionInput;

    @FindBy(id = "create-post")
    WebElement createPostBtn;

    public NewPostPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void populateCaption(String text) {
        enterText(captionInput, text);
    }

    public void clickSubmit() {
        clickElement(createPostBtn);
    }

    public void uploadFile(String absFilePath) {
        fileInput.sendKeys(absFilePath);
    }
}
