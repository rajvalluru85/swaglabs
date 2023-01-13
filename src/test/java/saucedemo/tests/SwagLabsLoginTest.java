package saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemo.factory.PageinstancesFactory;
import saucedemo.pages.LoginPage;

public class SwagLabsLoginTest extends BaseTest{
	
	@Test
	public void swagLabsLoginTest() {
		driver.get("https://www.saucedemo.com/");
		LoginPage loginPage = PageinstancesFactory.getInstance(LoginPage.class);
		loginPage.enterUserName("standard_user").enterPassword("secret_sauce").clickLogIn();
		Assert.assertTrue(true, "Login successful : Test passed");
	}

}
