package CrackSeleniumInterviewExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;

public class Ch4_Prog_5_SeleniumGrid_Example_1 {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver;
        DesiredCapabilities chromeCaps;
/*      chromeCaps = DesiredCapabilities.chrome();
        chromeCaps.setBrowserName("chrome"); */
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
        chromeOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
        chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        driver = new RemoteWebDriver(new URL("http://192.168.1.8:4444/wd/hub"), chromeOptions);
        driver.get("http://www.bing.com");
        System.out.println("Checking the Program ...");
        System.out.println(driver.findElement(By.tagName("title")));
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.quit();
    }
}
