require "json"
require "selenium-webdriver"
require "rspec"
include RSpec::Expectations

describe "BPBOnline" do

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
  
  it "test_b_p_b_online" do
    @driver.get "https://bpbonline.com/"
    @driver.find_element(:id, "bc-product-search").click
    @driver.find_element(:id, "bc-product-search").clear
    @driver.find_element(:id, "bc-product-search").send_keys "C"
    @driver.find_element(:id, "bc-product-search").send_keys :enter
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Add to cart'])[10]/following::img[1]").click
    @driver.close
  end
  
  def element_present?(how, what)
    ${receiver}.find_element(how, what)
    true
  rescue Selenium::WebDriver::Error::NoSuchElementError
    false
  end
  
  def alert_present?()
    ${receiver}.switch_to.alert
    true
  rescue Selenium::WebDriver::Error::NoAlertPresentError
    false
  end
  
  def verify(&blk)
    yield
  rescue ExpectationNotMetError => ex
    @verification_errors << ex
  end
  
  def close_alert_and_get_its_text(how, what)
    alert = ${receiver}.switch_to().alert()
    alert_text = alert.text
    if (@accept_next_alert) then
      alert.accept()
    else
      alert.dismiss()
    end
    alert_text
  ensure
    @accept_next_alert = true
  end
end
