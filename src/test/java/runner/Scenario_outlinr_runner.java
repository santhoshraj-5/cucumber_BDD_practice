package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/featureORuserstory/scenariooutline_login.feature"},
		dryRun =!true,
		glue ="stepdef",
		snippets = SnippetType.CAMELCASE,
		monochrome = true
		)
//\\Scenario_outline_practice
public class Scenario_outlinr_runner extends AbstractTestNGCucumberTests {

}
