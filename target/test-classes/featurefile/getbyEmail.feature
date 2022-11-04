Feature: User is able to get the Email by giving Email
Scenario: User should be able to get Email from database
Given User should be able to get Email
When User should be able to provide email by URI "http://localhost:8080/admins/naikps@gmail.com"
Then User should validate the statusCode 200 