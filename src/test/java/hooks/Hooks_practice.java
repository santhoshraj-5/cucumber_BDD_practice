package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks_practice {
	@Before
	public void beforescenario(Scenario result) {
		System.out.println(result.getName());
		
	}
	@After("@ss_special_hook")
public void afterscenario(Scenario result) {
		System.out.println("-------"+result.getName()+"-------");
		if (result.isFailed()) {
			System.out.println("--------take screen shot");
		}
	}
	@BeforeStep
public void beforeStep(Scenario result) {
		System.out.println("beforeStep");
	}
@AfterStep
public void afterStep(Scenario result) {
	System.out.println("afterStep");
}

}
