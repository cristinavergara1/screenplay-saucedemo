# language: en
Feature: Enter to the SauceDemo official site
  As a user
  I want to enter the SauceDemo official site
  To be able to use the platform

  Scenario: Successful login with valid credentials
    Given the user opens the SauceDemo login page
    When the user logs in with username "standard_user" and password "secret_sauce"
    Then the user should see the products inventory
