import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class CrackingSeleniumSimpleSitePageTest
{
    @Test
    public void enterDataChrome() {
        System.out.println("=====Browser Session Started - Chrome ");
        // This will launch browser and specific url
        WebDriver webDriver=BrowserHelper.setBrowser("chrome", "http://crackingseleniuminterviews.simplesite.com/443702024");
 //Created Page Object using Page Factory
        CrackingSeleniumSimpleSitePage checksite=PageFactory.initElements(webDriver, CrackingSeleniumSimpleSitePage.class);
        System.out.println("=====Application Started=====");
        System.out.println("=====Data Entry starts=====");
// Call the method
        checksite.SubmitData("Selenium User", "Selenium.User@seleniuminterviews.com","selenium is a brilliant tool");
        System.out.println("=====Data Entered");
        webDriver.close();
        System.out.println("=====Application ended=");
    }
    @Test
    public void enterDataFireFox() {
        System.out.println("=====Browser Session Started -Firefox ====");
        // This will launch browser and specific url
        WebDriver webDriver=BrowserHelper.setBrowser("firefox","http://crackingseleniuminterviews.simplesite.com/443702024");
        //Created Page Object using Page Factory
        CrackingSeleniumSimpleSitePage checksite=PageFactory.initElements(webDriver, CrackingSeleniumSimpleSitePage.class);
        System.out.println("=====Application Started=====");
        System.out.println("=====Data Entry starts=====");
// Call the method
        checksite.SubmitData("Selenium User", "Selenium.User@seleniuminterviews.com","selenium is a brilliant tool");
        System.out.println("=====Data Entered");
        webDriver.close();
        System.out.println("=====Application ended=");
    }

}
