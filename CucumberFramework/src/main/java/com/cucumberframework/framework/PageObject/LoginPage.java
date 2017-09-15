package com.cucumberframework.framework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberframework.framework.PageObject.LoginPage;
import com.cucumberframework.framework.configreader.ObjectRepo;
import com.cucumberframework.framework.helper.Logger.LoggerHelper;
import com.cucumberframework.framework.helper.TestBase.TestBase;
import com.cucumberframework.framework.helper.Wait.WaitHelper;
import com.cucumberframework.framework.helper.genericHelper.GenericHelper;

import org.apache.log4j.Logger;


public class LoginPage {
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LoginPage.class);
	WaitHelper waitHelper;
	
	@FindBy(css = "a[class='login']")
	WebElement signin;
	
	@FindBy(css = "#email")
	WebElement emailaddress;
	
	@FindBy(css = "#passwd")
	WebElement password;
	
	@FindBy(css = "#SubmitLogin>span")
	WebElement submit;
	
	@FindBy(xpath="//*[@id='SubmitLogin']")
	WebElement successMsgObject;
	
	public LoginPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, signin, ObjectRepo.reader.getExplicitWait());
	}
	
	public void clickOnSignInLink(){
		log.info("Clicking on SignIn link");
		signin.click();
	}
	
	public void enterEmailAddress(String emailaddress){	
		log.info("Entering Email Address....."+emailaddress);
		this.emailaddress.sendKeys(emailaddress);
		
	}
	
	public void enterPassword(String password){	
		log.info("Entering Password....."+password);
		this.password.sendKeys(password);
		
	}
	
	public void submitLogin(){
		log.info("Clicking Submit Button");
		submit.click();
		
	}
	
	public HomePage clickOnSubmitButton(){
		log.info("clicking on submit button...");
		submit.click();
		return new HomePage();
	}
	
	public boolean verifySuccessLoginMsg(){
		return new GenericHelper().isDisplayed(successMsgObject);
	}

}
