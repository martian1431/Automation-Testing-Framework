package com.fourteen31.guru99_demo.step_definitions;

import com.fourteen31.guru99_demo.pages.HomePage;
import com.fourteen31.guru99_demo.pages.LoginPage;
import com.fourteen31.utils.BrowserType;
import com.fourteen31.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.RemoteWebDriver;
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
//    protected WebDriver driver;
    protected RemoteWebDriver driver;
    protected String expectedWelcomeMessage = "Welcome To Manager's Page of Guru99 Bank";
    protected final String baseUrl = "http://demo.guru99.com/V4/index.php";

    @Before
    public void setUpClass() {
        // Web Driver (local)
        //System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe"); // Chrome
//        driver = DriverFactory.getInstance().getDriver(BrowserType.CHROME);

        // Remote Driver (docker container)
        driver = DriverFactory.getInstance().getDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }


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
}
