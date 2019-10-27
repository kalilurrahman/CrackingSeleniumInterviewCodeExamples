package CrackSeleniumInterviewExamples;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Ch5_Prog_2_WindowResize_Example {
    public static void main(String[] args) throws InterruptedException {
        WebElement element;
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("window-size=800,480");
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        //this will open chrome with set size
        WebDriver driver = new ChromeDriver(desiredCapabilities);
        driver.get("https://www.google.com");
        Dimension d = new Dimension(1200,1200);
        //Resize current window to the set dimension
        driver.manage().window().setSize(d);
        d = new Dimension(600,980);
        //Resize current window to the set dimension
        driver.manage().window().setSize(d);
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.close();
    }
}
