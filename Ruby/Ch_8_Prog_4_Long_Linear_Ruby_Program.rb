
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

@driver.get "http://newtours.demoaut.com/"
puts("Taking a @driver.save_screenshot ")
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")
@driver.find_element(:name, "userName").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='SIGN-ON'])[1]/following::td[1]").click
@driver.find_element(:link, "REGISTER").click
@driver.find_element(:name, "firstName").clear
@driver.find_element(:name, "firstName").send_keys "Selenium"
@driver.find_element(:name, "lastName").clear
@driver.find_element(:name, "lastName").send_keys "User"
@driver.find_element(:name, "phone").clear
@driver.find_element(:name, "phone").send_keys "1234567890"
@driver.find_element(:id, "userName").clear
@driver.find_element(:id, "userName").send_keys "sel@eni.um"
@driver.find_element(:name, "address1").clear
@driver.find_element(:name, "address1").send_keys "1234 5th avenue"
@driver.find_element(:name, "address2").clear
@driver.find_element(:name, "address2").send_keys "sixth street"
@driver.find_element(:name, "city").clear
@driver.find_element(:name, "city").send_keys "denver"
@driver.find_element(:name, "state").clear
@driver.find_element(:name, "state").send_keys "colorado"
@driver.find_element(:name, "postalCode").clear
@driver.find_element(:name, "postalCode").send_keys "80231"
@driver.find_element(:id, "email").clear
@driver.find_element(:id, "email").send_keys "seluser"
@driver.find_element(:name, "password").clear
@driver.find_element(:name, "password").send_keys "seluser"
@driver.find_element(:name, "confirmPassword").clear
@driver.find_element(:name, "confirmPassword").send_keys "seluser"
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

@driver.find_element(:name, "register").click
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

#@driver.find_element(:link, "SIGN-OFF").click
@driver.get "http://newtours.demoaut.com/mercurysignon.php"
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/preceding::td[3]").click
@driver.find_element(:name, "userName").click
@driver.find_element(:name, "userName").clear
@driver.find_element(:name, "userName").send_keys "sel"
@driver.find_element(:name, "userName").send_keys :down
@driver.find_element(:name, "userName").send_keys :down
@driver.find_element(:name, "userName").send_keys :tab
@driver.find_element(:name, "password").clear
@driver.find_element(:name, "password").send_keys "seluser"
@driver.find_element(:xpath, "//div").click
@driver.find_element(:name, "login").click
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

@driver.find_element(:name, "login").click
@driver.find_element(:link, "Home").click
@driver.find_element(:name, "userName").clear
@driver.find_element(:name, "userName").send_keys "seluser"
@driver.find_element(:name, "password").clear
@driver.find_element(:name, "password").send_keys "seluser"
@driver.find_element(:name, "login").click
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

@driver.find_element(:name, "login").click
@driver.find_element(:link, "Flights").click
#@driver.find_element(:name, "toDay").click
#@driver.find_element(:name, "toDay").click
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "toDay")).select_by(:text, "15")
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Returning:'])[1]/following::option[27]").click
@driver.find_element(:name, "findFlights").click
@driver.find_element(:name, "reserveFlights").click
@driver.find_element(:name, "passFirst0").click
@driver.find_element(:name, "passFirst0").clear
@driver.find_element(:name, "passFirst0").send_keys "Selenium"
@driver.find_element(:name, "passLast0").clear
@driver.find_element(:name, "passLast0").send_keys "User"
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.0.meal")).select_by(:text, "Bland")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.0.meal")).select_by(:text, "Diabetic")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.0.meal")).select_by(:text, "Hindu")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.0.meal")).select_by(:text, "Kosher")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.0.meal")).select_by(:text, "Low Calorie")
@driver.find_element(:name, "creditnumber").clear
@driver.find_element(:name, "creditnumber").send_keys "1234567890123456"
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_mn")).select_by(:text, "01")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_mn")).select_by(:text, "02")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_mn")).select_by(:text, "03")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2000")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2001")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2002")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2003")
(close_alert_and_get_its_text()).should == "You have entered 2003 as expiration year!"
@driver.find_element(:name, "cc_exp_dt_yr").click
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2010")
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Expiration:'])[1]/following::option[31]").click
@driver.find_element(:name, "cc_frst_name").click
@driver.find_element(:name, "cc_frst_name").clear
@driver.find_element(:name, "cc_frst_name").send_keys "Selenium"
@driver.find_element(:name, "cc_last_name").clear
@driver.find_element(:name, "cc_last_name").send_keys "User"
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='CONTACT'])[1]/following::table[3]").click
@driver.find_element(:name, "ticketLess").click
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

@driver.find_element(:name, "buyFlights").click
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='CONTACT'])[1]/following::img[3]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='$584 USD'])[1]/following::img[3]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Flights'])[1]/following::td[2]").click
@driver.find_element(:link, "Hotels").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='© 2005, Mercury Interactive (v. 011003-1.01-058)'])[1]/preceding::img[1]").click
@driver.find_element(:link, "Car Rentals").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='© 2005, Mercury Interactive (v. 011003-1.01-058)'])[1]/preceding::img[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Shipboard accomodations include: all meals, daily activities and nightly entertainment'])[1]/following::img[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Preferences'])[1]/following::font[3]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Preferences'])[1]/following::font[3]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='CONTACT'])[1]/following::table[3]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Preferences'])[1]/following::font[3]").click
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

@driver.find_element(:name, "findFlights").click
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

