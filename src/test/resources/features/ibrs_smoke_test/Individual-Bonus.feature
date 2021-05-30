# Author: pheto.malope@momentum.co.za
Feature: Individual bonus

  Scenario:
    Given the user administration page is displayed
    When the user clicks on the "<instance name>" link on the nav bar
    And the user clicks on the "Management" dropdown list on the side bar
    And the user clicks on the "Monthly Cost Summary" link on the dropdown list
    And the user clicks on the "search" button on the "User Search" form
    And the user clicks on the "Production credits" column on the first record from the table
    And the user clicks on the "Sub total" link on the "IBRS statement"
    Then the data-set in "Bonus category" should not be a negative

  Scenario:
    Given "Bonus category" does not have a negative number
    When "the user clicks on the "Raning" column from the table"
    Then "the calculated rating from the "Satisfied clients leave rate" componet should match the one from the "IBRS statement""

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