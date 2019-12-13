package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {
		try {
		prop = new Properties();
		FileInputStream ip= new FileInputStream("F:\\maven_demo\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
	
	
	public void initial() {   
		String BrowserName = prop.getProperty("broswer");
		if(BrowserName.equals("chrome")) {
		   System.setProperty("webdriver.chrome.driver", "");
		   driver= new ChromeDriver();
		}
		else if(BrowserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		}
	}

}