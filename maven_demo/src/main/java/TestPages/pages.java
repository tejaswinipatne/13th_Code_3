package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class pages extends TestBase{

	
	@FindBy(css="")
	WebElement test;
	
	public pages() {
       PageFactory.initElements(driver, this);
	}
	
	public void test() {
		test.click();
	}
}
