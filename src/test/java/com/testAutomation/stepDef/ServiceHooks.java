package com.testAutomation.stepDef;

import java.util.Properties;

import com.testAutomation.testBase.PropertiesFileReader;
import com.testAutomation.testBase.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks {
	PropertiesFileReader obj = new PropertiesFileReader();
	//TestBase testBase;
	
	@Before
	public void initializeTest() throws Throwable {
		Properties properties=obj.getProperty();
		TestBase.getBrowser(properties.getProperty("browser.name"));
	}
	
	@After
	public void endTest() {
		TestBase.driver.quit();
	}
}
