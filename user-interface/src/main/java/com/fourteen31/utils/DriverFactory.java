package com.fourteen31.utils;

import com.fourteen31.utils.ConfigGetPropertyValues;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.HashMap;

/** Represents a Browser Driver.
 * @author Phetho Malope
 * @author phetomalope@gmail.com
 * @version 1.0
 */
public class DriverFactory {

    //config properties
    private ConfigGetPropertyValues propertyValues = new ConfigGetPropertyValues();

    //Singleton design pattern
    public static final DriverFactory instance = new DriverFactory();

    private DriverFactory() {}

    public static DriverFactory getInstance() {
        return instance;
    }

    //Factory design pattern
    private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    /*
     *  TODO:
     *   * set driver options
     *      e.g - headless = true : this will run the browser in the background (NO GUI)
     *          - ChromeOptions options = new ChromeOptions();
     *          - options.addArguments("--headless");
     * */
    public WebDriver getDriver(BrowserType type) {
        if (threadLocal.get() == null) {
            switch (type) {
                case CHROME:
                    // TODO: Refactor
//                    try {
//                        HashMap<String, String> props = propertyValues.getPropValues();
//                        if (props.get("headless-mode").equals("true")) {
//                            ChromeOptions options = new ChromeOptions();
//                            options.addArguments("--headless");
//                            threadLocal.set(new ChromeDriver(options));
//                        } else {
//                            threadLocal.set(new ChromeDriver());
//                        }
//                    } catch (Exception e) {
//                        System.out.println(e);
//                    }
                    threadLocal.set(new ChromeDriver());
                    break;
                case FIREFOX:
                    threadLocal.set(new FirefoxDriver());
                    break;
                case EDGE:
                    threadLocal.set(new EdgeDriver());
                    break;
                case SAFARI:
                    threadLocal.set(new SafariDriver());
                    break;
            }
        }
        return threadLocal.get();
    }
}
