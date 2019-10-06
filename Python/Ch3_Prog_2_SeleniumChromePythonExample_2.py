from selenium import webdriver
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

# Create a new instance of the Chrome driver
# Pass the location of your web driver to executable_path
# parameter while instantiating Chrome Driver
driver = webdriver.Chrome(executable_path ="C:\\Selenium\\chromedriver.exe")
#Uncomment next line if you have a slow internet connection
#WebDriverWait(driver, 10)
# go to the BPBOnline home page
driver.get("https://bpbonline.com")
# the page Uses AJAX - lets check the title
print(driver.title)
# find the element that's name attribute is Product search
inputElement = driver.find_element_by_id('bc-product-search')
# type in the search term in the search bar
inputElement.send_keys("C")
# submit the search
inputElement.submit()
try:
    # Wait to check for the title to get loaded
    WebDriverWait(driver, 10).until(EC.title_contains("C"))
    # You should see "C in the title Search"
    print(driver.title)
    #Print the Page content in HTML format
    print(driver.page_source)
    #Save the Screen Shot as a file
    driver.get_screenshot_as_file("BPBonline_C_Output.png")
finally:
    #Close the Driver
    driver.quit()
