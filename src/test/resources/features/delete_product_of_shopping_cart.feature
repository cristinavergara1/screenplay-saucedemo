Feature: Delete product of the shopping cart
  I as user
  I want to delete a product from my shopping cart
  To remove unwanted item

  Background:
    Given the user logs in using valid credentials
    And the user has a product added to the shopping cart

  Scenario: Delete a product of the shopping cart successfully
    Given the user is on shopping cart page
    When the user deletes "Sauce Labs Backpack" from the shopping cart
    Then the shopping cart should be empty



