import time
import pandas as pd
from selenium import webdriver
from selenium.webdriver import Chrome
from selenium.webdriver.common.by import By

# Define the Chrome webdriver options
options = webdriver.ChromeOptions()
options.add_argument("--headless") # Set the Chrome webdriver to run in headless mode for scalabilty

# By default, Selenium waits for all resources to download before taking actions.
# However, we don't need it as the page is populated with dynamically generated JavaScript code
options.page_load_strategy = "none"

# Pass the defined options objects to initialize the webdriver
driver = Chrome(options=options)
# Set an implicit wait of 5 seconds to allow time for elements to appear before throwing an exception
driver.implicitly_wait(5)

url = "https://www.goal.com/en-us/fixtures/2023-12-09" 

driver.get(url)
time.sleep(20)

html = driver.page_source
with open('html.txt', 'wb+') as f:
  f.write(html)
  f.close

# content = driver.find_element(By.CSS_SELECTOR, "div[class*='e-14cjhfa'")

# breads = content.find_elements(By.TAG_NAME, "li")
