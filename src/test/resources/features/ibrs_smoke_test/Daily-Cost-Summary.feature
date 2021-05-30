# Author: pheto.malope@momentum.co.za
  Feature: Daily Cost Summary
    Verify that the points are pulling through

  Scenario: Filter summaries by current date
    Given the dashboard page is displayed
    When the user clicks on the "<instance name>" link on the nav bar
    And the user clicks on the "Management" dropdown list on the side bar
    And the user clicks on the "Daily Cost Summary" link on the dropdown list
    And the user enters the current date on the "Select Day" field on the "user search" form
    And the user clicks the search button
    Then the table column "Point as on" should show numbers


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
