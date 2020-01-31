package com.stepDefinitionFiles;

import java.io.IOException;

import com.pages.LoginPage;
import com.pages.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends TestBase {

	public StepDefinition() throws IOException{
		super();
	}
	
	LoginPage loginpage;
	TestBase testBase;
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws IOException {
		testBase=new TestBase();
		testBase.initialization();
		
		loginpage=new LoginPage();
		System.out.println("user is on the login page");
		loginpage.verifyPageTitle();
		
		
	}

	@When("^user varifies page title$")
    public void user_varifies_page_title() {
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Validation pass");
		}else {
			System.out.println("Validation fail");
		}
		
	}

	@Then("^user enters username and password$")
	 public void user_enters_username_and_password() throws InterruptedException {
		Thread.sleep(3000);
		loginpage.enterusernameandpassword(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	

	@Then("^user clicks on login$")
	public void user_clicks_on_login() {
		loginpage.clickonLogin();
		
	}

}
