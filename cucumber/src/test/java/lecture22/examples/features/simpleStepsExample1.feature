Feature: Eating cucumbers

  Scenario: eating
    Given there are 8 cucumbers
    When I eat 3 cucumbers
    Then I should have 5 cucumbers

  Scenario: step expression
    Given I have 5 cucumbers and "five" apples