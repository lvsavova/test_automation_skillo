package lecture22.examples.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginMockupSteps {
    @Given("the user is on the login page")
    public void goToLogin() {
        System.out.println("User navigates to login page");
    }

    @When("the user enters username {string} and password {string}")
    public void enterCredentials(String username, String pass) {
        System.out.println("User enters credentials");
    }

    @And("the user clicks the login button")
    public void clickLoginBtn() {
        System.out.println("User clicks login");
    }

    @Then("the user should be redirected to the dashboard")
    public void checkDashboard() {
        System.out.println("User sees dashboard");
    }

    @And("the user should see a welcome message")
    public void checkWelcomeMsg() {
        System.out.println("User sees welcome message");
    }
}