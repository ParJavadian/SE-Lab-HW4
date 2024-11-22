Feature: Calculator operations
  As a user
  I want to perform basic mathematical operations
  So that I can verify the calculator's functionality

  Scenario Outline: Perform basic operations
    Given the first operand is <operand1>
    And the second operand is <operand2>
    When the operation is "<operator>"
    Then the result should be <result>