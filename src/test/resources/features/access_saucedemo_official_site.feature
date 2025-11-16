# language: en
Feature: Find out SauceDemo official site
  As a user
  I want to enter the SauceDemo official site
  To be able to use the platform

  Scenario: Open the SauceDemo official site directly
    Given I am in the navigator
    When I navigate to the SauceDemo official site
    Then I should see the SauceDemo login page
