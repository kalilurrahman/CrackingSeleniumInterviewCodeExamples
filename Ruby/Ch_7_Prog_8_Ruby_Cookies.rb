require "json"
require "selenium-webdriver"
require "rspec"
include RSpec::Expectations

def setup 
    @driver = Selenium::WebDriver.for :firefox
    @accept_next_alert = true
    @driver.manage.timeouts.implicit_wait = 30
    @verification_errors = []
end

def teardown
    @driver.quit
end

def run
    setup
    yield
    teardown
end

def print_cookies 
  @driver.manage.all_cookies.each { |cookie|
      puts "#{cookie[:name]} => #{cookie[:value]}"
  }
end 

run do
  @driver.get "http://www.google.com"
  puts("before cookies")
  print_cookies
  puts("Adding cookies")
  @driver.manage.add_cookie(:name => 'key-1', :value => 'value-1')
  @driver.manage.add_cookie(:name => 'key-2', :value => 'value-2')
  puts("After Adding cookies")
  print_cookies
  puts("deleting cookies")
  @driver.manage.delete_cookie "key-2"
  @driver.manage.delete_all_cookies
  puts("After Deleting cookies")
  print_cookies
  puts("End of Program")
end