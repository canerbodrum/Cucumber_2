Feature: Country Multi Scenario

  Background: Before Scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page

    Scenario: Create country
      When create a country
      Then Success message should be displayed

      Scenario: Create a country 2
        When create a country name as "i344a" code as "422"
        Then Success message should be displayed