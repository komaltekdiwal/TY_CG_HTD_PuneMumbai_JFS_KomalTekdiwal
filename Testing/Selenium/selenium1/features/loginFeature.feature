Feature: Testing the login feature

#Background:
#Given the user has loaded the application in the browser
#When the user enters the valid username
#
#Scenario: Testing the login Feature with Valid Data
#And the user enters the valid password
#And the user clicks on the login button
#Then the dashboard page must be  displayed
#
#Scenario: Testing the login Feature with Invalid Data
#And the user enters the invalid password
#And the user clicks on the login button
#Then the user should be in the same page

Scenario: Testing the login Feature with Valid Data
Given the user has loaded the application in the browser
When the user enters the valid username
And the user enters the valid password
And the user clicks on the login button
Then the dashboard page must be  displayed