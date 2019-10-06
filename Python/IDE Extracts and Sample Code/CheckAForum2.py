# -*- coding: utf-8 -*-
"""
Created on Sun Jul 28 20:44:51 2019

@author: rahma
"""

from selenium import webdriver
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.support.ui import WebDriverWait # available since 2.4.0
from selenium.webdriver.support import expected_conditions as EC # available since 2.26.0
import pandas as pd

# Create a new instance of the Firefox driver
##driver = webdriver.Firefox()

driver = webdriver.Chrome(executable_path ="C:\\Users\\rahma\\OneDrive\\Desktop\\Selenium\\chromedriver.exe")

final_comments = []

for kk in range(699, 710):
    page_to_load='https://forums.edmunds.com/discussion/2864/general/x/entry-level-luxury-performance-sedans/p'
    print("We're on time ::: ", (kk+1))
    if kk > 0: 
        print(page_to_load + str(kk))
        page_to_load = page_to_load + str(kk)
    else:
        page_to_load='https://forums.edmunds.com/discussion/2864/general/x/entry-level-luxury-performance-sedans'
    driver.get(page_to_load)

    comments = pd.DataFrame(columns = ['Date','user_id','post']) 
    ids = driver.find_elements_by_xpath("//*[contains(@id,'post')]")
    
    comment_ids = [] 
    for i in ids:
        comment_ids.append(i.get_attribute('id'))

    for x in comment_ids:
        #Extract dates from for each user on a page
        user_date = driver.find_elements_by_xpath('//*[@id="' + x +'"]/div/div[2]/div[2]/span[1]/a/time')[0]
        date = user_date.get_attribute('title')

        #Extract user ids from each user on a page
        userid_element = driver.find_elements_by_xpath('//*[@id="' + x +'"]/div/div[2]/div[1]/span[1]/a[2]')[0]
        userid = userid_element.text

        #Extract Message for each user on a page
        user_message = driver.find_elements_by_xpath('//*[@id="' + x +'"]/div/div[3]/div/div[1]')[0]
        comment = user_message.text
                                       
        #Adding date, userid and comment for each user in a dataframe    
        comments.loc[len(comments)] = [date,userid,comment]
    print(comments)
    final_comments.append(comments)

print(final_comments)