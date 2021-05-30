package com.momentum.ibrs_demo.step_definitions;

import com.momentum.ibrs_demo.pages.DashboardPage;
import com.momentum.ibrs_demo.pages.LoginPage;
import com.momentum.utils.BrowserType;
import com.momentum.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/** Represents a Login Steps.
 * @author Phetho Malope
 * @author phetomalope@gmail.com
 * @version 1.0
 */
public class LoginStepDefs {

    private WebDriver driver;
    private DashboardPage dashboardPage;
    private LoginPage loginPage;
    private String baseUrl = "https://insidepre.momentummetropolitan.co.za/apps/ibrs";

    @Before
    public void setup() {
        // set driver path
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe"); // Chrome
//        driver = new ChromeDriver(options);
        driver = DriverFactory.getInstance().getDriver(BrowserType.CHROME);
    }

//    TODO: Implement
//    @BeforeStep
//    public void setUpStep() {
//
//    }
//
//    @AfterStep
//    public void tearDownStep() {
//
//    }

    @Given("The browser is open and login page is loaded")
    public void browser_is_open_and_login_page_is_loaded() {
        // TODO: handle session
        loginPage = new LoginPage(driver);
        // loginPage.loadPage(); // FIXME: find a way to use this format
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @When("I enter username {string} and password {string}")
    public void I_enter_username_and_password(String username, String password) {

        loginPage.enterCredentials(username, password);
    }
    @When("I click on the login button")
    public void I_click_on_the_login_button() {
        dashboardPage = loginPage.clickSignInButton();
    }
    @Then("I should be redirected to the Dashboard with a title {string}")
    public void I_should_be_redirected_to_the_dashboard(String dashboardTitle) {
        Assert.assertEquals(dashboardPage.getPageTitle(), dashboardTitle);
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
