package com.momentum.google_demo.step_definitions;

import com.momentum.google_demo.Search;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;

public class GoogleStepDefs {

    @Before
    public void setup() {
        Search.setDriver();
    }

    @Given("Google Chrome is launched")
    public void google_chrome_is_launched() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Google Chrome launched...");
//        throw new io.cucumber.java.PendingException();
    }

    @When("I search for {string}")
    public void i_search_for(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Searching for " + string);
//        throw new io.cucumber.java.PendingException();
    }

    @Then("Results should be displayed")
    public void results_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Validating results");
//        throw new io.cucumber.java.PendingException();
    }

    @After
    public void tearDown() {
        Search.closeDriver();
    }
}
