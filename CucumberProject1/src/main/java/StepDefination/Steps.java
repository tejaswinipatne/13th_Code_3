package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	
	@Given("^Open the Chrome and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\selenium 64 bit\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://45.112.2.195:83/");
			driver.manage().window().maximize();
			
	}
	@When("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String email, String pass) throws Throwable {
	  driver.findElement(By.id("id_email")).sendKeys(email);
	  driver.findElement(By.id("id_password")).sendKeys(pass);
	  
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	}


	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
		System.out.println("Successfullly Login");
	  
	}


	
}
