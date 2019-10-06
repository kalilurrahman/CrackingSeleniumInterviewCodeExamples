from selenium import webdriver

def testBrowser(browserDriver):
  SearchURL = 'https://www.bing.com'
  SearchPhrase = 'Selenium'
  browserDriver.get(SearchURL) 
  print("Let us try a simple XPATH based search in a website")
  browserDriver.find_element_by_xpath("/html//input[@id='sb_form_q']").send_keys(SearchPhrase)
  browserDriver.find_element_by_xpath("//html//input[@id='sb_form_go']").click()
  print(browserDriver.current_url)
  for cookie in browserDriver.get_cookies():
    print("%s -> %s" % (cookie['name'], cookie['value']))
  browserDriver.close()
  browserDriver.quit()
  
print("Let Us try XPATH search and Cookie Check")
driver= webdriver.Chrome()
driver.set_window_size(1120, 550)
testBrowser(driver)
print("Exiting the program successfully")