Feature: User is able to get the data from database by Id
@GetbyIdMethod
Scenario: user should be able to get data from database by Id
Given User Want to get the Data from database 
When User is able to get data by id from URI "http://localhost:8080/admins/id/33"
Then User want to get Status Code 200