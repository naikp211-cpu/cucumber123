Feature: User is able to get the data from database
@GetbyEPMethod
Scenario: user should be able to get data from database
Given User Want to get Data from database 
When User is able to get data from URI "http://localhost:8080/admins/email/string23@gmail.com ?password=string345"
Then User want to get the Status Code 200