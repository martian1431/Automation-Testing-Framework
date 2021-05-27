package com.momentum.ibrs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

    protected WebDriver driver;

    @FindBy(xpath = "//*[@id=\"nav-accordion\"]/div[7]/a")
    WebElement ibrsAdminBy;

    public Dashboard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        //Validate: check if user is logged in
    }

    public void IbrsAdminDropdown() {
        ibrsAdminBy.click();
    }


}
