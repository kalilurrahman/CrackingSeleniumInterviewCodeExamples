# -*- coding: utf-8 -*-
"""
Created on Thu Sep  5 22:09:26 2019

@author: rahma
"""

from selenium.webdriver.firefox.options import Options
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

from selenium import webdriver

def testBrowser(browserDriver):
  SearchURL = 'https://www.bing.com'
  SearchPhrase = 'Selenium'
  driver.implicitly_wait(100)
  browserDriver.get(SearchURL) 
  browserDriver.find_element_by_xpath("/html//input[@id='sb_form_q']").send_keys(SearchPhrase)
  browserDriver.find_element_by_xpath("//html//input[@id='sb_form_go']").click()
  print(browserDriver.current_url)
  #print(browserDriver.page_source)
  for cookie in browserDriver.get_cookies():
    print("%s -> %s" % (cookie['name'], cookie['value']))
  labels = browserDriver.find_elements_by_tag_name("p")
  inputs = browserDriver.execute_script(
    "var labels = arguments[0], inputs = []; for (var i=0; i < labels.length; i++){" +
    "inputs.push(document.getElementById(labels[i].getAttribute('for'))); } return inputs;", labels)
  print(inputs)
  browserDriver.close()
  browserDriver.quit()
  

print("Let us try a simple XPATH based search in a website")

'''options = Options()
options.add_argument("-profile")
options.add_argument("C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\geckodriver.exe")
firefox_capabilities = DesiredCapabilities.FIREFOX
firefox_capabilities['marionette'] = True
print("Capability Set")
driver = webdriver.Firefox(capabilities=firefox_capabilities, 
                           firefox_options=options, 
                           executable_path='C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\geckodriver.exe')


driver= webdriver.Firefox(firefox_profile=None, 
                          firefox_binary=None, 
                          timeout=30, 
                          capabilities=None, 
                          proxy=None, 
                          executable_path='C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\geckodriver.exe', 
                          firefox_options=None)
'''

driver = webdriver.Chrome()
driver.set_window_size(1120, 550)
print("Window Size Set")
driver.get('http://www.whatsmyip.org/')
print(driver.page_source)

testBrowser(driver)
print("Exiting the program successfully")


