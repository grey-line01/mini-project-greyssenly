@authentication
Feature: Authentication
  As a user, I want to authentication so that I can access the shopping page

@tc-01
  Scenario: Verify  user is not able to login with all empty entries
    Given the API request for TC01 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
    
    @tc-02
  Scenario: Verify  user is not able to login with all empty entries
    Given the API request for TC02 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
    
    @tc-03
  Scenario: Verify  user is not able to login with all empty entries
    Given the API request for TC03 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
    
    @tc-04
  Scenario: Verify  user is not able to login with all empty entries
    Given the API request for TC04 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
    
    @tc-08
  Scenario: Verify  user is not able to login with all empty entries
    Given the API request for TC08 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
    
    @tc-09
  Scenario: Verify  user is not able to login with all empty entries
    Given the API request for TC09 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
  
  @tc-10
  Scenario: Verify  user is not able to login with all empty entries
    Given the API request for TC10 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
   
    @tc-11
  Scenario: Verify  user is not able to login with empty email
   Given the API request for TC11 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
    
  @tc-12
  Scenario: Verify  user is not able to login with empty password
   Given the API request for TC12 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
    
  @tc-13
  Scenario: Verify  user is not able to login with invalid email
    Given the API request for TC13 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
    
    
  @tc-14
  Scenario: Verify  user is not able to login with invalid password
    Given the API request for TC14 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
    
    
      @tc-15
  Scenario: Verify  user is not able to login with invalid URL
    Given the API request for TC15 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
    
      @tc-16
  Scenario: Verify  user is able to login with all valied entries
     Given the API request for TC16 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
    
      @tc-17
  Scenario: Verify  user is not able to retrieve user information with invalid URL
   Given the API request for TC17 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message
    
      @tc-18
  Scenario: Verify  user is able to retrieve user information with valid URL
   Given the API request for TC18 is sent
    When the response status code should be verified
    Then the response body should contain the expected error message