Feature: Product Saucedemo

  Scenario: Success Open Product Detail by Click Product Image
    Given Login to Saucedmo
    When User Click a Product Image
    Then Product Detail page Displayed

  Scenario: Success Open Product Detail by Click Product Title
    Given Login to Saucedmo
    When User Click a Product Title
    Then Product Detail page Displayed