package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelevisionsPage extends BasePage {
    public static final String RESULT_XPATH = "//span[@data-component-type='s-search-results']/div/div";

    public TelevisionsPage() {
        super();
    }

    @FindBy(xpath = "//span[text()='Brands']")
    public WebElement BrandsFilter;
    
    @FindBy(xpath = "//span[text()='Samsung']/..//input[@type='checkbox']")
    public WebElement filterBySamsung;
    
    @FindBy(id = "s-result-sort-select")
    public WebElement TelevisionsSortByDropdown;

    @FindBy(xpath = RESULT_XPATH)
    public List <WebElement> results;
}
