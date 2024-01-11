Feature: User Authentication

  Scenario: User logs in with valid credentials
    Given the user is on the login page
    When the user enters username "valid_username" and password "password"
    And the user clicks the login button
    Then the user should be redirected to the dashboard
    And the user should see a welcome message
    But the user should not be able to access the admin panel

  Scenario: User logs in with invalid credentials
    Given the user is on the login page
    When the user enters username "invalid_username" and password "password"
    And the user clicks the login button
    Then an error message should be displayed
    And the user should remain on the login page


