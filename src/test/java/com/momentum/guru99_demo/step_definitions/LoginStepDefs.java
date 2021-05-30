package com.momentum.guru99_demo.step_definitions;

import com.momentum.guru99_demo.pages.HomePage;
import com.momentum.guru99_demo.pages.LoginPage;
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/** Represents a Login Steps.
 * @author Phetho Malope
 * @author phetomalope@gmail.com
 * @version 1.0
 */
public class LoginStepDefs {
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected WebDriver driver;
    protected String expectedWelcomeMessage = "Welcome To Manager's Page of Guru99 Bank";
    protected final String baseUrl = "http://demo.guru99.com/V4/index.php";

    @Before
    public void setUpClass() {
        // set driver path
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe"); // Chrome
        // System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe"); // Firefox
        // Driver options
        ChromeOptions options = new ChromeOptions(); // driver options
        options.addArguments("--headless");
        // user Chrome driver
        // driver = new ChromeDriver(options);
        driver = DriverFactory.getInstance().getDriver(BrowserType.CHROME); // FIXME: options parameter seems to be not working when passing it to another method
        // full screen window
        driver.manage().window().maximize();
        // wait for the element to appear before the exception occurs
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //
        loginPage = new LoginPage(driver);
    }

//    TODO: implement
//    @BeforeStep
//    public void setUpStep() {
//
//    }
//
//    @AfterStep
//    public void tearDownStep() {
//
//    }

    @Given("The login page is loaded")
    public void the_login_page_is_loaded() {
        driver.get(baseUrl);
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
    public void tearDownClass() {
        driver.close();
    }
}
