import org.apache.commons.io.FileUtils;
import org.hsqldb.jdbcDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Ch_9_JDBC_ODBC_DataBase_Connectivity_Example {
    static WebDriver driver;
    static String WEBDRIVER_PATH = "C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\";
    static jdbcDriver jdbcDriver = new jdbcDriver(); //Instantiate the jdbcDriver from HSQL
    static Connection dbConnection = null; //Database objects
    static Statement dbCommand = null;
    static ResultSet dbResultSet = null;
    static ZipFile zipFile = null; //For handeling zip files
    static ZipEntry zipEntry = null;
    static Enumeration< ? extends ZipEntry > dbEnumeration = null; //For the entries in the zip file
    static BufferedOutputStream bufferedOutputStream = null; //For the output from the zip class
    static InputStream inputStream = null; //for reading buffers from the zip file
    static File dbFile = null; //Used to get a temporary file name, not actually used for anything
    static int dbFileLength; //General length counter for loops
    static List vectorArrayOfFiles = new ArrayList(); //Stores list of unzipped file for deletion at end of program

    public static void main(String[] args) {
        // Perform DB File Extraction
        try {
            zipFile = new ZipFile("C:\\Users\\rahma\\OneDrive\\Documents\\SELENIUMTEST.odb");
            dbFile = File.createTempFile("ooTempDatabase", "tmp");
            dbFile.deleteOnExit();
            dbEnumeration = zipFile.entries();
            while (dbEnumeration.hasMoreElements()) {
                zipEntry = dbEnumeration.nextElement();
                if (zipEntry.getName().startsWith("database/")) {
                    System.out.println("Extracting File: " + zipEntry.getName());
                    byte[] buffer = new byte[1024];
                    inputStream = zipFile.getInputStream(zipEntry);
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(/*"\\tmp\\" + */ dbFile.getName() + "." + zipEntry.getName().substring(9)));
  //                  v.add("\\tmp\\" + f.getName() + "." + ent.getName().substring(9));
                    while ((dbFileLength = inputStream.read(buffer)) >= 0)
                        bufferedOutputStream.write(buffer, 0, dbFileLength);
                    bufferedOutputStream.close();
                    inputStream.close();
                }
            }
            zipFile.close();
            // Connect to the DB now
            dbConnection = DriverManager.getConnection("jdbc:hsqldb:file:" + dbFile.getName(), "SA", "");
            dbCommand = dbConnection.createStatement();
            dbResultSet = dbCommand.executeQuery("select * from \"SeleniumTest\"");
            //GO through the resultset, and output the results
            while (dbResultSet.next()) {
                System.out.println("Company Name: " + dbResultSet.getString("CompanyName")
                        + " Web Site: " + dbResultSet.getString("WEBSITE"));
                System.out.println("Country: " + dbResultSet.getString("CountryOrRegion") );
                setBrowser("chrome", dbResultSet.getString("WEBSITE"));
                takeScreenshot(driver, dbResultSet.getString("WEBSITE"));
                closeBrowser(driver);
            }
            //Close all the database objects
            dbResultSet.close();
            dbCommand.close();
            dbConnection.close();

            //Delete the temporary files, which file names are stored in the v vector
//            for (len = 0; len <> v.size(); len++) {  (new File((String) v.get(len))).delete();}
        } catch (Exception e) {
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