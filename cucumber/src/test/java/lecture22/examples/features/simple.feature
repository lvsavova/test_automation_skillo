Feature: Eating apples

  Scenario: I ate apples
    Given there are 5 apples
    When I eat 3 of them
    Then I should have 2 apples left