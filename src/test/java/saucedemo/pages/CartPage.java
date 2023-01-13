package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
	

	@FindBy(id="checkout")
	private WebElement checkoutOption;
	
	public CartPage(WebDriver driver) {
		super(driver);

	}
	
	public void SelectCheckout() {
		checkoutOption.click();
	}


}
