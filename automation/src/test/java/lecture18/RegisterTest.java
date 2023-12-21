package lecture18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

//        1. Open homepage
//        2. Click Login link
//        3. Check the login page url has loaded
//        4. Click Register link
//        5. Check the url - register
//        6. Check Sing up form is visible
//        7. Type valid username
//        8. Check that valid check has appeared
//        9. Type valid email
//        10. Check that valid check has appeared
//        11. Type valid password
//        12. Check that valid check has appeared
//        13. Confirm password
//        14. Check that valid check has appeared
//        15. Click Sign in
//        16. Wait for Successful register pop up
//        17. Check that url has changed to homepage
//        18. Check that Profile link page is visible
public class RegisterTest {

    WebDriver driver;
    WebDriverWait smallWait;
    WebDriverWait mediumWait;
    final String BASE_URL = "http://training.skillo-bg.com:4200";
    final String HOME_URL = BASE_URL + "/posts/all";
    final String LOGIN_URL = BASE_URL + "/users/login";
    final String REGISTER_URL = BASE_URL + "/users/register";
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        smallWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        mediumWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @DataProvider(name = "getUsers")
    public Object[][] getUsers() {
        return new Object[][] {
                {"user092", "user092@ot.com", "password"},
                {"user093", "user093@ot.com", "password"}
        };
    }
    @Test(dataProvider = "getUsers")
    public void registerTest(String name, String email, String password) {
        System.out.println("1. Open homepage");
        driver.get(HOME_URL);

        System.out.println("2. Click Login link");
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        clickElement(loginLink);

        System.out.println("3. Check the login page url has loaded");
        smallWait.until(ExpectedConditions.urlToBe(LOGIN_URL));

        System.out.println("4. Click Register link");
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        clickElement(registerLink);

        System.out.println("5. Check the url - register");
        smallWait.until(ExpectedConditions.urlToBe(REGISTER_URL));

        System.out.println("6. Check Sing up form is visible");
        smallWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".form-container")));

        System.out.println("7. Type valid username");
        WebElement username = driver.findElement(By.name("username"));
        typeInput(username, name);

        System.out.println("8. Check that valid check has appeared");
        checkValidInput(username);

        System.out.println("9. Type valid email");
        WebElement emailInput = driver.findElement(By.cssSelector("input[type='email']"));
        typeInput(emailInput, email);

        System.out.println("10. Check that valid check has appeared");
        checkValidInput(emailInput);

        System.out.println("11. Type valid password");
        WebElement passwordInput = driver.findElement(By.id("defaultRegisterFormPassword"));
        typeInput(passwordInput, password);

        System.out.println("12. Check that valid check has appeared");
        checkValidInput(passwordInput);

        System.out.println("13. Confirm password");
        WebElement confirmPasswordInput = driver.findElement(By.id("defaultRegisterPhonePassword"));
        typeInput(confirmPasswordInput, password);

        System.out.println("14. Check that valid check has appeared");
        checkValidInput(confirmPasswordInput);

        System.out.println("15. Click Sign in");
        clickElement(By.id("sign-in-button"));

        System.out.println("16. Wait for Successful register pop up");
        WebElement toastMsg = driver.findElement(By.className("toast-message"));
        smallWait.until(ExpectedConditions.visibilityOf(toastMsg));
        Assert.assertEquals(toastMsg.getText(), "Successful register!", "Incorrect toast message");

        System.out.println("17. Check that url has changed to homepage");
        smallWait.until(ExpectedConditions.urlToBe(HOME_URL));

        System.out.println("18. Check that Profile link page is visible");
        smallWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-profile")));
    }

    public void clickElement(WebElement element) {
        smallWait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void clickElement(By locator) {
        WebElement element = driver.findElement(locator);
        smallWait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void checkValidInput(WebElement input) {
        String classes = input.getAttribute("class");
        Boolean containsIsValidClass = classes.contains("is-valid");
        Assert.assertTrue(containsIsValidClass, "Input is not valid");
    }

    public void typeInput(WebElement input, String text) {
        smallWait.until(ExpectedConditions.visibilityOf(input));
        input.sendKeys(text);
    }

    @AfterMethod
    public void close() {
        driver.close();
    }
}
