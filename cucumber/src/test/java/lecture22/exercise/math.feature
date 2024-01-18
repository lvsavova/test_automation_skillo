Feature: Arithmetic Operations

  Scenario Outline: Math operations
    Given I have two numbers "<number1>" and "<number2>"
    When I add them
    Then the result should be "<add>"
    When I subtract them
    Then the result should be "<subtract>"
    When I multiply them
    Then the result should be "<multiply>"
    When I divide them
    Then the result should be "<divide>"
    When I modulus them
    Then the result should be "<modulus>"

    Examples:
      | number1 | number2 | add | subtract | multiply | divide | modulus |
      | 3       | 5       | 8   | -2       | 15       | 0.6    | 3       |
      | 10      | 2       | 12  | 8        | 20       | 5      | 0       |
      | 7       | 4       | 11  | 3        | 28       | 1.75   | 3       |
      | 15      | 5       | 20  | 10       | 75       | 3      | 0       |

