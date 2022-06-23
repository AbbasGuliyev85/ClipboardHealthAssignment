package Utilities;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){

    }
    private static Driver instance=new Driver();

    public static Driver getInstance(){
        return instance;
    }

    ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();// thread local driver object for webdriver

    public WebDriver getDriver(){
        return driver.get();
    }

    public  void setDriver(WebDriver driverParameter){

        driver.set(driverParameter);
    }
    public void removeDriver(){
        driver.get().quit();
        driver.remove();
    }
}
