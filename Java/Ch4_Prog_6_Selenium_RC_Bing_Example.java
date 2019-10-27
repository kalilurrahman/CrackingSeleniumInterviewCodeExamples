package CrackSeleniumInterviewExamples;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class Ch4_Prog_6_Selenium_RC_Bing_Example {
    public static void main(String[] args) throws InterruptedException {

        // Instatiate the RC Server
        Selenium selenium = new DefaultSelenium("192.168.1.8", 4444 , "firefox", "http://www.calculator.net");
        selenium.start();   // Start
        selenium.open("/");  // Open the URL
        selenium.windowMaximize();

        // Click on Link Math Calculator192.168
        selenium.click("xpath = .//*[@id = 'menu']/div[3]/a");
        Thread.sleep(2500); // Wait for page load

        // Click on Link Percent Calculator
        selenium.click("xpath = .//*[@id = 'menu']/div[4]/div[3]/a");
        Thread.sleep(4000); // Wait for page load

        // Focus on text Box
        selenium.focus("name = cpar1");

        // enter a value in Text box 1
        selenium.type("css=input[name = \"cpar1\"]", "10");

        // enter a value in Text box 2
        selenium.focus("name = cpar2");
        selenium.type("css = input[name = \"cpar2\"]", "50");

        // Click Calculate button
        selenium.click("xpath = .//*[@id = 'content']/table/tbody/tr/td[2]/input");

        // verify if the result is 5
        String result = selenium.getText(".//*[@id = 'content']/p[2]");

        if (result == "5") {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

/*    public static void main(String[] args) throws Exception {

        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://www.bing.com/";
        Selenium selDriver = new WebDriverBackedSelenium(driver, baseUrl);
        selDriver.open("https://www.bing.com/");
        selDriver.click("id=sb_form_q");
        selDriver.type("id=sb_form_q", "SELENIUM HQ");
        selDriver.typeKeys("id=sb_form_q", "${KEY_ENTER}");
        selDriver.click("id=sb_form_go");
        selDriver.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Selenium'])[3]/following::div[2]");
        selDriver.close();
        selDriver.stop();


    }

*/

/*

package com.example.tests;


public class rcdemo {
}
public class Ch4Prog6SeleniumRCExample {
    private Selenium selenium;

    @Before
    public void setUp() throws Exception {
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://www.katalon.com/";
        selenium = new WebDriverBackedSelenium(driver, baseUrl);
    }

    @Test
    public void testCh4Prog6SeleniumRCExample() throws Exception {
        selenium.open("https://www.bing.com/");
        selenium.click("id=sb_form_q");
        selenium.type("id=sb_form_q", "selenium rc");
        selenium.sendKeys("id=sb_form_q", "${KEY_ENTER}");
        selenium.click("id=sb_form_go");
        selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Selenium'])[3]/following::div[2]");
        selenium.close();
    }

    @After
    public void tearDown() throws Exception {
        selenium.stop();
    }
}
*/