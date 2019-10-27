package CrackSeleniumInterviewExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;

public class Ch5_Prog_5_SwitchWindowsExample_IDE_Export {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverWait wait;
        System.setProperty("webdriver.firefox.driver",
                "C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\geckodriver.exe");
        driver = new ChromeDriver();
        // Test name: http__the_internet_herokuapp_com_javascript_alerts
        // Step # | name | target | value | comment
        // 1 | open | /javascript_alerts |  |
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        // 2 | setWindowSize | 1382x744 |  |
        driver.manage().window().setSize(new Dimension(1382, 744));
        // 3 | click | css=li:nth-child(1) > button |  |
        sleep(3000);
        driver.findElement(By.cssSelector("li:nth-child(1) > button")).click();
        // 4 | assertAlert | I am a JS Alert |  |
        assertThat(driver.switchTo().alert().getText(), is("I am a JS Alert"));
        wait = new WebDriverWait(driver, 7);
        // 5 | chooseOkOnNextConfirmation |  |  |
        driver.switchTo().alert().accept();
        sleep(3000);
        // 6 | click | css=li:nth-child(2) > button |  |
        driver.findElement(By.cssSelector("li:nth-child(2) > button")).click();
        // 7 | assertConfirmation | I am a JS Confirm |  |
        assertThat(driver.switchTo().alert().getText(), is("I am a JS Confirm"));
        wait = new WebDriverWait(driver, 7);
        // 8 | webdriverChooseOkOnVisibleConfirmation |  |  |
        driver.switchTo().alert().accept();
        // 9 | chooseCancelOnNextConfirmation |  |  |
        // 10 | click | css=li:nth-child(2) > button |  |
        sleep(3000);
        driver.findElement(By.cssSelector("li:nth-child(2) > button")).click();
        // 11 | assertConfirmation | I am a JS Confirm |  |
        assertThat(driver.switchTo().alert().getText(), is("I am a JS Confirm"));
        wait = new WebDriverWait(driver, 7);
        // 12 | webdriverChooseCancelOnVisibleConfirmation |  |  |
        driver.switchTo().alert().dismiss();
        sleep(3000);
        // 13 | answerOnNextPrompt | Hello World |  |
        // 14 | click | css=li:nth-child(3) > button |  |
        driver.findElement(By.cssSelector("li:nth-child(3) > button")).click();
        // 15 | assertPrompt | I am a JS prompt |  |
        assertThat(driver.switchTo().alert().getText(), is("I am a JS prompt"));
        wait = new WebDriverWait(driver, 7);
        // 16 | webdriverAnswerOnVisiblePrompt | Hello World |  |
        {
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("Hello World");
            wait = new WebDriverWait(driver, 7);
            alert.accept();
        }
        sleep(3000);
        // 17 | answerOnNextPrompt | Testing Selenium Interview Questions! |  |
        // 18 | click | css=li:nth-child(3) > button |  |
        driver.findElement(By.cssSelector("li:nth-child(3) > button")).click();
        // 19 | assertPrompt | I am a JS prompt |  |
        assertThat(driver.switchTo().alert().getText(), is("I am a JS prompt"));
        wait = new WebDriverWait(driver, 7);
        // 20 | webdriverAnswerOnVisiblePrompt | Testing Selenium Interview Questions! |  |
        {
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("Testing Selenium Interview Questions!");
            wait = new WebDriverWait(driver, 7);
            alert.accept();
        }
        sleep(3000);
        // 21 | chooseCancelOnNextPrompt |  |  |
        // 22 | click | css=li:nth-child(3) > button |  |
        driver.findElement(By.cssSelector("li:nth-child(3) > button")).click();
        // 23 | assertPrompt | I am a JS prompt |  |
        assertThat(driver.switchTo().alert().getText(), is("I am a JS prompt"));
        wait = new WebDriverWait(driver, 7);
        // 24 | webdriverChooseCancelOnVisiblePrompt |  |  |
        driver.switchTo().alert().dismiss();
        sleep(3000);
        // 25 | chooseCancelOnNextPrompt |  |  |
        // 26 | click | css=li:nth-child(3) > button |  |
        driver.findElement(By.cssSelector("li:nth-child(3) > button")).click();
        // 27 | assertPrompt | I am a JS prompt |  |
        assertThat(driver.switchTo().alert().getText(), is("I am a JS prompt"));
        wait = new WebDriverWait(driver, 7);
        // 28 | webdriverChooseCancelOnVisiblePrompt |  |  |
        driver.switchTo().alert().dismiss();
        // 29 | close |  |  |
        sleep(7000);
        driver.close();
        driver.quit();
    }
}

