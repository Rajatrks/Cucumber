Feature: OrangeHrm Login Feature

#Scenario: Verify login is successfull with valid credential
#
#Given user is present on login page
#When title of the page is OrangeHRM
#Then user enter "Admin" and "admin123"
#Then user ckick on login button
#Then user moves to the homepage
#And close the browser

Scenario: Verify login is successfull with valid credential

Given user is present on login page
When title of the page is OrangeHRM
Then user enter username and password
  |Admin|admin123|
And user ckick on login button
And user moves to the homepage
And close the browser

#Scenario Outline: Verify login is successfull with valid credential
#
#Given user is present on login page
#When title of the page is OrangeHRM
#Then user enter "<username>" and "<password>"
#And user ckick on login button
#And user moves to the homepage
#And close the browser
#
#Examples:
#  
#    | username | password  |
#  	| Admin    |  admin123 |
#	  | brown    | qtp123    | 