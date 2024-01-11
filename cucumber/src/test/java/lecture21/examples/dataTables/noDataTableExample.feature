Feature: Shopping Cart

  Scenario: User adds multiple items to the cart
    Given a user is logged in
    When the user adds "Product A" to the cart with quantity 2
    And the user adds "Product B" to the cart with quantity 1
    And the user adds "Product C" to the cart with quantity 3
    Then the cart should contain "Product A" with quantity 2
    And the cart should contain "Product B" with quantity 1
    And the cart should contain "Product C" with quantity 3

