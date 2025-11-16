Feature: Add product to shopping cart
  I as user
  I want to add a product to my shopping cart
  To purchase it later


  Scenario: Add a product to the shopping cart successfully
    Given I see the product Sauce Labs Backpack on the products page
    When I add "Sauce Labs Backpack" to the shopping cart
    Then I should see 1 product in the shopping cart


