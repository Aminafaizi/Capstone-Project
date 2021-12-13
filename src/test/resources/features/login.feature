
Feature: User log in to Retail Website

Scenario: Retail Website login test
Given User is on Retail website 
When User click on MyAccount
And User click on Login option
And User enter username 'AF@gmail.com' and Password 'test12'
And User click on Login button
Then User should be logged in to MyAccount dashboard


Scenario Outline: Retail Website Login test with Multiple accounts
Given User is on Retail Website
When User click on Myaccount
And User click on Login option
And User Enter UserName '<username>' and Password '<password>'
And User Click on login Button
Then User should be logged in to Myaccount dashboard

Examples:
|username|password|
|AF@gmail.com|test12|
|account2|123|
|account3|1234|