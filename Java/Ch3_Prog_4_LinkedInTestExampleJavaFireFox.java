package CrackSeleniumInterviewExamples;

import java.io.File;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Ch3_Prog_4_LinkedInTestExampleJavaFireFox {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.firefox.driver",
                "C:\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testLinkedIn() throws Exception {
        driver.get("https://www.linkedin.com/");
        driver.findElement(By.name("session_key")).click();
        driver.findElement(By.name("session_key")).click();
        driver.findElement(By.name("session_key")).clear();
        driver.findElement(By.name("session_key")).sendKeys("YOUR LINKED IN LOGIN ID"); //Replace with your user id and password
        driver.findElement(By.name("session_password")).clear();
        driver.findElement(By.name("session_password")).sendKeys("YOUR LINKED IN PASSWORD"); //Replace with your user id and password
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot password?'])[1]/following::button[1]")).click();
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println(driver.findElement(By.tagName("body")).getText());
        File ScreenShotFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenShotFile, new File("LinkedInFile.png"));
        driver.close();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
