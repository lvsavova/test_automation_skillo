package lecture23;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/lecture23/features/login.feature",
        glue = "lecture23.steps",
        plugin = { "pretty", "html:src/test/java/resources/reports/cucumber.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
