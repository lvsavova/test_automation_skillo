Feature: Step expression

  Scenario: Step parameter types
    Given I have 5 cucumbers
    Given the price is 10.89348543534543545335453534
    When I add "apple" to the cart
    And I do some hiking
    Then the ID is abc123
    And the ID is "abc 123"

  Scenario: Optional text
    Given I have 1 cucumber in my belly
    When I have 1 cucumber in my belly
    And I have 42 cucumbers in my belly

  Scenario: Optional text 2
    Given I have a BMW
    And I have a BMW car

  Scenario: Alternative text
    Given I eat a fruit
    And I eat a vegetable
    And I eat a snack
    And I eat a buritto

  Scenario: Alternative text 2
    Given I do yoga
    And I do pilates

