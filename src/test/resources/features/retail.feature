
Feature: For this feature you have to have an existing account


Background:

Given User is on Retail website 
When User click on MyAccount
And User click on Login option
And User enter username 'test11@gmail.com' and password 'test'
And User click on Login button
Then User should be logged in to MyAccount dashboard

Scenario Outline: Register as an Affiliate user with Cheque Payment Method
When User click on Register for an Affiliate Account link 
And User fill affiliate form with below information '<company>' '<website>' '<taxID>' '<paymentMethod>'
And User fill check detail
And User check on About us check box 
And User click on Continue button 
Then User should see a success message 

Examples:
|company|website|taxID|paymentMethod|
|Amazon|www.amazon.com|0002222|check|


Scenario Outline: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on Edit your affiliate informationlink 
And user click on Bank Transfer radio button
And User fill Bank information with below information '<bankName>' '<abaNumber>' '<swiftCode>' '<accountName>' '<accountNumber>'
And User click on Continue button for Edit
Then User should see a success message Continue 

Examples:
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|BOFA|8888777|swiftCode|accountName|accountNumber|


Scenario Outline: Edit your account Information 
When User click on Edit your account information link 
And User modify below information '<firstname>' '<lastName>' '<email>' '<telephone>'
And User click on continue button Edit Button
Then User should see a message Success: Your account has been successfully updated


Examples:
|firstname|lastName|email|telephone|
|Jawad|Ahmadi|test11@gmail.com|571245554|


