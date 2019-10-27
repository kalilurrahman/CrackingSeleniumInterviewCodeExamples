package CrackingYourSeleniumInterviewExamplesClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch4_Prog_1_SeleniumDriver_Example_1 {

    public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	    	//System.setProperty("webdriver.firefox.marionette","C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "http://demo.guru99.com/test/newtours/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Fire fox
	        driver.close();       
	}
}