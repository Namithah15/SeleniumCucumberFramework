package com.testAutomation.stepDef;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.testAutomation.pageObjects.AmazonHomePage;
import com.testAutomation.pageObjects.AmazonProductPage;
import com.testAutomation.pageObjects.AmazonResultPage;
import com.testAutomation.testBase.PropertiesFileReader;
import com.testAutomation.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSearchStepDef extends TestBase{
	PropertiesFileReader obj= new PropertiesFileReader();

	@Given("Open the URL")
	public void open_the_URL() throws Throwable {
		Properties properties=obj.getProperty();   
		//driver = TestBase.OpenBrowser(driver, properties.getProperty("browser.name"));
		driver.get(properties.getProperty("browser.baseURL"));
	}
	
	@When("^Search product \"([^\"]*)\"$")
	public void search_product(String searchString) {
		new AmazonHomePage(driver).NavigateToResultPage(searchString);
	}

	@When("Click on product name")
	public void click_on_product_name() throws Throwable {
		new AmazonResultPage(driver).NavigateToProductName();
	}

	@Then("Validate product name")
	public void validate_product_name() throws Throwable {
		String expectedChannelName=new AmazonProductPage(driver).getProductTitle();
		String actualChannelName=new AmazonProductPage(driver).getTitle();
		System.out.println(expectedChannelName);
		System.out.println(actualChannelName);
		//Assert.assertEquals(actualChannelName, expectedChannelName,"Channel names are not matching");
		Assert.assertTrue(actualChannelName.contains(expectedChannelName));
		
	}

	
}
