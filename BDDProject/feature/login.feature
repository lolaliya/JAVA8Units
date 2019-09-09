Feature: Login feature

Scenario: Login with valid credentials

Given User is on login page
When User enter valid username and valid password
And click on login button
Then an error message should be displayed