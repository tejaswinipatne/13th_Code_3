package an;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class an {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 7);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "4DQ8C6I799999999");
        dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Trigen\\Downloads\\Frigate18Feb.apk");
      
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<>(url, dc);
        driver.swipe(400, 800, 400, 200, 2000);
       
//       MobileElement e = (MobileElement) driver.findElement(By.cssSelector("com.frigateindia:id/edt_username\r\n" + 
//    	  		""));
//       e.sendKeys("123");
        
//        MobileElement el1 = (MobileElement) driver.findElement(By.id("com.frigateindia:id/edt_username\r\n" + 
//        		""));
	//	el1.sendKeys("1236544");
//		MobileElement el2 = (MobileElement) driver.findElement(By.id("com.frigateindia:id/edt_password"));
//		el2.sendKeys("1236544");
//		MobileElement e13 = (MobileElement) driver.findElement(By.id("com.frigateindia:id/btn_login"));
//		e13.click();
		
//        ((MobileElement) driver.findElement(By.id(“com.frigateindia:id/edt_username”))).setValue(“1600”)
//		
//        MobileElement element = (MobileElement) driver.findElementByAccessibilityId("SomeAccessibilityID");
//        element.sendKeys("Hello world!");


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 7.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "4DQ8C6I799999999");
        dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Trigen\\Downloads\\Frigate18Feb.apk");
      
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<>(url, dc);
        MobileElement el1 = (MobileElement) driver.findElement(By.id("com.frigateindia:id/edt_username"));
		el1.sendKeys("1236544");
		MobileElement el2 = (MobileElement) driver.findElement(By.id("com.frigateindia:id/edt_password"));
		el2.sendKeys("1236544");
		MobileElement e13 = (MobileElement) driver.findElement(By.id("com.frigateindia:id/btn_login"));
		e13.click();*/
	}

}
