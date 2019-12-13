package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase1 {

	public static Properties prop;
	public static WebDriver driver;

	public TestBase1() {
		try {
			prop = new Properties();
			FileInputStream fn = new FileInputStream("");
			prop.load(fn);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initial() {
		String BrowserName= prop.getProperty("browser");
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "");
			WebDriver driver = new ChromeDriver();
			
		}
		else if(BrowserName.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "");
			WebDriver driver= new FirefoxDriver();
	}
		driver.get(prop.getProperty("url"));
	}
	
}
