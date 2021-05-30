# Author: pheto.malope@momentum.co.za
Feature: Timer Administration

  Scenario:
    Given the "dashboard" page is displayed
    When the user clicks on the "<instance name>" link
    And the user clicks on the "IBRS Admin" dropdown menu
    And the user clicks on the "Timer Administration" link
    Then timers are will be shown on the "Timer Administration" page

  Scenario:
    Given the timers are shown on the "Timer Administration" page
    When the user clicks on "<Timer-name>" timer
    Then the status should show completed
    And the timer should be active
    And the timer should be enabled

  Scenario:
    Given the status is showing completed
    When the user clicks on "Timer Execution Logs" button
    Then the execution status should show completed

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