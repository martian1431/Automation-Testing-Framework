package com.fourteen31.automation_panda.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDefs {

    @Given("a web browser is on the Google page")
    public void a_web_browser_is_on_the_google_page() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
    @When("the search phrase {string} is entered")
    public void the_search_phrase_is_entered(String string) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        // System.out.println("Searching for '" + string + "'...");
    }
    @Then("results for {string} are shown")
    public void results_for_are_shown(String string) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        // System.out.println("Search results for '" + string + "'...");
    }

    @Then("the related results include {string}")
    public void the_related_results_include(String string) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
}
