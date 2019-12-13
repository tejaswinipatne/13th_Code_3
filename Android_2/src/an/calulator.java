package an;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class calulator {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 7);
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "4DQ8C6I799999999");
		
		dc.setCapability("appPackage", "com.android.bbkcalculator");
		dc.setCapability("appActivity", "com.android.bbkcalculator.Calculator");

		
		URL u =new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(u, dc);
		
		 MobileElement e = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'digit5')]"));
         e.click();
		
         driver.findElementByXPath("//android.widget.ImageButton[contains(@resource-id,'plus')]").click();
	
         MobileElement e1 = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'digit3')]"));
         e1.click();
         
         driver.findElementByXPath("//android.widget.ImageButton[contains(@resource-id,'equal')]").click();
         
		
		
	}

}
