package com.momentum.ibrs_smoke_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/** Represents a IBRS Dashboard page.
 * @author Phetho Malope
 * @author phetomalope@gmail.com
 * @version 1.0
 */
public class DashboardPage {

    private WebDriver driver;
    private final String expectedPageTitle = "User Administration | Inside MMI";

    @FindBy(xpath = "//*[@id=\"nav-accordion\"]/div[7]/a")
    WebElement ibrsAdminBy;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        if (!this.driver.getTitle().equals(expectedPageTitle)) {
            throw new IllegalStateException("Expected Page Title " + expectedPageTitle + "Actual Page Title " +
                    this.driver.getTitle());
        }
        PageFactory.initElements(driver, this);
        //Validate: check if user is logged in
    }

    public void IbrsAdminDropdown() {
        ibrsAdminBy.click();
    }

    public String getPageTitle() {
        return this.driver.getTitle();
    }

}
