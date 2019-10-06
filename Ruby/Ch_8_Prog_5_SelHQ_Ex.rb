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
#@base_url = "https://www.google.com/"
@accept_next_alert = true
@driver.manage.timeouts.implicit_wait = 30
#@verification_errors = []

@driver.get "https://www.seleniumhq.org/"
@driver.save_screenshot("./#{Time.now.strftime("SelHQ__%d_%m_%Y__%H_%M_%S")}.png")
@driver.find_element(:link, "Projects").click
@driver.save_screenshot("./#{Time.now.strftime("SelHQ__%d_%m_%Y__%H_%M_%S")}.png")
@driver.find_element(:link, "Selenium WebDriver").click
@driver.save_screenshot("./#{Time.now.strftime("SelHQ__%d_%m_%Y__%H_%M_%S")}.png")
@driver.find_element(:id, "header").click
@driver.save_screenshot("./#{Time.now.strftime("SelHQ__%d_%m_%Y__%H_%M_%S")}.png")
@driver.find_element(:link, "Download").click
@driver.save_screenshot("./#{Time.now.strftime("SelHQ__%d_%m_%Y__%H_%M_%S")}.png")
@driver.find_element(:link, "Documentation").click
@driver.save_screenshot("./#{Time.now.strftime("SelHQ__%d_%m_%Y__%H_%M_%S")}.png")
@driver.find_element(:link, "Selenium IDE").click
@driver.save_screenshot("./#{Time.now.strftime("SelHQ__%d_%m_%Y__%H_%M_%S")}.png")
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Navigation'])[2]/following::a[1]").click
@driver.find_element(:link, "Brief History of The Selenium Project").click
@driver.save_screenshot("./#{Time.now.strftime("SelHQ__%d_%m_%Y__%H_%M_%S")}.png")
@driver.find_element(:id, "introduction").click
puts("Clicking Intro")
@driver.save_screenshot("./#{Time.now.strftime("SelHQ__%d_%m_%Y__%H_%M_%S")}.png")
#verify { (@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='¶'])[4]/following::h2[1]").text).should == "Brief History of The Selenium Project¶" }
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='¶'])[4]/following::p[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Programming Language Preference'])[2]/following::input[7]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Navigation'])[2]/following::a[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Selenium WebDriver'])[1]/following::ul[1]").click
@driver.save_screenshot("./#{Time.now.strftime("SelHQ__%d_%m_%Y__%H_%M_%S")}.png")
#@driver.find_element(:link, "AdvancedUserInteractions").click
#@driver.save_screenshot("./#{Time.now.strftime("SelHQ__%d_%m_%Y__%H_%M_%S")}.png")
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)=')'])[15]/following::input[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)=')'])[15]/following::input[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)=')'])[15]/following::input[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='()'])[2]/following::input[1]").click
@driver.save_screenshot("./#{Time.now.strftime("SelHQ__%d_%m_%Y__%H_%M_%S")}.png")
puts("Clicking Midways")
@driver.find_element(:link, "Support").click
@driver.find_element(:link, "About").click
@driver.find_element(:link, "Documentation").click
@driver.find_element(:link, "AdvancedUserInteractions").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='AdvancedUserInteractions'])[1]/following::div[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='AdvancedUserInteractions'])[1]/following::div[1]").click
#@driver.find_element(:link, "Using a Proxy").click
@driver.close
puts("Closing Browsers")
#@driver.quit