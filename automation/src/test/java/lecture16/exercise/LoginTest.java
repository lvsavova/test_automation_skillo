package lecture16.exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

//As an existing user, I can successfully login
//        1. Open homepage
//        2. Click Login link
//        3. Check the login page url has loaded
//        4. Check Sign In form is visible
//        5. Enter username - automation_user
//        6. Enter password - auto_pass
//        7. Click Remember me
//        8. Click Sign in
//        9. Check that Home page is displayed ( URL )
//        10. Check that there is Profile link
//        11. Click Profile
//        12. Check that the username is displayed and equals 'automation_user'
public class LoginTest {
    ChromeDriver driver;
    final String BASE_URL = "http://training.skillo-bg.com:4200";
    final String HOME_URL = BASE_URL + "/posts/all";
    final String LOGIN_URL = BASE_URL + "/users/login";
    final String USER_URL = BASE_URL + "/users/";
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
    }

    @DataProvider(name = "usersData")
    public Object[][] getUsersData() {
        return new Object[][] {
                {"automation_user", "auto_pass"},
                {"automation_user2", "auto_pass"}
        };
    }

    @Test(dataProvider = "usersData")
    public void loginTest(String username, String password) {
        System.out.println("1. Open homepage");
        driver.get(HOME_URL);

        System.out.println("2. Click Login link");
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        clickElement(loginLink);

        System.out.println("3. Check the login page url has loaded");
        wait.until(ExpectedConditions.urlToBe(LOGIN_URL));

        System.out.println("4. Check Sign in form is visible");
        WebElement signInForm = driver.findElement(By.cssSelector("form.form-container"));

        // Option 1:
//        Boolean isSignInFormDisplayed = signInForm.isDisplayed();
//        Assert.assertTrue(isSignInFormDisplayed, "Sign up form is not visible!");

        // Option 2:
        wait.until(ExpectedConditions.visibilityOf(signInForm));

        System.out.println("5. Enter username - automation_user");
        WebElement usernameField = driver.findElement(By.id("defaultLoginFormUsername"));
        wait.until(ExpectedConditions.visibilityOf(usernameField));
        usernameField.sendKeys(username);

        System.out.println("6. Enter password - auto_pass");
        WebElement passwordField = driver.findElement(By.id("defaultLoginFormPassword"));
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.sendKeys(password);

        System.out.println("7. Click Remember me");
        WebElement rememberMeCheckBox = driver.findElement(By.cssSelector("input.remember-me-button"));
        clickElement(rememberMeCheckBox);

        // check that checkbox is selected
        Boolean isSelected =  rememberMeCheckBox.isSelected();
        Assert.assertTrue(isSelected, "Remember me is not selected!");

        System.out.println("8. Click Sign in");
        WebElement signInBtn = driver.findElement(By.id("sign-in-button"));
        clickElement(signInBtn);

        System.out.println("9. Check that Home page is displayed ( URL )");
        wait.until(ExpectedConditions.urlToBe(HOME_URL));

        System.out.println("10. Check that there is Profile link");
        WebElement profileLink = driver.findElement(By.id("nav-link-profile"));
        Boolean isProfileLinkVisible = profileLink.isDisplayed();
        Assert.assertTrue(isProfileLinkVisible, "Profile link is not visible!");

        System.out.println("11. Click Profile");
        clickElement(profileLink);

        System.out.println("12. Check that the Profile page is loaded");
        wait.until(ExpectedConditions.urlContains(USER_URL));

        System.out.println("13. Check that the username is displayed and equals 'automation_user'");

        // Option 1:
//        WebElement usernameHeader = driver.findElement(By.cssSelector(".profile-user-settings > h2"));
//        String currentUsername = usernameHeader.getText();
//        Assert.assertEquals(currentUsername, "automation_user", "Incorrect username header");

        // Option 2:
//        WebElement usernameHeader = driver.findElement(By.xpath("//h2[text()='automation_user']"));
//        wait.until(ExpectedConditions.visibilityOf(usernameHeader));

        // Option 3:
        By usernameHeaderLocator = By.cssSelector(".profile-user-settings > h2");
        WebElement usernameHeader = driver.findElement(usernameHeaderLocator);
        wait.until(ExpectedConditions.textToBe(usernameHeaderLocator, username));
        wait.until(ExpectedConditions.visibilityOf(usernameHeader));
    }

    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }
}
