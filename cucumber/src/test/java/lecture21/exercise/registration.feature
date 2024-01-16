Feature: User registration

  As a potential user, I should be able to create an account so
  that I can access the system's features

  Background:
    Given the user is on the login page
    And the user clicks the Register button

  Scenario: Successful registration
   # When I enter the username "Gosho"
   # And I enter the email "gosho@abv.bg"
    #And I enter the password "Secret123"
    #And I re-enter the password "Secret123"
    When the user fills the register fields with data:
    |Username|Email       |Password |Confirm Password|
    |Gosho   |gosho@abv.bg|Secret123|Secret123       |
    And I click the Sign in button
    Then a popup with text "Successful register!" is displayed
    And the user lands on homepage
    And the "Profile" tab is displayed

  Scenario Outline: Unsuccessful registration - invalid email
    When the user fills the register fields with data:
      |Username     |Email       |Password  |Confirm Password  |
      |<username>   |<email>     |<password>|<confirm_password>|
    And I click the Sign in button
    Then a popup with text "Invalid email!" is displayed
    And the user stays at the Register page

    Examples:
      |username |email       |password |confirm_password|
      |Gosho2   |gosho@abv.bg|Secret123|Secret123       |
      |Gosho2   |goshoabv.bg |Secret123|Secret123       |
      |Gosho2   |gosh oabv.bg|Secret123|Secret123       |
