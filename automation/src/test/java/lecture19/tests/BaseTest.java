package lecture19.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    public static String SCREENSHOTS_DIR =  "src\\test\\java\\resources\\screenshots\\";
    WebDriver driver;
    @BeforeMethod
    public void setup() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();;
        cleanDirectory(SCREENSHOTS_DIR);
    }

    public void cleanDirectory(String path) throws IOException {
        File dir = new File(path);
        if (dir.exists()) {
            FileUtils.cleanDirectory(dir);
        } else {
            dir.mkdirs();
        }
    }

    @AfterMethod
    public void cleanup(ITestResult testResult) {
        takeScreenshot(testResult);
        driver.close();
    }

    public void takeScreenshot(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
            String fileName = testResult.getName();
            try {
                FileUtils.copyFile(screenshot, new File( SCREENSHOTS_DIR + fileName + ".jpeg"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
