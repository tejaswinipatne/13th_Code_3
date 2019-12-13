package screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class testshot {
	public static String baseUrl;
	public static WebDriver driver;

	@Test
	public void open() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium 64 bit\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.guru99.com/take-screenshot-selenium-webdriver.html";
		driver.navigate().to(baseUrl);
		File screensht = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screensht, new File("D:\\screen shots\\" + driver.getTitle() + "-" + ".png"));
	}

}
