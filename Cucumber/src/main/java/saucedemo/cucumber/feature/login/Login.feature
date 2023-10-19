Feature: Login Page SauceDemo

  @Positive
  Scenario: Success Login
    Given Login page saucedemo
    When User enter valid Username
    And User enter valid Password
    And Click Login Button
    Then Home Page should be Displayed

  @Negative
  Scenario: Failed Login
    Given Login page saucedemo
    When User enter invalid Username
    And User enter invalid Password
    And Click Login Button
    Then Error Message Displayed