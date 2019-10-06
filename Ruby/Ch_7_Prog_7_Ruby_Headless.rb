
require 'selenium-webdriver'
require 'rspec/expectations'
#require 'headless'

def setup
  #@headless = Headless.new
  #@headless.start
  options = Selenium::WebDriver::Chrome::Options.new 
  options.add_argument('--headless')
  options.add_argument('--disable-gpu')
  @driver = Selenium::WebDriver.for :chrome, options: options
end

def teardown
  @driver.quit
#  @headless.destroy
end

def run
  setup
  yield
  teardown
end

run do
  @driver.get "https://sites.google.com/view/crackingseleniuminterview/home"
  puts(@driver.title) 
  @driver.save_screenshot('Ch_7_Prog_7_Ruby_Headless.png')
end