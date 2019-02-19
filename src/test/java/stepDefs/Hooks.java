package stepDefs;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.ConfigFileReader;
import utilities.Log;

import java.util.concurrent.TimeUnit;

/**
 * Created by balajakka on 25/01/2019.
 */
public class Hooks {

    public static WebDriver myDriver;
    public static ConfigFileReader cfr = new ConfigFileReader();
    public static CapScreenSht ScShot = new CapScreenSht();
    static ChromeOptions options;


        @Before
        public void beforeScenario()
        {
//            System.setProperty("webdriver.chrome.driver", cfr.getDriverPath());
//            options=new ChromeOptions();
//            options.addArguments("--start-maximized");
//            myDriver = new ChromeDriver(options);

        }
        @After
        public void afterScenario(){


            //driver.quit();

        }
//        @After
//        public void afterTest(Scenario scr){
//            Log.endTestCase(scr.getName());
//            myDriver.quit();
//
//        }


    }


