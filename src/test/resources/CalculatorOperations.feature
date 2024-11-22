Feature: Calculator operations
  As a user
  I want to perform basic mathematical operations
  So that I can verify the calculator's functionality

  Scenario Outline: Perform basic operations
    Given the first operand is <operand1>
    And the second operand is <operand2>
    When the operation is "<operator>"
    Then the result should be <result>

    Examples:
      # Basic operations
      | operand1 | operand2 | operator | result |
      | 10       | 5        | +        | 15     |
      | 10       | 5        | -        | 5      |
      | 10       | 5        | *        | 50     |
      | 10       | 5        | /        | 2      |

    # Additional cases for edge cases
      | -10      | 5        | +        | -5     |
      | 10       | -5       | +        | 5      |
      | -10      | -5       | +        | -15    |