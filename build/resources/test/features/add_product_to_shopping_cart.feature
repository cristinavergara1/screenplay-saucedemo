Feature: Add product to shopping cart
  I as user
  I want to add a product to my shopping cart
  To purchase it later

  Background:
    Given the user logs in using valid credentials

  Scenario: Add a product to the shopping cart successfully
    Given the user is on the product page
    When the user adds "Sauce Labs Backpack" to the shopping cart
    Then the shopping cart should display 1 item



