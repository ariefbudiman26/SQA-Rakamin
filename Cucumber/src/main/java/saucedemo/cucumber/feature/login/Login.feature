Feature: Login Page SauceDemo

  Scenario: Success Login
    Given Login page saucedemo
    When User enter valid Username
    And User enter valid Password
    And Click Login Button
    Then Home Page should be Displayed

  Scenario: Failed Login
    Given Login page saucedemo
    When User enter invalid Username
    And User enter invalid Password
    And Click Login Button
    Then Error Message Displayed