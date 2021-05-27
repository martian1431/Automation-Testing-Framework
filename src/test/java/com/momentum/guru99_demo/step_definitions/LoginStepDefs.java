package com.momentum.guru99_demo.step_definitions;

import com.momentum.guru99_demo.pages.HomePage;
import com.momentum.guru99_demo.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginStepDefs {
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected WebDriver driver;
    protected String expectedWelcomeMessage = "Welcome To Manager's Page of Guru99 Bank";
    protected final String baseUrl = "http://demo.guru99.com/V4/index.php";

    @Before
    public void setup() {
        System.out.println("Loading browser...");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\phmalope\\devProjects\\QAProjects\\Automation-Testing-BDD-Framework\\src\\test\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
        loginPage = new LoginPage(driver);
    }

    @Given("The login page is loaded")
    public void the_login_page_is_loaded() {
        System.out.println("Loading website...");
        driver.get(baseUrl);
        System.out.println("Maximizing browser window...");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("User enters a userID {string}")
    public void user_enters_a_user_id(String string) {
        loginPage.setUserId(string);
    }

    @When("User enters a password {string}")
    public void user_enters_a_password(String string) {
        loginPage.setPassword(string);
    }

    @When("User clicks the login button")
    public void user_clicks_the_login_button() {
        homePage = loginPage.loginValidUser();
    }

    @Then("User is redirected to {string}")
    public void user_is_redirected_to(String string) {
        Assert.assertEquals(homePage.getWelcomeMessage(), expectedWelcomeMessage);
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up the environment...");
        driver.close();
    }
}
