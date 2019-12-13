package StepDefination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	WebDriver driver;
	
	@Given("^Open the Chrome and launch the application$")
	public void open_the_Chrome_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\selenium 64 bit\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4");  
	}

	  @When("^Enter the \"(.*?)\" and \"(.*?)\"$")
	    public void enter_the_and(String uname, String pass) throws Throwable {
		driver.findElement(By.name("uid")).sendKeys(uname);							
	    driver.findElement(By.name("password")).sendKeys(pass);
	}

	@Then("^Login$")
	public void reset_the_credential() throws Throwable {
		driver.findElement(By.name("btnReset")).click();
	}

}