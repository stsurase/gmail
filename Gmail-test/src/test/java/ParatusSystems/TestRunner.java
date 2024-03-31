package ParatusSystems;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 *  Using TestNG: extends
 * @author admin
 *
 */

@CucumberOptions(features = "src/test/resources/Features/Gmail.feature", glue = "com/stepdefinitions")
public class TestRunner extends AbstractTestNGCucumberTests{
	
	

	
	
}
