package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ManualCampaign{

	WebDriver driver;
	
	@Given("^Open the Chrome and launch the application and Create Normal Campaign$")
	public void open_the_Chrome_and_launch_the_application_and_Create_Normal_Campaign() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver","C:\\selenium 64 bit\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://45.112.2.195:83/");
		driver.manage().window().maximize();
		driver.findElement(By.id("id_email")).sendKeys("tejaswini.patne@trigensoft.com");
		driver.findElement(By.id("id_password")).sendKeys("Tech@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@Then("^Go to Campaign$")
	public void go_to_Campaign() throws Throwable {
	   
		driver.findElement(By.xpath("//*[@id=\"campaign\"]/a")).click();
		
	}

	@And("^Click on Pending Campaign$")
	public void click_on_Pending_Campaign() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"PendingCampaign\"]/a")).click();
		
	}


	@And("^Create Manual Campaign$")
	public void create_Manual_Campaign() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"centertext\"]/div/a/button")).click();
	}


}
