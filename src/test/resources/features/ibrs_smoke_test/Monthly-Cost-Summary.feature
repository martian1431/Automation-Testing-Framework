# Author: pheto.malope@momentum.co.za
Feature: Monthly Cost Summary

  #Performance pay should match the sum of production bonus, satisfied clients
  #personal pride and out performance bonus.
  Scenario: Production credits
    Given the user administration page is displayed
    When the user clicks on the "<instance name>" link on the nav bar
    And the user clicks on the "Management" dropdown list on the side bar
    And the user clicks on the "Monthly Cost Summary" link on the dropdown list
    And the user clicks on the "search" button on the "User Search" form
    And the user clicks on the "Production credits" column on the first record from the table
    Then the sum of Production Bonus, satisfied clients and personal pride should Performation pay

  # The data-set "total bonus" and "nett patment" should be consistent
  Scenario: History Statement
    Given the user administration page is displayed
    When the user clicks on the "<instance name>" link on the nav bar
    And the user clicks on the "Management" dropdown list on the side bar
    And the user clicks on the "Monthly Cost Summary" link on the dropdown list
    And the user clicks on the "search" button on the "User Search" form
    And the user clicks on the "Production credits" column on the first record from the table
    And the user clicks on the "Statement ID" on the "IBRS statement"
    Then the "Total Bonus", "Nett Payment" values should be consistent

  #
  Scenario: Individual bonus
    Given the user administration page is displayed
    When the user clicks on the "<instance name>" link on the nav bar
    And the user clicks on the "Management" dropdown list on the side bar
    And the user clicks on the "Monthly Cost Summary" link on the dropdown list
    And the user clicks on the "search" button on the "User Search" form
    And the user clicks on the "Production credits" column on the first record from the table
    And the user clicks on the "Sub total" link on the "IBRS statement"
    Then the data-set in "Bonus category" should not be a negative

  Scenario: Individual bonus
    Given "Bonus category" does not have a negative number
    When "the user clicks on the "Raning" column from the table"
    Then "the calculated rating from the "Satisfied clients leave rate" componet should match the one from the "IBRS statement""


  """
    Review:
      * Feature description
      * Scenario description
    Add:
      * Scenario: View Ranking
   Notes:
      * Do I need a separate file to check timers that are enabled but status is cancelled
    Questions:
      *
  """