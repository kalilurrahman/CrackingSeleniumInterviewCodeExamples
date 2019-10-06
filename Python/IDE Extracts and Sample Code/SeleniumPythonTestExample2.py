from selenium import webdriver
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.support.ui import WebDriverWait # available since 2.4.0
from selenium.webdriver.support import expected_conditions as EC # available since 2.26.0
from selenium.webdriver.chrome.options import Options

# Create a new instance of the Chrome driver
driver = webdriver.Chrome(executable_path ="C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\chromedriver.exe")



options = Options()
options.add_argument("--disable-notifications")

# go to the BPBOnline home page
driver.get("https://bpbonline.com")

# the page Use AJAX - lets check the title 
print(driver.title)

print("#Write Code to handle the Pop-up for signing up to Newsletter")
#Write Code to handle the Pop-up for signing up to Newsletter
driver.find_element_by_xpath('/html/body/div[5]/div/div/a').click()

print('#Wait for page to load')
#Wait for page to load
WebDriverWait(driver, 10)

print('#Click on Videos link by using Link Text option')
#Click on Videos link by using Link Text option
elem = driver.find_element_by_link_text("Videos")
elem.click()

try:
    # Wait to check for the title to get loaded
    WebDriverWait(driver, 30)
    print('Second title')
    print(driver.title)
    #Print the Page content in HTML format
    print('HTML Page Source')
   # print(driver.page_source)
    #Save the Screen Shot as a file
    driver.get_screenshot_as_file("BPBonline_Video_Output9.png")
    print('Saved Screen as image')
    
finally:
    #Close the Driver
    driver.quit()