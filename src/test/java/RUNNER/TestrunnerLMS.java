package RUNNER;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/Ds-algo.html"},  //cucumber reports
				//"timeline:<report folder>",
			//	"json:target/ExtentReports/Ds-algo.json",
				//"rerun:target/rerun.txt",  //mandatory for capture failures 
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",  //reporting purpose-- html reports are created
			//"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, //Allure reports
		monochrome=true,  //console output color and eliminate junk characters
		//dryRun=false, // (=true)->compilation purpose mostly to chk stepdefinitions are implemented or not
		tags = "", //tags from feature file
		features = {"src/test/resources/Features"}, //location of feature files, we can give this way-->".//features//"
		glue= {"lms_StepDefinitions",}) //location of step definition files, gives granural level of info in test result



public class TestrunnerLMS {

}
