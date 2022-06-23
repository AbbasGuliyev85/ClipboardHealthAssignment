package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Homepage;
import Pages.ProductPage;
import Pages.TelevisionsPage;
import Utilities.Driver;
import Utilities.Helper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PageSteps {

	Homepage hamburgerMenu = new Homepage();
	TelevisionsPage televisionPage = new TelevisionsPage();
	ProductPage productPage = new ProductPage();
	WebDriver driver = Driver.getInstance().getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));

	@When("user navigates to Amazon homepage")
	public void user_navigates_to_amazon_homepage() {
		String homePageUrl ="https://www.amazon.in/";
		driver.get(homePageUrl);
	}

	@Then("user clicks on the hamburger menu")
	public void user_clicks_on_main_hamburger_menu() {
		Helper.click(driver, hamburgerMenu.hamburgerMenu);
	}

	@Then("user clicks on the 'TV, Appliances and Electronics' menu item")
	public void user_clicks_on_the_tv_appliances_and_electronics_link() {
		Helper.click(driver, hamburgerMenu.TVAppliancesAndElectronicsCategory);
	}

	@Then("user clicks on 'Televisions' under the 'Tv, Audio & Cameras' submenu")
	public void user_clicks_on_televisions_under_tv_audio_cameras_link() {
		Helper.click(driver, hamburgerMenu.TelevisionsCatg);
	}

	@Then("user scrolls to the 'Brands' section")
	public void user_scrolls_to_the_menu_section() {
		wait.until(ExpectedConditions.visibilityOf(televisionPage.BrandsFilter));
		Helper.scrollIntoView(driver, televisionPage.BrandsFilter);
	}
	
	@Then("user checks the 'Samsung' checkbox")
	public void user_scrolls_down_and_filters_the_results_by_brand_samsung() {
		Helper.click(driver, televisionPage.filterBySamsung);
	}
	
	@Then("user sorts the results with price High to Low.")
	public void user_sorts_the_results_with_price_high_to_low() {
	    Helper.selectFromDropdown(driver, televisionPage.TelevisionsSortByDropdown, "Price: High to Low");
	}
	
	@Then("^user clicks on the ([0-9]*)(st|nd|rd|th) item on the results$")
	public void user_clicks_on_the_nth_item_in_results(int nth, String suffix) {
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
				By.xpath(TelevisionsPage.RESULT_XPATH),
				2
		));
		WebElement result = televisionPage.results.get(nth+1);
		result.click();
	}
	
	@Then("user switches to the product tab")
	public void user_switch_the_window() {
		Helper.switchToWindow();
	}

	@Then("^user should see '([^']*)' section in the page$")
	public void user_should_see_about_section(String expectedText) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='a-size-base-plus a-text-bold']")));
		Assert.assertEquals(expectedText, productPage.AboutThisItemTitle.getText());
	}
}
