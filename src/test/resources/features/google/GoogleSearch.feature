Feature: Google Search

  @regression
  Scenario: Open google and search for something that interests you.

    Given Google Chrome is launched
    When User types "QA Engineering" into the search box
    And User press enter button
    Then Results should be displayed