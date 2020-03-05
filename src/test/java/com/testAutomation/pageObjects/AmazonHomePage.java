package com.testAutomation.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	
	WebDriver driver;
	
	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='nav-link-accountList']/span[1]")
	public WebElement SignIn;
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement SearchTextbox;
	
	@FindBy(id="nav-search-submit-text")
	public WebElement SearchButton;
	
	public WebElement getSignIn() {
		return SignIn;
	}
	
	public WebElement getsearchProduct() {
		return SearchTextbox;
	}
	
	public void NavigateToResultPage(String searchString)
	{
		SearchTextbox.sendKeys(searchString);
		SearchTextbox.sendKeys(Keys.ENTER);
		//SearchButton.click();
	}

}
