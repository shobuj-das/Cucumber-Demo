Feature: Login feature

Scenario:
  Given User should be on the login page
  When user enter valid username and password
  And user click on login button
  Then User should be navigated to the homepage
  But User should not be on the login page

Scenario:
  Given User should be on the login page
  When user enter invalid password
  And user click on login button
  Then User should not be logged

Scenario:
  Given User should be on the login page
  When User enter "tttwrong@gmail.com" on the username field
  And User enter "shobuj123" on the password filed
  And user click on login button
  Then User should see "Your email or password is incorrect!"

