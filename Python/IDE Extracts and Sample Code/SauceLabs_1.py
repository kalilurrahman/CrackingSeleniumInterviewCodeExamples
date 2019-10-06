# -*- coding: utf-8 -*-
"""
Created on Sun Jul 28 19:18:18 2019

@author: rahma
"""

# Selenium 3.14+ doesn't enable certificate checking
from selenium import webdriver
import urllib3
urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)

# The command_executor tells the test to run on Sauce, while the desired_capabilities
# parameter tells us which browsers and OS to spin up.
desired_cap = {
    'platform': "Mac OS X 10.13",
    'browserName': "safari",
    'version': "11.1",
    'build': "Onboarding Sample App - Python",
    'name': "1-first-test",
}
username = "SeleniumInterview"
access_key = "0157b78e-3ea7-45a0-a9d1-f14b6003ce1e"
driver = webdriver.Remote(
   command_executor='http://{}:{}@ondemand.eu-central-1.saucelabs.com/wd/hub'.format(username, access_key),
   desired_capabilities=desired_cap)

# This is your test logic. You can add multiple tests here.
driver.get("https://bpbonline.com")
if "BPB Publications" not in driver.title:
    raise Exception("Unable to load BPB Online page!")
else:
    print("Test is completed Successfully")
# This is where you tell Sauce Labs to stop running tests on your behalf.
# It's important so that you aren't billed after your test finishes.
driver.quit()

