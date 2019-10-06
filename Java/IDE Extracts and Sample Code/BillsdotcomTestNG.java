package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Billsdotcom {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testBillsdotcom() throws Exception {
    driver.get("https://www.bills.com/");
    driver.findElement(By.linkText("Pay Off Debt")).click();
    driver.findElement(By.id("dn_get_started")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mild Stress'])[1]/following::small[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Part Time'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("//div[2]/div")).click();
    driver.findElement(By.id("annual_income_continue")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Yes'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Very Good'])[2]/following::div[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Total amount you can pay per month to pay off your debt?'])[1]/following::div[5]")).click();
    driver.findElement(By.id("monthly_payment_continue")).click();
    driver.findElement(By.id("back")).click();
    driver.findElement(By.id("monthly_payment_continue")).click();
    driver.findElement(By.id("first_name")).clear();
    driver.findElement(By.id("first_name")).sendKeys("Selenium");
    driver.findElement(By.id("last_name")).clear();
    driver.findElement(By.id("last_name")).sendKeys("User");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("selenium.user@gmail.com");
    driver.findElement(By.id("phone")).clear();
    driver.findElement(By.id("phone")).sendKeys("(303");
    driver.findElement(By.id("phone")).clear();
    driver.findElement(By.id("phone")).sendKeys("(303) 123-4567");
    driver.findElement(By.id("address")).clear();
    driver.findElement(By.id("address")).sendKeys("7595 E Arkansas Avenue");
    driver.findElement(By.id("zip_code")).clear();
    driver.findElement(By.id("zip_code")).sendKeys("80231");
    driver.findElement(By.id("date_month")).clear();
    driver.findElement(By.id("date_month")).sendKeys("11");
    driver.findElement(By.id("date_day")).clear();
    driver.findElement(By.id("date_day")).sendKeys("11");
    driver.findElement(By.id("date_year")).clear();
    driver.findElement(By.id("date_year")).sendKeys("1970");
    driver.findElement(By.id("personal_information_skip")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=see-my-solutions | ]]
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
