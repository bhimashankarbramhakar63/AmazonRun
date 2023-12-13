package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	 WebDriver driver;

		public AddToCartPage(WebDriver driver) {
		       this.driver = driver;
		       PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath ="//span[@class='a-truncate-full a-offscreen']")
		private WebElement addediphone;
		
		
		public void iphoneVerifyDisplayed() {
			try {
				addediphone.isDisplayed();
				} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
