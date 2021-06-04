package com.fourteen31.utils;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class RemoteDriverFactory {
    private static ChromeOptions chromeOptions;
    private static URL url;
    private static RemoteWebDriver driver;

    public static RemoteWebDriver getRemoteDriver() {
        chromeOptions = new ChromeOptions(); // driver options
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--window-size=1920,1080");

        try {
            url = new URL("http://192.168.8.112:4444/wd/hub");
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver = new RemoteWebDriver(url, chromeOptions);
        return driver;
    }
}
