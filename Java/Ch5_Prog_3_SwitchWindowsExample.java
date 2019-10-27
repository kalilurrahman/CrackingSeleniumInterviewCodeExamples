package CrackSeleniumInterviewExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

//import org.apache.commons.io.FileUtils;
//import org.testng.annotations.*;
//import static org.testng.Assert.*;

public class Ch5_Prog_3_SwitchWindowsExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverWait wait;
        System.setProperty("webdriver.firefox.driver",
                "C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//div[@id='content']/div[1]/ul[1]/li[1]/button")).click();
        wait = new WebDriverWait(driver, 7);
        Alert alert;
        sleep(3000);
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("result")).getText());
        driver.findElement(By.xpath("//div[@id='content']/div[1]/ul[1]/li[2]/button")).click();
        wait = new WebDriverWait(driver, 8);
        sleep(3000);
        driver.switchTo().alert().dismiss();
        System.out.println(driver.findElement(By.id("result")).getText());
        driver.findElement(By.xpath("//div[@id='content']/div[1]/ul[1]/li[3]/button")).click();
        wait = new WebDriverWait(driver, 9);
        alert = driver.switchTo().alert();
        sleep(3000);
        System.out.println(alert.getText());
        alert.sendKeys("Testing for Cracking the Selenium Interview!");
        sleep(3000);
        alert.accept();
        System.out.println(driver.findElement(By.id("result")).getText());
        try {
            sleep(3000); // Thread.sleep Is Here Slow Down Execution And Show The Result Before Closing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}

