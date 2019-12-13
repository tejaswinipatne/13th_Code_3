package TestPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class TestPages extends TestBase  {

	
	@FindBy(id="")
	WebElement test;

	public TestPages() {
		PageFactory.initElements(driver, this);
	}
	
	public void demo1() {
		test.click();
	}
}
