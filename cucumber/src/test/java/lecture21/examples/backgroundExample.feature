Feature: Online Shopping Checkout

  Background:
    Given a user is logged in
    And the user has items in the cart

  Scenario: User proceeds to checkout
    When the user goes to the checkout page
    Then the user should see the items in the cart

  Scenario: User applies a coupon during checkout
    When the user applies a valid coupon
    Then the total amount should be reduced

  Scenario: User selects payment method
    When the user chooses a credit card as the payment method
    Then the user should enter credit card details
