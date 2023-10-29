@Login
Feature: Login
  As a user, I want to login so that I can access the shopping page

#	Background: 
#	Given open login URL
#	 
  @empty-all-entries
  Scenario: Verify user is not able to login with all empty entries 
  	Given open login URL
    When I clear email and password
    And I click login 
    Then error message for all empty entries should be displayed

  @empty-empty-email
  Scenario: Verify user is not able to login with empty email
    When I input password
    And I click login 
    Then error message for empty email should be showed

    
  @empty-empty-password
  Scenario: Verify user is not able to login with empty password
    When I input email
    And I click login 
    Then error message for empty password should be showed
    
    
  @invalid-email
  Scenario Outline: Verify user is not able to login with an invalid email 
    When I input invalid email <email> and valid password <password>
    And I click login 
    Then error message for invalid email should be showed
    
    Examples:
    |email| password |
    |lili@gmail.com|lala123|
    
    
  @invalid-password
  Scenario Outline: Verify user is not able to login with an invalid password
    When I input valid email <email> and invalid password <password>
    And I click login 
    Then error message for invalid password should be showed
    
    Examples:
    |email| password |
    |lala@gmail.com|lala|
    
    
  @valid-email-password
  Scenario Outline: Verify user is able to login with all valid entries
    When I input valid email <email> and valid password <password>
    And I click login 
    Then the shopping page should be displayed
    
    Examples:
    |email| password |
    |lala@gmail.com|lala123|