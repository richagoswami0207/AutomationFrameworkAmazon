package stepDefinition;

import Base.BaseUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class Hooks extends BaseUtil {

    static final String DRIVER_TYPE = "Chrome";
    public static final Logger log = LoggerFactory.getLogger(Hooks.class);
    private BaseUtil _base;

    public Hooks(BaseUtil base) {
        _base= base;
    }

    /**
     * Returns WebDriver
     */
//    @Before
//    public static WebDriver getDriver() {
//
//        log.debug("Accessing the setUpBrowser");
//        if (driver == null) {
//            if (DRIVER_TYPE.equalsIgnoreCase("Chrome")) {
//                driver = buildChromeDriverPath();
//
//            } else {
//                driver = buildfirefoxDriverPath();
//
//
//            }
//        }
//        return driver;
//    }


    @Before
    public void getDriver() {

        log.debug("Accessing the setUpBrowser");
        if (_base.Driver == null) {
            if (DRIVER_TYPE.equalsIgnoreCase("Chrome")) {
                _base.Driver =   buildChromeDriverPath();
            } else
                _base.Driver = buildfirefoxDriverPath();
        }
    }

    /**
     *
     This method is intentially commented out to bt able
     to follow the WebDriver interactions with the UI
     and can be uncommented if required
     *
     */

    @After
    public void Teardown() {
        System.out.println("Closing the browser!!");

//       if(driver!= null){
//           driver.quit();
    }

    ;

    // Chrome driver
    private static WebDriver buildChromeDriverPath() {
        String chromeDriverPath = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver _driver = new ChromeDriver();
        _driver.manage().window().maximize();
        _driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return _driver;
    }

    // Firefox driver
    private static WebDriver buildfirefoxDriverPath() {
        String firefoxDriverPath = System.getProperty("user.dir") + "/Drivers/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
        WebDriver _driver = new ChromeDriver();
        _driver.manage().window().maximize();
        _driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return _driver;
    }
}



