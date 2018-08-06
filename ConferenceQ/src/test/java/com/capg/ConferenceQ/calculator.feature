

Feature: Calculator
  I want to use this template for my feature file

  
  @tag2
  Scenario Outline: Adding of two numbers <a> and <b>
    Given I have a calculator
    When I add <a> and <b>
    Then the result should be <a+b>

    Examples: 
      | a| b| a+b |
      | 2| 5 | 7|
      | 2 | 7 | 9   |
