package CrackSeleniumInterviewExamples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumEdgeJavaExample {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        System.setProperty("webdriver.firefox.driver",
                "C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\geckodriver.exe");
        WebElement element;
        WebDriver driver = new FirefoxDriver();
        // And now use this to visit BPB Online ebooks
        driver.get("https://www.ulektz.com/p/BPB-Publications");
        System.out.println("Page title is: " + driver.getTitle());
        String content = driver.findElement(By.tagName("body")).getText();
        System.out.println(content);

        driver.findElement(By.xpath("html/body/div[1]/section/div[2]/div/div/div[1]/div/ul/div[1]/div/li[2]")).click();
        // Second Method is  driver.navigate().to("https://bpbonline.com/");
        // Find the text input element by its name
        driver.wait(10000);
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println(driver.findElement(By.tagName("body")).getText());
       //Close the browser
        driver.quit();
    }
}

