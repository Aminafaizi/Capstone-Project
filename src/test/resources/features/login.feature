@test1
Feature: User log in to Retail Website

Scenario: Retail Website login test
Given User is on Retail website 
When User click on MyAccount
And User click on Login option
And User enter username 'aminaf@gmail.com' and password '12345'
And User click on Login button
Then User should be logged in to MyAccount dashboard


Scenario Outline: Retail Website Login test with Multiple accounts
Given User is on Retail Website
When User click on MyAccount
And User click on Login option
And User Enter UserName '<username>' and password '<password>'
And User click on Login button
Then User should be logged in to Myaccount dashboard

Examples:
|username|password|
|aminaf@gmail.com|12345|
