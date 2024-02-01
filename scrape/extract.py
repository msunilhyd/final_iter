from requests import get
from bs4 import BeautifulSoup
from lxml import html
import datetime

#target site
url = "https://www.goal.com/en-in/team/real-madrid/fixtures-results/"

#get data from site
response = get(url)

#print status code
print(response.status_code)

#get raw html data
tree = html.fromstring(response.content)

#get the dates
dates = tree.xpath("//a[@class='match-main-data-link']/div/span[not(text())]/../time")
dates = [date.get('datetime') for date in dates]

#get the teams
teams = tree.xpath("//a[@class='match-main-data-link']/div/span[not(text())]/../../div/div/div/span[@class='team-name']")
teams = [team.text for team in teams]

print(dates)
print(teams)