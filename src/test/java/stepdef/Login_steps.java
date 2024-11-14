package stepdef;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_steps {
	public static WebDriver driver;
	WebDriverWait wait ;
@Given("user navigated to the demo blazer site")
	public void navigation() {
		//System.out.println("user navigated to the demo blazer site");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
@Given("user clicks the header login button")
public void userClicksTheHeaderLoginButton() {
	driver.findElement(By.id("login2")).click();
}
@Given("user enters username")
public void userEntersUsername() {
    driver.findElement(By.id("loginusername")).sendKeys("santasanthosh");
}
@Given("user enters password")
public void userEntersPassword() {
	driver.findElement(By.id("loginpassword")).sendKeys("santa@123");
}
@When("user click login")
public void userClickLogin() {
	 driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
}
@Then("user should be succefully loged in")
public void userShouldBeSuccefullyLogedIn() {
	wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement userElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

	String actualtext=userElement.getText();
	//String actualtext=driver.findElement(By.xpath("(//li[@class='nav-item'])[6]")).getText();
	System.out.println(actualtext +" this the actual we get from browser ");
	Assert.assertEquals(actualtext,"Welcome santasanthosh");
}

  @Given("user enters wrong username") 
  public void userEntersWrongUsername() {
  driver.findElement(By.id("loginusername")).sendKeys("santasan");
  }
  
  @Given("user enters wrong password") 
  public void userEntersWronPassword() {
  driver.findElement(By.id("loginpassword")).sendKeys("santa@123"); }
  
  @But("user should not loged in") 
  public void userShouldNotLogedIn() {
	 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.alertIsPresent());
 Alert wrong_user_alert =driver.switchTo().alert();
	
	  String actual_alert_text=wrong_user_alert.getText();
	  Assert.assertEquals( actual_alert_text,"User does not exist.");
	  wrong_user_alert.accept();
	 
  }
 
}
