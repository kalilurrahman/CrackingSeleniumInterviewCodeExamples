package SeleniumTestNG;

import org.testng.annotations.Test;

import org.testng.Reporter;


public class TestNGMultiGroup {

	public TestNGMultiGroup() {
		// TODO Auto-generated constructor stub
	}
	
	@Test(groups = { "group-TG1" })
	public void TG_TM1() {
		System.out.println("Test Group one Test");
		Reporter.log("Test Group one Test");
	}

	@Test(groups = { "group-TG1", "group-TG2" })
	public void TG_TM2() {
		System.out.println("Test Group Two Test");
		Reporter.log("Test Group Two Test");
	}

	@Test(groups = { "group-TG2" })
	public void TG_TM3() {
		System.out.println("Test Group Three Test");
		Reporter.log("Test Group Three Test");
	}

}
