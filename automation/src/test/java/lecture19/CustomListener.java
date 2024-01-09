package lecture19;

import lecture19.tests.BaseTest;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult tr) {
        String screenshotPath = "..\\..\\" + BaseTest.SCREENSHOTS_DIR + tr.getName() + ".jpeg";
        Reporter.log("<br><a href='" + screenshotPath + "'> <img src='" + screenshotPath + "' height='200' width='300'/> </a>");
    }
}
