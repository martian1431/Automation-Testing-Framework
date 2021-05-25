package com.momentum.google_demo.step_definitions;

import com.momentum.google_demo.Search;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDefs {

    @Before
    public void setup() {
        Search.setDriver();
    }

    @Given("Google Chrome is launched")
    public void google_chrome_is_launched() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Launch Google Chrome...");
        Search.openBrowser();
//        throw new io.cucumber.java.PendingException();
    }

    @When("User types {string} into the search box")
    public void user_enters(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Searching for " + string);
        Search.searchInput(string);
//        throw new io.cucumber.java.PendingException();
    }

    @When("User press enter button")
    public void user_enter_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Pressing Enter button");
        Search.pressEnter();
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
