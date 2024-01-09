package lecture19.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DownloadTest {
    WebDriver driver;
    public static String DOWNLOADS_DIR = "src\\test\\java\\resources\\downloads\\";

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", System.getProperty("user.dir").concat("\\").concat(DOWNLOADS_DIR));
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void downloadTest() throws InterruptedException {
        driver.get("https://demoqa.com/upload-download");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        wait.until(ExpectedConditions.visibilityOf(downloadButton));
        downloadButton.click();
        String fileName = "sampleFile.jpeg";
        File file = new File(DOWNLOADS_DIR + fileName);
        Assert.assertTrue(waitFileToDownload(file, 10), "File" + fileName + " does not exist!");
    }

    public Boolean waitFileToDownload(File file, int timeoutSec) throws InterruptedException {
        for (int i = 0; i <= timeoutSec; i++) {
            // check
            if (file.exists()) {
                return true;
            } else {
                Thread.sleep(1000);
            }
        }
        return false;
    }

    @AfterMethod
    public void cleanup() {
        driver.close();
    }
}
