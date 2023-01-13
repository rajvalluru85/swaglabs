package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	/** The username input. */
	@FindBy(id = "user-name")
	private WebElement uname;

	/** The password input */
	@FindBy(id = "password")
	private WebElement pass;
	
	
	@FindBy(id="login-button")
	private WebElement login;


	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Enter username.
	 */
	public LoginPage enterUserName(String user) {
		uname.sendKeys(user);
		return this;
	}

	/**
	 * Enter password.
	 */
	public LoginPage enterPassword(String password) {
		pass.sendKeys(password);
		return this;
	}

	/**
	 * Click Log in.
	 */
	public void clickLogIn() {
		pass.submit();
	}

}


