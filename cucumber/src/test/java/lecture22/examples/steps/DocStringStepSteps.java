package lecture22.examples.steps;

import io.cucumber.java.en.Given;

public class DocStringStepSteps {

    @Given("I enter the text:")
    public void enterText(String docString) {
        System.out.println("Text:\n" + docString);
    }
}
