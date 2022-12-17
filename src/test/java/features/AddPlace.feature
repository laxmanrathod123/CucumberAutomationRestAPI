Feature: Validate the addPlace API's for the verified user

Scenario: Check the addPlace API is successfully added 

Given User add the payload
When User call  "addPlace" payload with http post request
Then User API call got sucess with status code 200
And "status" in response body is "OK"
And "scope" in response body is "APP"
