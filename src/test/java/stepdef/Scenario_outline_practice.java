package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario_outline_practice {
	WebDriverWait wait= new WebDriverWait(Login_steps.driver, Duration.ofSeconds(10));
	@Given("user  cliked login and enters {string} and {string}")
	public void userClikedLoginAndEntersAnd(String username, String password) {
		Login_steps.driver.findElement(By.id("login2")).click();
		Login_steps.driver.findElement(By.id("loginusername")).sendKeys(username);
		Login_steps.driver.findElement(By.id("loginpassword")).sendKeys(password);
		Login_steps.driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	}
	@When("user click any {string}")
	public void userClickAny(String product) throws InterruptedException {
		if(product.equalsIgnoreCase("Samsung galaxy s6")) {
			Thread.sleep(Duration.ofSeconds(2));
			//JavascriptExecutor js= (JavascriptExecutor)Login_steps.driver;
			//wait.until(ExpectedConditions.visibilityOf(Login_steps.driver.findElement(By.xpath("//a[@id='nameofuser']"))));
			WebElement samsung= Login_steps.driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s6']"));
			//js.executeScript("arguments[0].scrollIntoView(true);",samsung);
			
			//WebElement userElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Samsung galaxy s6']")));
			
			samsung.click();
			//userElement.click();
		}
		else if(product.equalsIgnoreCase("Nokia lumia 1520")){
			Thread.sleep(Duration.ofSeconds(2));
			WebElement userElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Nokia lumia 1520']")));
		//Login_steps.driver.findElement(By.xpath("//a[normalize-space()='Nokia lumia 1520']")).click();
			userElement.click();
		}
		else {
			System.out.println("selected product dont have locators");
		}
	}
	@Then("product page {string} should come")
	public void productPageShouldCome(String url) throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(2));
		String actualurl=Login_steps.driver.getCurrentUrl();
		Assert.assertEquals(actualurl, url);
	}
}
