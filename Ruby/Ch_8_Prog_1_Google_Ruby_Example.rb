require 'rubygems'
require 'selenium-webdriver'

driver = Selenium::WebDriver.for :firefox
driver.get "http://google.com"

element = driver.find_element :name => "q"
element.send_keys "Selenium"
element.submit

puts "Page title is #{driver.title}"

wait = Selenium::WebDriver::Wait.new(:timeout => 10)
wait.until { driver.title.downcase.start_with? "selenium" }

puts "Page title is #{driver.title}"

# Now set the cookie. Here's one for the entire domain
# the cookie name here is 'key' and its value is 'value'
driver.manage.add_cookie(:name => 'key', :value => 'value')
# additional keys that can be passed in are:
# :path => String, :secure -> Boolean, :expires -> Time, DateTime, or seconds since epoch

puts("Before delete cookies")
# And now output all the available cookies for the current URL

driver.manage.all_cookies.each { |cookie|
  puts "#{cookie[:name]} => #{cookie[:value]}"
}

# You can delete cookies in 2 ways
# By name
driver.manage.delete_cookie "key"
# Or all of them
driver.manage.delete_all_cookies
puts("After delete cookies")

driver.manage.all_cookies.each { |cookie|
  puts "#{cookie[:name]} => #{cookie[:value]}"
}

puts("End of Program")

puts("Checking Wait in Ruby")

wait = Selenium::WebDriver::Wait.new(:timeout => 3) # seconds

driver.get "https://edition.cnn.com"

begin
  element = wait.until { driver.find_element(:name => "videos") }
  driver.save_screenshot("Cnn.png")
ensure
  driver.close
end

puts("End of PRogram")

#driver.quit
