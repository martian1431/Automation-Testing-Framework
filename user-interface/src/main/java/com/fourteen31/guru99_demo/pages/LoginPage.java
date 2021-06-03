package com.fourteen31.guru99_demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    protected WebDriver driver;

    private String userId;
    private String password;

    @FindBy(name = "uid")
    WebElement userIdBy;

    @FindBy(name = "password")
    WebElement passwordBy;

    @FindBy(name = "btnLogin")
    WebElement loginBy;

//    private final By userIdBy = By.name("uid");
//    private final By passwordBy = By.name("password");
//    private final By loginBy = By.name("btnLogin");
//

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Login as valid user
     *
     * @return HomePage object
     */
    public HomePage loginValidUser() {
        userIdBy.sendKeys(userId);
        passwordBy.sendKeys(password);
        loginBy.click();
        return new HomePage(driver);
    }

    /**
     * Login as invalid user
     *
     * @return Error Message string
     */
    public String loginInvalidUser() {
        return "Default Error!!!";
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