@driver.find_element(:name, "reserveFlights").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Cruises'])[1]/following::td[2]").click
@driver.find_element(:link, "Cruises").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='© 2005, Mercury Interactive (v. 011003-1.01-058)'])[1]/preceding::img[1]").click
@driver.find_element(:link, "Cruises").click
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Shipboard accomodations include: all meals, daily activities and nightly entertainment'])[1]/following::img[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Preferences'])[1]/following::font[3]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Preferences'])[1]/following::font[3]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Preferences'])[1]/following::td[2]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Airline:'])[1]/preceding::input[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Airline:'])[1]/preceding::input[2]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Airline:'])[1]/preceding::input[1]").click
@driver.find_element(:name, "passCount").click
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "passCount")).select_by(:text, "4")
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Passengers:'])[1]/following::option[4]").click
@driver.find_element(:name, "toDay").click
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "toDay")).select_by(:text, "19")
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Returning:'])[1]/following::option[31]").click
@driver.find_element(:name, "fromPort").click
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "fromPort")).select_by(:text, "New York")
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Passengers:'])[1]/following::option[8]").click
@driver.find_element(:name, "toPort").click
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "toPort")).select_by(:text, "Sydney")
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='On:'])[1]/following::option[52]").click
@driver.find_element(:name, "findFlights").click
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Unified Airlines 363'])[1]/preceding::td[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Unified Airlines 363'])[1]/preceding::td[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Unified Airlines 363'])[1]/preceding::td[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Unified Airlines 363'])[1]/preceding::input[1]").click
@driver.find_element(:name, "results").click
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Unified Airlines 633'])[1]/preceding::td[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Unified Airlines 633'])[1]/preceding::td[1]").click
@driver.find_element(:xpath, "//td").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Unified Airlines 633'])[1]/preceding::input[1]").click
@driver.find_element(:name, "reserveFlights").click
@driver.find_element(:name, "passFirst0").click
@driver.find_element(:name, "passFirst0").clear
@driver.find_element(:name, "passFirst0").send_keys "Selenium"
@driver.find_element(:name, "passLast0").clear
@driver.find_element(:name, "passLast0").send_keys "User"
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.0.meal")).select_by(:text, "Bland")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.0.meal")).select_by(:text, "Diabetic")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.0.meal")).select_by(:text, "Bland")
@driver.find_element(:name, "passFirst1").clear
@driver.find_element(:name, "passFirst1").send_keys "Sel"
@driver.find_element(:name, "passLast1").clear
@driver.find_element(:name, "passLast1").send_keys "U2"
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.1.meal")).select_by(:text, "Bland")
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Last Name:'])[2]/following::td[1]").click
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.1.meal")).select_by(:text, "Diabetic")
@driver.find_element(:name, "passFirst2").clear
@driver.find_element(:name, "passFirst2").send_keys "Sel"
@driver.find_element(:name, "passLast2").clear
@driver.find_element(:name, "passLast2").send_keys "U3"
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.2.meal")).select_by(:text, "Bland")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.2.meal")).select_by(:text, "Diabetic")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.2.meal")).select_by(:text, "Hindu")
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

@driver.find_element(:name, "passFirst3").clear
@driver.find_element(:name, "passFirst3").send_keys "Sel"
@driver.find_element(:name, "passLast3").clear
@driver.find_element(:name, "passLast3").send_keys "U4"
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.3.meal")).select_by(:text, "Bland")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.3.meal")).select_by(:text, "Diabetic")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.3.meal")).select_by(:text, "Hindu")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.3.meal")).select_by(:text, "Kosher")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.3.meal")).select_by(:text, "Low Calorie")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.2.meal")).select_by(:text, "Kosher")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.2.meal")).select_by(:text, "Low Calorie")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "pass.2.meal")).select_by(:text, "Low Cholesterol")
@driver.find_element(:name, "creditnumber").clear
@driver.find_element(:name, "creditnumber").send_keys "123"
@driver.find_element(:name, "creditnumber").send_keys :down
@driver.find_element(:name, "creditnumber").send_keys :down
@driver.find_element(:name, "creditnumber").send_keys :down
@driver.find_element(:name, "creditnumber").send_keys :tab
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_mn")).select_by(:text, "01")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2000")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2001")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2002")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2003")
(close_alert_and_get_its_text()).should == "You have entered 2003 as expiration year!"
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2004")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2005")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2006")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2007")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2008")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2009")
Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "cc_exp_dt_yr")).select_by(:text, "2010")
@driver.find_element(:name, "cc_frst_name").clear
@driver.find_element(:name, "cc_frst_name").send_keys "Selenium"
@driver.find_element(:name, "cc_last_name").clear
@driver.find_element(:name, "cc_last_name").send_keys "User"
@driver.find_element(:name, "ticketLess").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Delivery Address'])[1]/following::input[1]").click
@driver.find_element(:name, "buyFlights").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='CONTACT'])[1]/following::img[3]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Vacations'])[1]/following::u[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Vacations'])[1]/following::u[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Use Java Version'])[1]/following::img[1]").click
@driver.find_element(:link, "SUPPORT").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='CONTACT'])[1]/following::td[7]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Cruises'])[1]/following::td[2]").click
@driver.find_element(:xpath, "//td/table/tbody/tr/td/table/tbody/tr/td/table").click
@driver.find_element(:link, "Vacations").click
@driver.find_element(:xpath, "//td/table/tbody/tr/td/table/tbody/tr/td").click
@driver.save_screenshot("./#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png")

@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Vacations'])[1]/following::img[1]").click
@driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Use Java Version'])[1]/following::img[1]").click
@driver.close


