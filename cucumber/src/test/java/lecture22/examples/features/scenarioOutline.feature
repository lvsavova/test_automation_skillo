Feature: Scenario Outline

  Scenario Outline: Adding items to the shopping cart
    When I add item "<item>" to the cart <count> times
    Then the cart should contain "<item>" <count> times

    Examples:
      | item       |count|
      | Product A  |4    |
      | Product B  |2    |
      | Product C  |1    |
