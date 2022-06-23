package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;

    public BasePage () {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }
}
