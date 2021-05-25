package com.momentum.google_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class Search extends Base {

    public static void openBrowser() {
        navigateToHome();
    }

    public static void searchInput(String text) {
        WebElement s = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        if (s.isDisplayed()) {
            s.sendKeys(text);
        }
    }

    public static void closeDriver(){
        driver.quit();
    }

    public static void pressEnter() {
        WebElement s = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        if (s.isDisplayed()) {
            s.sendKeys(Keys.ENTER);
        }
    }
}
