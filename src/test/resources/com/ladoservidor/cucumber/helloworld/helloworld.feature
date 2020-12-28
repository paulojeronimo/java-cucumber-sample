Feature: Hello World

  Scenario: Say hello
    Given I have a hello app with "Hello"
    When I ask it to say hi
    Then it should answer with "Hello World"
