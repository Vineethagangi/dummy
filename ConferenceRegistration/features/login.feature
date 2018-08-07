@tag
Feature: Registration form
  I want to login

  @execute
  Scenario: login to registration form
    Given I have a registration form
    When I enter valid username and valid password
    Then the result should be opening of login page
