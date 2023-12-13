package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.CommanUtils;
import Pages.FilterPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterPhone {

    private String  list= "//div[@data-component-type='s-search-result']";
    private WebDriver driver;
    private FilterPages filterPages;
    
	@When("^User enters (.*)into Search field$")
	public void user_enters_into_search_field(String tests) {
		 filterPages = new FilterPages(driver);
		 filterPages.searchText(tests);
	}

	@And("User clicks on phone button")
	public void user_clicks_on_phone_button() {
		filterPages.clickphone();
	}

	@And("User go to the Featured Brands and click SAMSANG")
	public void user_go_to_the_featured_brands_and_click_samsang() {
		filterPages.clickOnSamsangCheckbox();
	}

	@Then("User verify the filtered samsang list")
	public void user_verify_the_filtered_samsang_list() {
		
		List<WebElement> filteredPhones = driver.findElements(By.xpath(list));
        if (!filteredPhones.isEmpty()) {
            System.out.println("Filtered phones:");
            for (WebElement phone : filteredPhones) {
                System.out.println(phone.getText()); 
            }
        } else {
            System.out.println("No phones found based on applied filters.");
        }
	}
}
