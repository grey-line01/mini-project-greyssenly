@Logout
Feature: Logout
  As a user, I want to logout so that I can exit the system

  @logout-successfully
  Scenario: Verify user is able to logout
  	Given transaction is done
    When the transaction page showed
    Then click logout button
   