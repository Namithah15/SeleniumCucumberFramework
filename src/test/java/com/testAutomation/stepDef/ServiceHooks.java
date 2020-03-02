package com.testAutomation.stepDef;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.testAutomation.testBase.PropertiesFileReader;
import com.testAutomation.testBase.TestBase;

import cucumber.api.java.Before;

public class ServiceHooks {
	PropertiesFileReader obj = new PropertiesFileReader();
	public WebDriver driver;
	
	@Before
	public void initializeTest() throws Throwable {
		Properties properties=obj.getProperty();
		TestBase.OpenBrowser(driver, properties.getProperty("browser.name"), properties.getProperty("browser.url"));
	}
}
