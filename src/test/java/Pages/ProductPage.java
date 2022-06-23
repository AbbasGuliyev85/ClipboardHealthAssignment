package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    public ProductPage() {
        super();
    }

    @FindBy(xpath = "//h1[@class='a-size-base-plus a-text-bold']")
    public WebElement AboutThisItemTitle;
}
