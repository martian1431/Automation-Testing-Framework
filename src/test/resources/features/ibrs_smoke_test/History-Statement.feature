# Author: pheto.malope@momentum.co.za
Feature: History Statement
  The data-set should be consistent

  Scenario:
    Given the user administration page is displayed
    When the user clicks on the "<instance name>" link on the nav bar
    And the user clicks on the "Management" dropdown list on the side bar
    And the user clicks on the "Monthly Cost Summary" link on the dropdown list
    And the user clicks on the "search" button on the "User Search" form
    And the user clicks on the "Production credits" column on the first record from the table
    And the user clicks on the "Statement ID" on the "IBRS statement"
    Then the "Total Bonus", "Nett Payment" values should be consistent

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