Feature: User is able to post the data into database
@PostMethod
Scenario: user should be able to add data into database
Given User Want to post Data into database 
When User is able to put data into URI "http://localhost:8080/admins"
Then User want to check the StatusCode 200