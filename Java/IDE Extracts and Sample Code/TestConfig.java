package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestConfig {
  
	public static WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Starting Suite");
		System.setProperty("webdriver.gecko.driver", "<path to>\\geckodriver.exe");
		  
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Nightly\\56\\firefox.exe");
		  
		driver = new FirefoxDriver(options);
		  
	  }
	
	  @AfterSuite
	  public void afterSuite() throws InterruptedException {
		  
		  System.out.println("Completed Suite");
		  
		  Thread.sleep(3000);
		  driver.quit();
	  
	  }

}
