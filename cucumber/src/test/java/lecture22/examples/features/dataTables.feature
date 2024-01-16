Feature: Data tables

  Scenario: Adding items array
    Given I have these fruits:
      | Apple      |
      | Banana     |
      | Orange     |

  @smoke
  Scenario: Adding items map
    Given I have these items:
      | Item      | Quantity |
      | Apples    | 5        |
      | Bananas   | 3        |
      | Oranges   | 4        |

  Scenario: Adding items map 2
    Given the following users exist:
      | name   | email              | twitter         |
      | Aslak  | aslak@cucumber.io  | @aslak_hellesoy |
      | Julien | julien@cucumber.io | @jbpros         |
      | Matt   | matt@cucumber.io   | @mattwynne      |
