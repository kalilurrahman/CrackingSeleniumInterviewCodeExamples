import unittest
from selenium import webdriver
from selenium.webdriver import Chrome
from selenium.webdriver.support.events import EventFiringWebDriver, AbstractEventListener

class CustomPythonListener(AbstractEventListener):
    def before_navigate_to(self, url, driver):
        print("Event Handler Function for actions before navigating to ", url)

    def after_navigate_to(self, url, driver):
        print("Event Handler Function for actions after navigating to ", url)

    def before_navigate_back(self, driver):
        print("Event Handler Function for actions before navigating back ", driver.current_url)

    def after_navigate_back(self, driver):
        print("Event Handler Function for actions after navigating back ", driver.current_url)

    def before_navigate_forward(self, driver):
        print("Event Handler Function for actions before navigating forward ", driver.current_url)

    def after_navigate_forward(self, driver):
        print("Event Handler Function for actions after navigating forward ", driver.current_url)

    def before_find(self, by, value, driver):
        print("Event Handler Function for before find")

    def after_find(self, by, value, driver):
        print("Event Handler Function for after_find")

    def before_click(self, element, driver):
        print("Event Handler Function for before_click")

    def after_click(self, element, driver):
        print("Event Handler Function for after_click")

    def before_change_value_of(self, element, driver):
        print("Event Handler Function for before_change_value_of")

    def after_change_value_of(self, element, driver):
        print("Event Handler Function for after_change_value_of")

    def before_execute_script(self, script, driver):
        print("Event Handler Function for before_execute_script")

    def after_execute_script(self, script, driver):
        print("Event Handler Function for after_execute_script")

    def before_close(self, driver):
        print("Event Handler Function before closing the browser driver")

    def after_close(self, driver):
        print("Event Handler Function after closing the browser driver")

    def before_quit(self, driver):
        print("Event Handler Function for before_quit")

    def after_quit(self, driver):
        print("Event Handler Function for after_quit")

    def on_exception(self, exception, driver):
        print("Event Handler Function for on_exception")


class Test(unittest.TestCase):
    def test_logging_file(self):
        myWebDriver = webdriver.Chrome()
        eventListenerDriver = EventFiringWebDriver(myWebDriver, CustomPythonListener())
        eventListenerDriver.get("https://www.bing.com")
        eventListenerDriver.find_element_by_xpath("/html//input[@id='sb_form_q']").send_keys("Testing Event in Selenium Using Python")
        eventListenerDriver.find_element_by_xpath("//html//input[@id='sb_form_go']").click()
        eventListenerDriver.close()

if __name__ == "__main__":
    unittest.main()