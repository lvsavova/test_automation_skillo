Feature: User search

  Scenario: User searches for different products
    Given the user is on the search page
    When the user enters "headphones" in the search bar
    And the user clicks the search button
    Then the user should see a list of "headphones"

    Given the user is on the search page
    When the user enters "smartphones" in the search bar
    And the user clicks the search button
    Then the user should see a list of "smartphones"

    Given the user is on the search page
    When the user enters "laptops" in the search bar
    And the user clicks the search button
    Then the user should see a list of "laptops"




