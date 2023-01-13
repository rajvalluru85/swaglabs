package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
	

	@FindBy(xpath = "//*[@id=\"item_4_img_link\"]/img")
	private WebElement backpack;
	
	
	@FindBy(xpath = "//*[@id=\"inventory_container\"]/div")
	private WebElement unaitem2me;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addtoCartBackpack;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement addtoCartBikeLight;

	//add-to-cart-sauce-labs-bolt-t-shirt
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement addtoCartTshirt;

	//shopping_cart_container
	
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	private WebElement addtoCartFleeceJacket;
	
	@FindBy(id="shopping_cart_container")
	private WebElement moveToCart;
	
	public ProductsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void SelectBackPack() {
		addtoCartBackpack.click();
	}
	
	public void SelectBikeLight() {
		addtoCartBikeLight.click();
	}
	
	public void SelectCart() {
		moveToCart.click();
	}

////*[@id="cart_contents_container"]/div/div[1]/div[3]/div[2]/div[2]/div
//*[@id="cart_contents_container"]/div/div[1]/div[4]/div[2]/div[2]/div
}
