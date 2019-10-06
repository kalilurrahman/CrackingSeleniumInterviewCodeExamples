from selenium import webdriver
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.support.ui import
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.chrome.options import Options

# Create a new instance of the Chrome driver
# Replace your executable path with the directory where you have the drivers
driver = webdriver.Chrome(executable_path ="C:\\Selenium\\chromedriver.exe")

#A code to disable notifications pop-up. This could be handy
options = Options()
options.add_argument("--disable-notifications")

# go to the BPBOnline home page
driver.get("https://bpbonline.com")

# Lets check the title
print(driver.title)

#Write Code to handle the Pop-up for signing up to Newsletter
driver.find_element_by_xpath('/html/body/div[5]/div/div/a').click()

#Wait for page to load
WebDriverWait(driver, 10)

#Click on Videos link by using Link Text option
elem = driver.find_element_by_link_text("Videos")
elem.click()

try:
    # Wait to check for the title to get loaded
    WebDriverWait(driver, 30)
    print(driver.title)
    #Print the Page content in HTML format
    print(driver.page_source)
    #Save the Screen Shot as a file
    driver.get_screenshot_as_file("OUTPUTFILENAME.png")

finally:
    #Close the Driver
    driver.quit()
