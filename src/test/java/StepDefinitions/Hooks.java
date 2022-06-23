package StepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import Utilities.BrowserFactory;
import Utilities.Driver;

import java.time.Duration;

public class Hooks {
    public WebDriver driver=null;

    @Before
    public void setUp(){
        driver= BrowserFactory.createInstance();
        Driver.getInstance().setDriver(driver);
        driver=Driver.getInstance().getDriver();    	
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(5000));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","Screenshot");
        }
       Driver.getInstance().removeDriver();
    }
}