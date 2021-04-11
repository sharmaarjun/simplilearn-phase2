package MyRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        
        features = "src/test/resources/Features",
        glue= {"stepDefinitions"},
        tags= "@otp",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        ,monochrome = true
        ,publish = true
        
        )
public class MyTestRunner extends AbstractTestNGCucumberTests {
	
	
}
