package CrackSeleniumInterviewExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ch3_Prog_1_SeleniumChromeJavaExample{
    public static void main(String[] args) {
        // Create a new instance of the Chrome driver - Set the Properties for the Chrome Driver locations
        System.setProperty("webdriver.chrome.driver",
                "C:\\Selenium\\chromedriver.exe");
        WebElement element;
        WebDriver driver = new ChromeDriver();
        // And now use this to visit BPB Publication's website
        driver.get("https://bpbonline.com/");
        // Second Method is  driver.navigate().to("https://bpbonline.com/");

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        // Type C to search for book titles with C
        driver.findElement(By.id("bc-product-search")).sendKeys("C");
        // Now Press Enter to see the results
        driver.findElement(By.id("bc-product-search")).sendKeys(Keys.ENTER);
        // Check the title of the new page page
        System.out.println("Page title is: " + driver.getTitle());
        // Get the text content of the web page
        System.out.println(driver.findElement(By.tagName("body")).getText());
        //Close the browser
        driver.quit();
    }
}