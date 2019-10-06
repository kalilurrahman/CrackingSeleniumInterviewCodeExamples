# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
import unittest, time, re

class InternetHeroku(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.driver.implicitly_wait(30)
        self.base_url = "https://www.google.com/"
        self.verificationErrors = []
        self.accept_next_alert = True
    
    def test_internet_heroku(self):
        driver = self.driver
        driver.get("https://the-internet.herokuapp.com/")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Available Examples'])[1]/following::li[1]").click()
        driver.find_element_by_link_text("Form Authentication").click()
        driver.find_element_by_id("username").click()
        print("Entered User Name")
        driver.find_element_by_id("username").clear()
        driver.find_element_by_id("username").send_keys("tomsmith")
        driver.find_element_by_id("password").clear()
        driver.find_element_by_id("password").send_keys("SuperSecretPassword!")
        print("Entered Password")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::i[1]").click()
        driver.find_element_by_id("flash").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Welcome to the Secure Area. When you are done click logout below.'])[1]/following::i[1]").click()
        driver.find_element_by_id("flash").click()
        print("Entered Empty Click")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::i[1]").click()
        driver.find_element_by_id("flash").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='SuperSecretPassword!'])[1]/following::div[1]").click()
        print("Let's click the exit button")
        driver.close()
        print("End of the program")
    
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
