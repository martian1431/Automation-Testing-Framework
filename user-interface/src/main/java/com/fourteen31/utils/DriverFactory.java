package com.fourteen31.utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Properties;

import static com.fourteen31.utils.DriverConstants.*;

/** Represents a Browser Driver.
 * @author Phetho Malope
 * @author phetomalope@gmail.com
 * @version 1.0
 */
public class DriverFactory {
    private static URL remoteDriverHostUrl;
    private static ChromeOptions chromeOptions;
    private static Properties config;
    private static final String DRIVER_CONFIG_FILE = "src/main/resources/driver.propertie";

    //config properties
    private ConfigGetPropertyValues propertyValues = new ConfigGetPropertyValues();

    //Singleton design pattern
    public static final DriverFactory instance = new DriverFactory();

    private DriverFactory() {}

    public static DriverFactory getInstance() {
        return instance;
    }

    //Factory design pattern
    private static final ThreadLocal<RemoteWebDriver> threadLocal = new ThreadLocal<>();

    /*
     *
     * */
    public RemoteWebDriver getDriver(BrowserType type) {

        try {
            config = new Properties();
            config.load(new FileInputStream(DRIVER_CONFIG_FILE));

            if (threadLocal.get() == null) {
                if (isWindows()) {
                    // TODO: refactor - setupDriver()
                    switch (type) {
                        case CHROME:
                            System.setProperty(CHROME_DRIVER_WINDOWS, config.getProperty(CHROME_DRIVER_PATH_WINDOWS));
                            threadLocal.set(new ChromeDriver());
                            break;
                        case FIREFOX:
                            System.setProperty(GECKO_DRIVER_WINDOWS, config.getProperty(GECKO_DRIVER_PATH_WINDOWS));
                            threadLocal.set(new FirefoxDriver());
                            break;
                        case EDGE:
                            System.setProperty(EDGE_DRIVER_WINDOWS, config.getProperty(EDGE_DRIVER_PATH_WINDOWS));
                            threadLocal.set(new EdgeDriver());
                            break;
                        default:
                            // TODO: throw exception "Driver not available"
                            break;
                    }
                }
            }
        } catch (Exception ex) {
            if (ex instanceof FileNotFoundException) {
                //FIXME: handle exception gracefully!!!
                System.out.println("TODO: handle exception gracefully!!!");
                System.out.println(ex.getMessage());
            } else {
                //FIXME: handle unknown exception gracefully!!!
                System.out.println("handle unknow exception gracefully!!!");
                ex.printStackTrace();
            }
        }

        return threadLocal.get();
    }

    /*
     *
     * */
    public RemoteWebDriver getDriver() {
        chromeOptions = new ChromeOptions(); // driver options

        try {
            remoteDriverHostUrl = new URL("http://192.168.8.112:4444/wd/hub");
        } catch (Exception e) {
            e.printStackTrace();
        }
        threadLocal.set(new RemoteWebDriver(remoteDriverHostUrl, chromeOptions));

        return threadLocal.get();
    }

    /**
     *
     * */
    private void setupDriver() {

    }

    /**
     *
     * */
    private boolean isWindows() {
        String os = System.getProperty("os.name");
        return os.startsWith("Windows");
    }

    /**
     *
     * */
    private boolean isUnix() {
        String os = System.getProperty("os.name");
        return os.startsWith("Mac");
    }
}
