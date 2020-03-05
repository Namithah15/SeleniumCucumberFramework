package com.testAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductPage {
	
	WebDriver driver;
	
	public AmazonProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="productTitle")
	public WebElement productTitle;

	public String getTitle() throws Exception
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}
	
	public String getProductTitle() {
		return productTitle.getText();
	}
	
}
