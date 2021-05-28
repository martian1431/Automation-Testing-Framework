Feature: Login Feature

  @IBRS_Wealth_Instance_Smoke_test
  Scenario: Login to IBRS Pre environment
    Given The browser is open and login page is loaded
    When I enter username "phmalope" and password "Welcome@2021"
    And I click on the login button
    Then I should be redirected to the Dashboard with a title "User Administration | Inside MMI"