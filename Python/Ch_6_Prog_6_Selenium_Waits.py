from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.by import By

time.sleep(3)
driver = webdriver.Chrome(executable_path ="C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\chromedriver.exe")
driver.get("http://www.duckduckgo.com")
time.sleep(2)
assert "DuckDuckGo" in driver.title
elem = driver.find_element_by_id("search_form_input_homepage")
elem.send_keys("Google")
elem.send_keys(Keys.RETURN)
time.sleep(7)
driver.save_screenshot("screenshot_DDG.png")
print("Success 1")


user = "Your USER ID for Facebook"
pwd = "Your PASSWORD for Facebook"
driver.implicitly_wait(5)
driver.get("http://www.facebook.com")
assert "Facebook" in driver.title
elem = WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.ID,"email")))
elem = driver.find_element_by_id("email")
elem.send_keys(user)
elem = driver.find_element_by_id("pass")
elem.send_keys(pwd)
elem.send_keys(Keys.RETURN)
driver.save_screenshot("screenshot_FB.png")
print("Success 2")

time.sleep(5)
driver.get("http://www.linkedin.com")
assert "LinkedIn: Log In or Sign Up" in driver.title
driver.save_screenshot("screenshot_LI.png")
print("Success 3")

driver.close()
