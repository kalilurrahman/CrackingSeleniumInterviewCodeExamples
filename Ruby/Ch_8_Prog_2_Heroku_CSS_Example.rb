require "json"
require "selenium-webdriver"
require "rspec"
include RSpec::Expectations

def verify(&blk)
  yield
rescue ExpectationNotMetError => ex
  @verification_errors << ex
end

@driver = Selenium::WebDriver.for :firefox
@accept_next_alert = true
@driver.manage.timeouts.implicit_wait = 30

@driver.get "https://the-internet.herokuapp.com/"

puts("get @driver.get 'https://the-internet.herokuapp.com/'")
@driver.find_element(:link, "Status Codes").click
puts("get Status Codes Link")
@driver.find_element(:css, "li > a").click
@driver.find_element(:css, "p > a").click
@driver.find_element(:link, "301").click
puts("get 301 error Page")
@driver.find_element(:css, "p > a").click
@driver.find_element(:link, "404").click
puts("get 404 error Page")
@driver.find_element(:css, "p > a").click
@driver.find_element(:link, "500").click
puts("get 500 error Page")
@driver.find_element(:css, "p > a").click
@driver.find_element(:css, "p > a").click
@driver.quit
puts("Quit the Browser")

