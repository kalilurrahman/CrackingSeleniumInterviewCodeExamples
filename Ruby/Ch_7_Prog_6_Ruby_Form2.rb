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
    puts("Open Site")
    @driver.get "http://crackingseleniuminterviews.simplesite.com/"
    @driver.find_element(:link, "CONTACT").click
    puts("Click Contacts")
    puts("Fill Contact form")
    @driver.find_element(:name, "Name").click
    @driver.find_element(:name, "Name").clear
    @driver.find_element(:name, "Name").send_keys "Selenium User"
    @driver.find_element(:name, "Email").clear
    @driver.find_element(:name, "Email").send_keys "seleniumuser@exactsiteemailaddress.is.not.needed.com"
    @driver.find_element(:name, "Message").clear
    @driver.find_element(:name, "Message").send_keys "testing selenium is very cool"
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Message*'])[1]/following::span[1]").click
    puts("end of submission")

end 
def verify(&blk)
  yield
  rescue ExpectationNotMetError => ex
    @verification_errors << ex
end


