Feature: User is able to get the data from database by phone
@GetbyPhoneMethod
Scenario: user should be able to get data from database by phone
Given User Want to get  Data from database 
When User is able to get data by phone from URI "http://localhost:8080/admins/phone?phone=9987543219"
Then User should get Status Code 200