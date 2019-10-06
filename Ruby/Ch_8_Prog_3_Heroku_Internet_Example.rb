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
@base_url = "https://www.katalon.com/"
@accept_next_alert = true
@driver.manage.timeouts.implicit_wait = 30
@verification_errors = []
@driver.get "https://the-internet.herokuapp.com/"
puts("get @driver.get 'https://the-internet.herokuapp.com/'")
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Available Examples'])[1]/following::li[1]").click
@driver.find_element(:link, "Form Authentication").click
puts("Click Link")
@driver.find_element(:id, "username").click
@driver.find_element(:id, "username").clear
puts("enter username")
@driver.find_element(:id, "username").send_keys "tomsmith"
@driver.find_element(:id, "password").clear
@driver.find_element(:id, "password").send_keys "SuperSecretPassword!"
puts("Password")
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::i[1]").click
@driver.find_element(:id, "flash").click
puts("Checking Verify")
verify { (@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Welcome to the Secure Area. When you are done click logout below.'])[1]/preceding::div[1]").text).should == "You logged into a secure area! ×" }
puts("Checking Verify -Welcome to the Secure Area. When you are done click logout below.")
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Welcome to the Secure Area. When you are done click logout below.'])[1]/following::i[1]").click
@driver.find_element(:id, "flash").click
puts("Clicked Logout")
verify { (@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='tomsmith'])[1]/preceding::div[1]").text).should == "You logged out of the secure area! ×" }
puts("Checking Verify -You logged out of the secure area!")
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::i[1]").click
puts("Click Login without any password")
@driver.find_element(:id, "flash").click
verify { (@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='tomsmith'])[1]/preceding::div[1]").text).should == "Your username is invalid! ×" }
puts("Checking Verify -Your username is invalid! ×")
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='SuperSecretPassword!'])[1]/following::div[1]").click
#@driver.close
@driver.quit
