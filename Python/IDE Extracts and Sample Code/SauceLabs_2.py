# -*- coding: utf-8 -*-
"""
Created on Sun Jul 28 19:35:45 2019

@author: rahma
"""

# In the following examples we implement the pytest and seleniumbase test frameworks
# pytest docs: https://docs.pytest.org/en/latest/contents.html
# seleniumbase docs: https://github.com/seleniumbase/SeleniumBase
import pytest
import os
from selenium import webdriver
from _pytest.runner import runtestprotocol
import urllib3
urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)


@pytest.fixture
def driver(request):
    sauce_username = os.environ["SeleniumInterview"]
    sauce_access_key = os.environ["0157b78e-3ea7-45a0-a9d1-f14b6003ce1e"]
    remote_url = "https://ondemand.eu-central-1.saucelabs.com/wd/hub"
    # use sauce:options to handle all saucelabs.com-specific capabilities such as:
    # username, accesskey, build number, test name, timeouts etc.
    sauceOptions = {
        "screenResolution": "1280x768",
        "seleniumVersion": "3.141.59",
        'build': "Onboarding Sample App - Python",
        'name': "3-cross-browser",
        "username": sauce_username,
        "accessKey": sauce_access_key
    }
    # In ChromeOpts, we define browser and/or WebDriver capabilities such as
    # the browser name, browser version, platform name, platform version
    chromeOpts =  {
        'platformName':"Windows 10",
        'browserName': "chrome",
        'browserVersion': '71.0',
        'goog:chromeOptions': {'w3c': True},
        'sauce:options': sauceOptions
    }

    browser = webdriver.Remote(remote_url, desired_capabilities=chromeOpts)
    yield browser
    browser.quit()

# Here is our actual test code. In this test we open the saucedemo app in chrome and assert that the title is correct.
def test_should_open_chrome(driver):
    driver.get("https://bpbonline.com")
    actual_title = driver.title
    expected_title = "Computer &amp; IT Books | Emerging &amp; Trending Technologies l E-books &ndash; BPB Publications"
    assert expected_title == actual_title