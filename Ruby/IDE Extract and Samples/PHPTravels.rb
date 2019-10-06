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

def First_action_Method
  @driver.get "https://www.phptravels.net/"
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Offers'])[1]/following::a[1]").click
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='My Account'])[2]/b[1]").click
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='My Account'])[2]/following::a[1]").click
  @driver.find_element(:name, "username").click
  @driver.find_element(:name, "username").clear
  @driver.find_element(:name, "username").send_keys "user@phptravels.net"
  @driver.find_element(:name, "password").clear
  @driver.find_element(:name, "password").send_keys "demouser"
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]").click
end

def Second_Action_Method
  @driver.find_element(:name, "username").click
  @driver.find_element(:name, "username").click
  @driver.find_element(:name, "username").clear
  @driver.find_element(:name, "username").send_keys "user@phptravels.com"
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]").click
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Hotels'])[1]/following::span[1]").click
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Denver Intl Arpt (DEN)'])[1]/following::i[2]").click
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Done'])[1]/following::ins[2]").click
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Denver Intl Arpt (DEN)'])[1]/following::i[1]").click
  @driver.find_element(:id, "arrival").click
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[7]/following::td[42]").click
  @driver.find_element(:name, "totalManualPassenger").click
  @driver.find_element(:name, "totalManualPassenger").clear
  @driver.find_element(:name, "totalManualPassenger").send_keys "2"
  @driver.find_element(:id, "madult").click
end

def Third_Action_Method
  Selenium::WebDriver::Support::Select.new(@driver.find_element(:id, "madult")).select_by(:text, "2")
  @driver.find_element(:id, "sumManualPassenger").click
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Denver Intl Arpt (DEN)'])[1]/following::button[1]").click
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='×'])[2]/following::img[1]").click
  @driver.find_element(:css, "button.e1mwfyk10.lc-11466y2.e1m5b1js0 > svg.lc-1mpchac").click
  @driver.find_element(:id, "name").click
  @driver.find_element(:id, "name").clear
end

def Fourth_Action_Method
  @driver.find_element(:id, "name").send_keys "Selenium"
  @driver.find_element(:id, "surname").clear
  @driver.find_element(:id, "surname").send_keys "User"
  @driver.find_element(:id, "email").clear
  @driver.find_element(:id, "email").send_keys "selenium@user.com"
  @driver.find_element(:id, "phone").clear
  @driver.find_element(:id, "phone").send_keys "1234567890"
  @driver.find_element(:id, "birthday").clear
  @driver.find_element(:id, "birthday").send_keys "1990-01-01"
  @driver.find_element(:id, "cardno").clear
  @driver.find_element(:id, "cardno").send_keys "12345678901234567890"
  @driver.find_element(:id, "expiration").clear
  @driver.find_element(:id, "expiration").send_keys "2022-01-01"
  @driver.find_element(:id, "s2id_autogen1").clear
  @driver.find_element(:id, "s2id_autogen1").send_keys "i"
  Selenium::WebDriver::Support::Select.new(@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Title:'])[2]/following::select[1]")).select_by(:text, "Ms.")
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Name:'])[2]/following::input[1]").clear
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Name:'])[2]/following::input[1]").send_keys "Selenium"
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Surname:'])[2]/following::input[1]").clear
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Surname:'])[2]/following::input[1]").send_keys "Manager"
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Email:'])[2]/following::input[1]").clear
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Email:'])[2]/following::input[1]").send_keys "selenium@manager.com"
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Phone:'])[2]/following::input[1]").clear
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Phone:'])[2]/following::input[1]").send_keys "9876543210"
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Birthday:'])[2]/following::input[1]").clear
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Birthday:'])[2]/following::input[1]").send_keys "1970-01-01"
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Card Number:'])[2]/following::input[1]").clear
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Card Number:'])[2]/following::input[1]").send_keys "9876543210987654321"
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Expiration:'])[2]/following::input[1]").clear
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Expiration:'])[2]/following::input[1]").send_keys "2099-01-01"
  @driver.find_element(:id, "s2id_autogen2").clear
  @driver.find_element(:id, "s2id_autogen2").send_keys "u"
  @driver.find_element(:id, "cardtype").click
  Selenium::WebDriver::Support::Select.new(@driver.find_element(:id, "cardtype")).select_by(:text, "Visa")
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Card Type'])[1]/following::option[5]").click
  @driver.find_element(:id, "card-number").click
  @driver.find_element(:id, "card-number").clear
  @driver.find_element(:id, "card-number").send_keys "1234567890123456"
  @driver.find_element(:id, "expiry-month").click
  Selenium::WebDriver::Support::Select.new(@driver.find_element(:id, "expiry-month")).select_by(:text, "July (07)")
  @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Expiration Date'])[1]/following::option[8]").click
  @driver.find_element(:id, "expiry-year").click
  @driver.find_element(:id, "expiry-year").click
  Selenium::WebDriver::Support::Select.new(@driver.find_element(:id, "expiry-year")).select_by(:text, "2026")
  @driver.find_element(:id, "cvv").clear
  @driver.find_element(:id, "cvv").send_keys "1234567890"
  @driver.find_element(:xpath, "//body").click
  @driver.find_element(:xpath, "//body").click
end

describe "PHPTravels" do

  before(:each) do
    puts("before")
    @driver = Selenium::WebDriver.for :firefox
    @accept_next_alert = true
    @driver.manage.timeouts.implicit_wait = 30
    @verification_errors = []
  end
  
  after(:each) do
    puts("after")
    @driver.quit
    @verification_errors.should == []
  end
  
  it "test_p_h_p_travels" do
    puts("before FAM")
    First_action_Method
    Second_Action_Method
    Third_Action_Method
    Fourth_Action_Method
    puts("after FAM")
    @driver.close
  end



  
end
