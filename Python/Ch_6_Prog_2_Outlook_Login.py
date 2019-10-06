# -*- coding: utf-8 -*-
"""
Created on Fri Sep  6 09:32:53 2019

@author: rahma
"""

# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome()
base_url = "https://www.google.com/"
driver.get("https://outlook.live.com/owa/")
driver.find_element_by_link_text("Sign in").click()
print("Success 1")
driver.find_element_by_id("i0116").click()
driver.find_element_by_id("i0116").clear()
driver.find_element_by_id("i0116").send_keys("rahman.kalilur@outlook.com" + Keys.ENTER)
driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Create one!'])[1]/preceding::div[5]").click()
driver.find_element_by_id("idSIButton9").click()
driver.close()
driver.quit()
print("Success 2")
driver2 = webdriver.Firefox()
driver2.implicitly_wait(5)
driver2.find_element_by_id("i0118").click()
driver2.find_element_by_id("i0118").clear()
driver2.find_element_by_id("i0118").send_keys("Nas4Far$" + Keys.ENTER)
driver2.find_element_by_id("idSIButton9").click()
driver2.close()
driver2.quit()
print("Success 3")
driver3 = webdriver.Safari()
driver3.implicitly_wait(5)
driver3.find_element_by_id("id__3").click()
driver3.find_element_by_id("id__992").click()
driver3.close()
driver3.quit()
print("Success 4")
driver4 = webdriver.Edge()
driver4.implicitly_wait(5)
driver4.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='KR'])[1]/following::img[1]").click()
driver4.find_element_by_id("meControlSignoutLink").click()
driver4.close()
driver4.quit()
print("Success 5")
