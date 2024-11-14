package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = {"src/test/java/featureORuserstory"},
dryRun=!true,
glue = {"stepdef","hooks"},//directly step definition folder name
snippets = SnippetType.CAMELCASE,
monochrome = true,
plugin = {"pretty"}
)

public class Hooks_runner extends AbstractTestNGCucumberTests {

}
