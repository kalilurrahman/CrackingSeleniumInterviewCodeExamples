require 'rubygems'
require 'selenium-webdriver'

def setup 
	@driver = Selenium::WebDriver.for :firefox
end

def teardown
  @driver.quit
end

def run
    setup
    yield
    teardown
end

run do
	@driver.get "https://sites.google.com/view/crackingseleniuminterview/home"
	puts("Page title is #{@driver.title}")
	wait = Selenium::WebDriver::Wait.new(:timeout => 10)
	puts("Successful Selenium Wait")
	@driver.save_screenshot("..\\..\\Cracking Your Selenium Interview Book\\Images\\CrackingSelenium.png")
	puts("Successful Screenshot")
	puts("End of Program")
end
