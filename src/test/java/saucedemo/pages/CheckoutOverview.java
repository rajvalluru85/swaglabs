package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverview extends BasePage{
	
	//*[@id="checkout_summary_container"]/div/div[2]/div[5]/text()[2]
	
	@FindBy(xpath="//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")
	private WebElement price1;
	
	@FindBy(xpath="//*[@id=\"checkout_summary_container\"]/div/div[1]/div[4]/div[2]/div[2]/div")
	private WebElement price2;
	
	
	@FindBy(xpath="//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]/text()[2]")
	private WebElement itemTotal;

	public CheckoutOverview(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
