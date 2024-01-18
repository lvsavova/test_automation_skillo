package lecture22.exercise;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MathSteps {
    private float result;
    private float numberA;
    private float numberB;

    @Given("I have two numbers {string} and {string}")
    public void iHaveTwoNumbersAnd(String a, String b) {
        numberA = Float.parseFloat(a);
        numberB = Float.parseFloat(b);
    }

    @When("I add them")
    public void add() {
        result = numberA + numberB;
    }

    @When("I subtract them")
    public void subtract() {
        result = numberA - numberB;
    }

    @When("I multiply them")
    public void multiply() {
        result = numberA * numberB;
    }

    @When("I divide them")
    public void divide() {
        result = numberA / numberB;
    }

    @When("I modulus them")
    public void modulus() {
        result = numberA % numberB;
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String expectedResult) {
        Assert.assertEquals(result, Float.parseFloat(expectedResult));
    }
}
