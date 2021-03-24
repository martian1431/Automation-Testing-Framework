package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	WebDriver driver = null;

	@Given("^I am on Facebook login page$")
	public void goToFacebookLoginPage() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	@When("^I enter username as \"([^\"]*)\"$")
	public void enterUsername(String username) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(username);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void enterPassword(String password) throws Throwable {
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}

	@Then("^Login should fail$")
	public void checkFail() throws Throwable {
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
			System.out.println("Test1 Pass");
		} else {
			System.out.println("Test1 Failed");
		}
		driver.close();
	}

	@Then("^Relogin option should be available$")
	public void checkRelogin() throws Throwable {
		driver.navigate().to("https://www.facebook.com/");
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
			System.out.println("Test2 Pass");
		} else {
			System.out.println("Test2 Failed");
		}
		driver.close();
	}
}
