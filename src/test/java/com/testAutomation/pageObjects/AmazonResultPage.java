package com.testAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonResultPage {
	
	WebDriver driver;
	
	public AmazonResultPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img")
	public WebElement ProductNameLink;
	
	public void NavigateToProductName() throws InterruptedException
	{
		Thread.sleep(5000);
		ProductNameLink.click();
		Thread.sleep(3000);
	}

}
