package CrackSeleniumInterviewExamples.Ch5_EventHandler;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Ch5_Prog_1_ListenerExample_Main {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the Chrome driver - Set the Properties for the Chrome Driver locations
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
        WebElement elementForEvent;
        WebDriver driver = new ChromeDriver();
        //Initiate the Event Capturing Class Initiated
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        Ch5_EventCaptureExample ch5EventCaptureExample = new Ch5_EventCaptureExample();
        // Let us Register the Capture with EventFiringWebDriver to register
        // the implementation of WebDriverEventListener
        // to ensure it listens to the WebDriver events
        eventFiringWebDriver.register(ch5EventCaptureExample);
      // And now use this to visit BPB Publication's website
        eventFiringWebDriver.navigate().to("https://WWW.GOOGLE.COM/");
        // Check the title of the page
        System.out.println("Page title is: " + eventFiringWebDriver.getTitle());
        // Let's pick the Check Bing
        eventFiringWebDriver.navigate().to("https://www.bing.com/search?q=selenium");
        System.out.println("Page title is: " + eventFiringWebDriver.getTitle());
        System.out.println("The current" + eventFiringWebDriver.getCurrentUrl() );
        //Now Let us move to the home page of Selenium HQ
        eventFiringWebDriver.navigate().to("https://www.seleniumhq.org/");
        System.out.println("Page title is: " + eventFiringWebDriver.getTitle());
        System.out.println("The current" + eventFiringWebDriver.getCurrentUrl() );
        // Let's try some events to cover the Locater concept
        eventFiringWebDriver.manage().window().setSize(new Dimension(1050, 708));
        System.out.println("The current" + eventFiringWebDriver.getCurrentUrl() );
        eventFiringWebDriver.navigate().to("https://www.google.com/search?q=selenium");
        System.out.println("Page title is: " + eventFiringWebDriver.getTitle());
        System.out.println("The current" + eventFiringWebDriver.getCurrentUrl() + "Capabilites are \n" + eventFiringWebDriver.getCapabilities());
        // And now use this to visit BPB Publication's website
        eventFiringWebDriver.navigate().to("https://bpbonline.com/");
        System.out.println("Page title is: " + eventFiringWebDriver.getTitle());
        System.out.println("The current" + eventFiringWebDriver.getCurrentUrl() );
        // Let's quit this driver
        eventFiringWebDriver.quit();
        //Now to Unregister the listener
        eventFiringWebDriver.unregister(ch5EventCaptureExample);
        System.out.print("End of the Code");
    }
}


