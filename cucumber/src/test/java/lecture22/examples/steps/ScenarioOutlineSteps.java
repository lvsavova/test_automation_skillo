package lecture22.examples.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;

public class ScenarioOutlineSteps {
    ArrayList<String> items = new ArrayList<>();

    @When("I add item {string} to the cart {int} times")
    public void addItemToCart(String item, int count) {
        for (int i=0; i < count; i++ ) {
            items.add(item);
        }
    }

    @Then("the cart should contain {string} {int} times")
    public void cartContains(String item,  int count) {
        Assert.assertTrue(items.contains(item), "The cart does not contain item " + item);
    }
}
