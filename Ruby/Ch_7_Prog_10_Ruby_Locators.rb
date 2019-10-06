#Selenium WebDriver Commands in Ruby for Switching Windows 
driver.switch_to.window("windowName")

#Selenium WebDriver Commands in Ruby for Navigating all window handles 
driver.window_handles.each do |windowhandle|
    driver.switch_to.window windowhandle
end

#Selenium WebDriver Commands in Ruby for Switching Frames 
driver.switch_to.frame "BrowserFrameName"


alert = driver.switch_to.alert

alert.accept
alert.dismiss
alert.text
alert.send_keys "Key.ENTER"
puts(alert.text)


@driver.navigate.to "http://www.bpbonline.com"
@driver.navigate.forward
@driver.navigate.back

#identfiy the source and destination web elements
sourcewebweblocatorelement = @driver.find_element(:name => 'source_web_element')
targetwebweblocatorelement = @driver.find_element(:name => 'target_web_element')

#Drag the Source element to Target
@driver.action.drag_and_drop(sourcewebelement, targetwebelement).perform

#Drag the Source element to Target in action - We can use more than one web element
@driver.action.key_down(:shift).
              click(firstwebelement).
              click(secondwebelement).
              key_up(:shift).
              drag_and_drop(targetwebelement, thirdwebelement).
              perform


#Selenium Locators 
# We can search based on the following Parameters
  class: 'class name',
  class_name: 'class name',
  css: 'css selector',
  id: 'id',
  link: 'link text',
  link_text: 'link text',
  name: 'name',
  partial_link_text: 'partial link text',
  tag_name: 'tag name',
  xpath: 'xpath'

#Getting values through various locators 
find_element - Get the first matching element based on Parameters passed
find_elements - Get list of elements matching the parameters passed 

#Locator by ID
# <input id="crackseleniuminterview">...</input>
weblocatorelement = driver.find_element(:id, "crackseleniuminterview")

#Locator By Class Name
# <div class="selenium-ruby" style="display: none; ">...</div>
weblocatorelement = driver.find_element(:class, 'selenium-ruby')
weblocatorelement driver.find_element(:class_name, 'selenium-ruby')

#locator by Tag Name
# <div class="selenium-ruby" style="display: none; ">...</div>
weblocatorelement = driver.find_element(:tag_name, 'div')

#locator by Name
# <input id="reviewer" name='reviewer' type='text'>…</input>
weblocatorelement = driver.find_element(:name, 'reviewer')

#locator by Link Text
# <a href="https://bpbonline.com/search?q=C">C</a>
weblocatorelement = driver.find_element(:link, 'C')
weblocatorelement = driver.find_element(:link_text, 'C')


#locator by Partial Link Text
#<a href="/products/web-applications-using-jsp?_pos=1&amp;_sid=d16c8f49a&amp;_ss=r" style="font-family: &quot;SF Pro Display&quot;,&quot;SF Pro Icons&quot;,&quot;Helvetica Neue&quot;,&quot;Helvetica&quot;,&quot;Arial&quot;,sans-serif;
# font-size:14px;text-align:center;color:#555;">Web Applications Using JSP</a>
weblocatorelement = driver.find_element(:partial_link_text, 'JSP')

#locator by XPATH
#<span>Home</span>
#XPATH = //*[@id="page-body"]/header/div[3]/div/div/div/div/nav/div/ul/li[1]/a/span
weblocatorelement = driver.find_element(:xpath, '//*[@id="page-body"]/header/div[3]/div/div/div/div/nav/div/ul/li[1]/a/span')

#locator by CSS
#https://www.w3.org/Style/CSS/ 
#CSS Selector = "a[href*='TR/CSS/'] > cite"
weblocatorelement = driver.find_element(:css, a[href*='TR/CSS/'] > cite)



#RUBY WEB ELEMENT OPERATIONS 
#Handling a Button CLick
@driver.find_element(:id, web_id_element_for_button).click
#e.g
@driver.find_element(:id, 'SUBMIT').click

# Filling a Text Box
@driver.find_element(:id, web_id_element_for_a_text_box).send_keys 'Text Inputs'

# Check Box Examples for checking if it is selected, clicking a check box and clearing the same.
@driver.find_element(:id, web_id_element_for_a_checkbox).selected?
@driver.find_element(:id, web_id_element_for_a_checkbox).click
@driver.find_element(:id, web_id_element_for_a_checkbox).clear

# Selecting an element	
elementselect = @driver.find_element(:tag_name, "elementselect")
all_options_in_select = elementselect.find_elements(:tag_name, "option")
all_options_in_select.each do |options|
 puts "Value is: " + options.attribute("value")
 options.click
end

#Checking if this is displayed?
driver.find_element(:id,'webelementtocheck').displayed?

#getting element's text
driver.find_element(:id,'webelementtocheck').text

#getting element's attributes
driver.find_element(:id,'webelementtocheck').attribute('webelementclass')

