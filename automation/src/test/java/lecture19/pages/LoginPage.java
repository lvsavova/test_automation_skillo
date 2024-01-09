package lecture19.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {
    // 1. Attributes - WebElement - all the html elements we will interact with in our tests
    //  * usernameField
    //  * passwordField
    //  * signInBtn
    //  * rememberMeCheckbox
    public static final String URL = "http://training.skillo-bg.com:4200/users/login";

    @FindBy(id = "defaultLoginFormUsername")
    private WebElement usernameField;

    @FindBy(id = "defaultLoginFormPassword")
    private WebElement passwordField;

    @FindBy(id = "sign-in-button")
    private WebElement signInBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // 2. Methods - actions we can perform with the web elements
    // * populateUsername(String username)
    // * populatePassword(String password)
    // * login(String username, String password)
    // * clickSignIn()
    // * selectRememberMe()
    // * isRememberMeSelected()
    public void populateUsername(String username) {
        enterText(usernameField, username);
    }
    public void populatePassword(String password) {
        enterText(passwordField, password);
    }
    public void clickSignIn() {
        clickElement(signInBtn);
    }

    public void login(String username, String password) {
        populateUsername(username);
        populatePassword(password);
        clickSignIn();
    }
}
