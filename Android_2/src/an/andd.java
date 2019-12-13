package an;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class andd {

	@Test
	public void open() throws MalformedURLException, InterruptedException {
DesiredCapabilities dc= new DesiredCapabilities();
		
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 7.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "android");
	    dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Trigen\\Downloads\\app-debug.apk");
    
	    URL u = new URL("http://0.0.0.0:4723/wd/hub");
	    AndroidDriver<WebElement> driver = new AndroidDriver<>(u, dc);
	    Thread.sleep(4000);
	    TouchAction t= new TouchAction(driver);
        t.press(561,625).moveTo(128, 653).release().perform();
	    
		
	}
}
