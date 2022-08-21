Feature: Google Search

  @GoogleSearchCat
  Scenario Outline: Search cats
    Given I have Google Search url
    When I fill "<Search>" field
    And I press enter key
    Then I see many little cats and "<Search>" in search head

    Examples:
      | Search    |
      | Gato azul |