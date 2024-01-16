package lecture22.examples.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SimpleStepsExample1 {

    int initialCount;
    int leftCount;
    @Given("there are {int} cucumbers")
    public void setCucumbersCount(int count) {
        initialCount = count;
    }
    @When("I eat {int} cucumbers")
    public void eatCucumbers(int eatenCount) {
        leftCount = initialCount - eatenCount;
    }

    @Then("I should have {int} cucumbers")
    public void leftCucumbers(int expectedCount) {
        Assert.assertEquals(leftCount, expectedCount,
                "Incorrect number of cucumbers");
    }
    @Given("I have {int} cucumbers and {string} apples")
    public void cucumberAndApplesCount(int cucumberCount, String appleType) {
    }
//    @Given("^I have (\\d+) cucumbers and \"(.*)\" apples$")
//    public void cucumberAndApplesCount(int cucumberCount, String appleType) {
//    }
}
