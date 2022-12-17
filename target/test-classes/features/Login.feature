Feature: Application Login



Scenario: Home page default login
Given user is on NetBanking landing page
When user login into application with "wick" and "8499"
Then Home page is populated
And Cards are displayed


Scenario: Home page default login
Given user is on NetBanking landing page
When user login into application with "john" and "12452"
Then Home page is populated
And Cards are displayed 
