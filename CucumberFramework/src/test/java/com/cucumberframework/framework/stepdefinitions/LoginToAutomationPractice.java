package com.cucumberframework.framework.stepdefinitions;

import com.cucumberframework.framework.PageObject.LoginPage;
import com.cucumberframework.framework.configreader.ObjectRepo;
import com.cucumberframework.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToAutomationPractice {
	
	LoginPage loginpage;
	
	@Given("^User navigates to website$")
	public void user_navigates_to_website() throws Throwable {
		TestBase.driver.get(ObjectRepo.reader.getWebsite());
	}

	@When("^User click on Sign in Link$")
	public void user_click_on_Sign_in_Link() throws Throwable {
		loginpage= new LoginPage(TestBase.driver);
		loginpage.clickOnSignInLink();
	}

	@When("^enter email address as \"([^\"]*)\"$")
	public void enter_email_address_as(String arg1) throws Throwable {
		loginpage.enterEmailAddress(arg1);
	}

	@When("^enter password as \"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginpage.enterPassword(arg1);
	}

	@When("^click on sign in button$")
	public void click_on_sign_in_button() throws Throwable {
		loginpage.submitLogin();
	}

	@Then("^Login is successful$")
	public void login_is_successful() throws Throwable {
	    
	}

}
