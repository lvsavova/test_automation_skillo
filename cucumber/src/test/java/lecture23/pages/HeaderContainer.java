package lecture23.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HeaderContainer extends BasePage {
    @FindBy(id = "nav-link-home")
    WebElement homeLink;

    @FindBy(id = "nav-link-login")
    WebElement loginLink;

    @FindBy(id = "nav-link-profile")
    WebElement profileLink;

    @FindBy(id = "nav-link-new-post")
    WebElement newPostLink;

    public HeaderContainer(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goToHome() {
        clickElement(homeLink);
        wait.until(ExpectedConditions.urlToBe(HomePage.URL));
    }

    public void goToLogin() {
        clickElement(loginLink);
        wait.until(ExpectedConditions.urlToBe(LoginPage.URL));
    }

    public void goToProfile() {
        clickElement(profileLink);
        wait.until(ExpectedConditions.urlContains(ProfilePage.URL));
    }

    public void goToNewPost() {
        clickElement(newPostLink);
        wait.until(ExpectedConditions.urlToBe(NewPostPage.URL));
    }

}
