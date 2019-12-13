package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.TestBase;
import TestPages.pages;

public class TestCase1 extends TestBase {

	public TestCase1() {
		super();
	}

	@BeforeMethod
	public void test() {
		initial();
		pages p = new pages();
		p.test();
	}

	@Test
	public void test1() {
		pages p1 = new pages();
		p1.test();

	}
}
