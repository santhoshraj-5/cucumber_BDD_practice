package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = {"src/test/java/featureORuserstory"},
dryRun=!true,
glue = "stepdef",//directly step definition folder name
snippets = SnippetType.CAMELCASE,
monochrome = true,
plugin = {"pretty",
		"html:reporter/test_reprt.html"},
tags = ("@smoke or @reg")
)
//tags = ("@smoke or @reg or @sanity")
public class Reporter_tag_practice extends AbstractTestNGCucumberTests  {

}
