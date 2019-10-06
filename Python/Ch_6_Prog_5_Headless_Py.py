# -*- coding: utf-8 -*-
"""
Created on Thu Sep  5 21:31:18 2019

@author: rahma
"""

from selenium import webdriver

driver = webdriver.PhantomJS()
driver.set_window_size(1120, 550)
'''driver.get("https://duckduckgo.com/")
driver.find_element_by_id("search_form_input_homepage").click()
driver.find_element_by_id("search_form_input_homepage").clear()
driver.find_element_by_id("search_form_input_homepage").send_keys("Selenium")
driver.find_element_by_id("search_button_homepage").click()'''
driver.get("https://www.google.com/")
driver.find_element_by_name("q").click()
driver.find_element_by_name("q").clear()
driver.find_element_by_name("q").send_keys("Selenium")
driver.find_element_by_name("q").submit()
#driver.find_element_by_css_selector("div.FPdoLc.VlcLAe > center > input[name=\"btnK\"]").click()
print(driver.current_url)
#print(driver.page_source)
driver.save_screenshot("screenshot_Google_SeleniumSearch.png")

driver.get("https://www.bing.com")
#/html//input[@id='sb_form_q']
driver.find_element_by_xpath("/html//input[@id='sb_form_q']").send_keys("Selenium")
driver.find_element_by_xpath("/html//input[@id='sb_form_go']").click()
print(driver.current_url)
driver.save_screenshot("screenshot_Bing_SeleniumSearch.png")
#print(driver.page_source)

driver.quit()


'''# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
import unittest, time, re

class DuckDuckGo(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(30)
        self.base_url = "https://www.katalon.com/"
        self.verificationErrors = []
        self.accept_next_alert = True
    
    def test_duck_duck_go(self):
        driver = self.driver
        driver.get("https://duckduckgo.com/")
        driver.find_element_by_id("search_form_input_homepage").click()
        driver.find_element_by_id("search_form_input_homepage").clear()
        driver.find_element_by_id("search_form_input_homepage").send_keys("Selenium")
        driver.find_element_by_id("search_button_homepage").click()
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
    
    
    # -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
import unittest, time, re

class Google(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(30)
        self.base_url = "https://www.katalon.com/"
        self.verificationErrors = []
        self.accept_next_alert = True
    
    def test_google(self):
        driver = self.driver
        driver.get("https://www.google.com/")
        driver.find_element_by_name("q").click()
        driver.find_element_by_name("q").clear()
        driver.find_element_by_name("q").send_keys("Selenium")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remove'])[11]/following::input[3]").click()
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

'''