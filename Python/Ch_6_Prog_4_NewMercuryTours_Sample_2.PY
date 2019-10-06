# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
import unittest, time, re

class MercuryTours(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(30)
        self.base_url = "https://www.katalon.com/"
        self.verificationErrors = []
        self.accept_next_alert = True
    
    def test_mercury_tours(self):
        driver = self.driver
        driver.get("http://newtours.demoaut.com/mercurywelcome.php")
        driver.find_element_by_link_text("Home").click()
        driver.find_element_by_name("userName").clear()
        driver.find_element_by_name("userName").send_keys("SEL")
        driver.find_element_by_name("userName").send_keys(Keys.DOWN)
        driver.find_element_by_name("userName").send_keys(Keys.DOWN)
        driver.find_element_by_name("password").clear()
        driver.find_element_by_name("password").send_keys("seluser")
        driver.find_element_by_name("userName").clear()
        driver.find_element_by_name("userName").send_keys("seluser")
        driver.find_element_by_name("login").click()
        driver.find_element_by_name("toDay").click()
        driver.find_element_by_name("toMonth").click()
        Select(driver.find_element_by_name("toMonth")).select_by_visible_text("December")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Returning:'])[1]/following::option[12]").click()
        driver.find_element_by_name("toDay").click()
        Select(driver.find_element_by_name("toDay")).select_by_visible_text("10")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Returning:'])[1]/following::option[22]").click()
        driver.find_element_by_name("passCount").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Passengers:'])[1]/following::td[3]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Airline:'])[1]/preceding::input[1]").click()
        driver.find_element_by_name("airline").click()
        Select(driver.find_element_by_name("airline")).select_by_visible_text("Unified Airlines")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Airline:'])[1]/following::option[3]").click()
        driver.find_element_by_name("findFlights").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Unified Airlines 363'])[1]/preceding::td[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Unified Airlines 363'])[1]/preceding::td[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Unified Airlines 363'])[1]/preceding::td[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Unified Airlines 363'])[1]/preceding::input[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Unified Airlines 633'])[1]/preceding::input[1]").click()
        driver.find_element_by_name("reserveFlights").click()
        driver.find_element_by_name("passFirst0").clear()
        driver.find_element_by_name("passFirst0").send_keys("Selenium")
        driver.find_element_by_name("passLast0").clear()
        driver.find_element_by_name("passLast0").send_keys("User")
        Select(driver.find_element_by_name("pass.0.meal")).select_by_visible_text("Bland")
        Select(driver.find_element_by_name("pass.0.meal")).select_by_visible_text("Diabetic")
        Select(driver.find_element_by_name("creditCard")).select_by_visible_text("MasterCard")
        driver.find_element_by_name("creditnumber").clear()
        driver.find_element_by_name("creditnumber").send_keys("1234567890123456")
        Select(driver.find_element_by_name("cc_exp_dt_mn")).select_by_visible_text("01")
        Select(driver.find_element_by_name("cc_exp_dt_mn")).select_by_visible_text("02")
        Select(driver.find_element_by_name("cc_exp_dt_yr")).select_by_visible_text("2000")
        Select(driver.find_element_by_name("cc_exp_dt_yr")).select_by_visible_text("2001")
        Select(driver.find_element_by_name("cc_exp_dt_yr")).select_by_visible_text("2002")
        Select(driver.find_element_by_name("cc_exp_dt_yr")).select_by_visible_text("2003")
        self.assertEqual("You have entered 2003 as expiration year!", self.close_alert_and_get_its_text())
        Select(driver.find_element_by_name("cc_exp_dt_yr")).select_by_visible_text("2002")
        Select(driver.find_element_by_name("cc_exp_dt_yr")).select_by_visible_text("2001")
        Select(driver.find_element_by_name("cc_exp_dt_yr")).select_by_visible_text("2000")
        Select(driver.find_element_by_name("cc_exp_dt_yr")).select_by_visible_text("None")
        Select(driver.find_element_by_name("cc_exp_dt_yr")).select_by_visible_text("2000")
        Select(driver.find_element_by_name("cc_exp_dt_yr")).select_by_visible_text("2001")
        Select(driver.find_element_by_name("cc_exp_dt_yr")).select_by_visible_text("2002")
        Select(driver.find_element_by_name("cc_exp_dt_yr")).select_by_visible_text("2003")
        self.assertEqual("You have entered 2003 as expiration year!", self.close_alert_and_get_its_text())
        driver.find_element_by_name("cc_exp_dt_yr").click()
        Select(driver.find_element_by_name("cc_exp_dt_yr")).select_by_visible_text("2010")
        driver.find_element_by_name("cc_exp_dt_yr").click()
        driver.find_element_by_xpath("//div").click()
        driver.find_element_by_name("cc_frst_name").click()
        driver.find_element_by_name("cc_frst_name").clear()
        driver.find_element_by_name("cc_frst_name").send_keys("Selenium")
        driver.find_element_by_name("cc_last_name").clear()
        driver.find_element_by_name("cc_last_name").send_keys("User")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Billing Address'])[1]/following::td[1]").click()
        driver.find_element_by_name("ticketLess").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Delivery Address'])[1]/following::input[1]").click()
        driver.find_element_by_name("buyFlights").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='CONTACT'])[1]/following::img[3]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='$632 USD'])[1]/following::img[2]").click()
        driver.find_element_by_link_text("Hotels").click()
        driver.find_element_by_xpath(u"(.//*[normalize-space(text()) and normalize-space(.)='© 2005, Mercury Interactive (v. 011003-1.01-058)'])[1]/preceding::img[1]").click()
        driver.find_element_by_link_text("Car Rentals").click()
        driver.find_element_by_xpath(u"(.//*[normalize-space(text()) and normalize-space(.)='© 2005, Mercury Interactive (v. 011003-1.01-058)'])[1]/preceding::img[1]").click()
        driver.find_element_by_link_text("Cruises").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Shipboard accomodations include: all meals, daily activities and nightly entertainment'])[1]/following::img[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cruises'])[1]/following::td[2]").click()
        driver.find_element_by_link_text("Destinations").click()
        driver.find_element_by_xpath(u"(.//*[normalize-space(text()) and normalize-space(.)='© 2005, Mercury Interactive (v. 011003-1.01-058)'])[1]/preceding::img[1]").click()
        driver.find_element_by_link_text("Vacations").click()
        driver.find_element_by_xpath(u"(.//*[normalize-space(text()) and normalize-space(.)='© 2005, Mercury Interactive (v. 011003-1.01-058)'])[1]/preceding::img[1]").click()
        driver.find_element_by_link_text("REGISTER").click()
        driver.find_element_by_link_text("SUPPORT").click()
        driver.find_element_by_link_text("CONTACT").click()
        driver.close()
    
    def is_element_present(self, how, what):
        try: self.driver.find_element(by=how, value=what)
        except NoSuchElementException as e: return False
        return True
    
    def is_alert_present(self):
        try: self.driver.switch_to_alert()
        except NoAlertPresentException as e: return False
        return True
    
    def close_alert_and_get_its_text(self):
        try:
            alert = self.driver.switch_to_alert()
            alert_text = alert.text
            if self.accept_next_alert:
                alert.accept()
            else:
                alert.dismiss()
            return alert_text
        finally: self.accept_next_alert = True
    
    def tearDown(self):
        self.driver.quit()
        self.assertEqual([], self.verificationErrors)

if __name__ == "__main__":
    unittest.main()
