# Generated by Selenium IDE
import pytest
import time
import json
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.keys import Keys

class TestControlFlow():
  def setup_method(self, method):
    self.driver = webdriver.Firefox()
    self.vars = {}
  
  def teardown_method(self, method):
    self.driver.quit()
  
  def test_controlFlow(self):
    # Test name: ControlFlow
    # Step # | name | target | value | comment
    # 1 | executeScript | return "a" | myVar | 
    self.vars["myVar"] = self.driver.execute_script("return \'a\'")
    # 2 | if | ${myVar} === "a" |  | 
    if self.driver.execute_script("return (arguments[0] === \"a\")", self.vars["myVar"]):
      # 3 | executeScript | return "a" | output | 
      self.vars["output"] = self.driver.execute_script("return \'a\'")
      # 4 | elseIf | ${myVar} === "b" |  | 
    elif self.driver.execute_script("return (arguments[0] === \"b\")", self.vars["myVar"]):
      # 5 | executeScript | return "b" | output | 
      self.vars["output"] = self.driver.execute_script("return \'b\'")
      # 6 | elseIf | ${myVar} === "c" |  | 
    elif self.driver.execute_script("return (arguments[0] === \"c\")", self.vars["myVar"]):
      # 7 | executeScript | return "c" | output | 
      self.vars["output"] = self.driver.execute_script("return \'c\'")
      # 8 | end |  |  | 
    # 9 | assert | output | a | 
    assert(self.vars["output"] == "a")
    # 10 | assert | output | b | 
    assert(self.vars["output"] == "b")
  
