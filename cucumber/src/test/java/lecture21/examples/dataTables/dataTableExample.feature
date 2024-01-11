Feature: Shopping Cart

  Scenario: User adds multiple items to the cart
    Given a user is logged in
    When the user adds the following items to the cart:
      | Item       | Quantity |
      | Product A  | 2        |
      | Product B  | 1        |
      | Product C  | 3        |
    Then the cart should contain the following items:
      | Item       | Quantity |
      | Product A  | 2        |
      | Product B  | 1        |
      | Product C  | 3        |
