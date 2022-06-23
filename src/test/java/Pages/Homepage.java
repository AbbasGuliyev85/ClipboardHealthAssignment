package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {

    public Homepage() {
        super();
    }

    @FindBy(id = "nav-hamburger-menu")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//a[@data-menu-id='9']")
    public WebElement TVAppliancesAndElectronicsCategory;
    
    @FindBy(xpath = "//a[text()='Televisions']")
    public WebElement TelevisionsCatg;
}
