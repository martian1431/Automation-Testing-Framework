Feature: Login feature

  @Regression
  Scenario: Login with valid credentials
    Given The login page is loaded
    When User enters a userID "mngr329063"
    And User enters a password "gazYvYr"
    And User clicks the login button
    Then User is redirected to "Managerhomepage"

#  Scenario: Login with invalid credentials

# Url = http://demo.guru99.com/V4/index.php
# UserID = mngr329063
# Password = gazYvYr