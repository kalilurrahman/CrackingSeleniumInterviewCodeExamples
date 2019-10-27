package com.CrackingSeleniumInterviews.TestNG.examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGExampleOne {
	@Test
	public void run() {
		// TODO Auto-generated constructor stub
		WebDriver driver = new FirefoxDriver();
		Reporter.log("The Browser is Open now");
		driver.manage().window().maximize();
		driver.get("http://news.google.com");
		Reporter.log("Opened Google News Website");		
	}
}
