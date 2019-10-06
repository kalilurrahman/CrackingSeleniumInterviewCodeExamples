package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class Bing {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.katalon.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testBing() throws Exception {
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
