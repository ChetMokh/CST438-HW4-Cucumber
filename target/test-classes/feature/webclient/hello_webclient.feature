Feature: Hello web page
  As a user I want to calculate squared of the number I enter

  Scenario: test1
    Given I am on the hello page
    When I enter "1"
    Then I see the result "1"

  Scenario: test2
    Given I am on the hello page
    When I enter "2"
    Then I see the result "4"

  Scenario: test3
    Given I am on the hello page
    When I enter "3"
    Then I see the result "9"

  Scenario: test4
    Given I am on the hello page
    When I enter "4"
    Then I see the result "16"
