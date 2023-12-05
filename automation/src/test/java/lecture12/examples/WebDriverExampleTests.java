package lecture12.examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebDriverExampleTests {
    private static WebDriver driver;

    @BeforeMethod
    private static void setupDriver() {
        System.out.println("==========Setting up WebDriver==========");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    private static void testFindElement() {
        driver.get("http://training.skillo-bg.com/posts/all");

        WebElement login = driver.findElement(By.id("nav-link-login"));
        login.click();
    }

    @Test
    private static void testFindElement2() {
        driver.get("http://training.skillo-bg.com/posts/all");

        //Finds Login link which you can use to interact with on a later stage
        WebElement loginElement = driver.findElement(By.id("nav-link-login"));

        //Finds Home link which you can use to interact with on a later stage
        WebElement homeElement = driver.findElement(By.linkText("Home"));
    }

    @Test
    private static void testFindElements() throws InterruptedException {
        driver.get("http://training.skillo-bg.com/posts/all");
        //Finds all posts elements
        List<WebElement> posts = driver.findElements(By.xpath("//*[@class='post-feed-img']"));
        System.out.println("The number of post elements is: " + posts.size());
    }

    @Test
    private static void testClick() {

        driver.get("http://training.skillo-bg.com/posts/all");

        WebElement login = driver.findElement(By.id("nav-link-login"));

        login.click();
    }

    @Test
    private static void testSendKeys() {

        driver.get("http://training.skillo-bg.com/posts/all");

        WebElement login = driver.findElement(By.id("nav-link-login"));
        login.click();

        WebElement username = driver.findElement(By.name("usernameOrEmail"));

        //type in username field
        username.sendKeys("test");
    }

    @Test
    private static void testClear() {

        driver.get("http://training.skillo-bg.com/posts/all");

        WebElement login = driver.findElement(By.id("nav-link-login"));
        login.click();

        WebElement username = driver.findElement(By.id("defaultLoginFormUsername"));

        //type in username field
        username.sendKeys("test");
        username.clear();
    }

    @Test
    private static void testCommonCommands() {

        driver.get("http://training.skillo-bg.com/posts/all");

        //return title of the page as a string
        String titleOfThePage = driver.getTitle();
        System.out.println("The title is: " + titleOfThePage);

        WebElement login = driver.findElement(By.id("nav-link-login"));
        login.click();
        WebElement rememberMe = driver.findElement(By.xpath("//input[@formcontrolname='rememberMe']"));
        rememberMe.click();
        //return true if element is selected(checked)
        System.out.println("Element is selected: " + rememberMe.isSelected());

        WebElement signInButton = driver.findElement(By.id("sign-in-button"));
        //return text of the field as a string
        String buttonText = signInButton.getText();
        System.out.println("The text of the element is: " + buttonText);

        //return true if element is displayed on the page
        System.out.println("The element is displayed: " + signInButton.isDisplayed());

        //return true if element is enabled, and you can interact with it
        System.out.println("The element is enabled: " + signInButton.isEnabled());
    }

    @Test
    private static void testDropdowns() {

        driver.get("https://www.amazon.com/");

        // Select value from dropdown
        WebElement select = driver.findElement(By.id("searchDropdownBox"));

        Select dropdownCategory = new Select(select);
         //dropdownCategory.selectByValue("search-alias=arts-crafts-intl-ship");
        dropdownCategory.selectByVisibleText("Arts & Crafts");
    }

    @Test
    private static void explicitWait() {
        driver.get("http://training.skillo-bg.com/posts/all");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement goToLoginBtn = driver.findElement(By.id("nav-link-login"));

        // Wait for posts to not become visible
        WebElement allPosts = driver.findElement(By.tagName("app-all-posts"));
        webDriverWait.until(ExpectedConditions.visibilityOf(allPosts));

        goToLoginBtn.click();

        // Wait for posts to disappear
        webDriverWait.until(ExpectedConditions.invisibilityOf(allPosts));
    }

    @AfterMethod
    private static void closeDriver() {
        System.out.println("==========Closing WebDriver session==========");
        driver.close();
    }
}
