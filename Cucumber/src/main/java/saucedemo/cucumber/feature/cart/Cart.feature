Feature: Cart Saucedemo

  Scenario: User Success Add Item to Cart
    Given User Login to Saucedemo
    When User Click Add to cart
    Then Cart Badge Displayed

  Scenario: User Success Remove Item that has Added to Cart
    Given User Login to Saucedemo
    And User Click Add to cart an Item
    And The Item clicked label change to Remove
    When User Click Remove at Added Item
    Then The Added Item label change to Add to Cart