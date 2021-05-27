package com.momentum.ibrs.step_definitions;

import com.momentum.ibrs.pages.Dashboard;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepDefs {

    protected WebDriver driver;
    protected Dashboard dashboard;
    protected String baseUrl = "https://insidepre.momentummetropolitan.co.za/apps/ibrs";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver = new ChromeDriver();
        dashboard = new Dashboard(driver);
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        dashboard.IbrsAdminDropdown();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            System.out.println(e.getMessage());
        }
    }
    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should be redirected to the {string}")
    public void user_should_be_redirected_to_the(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
