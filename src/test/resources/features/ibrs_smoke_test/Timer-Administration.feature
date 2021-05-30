# Author: pheto.malope@momentum.co.za
Feature: Timer Administration
  The execution status should display completed, given that
  the timer is enabled and active.

  Scenario: The user navigates to the Timer Administration page
    Given the user administration page is displayed
    When the user clicks on the "<instance name>" link on the nav bar
    And the user clicks on the "IBRS Admin" dropdown list on the side bar
    And the user clicks on the "Timer Administration" link on the dropdown list
    Then a table with timer details should be displayed

  Scenario: The timer is active and enabled
    Given a table with timer details is displayed
    When the user clicks on "<Timer>" record
    Then the status should show completed
    And the timer should be active
    And the timer should be enabled

  Scenario: The timer logs
    Given the status is showing completed
    When the user clicks on "Timer Execution Logs" button
    Then the execution status should be completed

  """
    Review:
      * Feature description
      * Scenario description
      * Step definitions
    Add:
      * Scenario outline
   Notes:
      * Validate timers that are enabled and active
    Questions:
      * Do I need a separate file to check timers that are enabled but status is cancelled?
      * Do I stop the test execution if one timer failed?
      * Should I re-run the timer?
  """