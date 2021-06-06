Feature: Login feature

  @Guru99_Regression
  Scenario: Login with valid credentials
    Given The login page is loaded
    When User enters a userID "mngr329063"
    And User enters a password "gazYvYr"
    And User clicks the login button
    Then User is redirected to "HomePage"

#  Scenario: Login with invalid credential

# Url = http://demo.guru99.com/V4/index.php
# UserID = mngr329063
# Password = gazYvYr
