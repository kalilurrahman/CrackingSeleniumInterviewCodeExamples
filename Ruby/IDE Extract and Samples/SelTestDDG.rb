require 'rubygems'
require 'selenium-webdriver'

driver = Selenium::WebDriver.for :firefox
driver.get "http://www.duckduckgo.com"

element = driver.find_element :id => "search_form_input_homepage"
element.send_keys "Selenium"
element.submit

puts "Page title is #{driver.title}"

wait = Selenium::WebDriver::Wait.new(:timeout => 10)
wait.until { driver.title.downcase.start_with? "selenium" }

puts "Page title is #{driver.title}"
driver.quit

