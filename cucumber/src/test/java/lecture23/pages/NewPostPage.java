package lecture23.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewPostPage extends BasePage {
    public static final String URL = "http://training.skillo-bg.com:4200/posts/create";
    @FindBy(className = "file")
    WebElement fileInput;

    @FindBy(name = "caption")
    WebElement captionInput;

    @FindBy(id = "create-post")
    WebElement createPostBtn;
    @FindBy(className = "image-preview")
    WebElement imagePreview;

    @FindBy(css = ".form-control.input-lg")
    WebElement fileNameInput;

    public NewPostPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void populateCaption(String text) {
        enterText(captionInput, text);
    }

    public void clickSubmit() {
        clickElement(createPostBtn);
        wait.until(ExpectedConditions.urlContains(ProfilePage.URL));
    }

    public void uploadFile(String absFilePath) {
        fileInput.sendKeys(absFilePath);
    }

    public void checkImagePreview() {
        smallWait.until(ExpectedConditions.visibilityOf(imagePreview));
    }

    public String getFileName() {
        smallWait.until(ExpectedConditions.visibilityOf(fileNameInput));
        return fileNameInput.getAttribute("placeholder");
    }
}
