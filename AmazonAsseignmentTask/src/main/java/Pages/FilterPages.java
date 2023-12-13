package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPages {

	 WebDriver driver;

		public FilterPages(WebDriver driver) {
		       this.driver = driver;
		       PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath ="//input[@name='field-keywords']")
		private WebElement enterphone;
        
		@FindBy(xpath ="//div[@class='left-pane-results-container']//descendant::div[@aria-label='phone']")
		private WebElement clickOnPhone;
        
		@FindBy(xpath ="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[6]/ul/span[5]/li/span/a/div/label/i")
		private WebElement clickOnSamSang;
		
		public void searchText(String text) {
			enterphone.sendKeys(text);
		}	
		
		public void clickphone() {
			clickOnPhone.click();
		}	
		
		public void clickOnSamsangCheckbox() {
			clickOnSamSang.click();
		}	
}
