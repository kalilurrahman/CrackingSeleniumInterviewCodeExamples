# -*- coding: utf-8 -*-
"""
Created on Mon Aug  5 18:29:15 2019

@author: rahma
"""

from selenium import webdriver
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.support.ui import WebDriverWait # available since 2.4.0
from selenium.webdriver.support import expected_conditions as EC # available since 2.26.0

# Create a new instance of the Firefox driver
##driver = webdriver.Firefox()

#driver = web


driver = webdriver.Chrome(executable_path ="C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\chromedriver.exe")
#cpbl = webdriver.DesiredCapabilities.INTERNETEXPLORER.copy()
#cpbl['ie.enableFullPageScreenshot'] = False
#driver = webdriver.Ie(executable_path ="C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\IEDriverServer.exe", capabilities = cpbl)

#driver = webdriver.Firefox(executable_path ="C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\geckodriver.exe")

print("Success in opening driver")

# go to the google home page
driver.get("https://demo.applitools.com/")

print("Success in opening URL")

# setWindowSize | 1050x708 |  | 
driver.set_window_size(1050, 708)


print("Success in resizing browser")

# the page is ajaxy so the title is originally this:
print(driver.title)


#Check if the Page contains "Login Form" Selector
#assert driver.find_element_by_name(".auth-header").text == "Login Form"
    
#  click | id=username |  | 
driver.find_element_by_id("username").click()


print("Success in finding username")

# type | id=username | demo | 
driver.find_element_by_id("username").send_keys("demo")


print("Success in typing username")

#  type | id=password | demo | 
driver.find_element_by_id("password").send_keys("demo")


print("Success in typing password")


#  click | id=log-in |  | 
driver.find_element_by_id("log-in").click()

print("Success in Clicking login")

# assertTitle | ACME demo app |  | 
#assert driver.title == "ACME demo app"

#content = driver.page_source


#try:
    # we have to wait for the page to refresh, the last thing that seems to be updated is the title
WebDriverWait(driver, 10).until(EC.title_contains("ACME demo app"))
    
print("Success checking title")

 #   assert driver.title == "ACME demo app"
print(driver.title)

content = driver.find_element_by_tag_name("body").get_attribute("innerText")
print(driver.page_source)

print(content)
# You should see "cheese! - Google Search"

#| close |  |  | 
driver.quit()
 
#driver.quit()
    
#finally:
#    driver.quit()
    
    
   
