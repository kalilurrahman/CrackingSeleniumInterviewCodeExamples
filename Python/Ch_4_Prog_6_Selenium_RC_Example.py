# -*- coding: utf-8 -*-
from selenium import selenium

sel = selenium("192.168.1.8", 4444, "*firefox","https://www.bing.com/")
sel.start()

##sel = selenium
## driver.implicitly_wait(30)
base_url = "https://www.bing.com/"
verificationErrors = []
accept_next_alert = True


sel.open("/")
##sel.type("q", "selenium rc")
##sel.click("btnG")
##sel.wait_for_page_to_load("30000")
##print(sel.is_text_present("Results * for selenium rc"))
##selenium.stop()

        
##driver.get("https://www.bing.com/")
##driver.find_element_by_id("sb_form_q").click()
##driver.find_element_by_id("sb_form_q").clear()
##driver.find_element_by_id("sb_form_q").send_keys("SELENIUM")
##driver.find_element_by_id("sb_form_q").send_keys(Keys.ENTER)
##driver.find_element_by_id("sb_form_go").click()
##driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Selenium'])[3]/following::div[2]").click()
##driver.quit()
##assertEqual([], verificationErrors)
##driver.close()
# These are the real test steps
# we close the browser (I'd recommend you to comment this line while
        # you are creating and debugging your tests)
##       self.assertEqual([], self.verificationErrors)
        # And make the test fail if we found that any verification errors
        # were found
##    def is_element_present(self, how, what):
##       try: self.driver.find_element(by=how, value=what)
##        except NoSuchElementException as e: return False
##        return True
##    def is_alert_present(self):
##        try: self.driver.switch_to_alert()
##        except NoAlertPresentException as e: return False
##        return True
##    def close_alert_and_get_its_text(self):
##        try:
##            alert = self.driver.switch_to_alert()
##            alert_text = alert.text
##            if self.accept_next_alert:
##                alert.accept()
##            else:
####                alert.dismiss()
##            return alert_text
##        finally: self.accept_next_alert = True