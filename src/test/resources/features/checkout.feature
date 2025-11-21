Feature: Checkout process
  As a user
  I want to complete the checkout process
  To finalize my purchase


  Background:
    Given the user logs in using valid credentials
    And the user has a product added to the shopping cart
    And the user is on the shopping cart page

  Scenario: Successful checkout process
    When the user proceeds to checkout
    And the checkout information given is valid
    And the user continues with the purchase revision
    Then the order should be confirmed
    And the purchase should be completed successfully