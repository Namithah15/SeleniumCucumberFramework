package com.testAutomation.testRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features= {"src/test/resources/features"},
				 glue= {"com.testAutomation.stepDef"}, 
				 plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
						 			  "json:target/cucumber-reports/CucumberTestReport.json", 
			                          "rerun:target/cucumber-reports/rerun.txt" },
				 monochrome = true)
public class TestRunner {
	 private TestNGCucumberRunner testNGCucumberRunner;

	    @BeforeClass(alwaysRun = true)
	    public void setUpClass() throws Exception {
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }

	    
	    @Test(dataProvider = "features")    
	    public void feature(PickleEventWrapper eventwrapper,CucumberFeatureWrapper cucumberFeature) throws Throwable {
	    	//testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    	testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
	    }

	    /**
	     * @return returns two dimensional array of {@link CucumberFeatureWrapper} objects.
	     */
	    @DataProvider
	    public Object[][] features() {
	    	 return testNGCucumberRunner.provideScenarios();
	    }

	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {
	        testNGCucumberRunner.finish();
	    }

}
