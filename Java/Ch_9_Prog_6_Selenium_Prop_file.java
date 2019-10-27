import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class Ch_9_Prog_6_Selenium_Prop_file {
    static WebDriver driver;
    static String WEBDRIVER_PATH = "C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\";

    public static void main(String[] args) {
        WriteToPropertiesFile("Ch_9_Prog_6_Test_output.properties");
        ReadFromPropertiesFile("Ch_9_Prog_6_Test_output.properties");
    }

    private static void WriteToPropertiesFile(String propFileName) {
        try {
            Properties propertiesFile = new Properties();
            FileOutputStream fileOutputStream = new FileOutputStream(propFileName);
            propertiesFile.setProperty("Novartis", "http://www.novartis.com");
            propertiesFile.setProperty("Amazon", "http://www.amazon.com");
            propertiesFile.setProperty("Apple", "http://www.apple.com");
            propertiesFile.setProperty("Facebook", "http://www.facebook.com");
            propertiesFile.setProperty("Google", "http://www.google.com");
            propertiesFile.setProperty("Microsoft", "http://www.microsoft.com");
            propertiesFile.store(fileOutputStream, "=====Important Firms and landing pages =====");
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ReadFromPropertiesFile(String propFileName) {
        try {
            Properties propertiesFile = new Properties();
            FileInputStream fileInputStream = new FileInputStream(propFileName);
            propertiesFile.load(fileInputStream);
            System.out.println("========== Flushing the content ======");
            System.out.println(propertiesFile.toString());
            System.out.println("========== Iterating through Key/Value Pair " +
                    "======");
            Enumeration< String > enums = (Enumeration< String >) propertiesFile.propertyNames();
            while (enums.hasMoreElements()) {
                String key = enums.nextElement();
                String value = propertiesFile.getProperty(key);
                System.out.println(key + " : " + value);
                setBrowser("firefox", (String) value);
                takeScreenshot(driver, key);
                closeBrowser(driver);
            }
            System.out.println("========== Random Key Search ======");
            System.out.println(propertiesFile.get("Novartis"));
            propertiesFile.clear();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static WebDriver setBrowser(String browName, String URL) {
        if (browName.equalsIgnoreCase("firefox")) {
            String wdp = WEBDRIVER_PATH.concat("geckodriver.exe");
            System.out.println(wdp);
            System.setProperty("webdriver.firefox.driver", wdp);
            driver = new FirefoxDriver();
        } else if (browName.equalsIgnoreCase("chrome")) {
            String wdp = WEBDRIVER_PATH.concat("chromedriver.exe");
            System.out.println(wdp);
            System.setProperty("webdriver.chrome.driver", wdp);
            driver = new ChromeDriver();
        } else if (browName.equalsIgnoreCase("safari")) {
            System.setProperty("webdriver.safari.driver",
                    WEBDRIVER_PATH.concat("safaridriver.exe"));
            driver = new SafariDriver();
        } else if (browName.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.IE.driver",
                    WEBDRIVER_PATH.concat("IEDriverServer.exe"));
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.get(URL);
        System.out.println("Opened Page " + URL);
        return driver;
    }

    public static void takeScreenshot(WebDriver driver, String siteName) {
        File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, new File("New" + siteName + ".png"));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void closeBrowser(WebDriver driver) {
        driver.close();
    }
}
