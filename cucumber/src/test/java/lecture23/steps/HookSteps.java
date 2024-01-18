package lecture23.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lecture23.utils.WebDriverHandler;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class HookSteps {

    public static final String REPORT_DIR = "src\\test\\java\\resources\\reports\\";

    @Before
    public void setup()  {
        try {
            cleanDir(REPORT_DIR);
        } catch (IOException e) {
            System.out.println("Unable to delete the report dir.");
        }
        WebDriverHandler.setupDriver();
    }

    public void cleanDir(String filepath) throws IOException {
        File dir = new File(filepath);
        if (dir.exists()) {
            FileUtils.cleanDirectory(dir);
        } else {
            dir.mkdirs();
        }
    }

    @After
    public void cleanup(Scenario scenario) {
        takeScreeshot(scenario);
        WebDriverHandler.closeDriver();
    }

    public void takeScreeshot(Scenario scenario) {
        if (scenario.isFailed()) {
            // Capture screenshot
            byte[] screenshot = ((TakesScreenshot) WebDriverHandler.setupDriver()).getScreenshotAs(OutputType.BYTES);
            // Attach screenshot to report
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }
}
