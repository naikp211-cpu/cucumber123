Feature: User is able to get the data from database by phoneId
@GetbyPhoneNMethod
Scenario: user should be able to get data from database by phoneId
Given User Want to get  Data from database by phone
When User is able to get data by phoneID from URI "http://localhost:8080/admins/phone/9491283607?password=pavn55"
Then User should get a Status Code 200