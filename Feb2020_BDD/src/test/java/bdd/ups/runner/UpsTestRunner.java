package bdd.ups.runner;

import java.io.File;
import org.testng.annotations.AfterClass;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/test/resources/Features"},glue={"bdd.ups.stepDef","bdd.ups.utilities"}, tags={"@Sprint1"},
				plugin = {"pretty", "html:target/cucumber-htmlreport",
				"json:target/cucumber-jsonreport/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
				monochrome = true)


public class UpsTestRunner extends AbstractTestNGCucumberTests{
	
	@AfterClass
	public static void generateExtentReport(){
		Reporter.loadXMLConfig(new File("config/config.xml"));
	}
	

}
