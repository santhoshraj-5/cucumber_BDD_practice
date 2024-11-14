package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class Parameter_login {
	//here we have same steps for both the feature Scenario so this step name is only miss match so we written this alone 
	
	//as we pass param we dont want 2 another steps for negative case the param will pass here also
	@Given("user enters username as {string}")
	public void userEntersUsernameAs(String username) {
		Login_steps.driver.findElement(By.id("loginusername")).sendKeys(username);
	}
	@Given("user enters password as {string}")
	public void userEntersPasswordAs(String password) {
		Login_steps.driver.findElement(By.id("loginpassword")).sendKeys(password);
	}
}
