from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.by import By

driver = webdriver.Chrome(executable_path ="C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\chromedriver.exe")
#driver = webdriver.Opera(executable_path ="C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\operadriver.exe")
driver.implicitly_wait(5)

driver.get("http://www.duckduckgo.com")
#assert "DuckDuckGo" in driver.title
elem = driver.find_element_by_id("search_form_input_homepage")
elem.send_keys("Google")
elem.send_keys(Keys.RETURN)
for cookie in driver.get_cookies():
    print("%s -> %s" % (cookie['name'], cookie['value']))
driver.save_screenshot("screenshot_DDG33.png")
print("Success 1")

driver.close()
