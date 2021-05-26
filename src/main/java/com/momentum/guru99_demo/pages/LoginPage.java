package com.momentum.guru99_demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    protected WebDriver driver;

    private String userId;
    private String password;

    private By userIdBy = By.name("uid");
    private By passwordBy = By.name("password");
    private By loginBy = By.name("btnLogin");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Login as valid user
     *
     * @return HomePage object
     */
    public HomePage loginValidUser() {
        driver.findElement(userIdBy).sendKeys(userId);
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(loginBy).click();
        return new HomePage(driver);
    }

    /**
     * Login as invalid user
     *
     * @param userName
     * @param password
     * @return Error Message string
     */
    public String loginInvalidUser(String userName, String password) {
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
