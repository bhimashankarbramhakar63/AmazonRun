@sanity
Feature: filtered phones functionality

Scenario Outline: verify User filtered phones and validate list 
Given User opens the Application
When User enters <product> into Search field
And User clicks on phone button
And User go to the Featured Brands and click SAMSANG
Then User verify the filtered samsang list
Then user Close the application

Examples: 
|product|
|phone|
