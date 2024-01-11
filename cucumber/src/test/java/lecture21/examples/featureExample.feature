Feature: Password Recovery
  Password recovery is a feature that allows users to regain access to their accounts
  when they've forgotten their passwords.
  The user initiates the password recovery process,
  and the system verifies the user's identity before enabling the password reset.

  Scenario: User initiates password recovery
    Given the user accesses the "Forgot Password" functionality
    When the user provides their registered email
    Then the system sends a password reset link to the user's email