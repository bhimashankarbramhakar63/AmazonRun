package stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.CommanUtils;
import Pages.AddToCartPage;
import Pages.ProductPage;
import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search extends CommanUtils{

	private WebDriver driver;
	private ProductPage ProductPage;
	private AddToCartPage cartPage;
	private SearchPage SearchPage;
	
	@Given("User opens the Application")
	public void user_opens_the_application() {
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
	}
	@When("User enters valid product {string} into Search box field")
	public void user_enters_valid_product_into_search_box_field(String inputText) {
		SearchPage = new SearchPage(driver);
		SearchPage.enterProductInSearchBar(inputText);
	}

	@And("User clicks on iphone button")
	public void user_clicks_on_iphone_button() {

		ProductPage = SearchPage.clickOnIphone();
	}

	@And("User go to product details page")
	public void user_go_to_product_details_page() {
		Assert.assertTrue(ProductPage.verifyProductPageDispalyed());
	}

	@Then("User click On the Iphone")
	public void user_click_On_the_phone() {

		ProductPage.clickOnSelectedIphone();
	}

	@Then("User click on the Go To cart")
	public void user_click_On_Go_To_cart() {

		ProductPage.clickOnGoToCart();
	}
	@And("User added the product in the add to cart")
	public void user_added_the_product_in_the_add_to_cart() {
		ProductPage.clickOnAddToCart();
	}

	@Then("User should validate the product is displayed or not in add to cart")
	public void user_should_validate_the_product_is_displayed_or_not_in_add_to_cart(){
		cartPage = new AddToCartPage(driver);
		waitforTime(5000);
		cartPage.iphoneVerifyDisplayed();
	}
	@Then("user Close the application")
	public void user_Close_the_application(){
		
		driver.quit();
	}
}
