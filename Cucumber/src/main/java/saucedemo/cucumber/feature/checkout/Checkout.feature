Feature: Checkout Saucedemo

  Scenario: Success Checkout
    Given User Login to website Saucedemo
    And User Click Add to cart an Item to Checkout
    And User Click Cart Button
    Then Checkout page Displayed
    And User Click Checkout Button
    Then Checkout Confirmation page Displayed
    And User Enter First Name
    And User Enter Last Name
    And User Enter Postal Code
    And User Click Continue Button
    Then Checkout Overview page Displayed
    When User Click Finish Button
    Then Checkout Complete page Displayed

  Scenario: Failed Checkout
    Given User Login to website Saucedemo
    And User Click Add to cart an Item to Checkout
    And User Click Cart Button
    Then Checkout page Displayed
    And User Click Checkout Button
    Then Checkout Confirmation page Displayed
    And User Enter Empty First Name
    And User Enter Empty Last Name
    And User Enter Empty Postal Code
    When Click Continue Button
    Then Message Error Displayed