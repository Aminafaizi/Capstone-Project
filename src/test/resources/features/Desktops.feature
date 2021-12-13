
Feature:  Desktops 


Background:
Given User is on Retail website
When user click on Desktops tab 
And user click on Show all desktops 

Scenario: user verify all items are present in Desktops tab
Then user should see all items are present in Desktop page

Scenario: user add HP LP 3065  from Desktops tab to the cart
And user click  ADD TO CART option on HP LP3065 item 
And user select quantity (1)
And user click add to Cart button 
Then user should see a message Success: you have added HP LP 3065 to your Shopping cart!
 
Scenario: user add Canon EOS 5D from Desktops tab to the cart
And user click  ADD TO CART option on Canon EOS 5D item 
And user select color from droppdown Red
And user select quantity (1)
And user click add to Cart button 
Then user should see a message Success: You have added Canon EOS 5D to your shopping cart!
 
Scenario: user add a review to Canon EOS 5D item in Desktops tab
And user click on Canon EOS 5D item 
And user click on write a review link 
And user fill the review information with below information '<yourname>' '<yourReview>' '<Rating>'
And user click on Continue Button 
Then user should see a message with Thank you for your review. It has been submitted to the webmaster for approval


Examples: 
|yourname| yourReview| Rating|
|Saad|Not Bad WebSite for shopping Tech stuff to you or your family|Good|

