package com.CrackingSeleniumInterviews.TestNG.examples;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
public class TestNGExampleTwo {
	@Test
	public void run() {
		// TODO Auto-generated constructor stub
		WebDriver driver = new FirefoxDriver();
		Reporter.log("The Browser is Open now");
		driver.manage().window().maximize();
		driver.get("http://news.google.com");
		Reporter.log("Opened Google News Website");
		driver.findElement(By.xpath("//input[@class='Ax4B8 ZAGvjd']")).sendKeys("Selenium");
		Reporter.log("Search Entered");
		assert(driver.getTitle() == "Google News - Search"); 
		Reporter.log("Assert Done");			
	}
}