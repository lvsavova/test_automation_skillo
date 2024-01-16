package lecture22.examples.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SimpleSteps {

    int initialAppleCount;
    int result;

    @Given("there are {int} apples")
    public void setApplesCount(int count) {
        initialAppleCount = count;
    }

    @When("I eat {int} of them")
    public void eatApples(int eatenCount) {
        result = initialAppleCount - eatenCount;
    }

    @Then("I should have {int} apples left")
    public void estimateLeftApples(int leftCount) {
        Assert.assertEquals(result, leftCount,
                "Incorrect apple count!");
    }
}
