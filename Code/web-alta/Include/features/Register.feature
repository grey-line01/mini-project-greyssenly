@Register
Feature: Register
  As a user, I am able to register so that I can login to shopping page

	Background: 
	 Given open browser
	 
  @all-empty-entries
  Scenario: Verify user is not able to register with all empty entries
    Given open browser
    When I clear all inputs 
    Then error message should be displayed
       
  @empty-name
  Scenario: Verify user is not able to register with  empty name
    When I input email and password 
    And I click register
    Then error message for empty name should be displayed
        
  @empty-email
  Scenario: Verify user is not able to register with  empty email
    When I input name and password
    And I click register
    Then error message for empty email should be displayed
       
  @empty-password
  Scenario: Verify user is not able to register with  empty password
    When I input name and email
    And I click register
    Then error message for empty password should be displayed
   
  @valid-input
  Scenario: Verify user is able to register with a valid input
    When I enter all inputs
    Then login page should be displayed
    

  