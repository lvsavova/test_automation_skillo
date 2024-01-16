package lecture22.examples.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterTypesSteps {
    @Given("I have {int} cucumbers")
    public void setCucumbersCount(int cucumberCount) {
        System.out.println(cucumberCount);
    }

    @Given("the price is {float}")
    public void checkPrice(double price) {
        System.out.println(price);
    }

    @When("I add {string} to the cart")
    public void addCartItem(String item) {
        System.out.println(item);
    }

    @And("I do some {}")
    public void doSome(String thing) {
        System.out.println(thing);
    }

    @Then("the ID is {word}")
    public void checkID(String id) {
        System.out.println(id);
    }

    @And("the ID is {string}")
    public void checkID2(String id) {
        System.out.println(id);
    }

    @Given("I have {int} cucumber(s) in my belly")
    public void haveCucumber(int count) {
        System.out.println(count);
    }

    @Given("I have a {word}( car)")
    public void haveCar(String vehicleType) {
        System.out.println("I have a " + vehicleType);
    }
    @Given("I eat a fruit/vegetable/snack/buritto")
    public void eatStuff() {
        System.out.println("I eat");
    }
    @Given("I do yoga/pilates")
    public void doYogaPilates() {
        System.out.println("I do yoga or pilates");
    }
}
