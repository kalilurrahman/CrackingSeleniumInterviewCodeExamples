package CrackSeleniumInterviewExamples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch_9_Prog_1_POM_Dogpile_Search_Test {

    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
    }

    @Test
    public void workWithBasicAuthTest() {
        Ch_9_Prog_1_POM_DogpileSearch dogpile = new Ch_9_Prog_1_POM_DogpileSearch(driver);
        dogpile.searchFor("BPBOnline");
        boolean result = dogpile.searchResultPresent("BPB Publications");
        assert (result);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
