package lecture22.examples;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/lecture22/examples/features/dataTables.feature",
                "src/test/java/lecture22/examples/features/docString.feature"},
        glue = "lecture22.examples.steps",
        tags = "@smoke",
        plugin = { "pretty", "html:target/cucumber-reports/cucumber.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
