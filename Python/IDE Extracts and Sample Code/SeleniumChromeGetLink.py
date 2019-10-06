from selenium import webdriver
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.support.ui import WebDriverWait # available since 2.4.0
from selenium.webdriver.support import expected_conditions as EC # available since 2.26.0

# Create a new instance of the Chrome driver
driver = webdriver.Chrome(executable_path ="C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\chromedriver.exe")

##WebDriverWait(driver, 10)

# go to the BPBOnline home page
driver.get("https://bpbonline.com")

# the page Use AJAX - lets check the title 
print(driver.title)

elem = driver.find_element_by_link_text("Videos")
elem.click()


try:
    # Wait to check for the title to get loaded
    print(driver.title)
    #Print the Page content in HTML format
    print(driver.page_source)
    #Save the Screen Shot as a file
    #driver.get_screenshot_as_file("BPBonline_Video_Output.png")
finally:
    #Close the Driver
    driver.quit()