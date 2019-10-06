# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
import unittest, time, re

class EPFL(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(30)
        self.base_url = "https://www.katalon.com/"
        self.verificationErrors = []
        self.accept_next_alert = True
    
    def test_e_p_f_l(self):
        driver = self.driver
        driver.get("https://rapport-annuel.epfl.ch/en")
        driver.find_element_by_link_text("2018").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='English'])[1]/following::div[7]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='View the statements'])[1]/following::div[12]").click()
        driver.find_element_by_link_text("Innovation").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='English'])[1]/following::div[9]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Innovation'])[1]/following::div[4]").click()
        driver.find_element_by_link_text("EPFL in figures").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='English'])[1]/following::p[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='EPFL in figures'])[1]/following::div[3]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='EPFL in figures'])[1]/following::input[2]").clear()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='EPFL in figures'])[1]/following::input[2]").send_keys("switzerland")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='EPFL in figures'])[1]/following::input[2]").send_keys(Keys.ENTER)
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
