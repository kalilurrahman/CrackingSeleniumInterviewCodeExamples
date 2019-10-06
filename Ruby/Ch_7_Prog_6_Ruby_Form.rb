require "json"
require "selenium-webdriver"
require "rspec"
include RSpec::Expectations

def setup 
    @driver = Selenium::WebDriver.for :chrome
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
    @driver.get "https://sites.google.com/view/crackingseleniuminterview/htmlelementscheck?authuser=0"
    frames = @driver.find_elements(:xpath, '//iframe[starts-with(@id,win-)]')   
    puts(frames.length)
    puts(frames[1])
    puts(frames[0])
    @driver.switch_to.frame frames[0]
    @driver.find_element(:name, 'uname').click
    @driver.find_element(:name, 'uname').send_keys "test"
    puts("Test Passed: Form input User Name found")
    @driver.find_element(:name, 'psw').clear
    @driver.find_element(:name, 'psw').send_keys "test"
    puts("Test Passed: Form input Password found")
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]").click
    verify { (@driver.title).should == "Selenium Automation - Confirmation" }
    puts("Test Passed: Submitted the form") 
    #@driver.quit
end
 
def verify(&blk)
  yield
  rescue ExpectationNotMetError => ex
    @verification_errors << ex
end
