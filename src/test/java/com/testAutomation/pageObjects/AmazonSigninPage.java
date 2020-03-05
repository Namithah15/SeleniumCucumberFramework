package com.testAutomation.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSigninPage {
	
WebDriver driver;
	
	public AmazonSigninPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ap_email")
	public WebElement userEmail;
	
	@FindBy(xpath="//*[@id='continue']")
	public WebElement clickContinue;
	
	@FindBy(id="ap_password")
	public WebElement enterPassword;
	
	@FindBy(id="signInSubmit")
	public WebElement clickSignin;
	
	public WebElement getUserEmail() {
		return userEmail;
	}

	public WebElement getClickContinue() {
		return clickContinue;
	}

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	public WebElement getClickSignin() {
		return clickSignin;
	}

	public void setEmail(String email) {
		getUserEmail().sendKeys(email);
	}
	
	public void clickContinueButton() {
		getClickContinue().click();
	}
	
	public void enterPassword() {
		getEnterPassword().sendKeys("Pranav@2015");
	}
	
	public void clickSigninButton() {
		getClickSignin().click();
	}
}
