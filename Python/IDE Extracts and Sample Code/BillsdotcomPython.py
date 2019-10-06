# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
import unittest, time, re

class Billsdotcom(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(30)
        self.base_url = "https://www.katalon.com/"
        self.verificationErrors = []
        self.accept_next_alert = True
    
    def test_billsdotcom(self):
        driver = self.driver
        driver.get("https://www.bills.com/")
        driver.find_element_by_link_text("Pay Off Debt").click()
        driver.find_element_by_id("dn_get_started").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mild Stress'])[1]/following::small[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Part Time'])[1]/following::button[1]").click()
        driver.find_element_by_xpath("//div[2]/div").click()
        driver.find_element_by_id("annual_income_continue").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Yes'])[1]/following::button[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Very Good'])[2]/following::div[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Total amount you can pay per month to pay off your debt?'])[1]/following::div[5]").click()
        driver.find_element_by_id("monthly_payment_continue").click()
        driver.find_element_by_id("back").click()
        driver.find_element_by_id("monthly_payment_continue").click()
        driver.find_element_by_id("first_name").clear()
        driver.find_element_by_id("first_name").send_keys("Selenium")
        driver.find_element_by_id("last_name").clear()
        driver.find_element_by_id("last_name").send_keys("User")
        driver.find_element_by_id("email").clear()
        driver.find_element_by_id("email").send_keys("selenium.user@gmail.com")
        driver.find_element_by_id("phone").clear()
        driver.find_element_by_id("phone").send_keys("(303")
        driver.find_element_by_id("phone").clear()
        driver.find_element_by_id("phone").send_keys("(303) 123-4567")
        driver.find_element_by_id("address").clear()
        driver.find_element_by_id("address").send_keys("7595 E Arkansas Avenue")
        driver.find_element_by_id("zip_code").clear()
        driver.find_element_by_id("zip_code").send_keys("80231")
        driver.find_element_by_id("date_month").clear()
        driver.find_element_by_id("date_month").send_keys("11")
        driver.find_element_by_id("date_day").clear()
        driver.find_element_by_id("date_day").send_keys("11")
        driver.find_element_by_id("date_year").clear()
        driver.find_element_by_id("date_year").send_keys("1970")
        driver.find_element_by_id("personal_information_skip").click()
        # ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=see-my-solutions | ]]
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
