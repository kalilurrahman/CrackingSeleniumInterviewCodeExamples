# filename: headless_chrome.rb
require 'selenium-webdriver'
require 'rspec/expectations'
include RSpec::Matchers

def setup
  options = Selenium::WebDriver::Chrome::Options.new
  options.add_argument('--headless')
  options.add_argument('--disable-gpu')
  options.add_argument('--remote-debugging-port=9999')
  @driver = Selenium::WebDriver.for :chrome, options: options
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
  @driver.get 'https://news.google.co.uk'
  expect(@driver.title).to eql 'Google News'
  @driver.save_screenshot('headlessGoogleNews.png')
end