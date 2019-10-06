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
    @driver.get "https://docs.google.com/forms/d/e/1FAIpQLSdPjNwlIuToBeVnTPIIRhg2_8t5HX-o0PwaSIvSeUmFr1KasA/viewform"
    #windowhandleslist
    @driver.save_screenshot 'Ch_7_Prog_11_Ruby_Form_Prefill.png'
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Selenium Test User - Form Data Collection'])[1]/following::div[4]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Choice 1'])[1]/following::div[7]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Option 1'])[1]/following::div[6]").click
    @driver.find_element(:name, "entry.1621524406").click
    @driver.find_element(:name, "entry.1621524406").clear
    @driver.find_element(:name, "entry.1621524406").send_keys "Test"
    @driver.find_element(:name, "entry.420674755").click
    @driver.find_element(:name, "entry.420674755").clear
    @driver.find_element(:name, "entry.420674755").send_keys "Tested Again and Again... and Again... and Again... How many times does a test gets Tested Again and Again... and Again... and Again... How many times does a test gets Tested Again and Again... and Again... and Again... How many times does a test gets Tested Again and Again... and Again... and Again... How many times does a test gets Tested Again and Again... and Again... and Again... How many times does a test"
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Choose A Drop Down'])[1]/following::div[4]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Option 1'])[3]/following::span[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Choose a Scale'])[1]/following::div[54]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Row 1'])[1]/following::div[6]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Row 2'])[1]/following::div[13]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Row 3'])[1]/following::div[20]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Row 4'])[1]/following::div[27]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Row 1'])[3]/following::div[4]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Row 1'])[3]/following::div[20]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Row 2'])[3]/following::div[12]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Row 2'])[3]/following::div[28]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Row 3'])[3]/following::div[4]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Row 3'])[3]/following::div[28]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Row 4'])[3]/following::div[12]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Row 4'])[3]/following::div[20]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::input[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::input[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::input[1]").clear
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::input[1]").send_keys "10-10-2019"
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Time'])[1]/following::input[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Time'])[1]/following::input[1]").clear
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Time'])[1]/following::input[1]").send_keys "12"
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)=':'])[1]/following::input[1]").clear
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)=':'])[1]/following::input[1]").send_keys "34"
    @driver.save_screenshot 'Ch_7_Prog_11_Ruby_Form_Postfill.png'
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)=':'])[1]/following::span[1]").click
    puts @driver.title
    @driver.save_screenshot 'Ch_7_Prog_11_Ruby_Form_Submit_Confirmation.png'
    @driver.close
end

def windowhandleslist
    @driver.window_handles.each do |windowhandle|
    puts(windowhandle)
    @driver.switch_to.window windowhandle
end
    
end 