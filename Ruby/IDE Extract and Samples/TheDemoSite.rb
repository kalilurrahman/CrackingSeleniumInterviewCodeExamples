require "json"
require "selenium-webdriver"
require "rspec"
include RSpec::Expectations

describe "TheDemoSite" do

  before(:each) do
    @driver = Selenium::WebDriver.for :firefox
    @base_url = "https://www.katalon.com/"
    @accept_next_alert = true
    @driver.manage.timeouts.implicit_wait = 30
    @verification_errors = []
  end
  
  after(:each) do
    @driver.quit
    @verification_errors.should == []
  end
  
  it "test_the_demo_site" do
    @driver.get "http://thedemosite.co.uk/"
    @driver.find_element(:link, "4. Login").click
    @driver.find_element(:name, "username").click
    @driver.find_element(:name, "username").clear
    @driver.find_element(:name, "username").send_keys "Automation"
    @driver.find_element(:name, "password").clear
    @driver.find_element(:name, "password").send_keys "Testing"
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='**No login attempted**'])[1]/following::td[1]").click
    @driver.find_element(:name, "FormsButton2").click
    @driver.find_element(:name, "username").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='The status was:'])[1]/following::center[1]").click
    verify { @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='The status was:'])[1]/following::center[1]").text.should =~ /^[\s\S]*[\s\S]*Failed Login[\s\S]*[\s\S]*$/ }
    @driver.find_element(:name, "username").click
    @driver.find_element(:name, "username").clear
    @driver.find_element(:name, "username").send_keys "Automation"
    @driver.find_element(:name, "password").clear
    @driver.find_element(:name, "password").send_keys "Tester"
    @driver.find_element(:name, "FormsButton2").click
    @driver.find_element(:link, "3. Add a User").click
    @driver.find_element(:name, "username").click
    @driver.find_element(:name, "username").click
    @driver.find_element(:name, "username").clear
    @driver.find_element(:name, "username").send_keys "naveen"
    @driver.find_element(:name, "password").clear
    @driver.find_element(:name, "password").send_keys "naveen"
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='All code updated April 2014, now uses PHP/PDO for database connectivity'])[1]/following::blockquote[1]").click
    @driver.find_element(:name, "FormsButton2").click
    @driver.find_element(:link, "4. Login").click
    @driver.find_element(:name, "username").click
    @driver.find_element(:name, "username").clear
    @driver.find_element(:name, "username").send_keys "naveen"
    @driver.find_element(:name, "password").clear
    @driver.find_element(:name, "password").send_keys "naveen"
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='MySQL'])[1]/following::td[2]").click
    @driver.find_element(:name, "FormsButton2").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='The status was:'])[1]/following::center[1]").click
    verify { @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='The status was:'])[1]/following::b[1]").text.should =~ /^[\s\S]*[\s\S]*Successful Login[\s\S]*[\s\S]*$/ }
  end
  
  def verify(&blk)
    yield
  rescue ExpectationNotMetError => ex
    @verification_errors << ex
  end
  
end
