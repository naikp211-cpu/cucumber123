Feature: delete the data in the database with the id
Scenario: User should be able to delete data
Given User can delete the data by using email
When User gives the path to delete the data "http://localhost:8080/admins/2"
Then User gets the statusCode 200