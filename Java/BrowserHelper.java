import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserHelper {
    static WebDriver driver;
    static String WEBDRIVER_PATH = "C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\";

    public static WebDriver setBrowser(String browName, String URL){

        if (browName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if (browName.equalsIgnoreCase("chrome")){
            String wdp= WEBDRIVER_PATH.concat("chromedriver.exe");
            System.out.println(wdp);
            System.setProperty("webdriver.chrome.driver",
            //        "C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\chromedriver.exe"
            wdp
            );
            //                WEBDRIVER_PATH.concat("chromedriver.exe"));
            driver = new ChromeDriver();
        } else if (browName.equalsIgnoreCase("safari")){
            System.setProperty("webdriver.safari.driver",
                    WEBDRIVER_PATH.concat("safaridriver.exe"));
            driver = new SafariDriver();
        } else if(browName.equalsIgnoreCase("IE")){
            System.setProperty("webdriver.IE.driver",
                    WEBDRIVER_PATH.concat("IEDriverServer.exe"));
            driver = new InternetExplorerDriver();
        }

        driver.manage().window().maximize();
        driver.get(URL);
        return driver;

    }

    public void closeBrowser(WebDriver driver){
        driver.quit();
    }
}
