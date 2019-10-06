from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.by import By

time.sleep(3)
driver = webdriver.Chrome(executable_path ="C:\\ Selenium\\chromedriver.exe")
driver.get("http://www.duckduckgo.com")
time.sleep(2)
assert "DuckDuckGo" in driver.title
elem = driver.find_element_by_id("search_form_input_homepage")
elem.send_keys("Google")
elem.send_keys(Keys.RETURN)
time.sleep(7)
driver.save_screenshot("screenshot_DDG.png")
print("Success 1")
