# Author: pheto.malope@momentum.co.za
# Monthly cost summary
Feature: Production Credits
  Performance pay should match the sum of production bonus, satisfied clients
  personal pride and out performance bonus.

  Scenario:
    Given the user administration page is displayed
    When the user clicks on the "<instance name>" link on the nav bar
    And the user clicks on the "Management" dropdown list on the side bar
    And the user clicks on the "Monthly Cost Summary" link on the dropdown list
    And the user clicks on the "search" button on the "User Search" form
    And the user clicks on the "Production credits" column on the first record from the table
    Then the sum of Production Bonus, satisfied clients and personal pride should Performation pay

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