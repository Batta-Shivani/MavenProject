package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="StepDefinition",
		tags= "@SmokeTest",
		//plugin={"pretty","junit:target/cucumberReports.xml","json:target/cucumberReports.json","html:target/cucumberReports"},
		plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",		
		dryRun= false,
		monochrome=true
		)
public class login {
}




