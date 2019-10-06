require "json"
require "selenium-webdriver"
require "rspec"
include RSpec::Expectations

def setup 
    @driver = Selenium::WebDriver.for :firefox
#    @accept_next_alert = true
    @driver.manage.timeouts.implicit_wait = 30
#    @verification_errors = []
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
  @driver.get "http://www.google.com"
  # get initial window size
  puts @driver.manage.window.size

  # set window size using Dimension struct
  target_size = Selenium::WebDriver::Dimension.new(1024, 768)
  @driver.manage.window.size = target_size
  puts @driver.manage.window.size

  # resize window
  @driver.manage.window.resize_to(800, 320)
  puts @driver.manage.window.size

  # maximize window
  @driver.manage.window.maximize
  puts @driver.manage.window.size

  max_width, max_height = @driver.execute_script("return [window.screen.availWidth, window.screen.availHeight];")
  @driver.manage.window.resize_to(max_width, max_height)
  puts @driver.manage.window.size

  @driver.manage.window.move_to(300, 400)
  puts @driver.manage.window.size

  @driver.manage.window.full_screen
  puts @driver.manage.window.size

  @driver.manage.window.minimize
  puts @driver.manage.window.size
  puts("End of Program")
end