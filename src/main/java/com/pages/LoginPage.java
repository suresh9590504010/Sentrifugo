package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

	@FindBy(name="txtUserName")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement login;
	
	public LoginPage() throws IOException {
	
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	public void enterusernameandpassword(String Username, String Password) {
		username.sendKeys(Username);
		password.sendKeys(Password);
	}
	
	public void clickonLogin() {
		login.click();
	}

	
}
