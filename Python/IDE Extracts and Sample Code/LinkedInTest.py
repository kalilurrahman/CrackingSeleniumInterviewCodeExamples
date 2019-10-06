# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
import unittest, time, re

class LinkedIn(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(30)
        self.base_url = "https://www.katalon.com/"
        self.verificationErrors = []
        self.accept_next_alert = True
    
    def test_linked_in(self):
        driver = self.driver
        driver.get("https://www.linkedin.com/")
        driver.find_element_by_name("session_key").click()
        driver.find_element_by_name("session_key").click()
        driver.find_element_by_name("session_key").clear()
        driver.find_element_by_name("session_key").send_keys("rahman.kalilur@gmail.com")
        driver.find_element_by_name("session_password").clear()
        driver.find_element_by_name("session_password").send_keys("Nas9Fas(bujili")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot password?'])[1]/following::button[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='urn:li:page:d_flagship3_feed;lZdeBeRHSJqi/hveVrpgLg=='])[1]/following::span[3]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('Who', \"'\", 's viewed your profile')])[1]/following::span[3]").click()
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
