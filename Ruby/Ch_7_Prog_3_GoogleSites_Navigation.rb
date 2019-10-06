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

run do
    @driver.get "https://sites.google.com/view/crackingseleniuminterview/htmlelementscheck/confirmation?uname=test&psw=user&remember=on"
    puts("get @driver.get https://sites.google.com/view/crackingseleniuminterview/home")
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='HTML Form Element Confirmation'])[2]/following::a[1]").click
    @driver.find_element(:link, "login").click
    puts("Click Navigation Link ")
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Selenium Automation'])[1]/preceding::input[1]").clear
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Selenium Automation'])[1]/preceding::input[1]").send_keys "test"
    puts("Click Navigation Link 3")
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Selenium Automation'])[1]/preceding::input[1]").send_keys :enter
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='No results match your search'])[1]/preceding::input[1]").clear
    puts("Click Navigation Link 5")
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='No results match your search'])[1]/preceding::input[1]").send_keys "login"
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='No results match your search'])[1]/preceding::input[1]").send_keys :enter
    puts("Click Navigation Link 7")
    @driver.find_element(:link, "HTML Form Element Confirmation - Selenium Automation").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Selenium Automation'])[2]/following::a[1]").click
    @driver.find_element(:link, "Form Examples").click
    puts("Click Navigation Link 10")
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Selenium Automation'])[2]/following::a[1]").click
    puts("Quit the Browser")
    @driver.window_handles.each do |handle|
      driver.switch_to.window handle
    end
end
 
def verify(&blk)
  yield
  rescue ExpectationNotMetError => ex
    @verification_errors << ex
end