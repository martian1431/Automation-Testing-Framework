Feature: Google Search

  @regression
  Scenario: Open google and search for something that interests you.

    Given Google Chrome is launched
    When I search for "QA Engineering"
    Then Results should be displayed