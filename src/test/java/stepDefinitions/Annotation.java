package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Annotation {

	WebDriver driver = null;

	@Given("^I am on Facebook login page$")
	public void goToFacebookLoginPage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
	}

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
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
			System.out.println("Test2 Pass");
		} else {
			System.out.println("Test2 Failed");
		}
		driver.close();
	}
}
