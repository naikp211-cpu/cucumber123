Feature: perform put method

Scenario: User should be able to update data into the database
Given User wants to put data into database
When User is able to put the data into URI "http://localhost:8080/admins"
Then User should be able to get the statusCode 200