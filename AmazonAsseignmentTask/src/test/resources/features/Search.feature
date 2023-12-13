
@smoke
Feature: Search functionality

Scenario: User searches for a valid product
Given User opens the Application
When User enters valid product "Iphone" into Search box field
And User clicks on iphone button
And User go to product details page
Then User click On the Iphone
And User added the product in the add to cart
And User click on the Go To cart
Then User should validate the product is displayed or not in add to cart
Then user Close the application
