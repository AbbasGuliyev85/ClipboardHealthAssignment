package Utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Helper {
	
	public static void click(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
        actions.click(element).perform();
	}

    public static void scrollIntoView(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(("arguments[0].scrollIntoView(true);"), element);
    }
    
    public static void selectFromDropdown(WebDriver driver, WebElement element, String DropdownName) {
        Select skillsDropdown = new Select(element);
        skillsDropdown.selectByVisibleText(DropdownName);
    }
    
    public static void switchToWindow() {
        String targetTitle = Driver.getInstance().getDriver().getTitle();
        for (String handle : Driver.getInstance().getDriver().getWindowHandles()) {
            Driver.getInstance().getDriver().switchTo().window(handle);
            if(!Driver.getInstance().getDriver().getTitle().contains(targetTitle)) {
                return;
            }
        }
    }
}
