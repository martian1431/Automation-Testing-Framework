package com.fourteen31.guru99_demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected WebDriver driver;
    private final String expectedPageTitle = "Guru99 Bank Manager HomePage";
    private By welcomeMessageBy = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        if (!this.driver.getTitle().equals(expectedPageTitle)) {
            throw new IllegalStateException("This is not the Home page of a logged in user, " + "current page is " +
                    this.driver.getCurrentUrl());
        }
    }

    /**
     * Get welcome message (h1 tag)
     *
     * @return String message text
     */
    public String getWelcomeMessage() {
        return driver.findElement(welcomeMessageBy).getText();
    }
}
