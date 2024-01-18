Feature: Login functionality

  Background:
    Given I open the iSkillo site
    And I navigate to "Login" page

  Scenario Outline: Successful Login with username or email
    When I enter username "<username_or_email>"
    When I enter password "<password>"
    And I click the Login button
    And I should see a popup with text "Successful login!"
    Then I should land on "Home" page
    Given I navigate to "Profile" page
    Then I see the username "<username>"
    Examples:
      |username_or_email       |password |  username     |
      |automation_user         |auto_pass|automation_user|
      |autouser@skillo.bg      |auto_pass|automation_user|

  Scenario Outline: Unsuccessful Login gives a proper message
    When I enter username "<username_or_email>"
    When I enter password "<password>"
    And I click the Login button
    And I should see a popup with text "<message>"
    Then I should stay at "Login" page
    Examples:
      |username_or_email       |password  |message          |
      |automation_user         |auto_pass1|Invalid password |
      |invalidUser             |auto_pass |User not found   |