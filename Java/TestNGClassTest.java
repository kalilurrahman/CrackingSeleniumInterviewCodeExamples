package com.CrackingSeleniumInterviews.TestNG.examples;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClassTest {
  @Test
  public void f() {
	  Reporter.log("public void f()");
  }

  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("public void beforeMethod()");
  }
  
  @AfterMethod
  public void afterMethod() {
	  Reporter.log("  public void afterMethod()");
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("  public void beforeClass()");
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("  public void afterClass() ");
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("  public void beforeTest()");
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("  public void afterTest()");
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("  public void beforeSuite()");
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("  public void afterSuite() ");
  }

}
