from selenium import webdriver
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.support.ui import WebDriverWait # available since 2.4.0
from selenium.webdriver.support import expected_conditions as EC # available since 2.26.0

# Create a new instance of the Firefox driver
##driver = webdriver.Firefox()

driver = webdriver.Firefox(executable_path ="C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\geckdriver.exe")

# go to the BPBOnline home page
driver.get("https://bpbonline.com")

# the page is ajaxy so the title is originally this:
print(driver.title)

# find the element that's name attribute is q (the google search box)
inputElement = driver.find_element_by_id("bc-product-search")

# type in the search
inputElement.send_keys("C")

# submit the form (although google automatically searches now without submitting)
inputElement.send_keys(Keys.ENTER)

#Print the Page content in HTML
content = driver.page_source
print(driver.page_source)

try:
    # we have to wait for the page to refresh, the last thing that seems to be updated is the title
    WebDriverWait(driver, 10).until(EC.title_contains("C"))

    # You should see "C in the title Search"
    print(driver.title)

finally:
    #Close the Driver
    driver.quit()