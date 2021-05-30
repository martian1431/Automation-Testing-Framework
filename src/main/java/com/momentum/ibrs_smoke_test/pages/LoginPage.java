package com.momentum.ibrs_smoke_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/** Represents a IBRS Login page.
 * @author Phetho Malope
 * @author phetomalope@gmail.com
 * @version 1.0
 */
public class LoginPage {
    private WebDriver driver;

    //Web Elements
    @FindBy(xpath = "//*[@id=\"userName\"]")
    private WebElement usernameInput;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordInput;
    @FindBy(xpath = "//*[@id=\"loginSubmitButton\"]")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterCredentials(String username, String password) {
        if (isPageOpened()) {
            setUsernameInput(username);
            setPasswordInput(password);
        }
    }

    public DashboardPage clickSignInButton() {
        signInButton.click();
        return new DashboardPage(driver);
    }

    private void setUsernameInput(String username) {
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    private void setPasswordInput(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    private boolean isPageOpened() {
        String pageTitle = driver.getTitle();
        // FIXME: Refactor hardcoded string!!!
        return pageTitle.equals("Sign in | Inside MMI");
    }
}
