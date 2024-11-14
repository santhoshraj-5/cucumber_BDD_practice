package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/featureORuserstory/login_feature.feature",
				"src/test/java/featureORuserstory/parameter_login.feature"},//give direction of the feature file, we can have different runner class also 
		dryRun = !true,//this will execute the 
		glue = "stepdef",//directly step definition folder name
		snippets = SnippetType.CAMELCASE,
		monochrome = true
		)

public class Run extends AbstractTestNGCucumberTests {

}
