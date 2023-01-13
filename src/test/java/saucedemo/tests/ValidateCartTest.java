package saucedemo.tests;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import saucedemo.factory.PageinstancesFactory;
import saucedemo.pages.*;


public class ValidateCartTest extends BaseTest{
	
	@Test (priority = 1)
	public void swagLabsLoginTest() {
		driver.get("https://www.saucedemo.com/");
		LoginPage loginPage = PageinstancesFactory.getInstance(LoginPage.class);
		loginPage.enterUserName("standard_user").enterPassword("secret_sauce").clickLogIn();
		Assert.assertTrue(true, "Login successful : Test passed");
	}
	
	@Test (priority = 2)
	public void swagLabsProductsTest() throws InterruptedException {
		//Thread.sleep(10000);
		ProductsPage productsPage = PageinstancesFactory.getInstance(ProductsPage.class);
		productsPage.SelectBackPack();
		productsPage.SelectBikeLight();
		productsPage.SelectCart();
		Assert.assertTrue(true, "User is on Cart page : Test passed");

}
	
	@Test (priority = 3)
	public void SwagLabsCartTest() throws InterruptedException {
		CartPage cartPage = PageinstancesFactory.getInstance(CartPage.class);
		cartPage.SelectCheckout();
		Assert.assertTrue(true, "User is on Checout page : Test passed");
}
	
	@Test (priority = 4)
	public void CheckOutOverviewTest() throws InterruptedException {
		CheckOutPage checkoutPage = PageinstancesFactory.getInstance(CheckOutPage.class);
		checkoutPage.enterFirstName("Ravi");
		checkoutPage.enterLastName("Gangula");
		checkoutPage.enterzipCode("60306");
		checkoutPage.SelectContinue();
		Assert.assertTrue(true, "User is on Checkout Overview page : Test passed");

}
	@Test (priority = 5)
	public void ValidateTotal() throws InterruptedException {
		CheckoutOverview checkoutOverviewPage = PageinstancesFactory.getInstance(CheckoutOverview.class);

	
}
	
	
}
