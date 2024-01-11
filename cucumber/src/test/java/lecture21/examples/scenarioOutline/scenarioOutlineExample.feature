Feature: User search

  Scenario Outline: User searches for products with different search terms
    Given the user is on the search page
    When the user enters "<search_term>" in the search bar
    And the user clicks the search button
    Then the user should see a list of "<search_term>"

    Examples:
      | search_term |
      | headphones  |
      | smartphones |
      | laptops     |



