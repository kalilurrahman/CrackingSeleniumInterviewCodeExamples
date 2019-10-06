package src;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

	

public class NewTest {
	
	private WebDriver driver;
	
  @Test
  public void f() {
	  
	  System.out.println("Hello Selenium GetSetGo");
	  
	  driver.get("https://www.google.com/");
	  String Title = driver.getTitle();          // Getting the title with the help of getTitle
	  
	  System.out.println("Title Of the webpage = " +Title);
	  assertEquals("Google", Title);	
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  	System.out.println("Starting Tests");
		System.setProperty("webdriver.gecko.driver", "<path to>\\geckodriver.exe");
		  
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Nightly\\56\\firefox.exe");
		  
		driver = new FirefoxDriver(options);
	  
  }

  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  System.out.println("Completed Tests");
	  
	  Thread.sleep(3000);
	  driver.quit();
  
  }
  

}
