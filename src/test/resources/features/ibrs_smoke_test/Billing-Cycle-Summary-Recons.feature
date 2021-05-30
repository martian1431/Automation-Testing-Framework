# Author: pheto.malope@momentum.co.za
Feature: Daily Cost Summary
  Check if movement data is balancing

  Scenario:
    Given the dashboard page is displayed
    When the user clicks on the "<instance name>" link on the nav bar
    And the user clicks on "Fin Admin" on dropdown list
    And the user clicks on the "Work Type" link on the dropdown list
    And the user clicks on the "Billing Cycle Summary Recon" link
    Then the "number of movements" should balance

  """
    Review:
      * Feature description
      * Scenario description
    Add:
      *
      *
   Notes:
      *
  """