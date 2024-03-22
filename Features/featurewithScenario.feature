Feature: Hotel App Login
@SmokeTest 
Scenario: Login Successful
Given I am on Hotel App Login page
When I enter username as "vasuvespag" 
And I enter password as "vasu1234"
And I click login
Then I am logged in successfully

@E2ETest 
Scenario: Select location
Given I am on Hotel App Login page
When I enter username as "vasuvespag" 
And I enter password as "vasu1234"
And I click login
And I am logged in successfully
And I select location as "Sydney"
And Click on the search button
Then I can see the hotel