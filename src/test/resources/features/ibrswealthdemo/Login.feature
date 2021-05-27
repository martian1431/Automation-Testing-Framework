Feature: Login Feature

  @IBRS_Wealth_Instance_Smoke_test
  Scenario: Login to IBRS Pre environment
    Given User is on the login page
    When User enters username "test" and password "test"
    And User clicks on the login button
    Then User should be redirected to the "Dashboard"