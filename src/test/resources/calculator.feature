Feature: Calculator
  Scenario: Add two number

    Given eynar is an user in the calculator
    When he wants to add "8" + "9"
    Then he expected the result should be "17"