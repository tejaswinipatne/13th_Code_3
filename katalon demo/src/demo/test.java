package demo;

import org.testng.annotations.*;
import static org.testng.Assert.*;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();


	@Test
	public void testUntitledTestCase2() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium 64 bit\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.20.104:8000/");
		driver.findElement(By.id("id_email")).click();
		driver.findElement(By.id("id_email")).clear();
		driver.findElement(By.id("id_email")).sendKeys("tejaswini.patne@trigensoft.com");
		driver.findElement(By.id("id_password")).click();
		driver.findElement(By.id("id_password")).clear();
		driver.findElement(By.id("id_password")).sendKeys("Tech@123");
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Forgot Password?'])[1]/following::button[1]"))
				.click();
//		driver.findElement(By
//				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Campaign List'])[1]/following::span[1]"))
//				.click();
		
		
		Thread.sleep(4000);
		driver.findElement(By.linkText("Pending Campaign")).click();
		
		driver.findElement(By.id("all_camp_list")).click();
		driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='dsgdgdfgdfgdfg'])[1]/following::div[1]"))
				.click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='|'])[1]/following::span[1]"))
				.click();
		driver.findElement(By.linkText("Logout")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}


}
