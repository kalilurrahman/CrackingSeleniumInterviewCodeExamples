package CrackSeleniumInterviewExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.io.File;

public class Ch5_Prog_3_Headless_Browser_PhantomJS_Example {
    public static void main(String[] args) throws InterruptedException {
        //Set the path of the PhantomJS Driver file location
        File headlessDriverFile = new File("C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\phantomjs.exe");
        System.setProperty("phantomjs.binary.path", headlessDriverFile.getAbsolutePath());
        //Create a new instance
        WebDriver driver = new PhantomJSDriver();
        //Let's start a search at Bing.com
        driver.get("http://www.bing.com");
        //Let's start a search
        ///html//input[@id='sb_form_q']
        WebElement element = driver.findElement(By.xpath("/html//input[@id='sb_form_q']"));
        element.sendKeys("Selenium");
        element.submit();
        //Let's check the Title Page and the length of the file
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page output length of HTML page is: " +driver.getPageSource().length());
        //Close the driver
        driver.quit();
    }
}
