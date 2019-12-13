package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps2 {

	WebDriver driver;
	@Given("^Open the Chrome browser$")
	public void open_the_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium 64 bit\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://45.112.2.195:83/");
	}
	
	@When("^Enter the username and password$")
	public void Enter_the_username_and_password() {
		
		driver.findElement(By.name("email")).sendKeys("tejaswini.patne@trigensoft.com");
		driver.findElement(By.name("password")).sendKeys("Tri@123");
	//	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[4]/center/button")).click();
	}
	
	@Then("^Login to the portal$")
	public void login() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[4]/center/button")).click();
	}
}
