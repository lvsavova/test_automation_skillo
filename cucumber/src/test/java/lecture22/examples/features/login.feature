Feature: Login

  Scenario: User logs in with valid credentials
    Given the user is on the login page
    When the user enters username "valid_username" and password "password"
    And the user clicks the login button
    Then the user should be redirected to the dashboard
    And the user should see a welcome message
