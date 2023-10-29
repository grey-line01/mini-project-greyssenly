@Oeders
Feature: Orders
  As a user, I want to order a product so that I buy it
  
@tc-42
  Scenario: Verify  user is not able to create a new order with all empty entries
    Given the API request for TC42 is sent
    When the response status code should be appeared
    Then expected error message
    
    @tc-43
  Scenario: Verify  user is not able to create a new order with empty product_id
     Given the API request for TC43 is sent
    When the response status code should be appeared
    Then expected error message
    
  @tc-44
  Scenario: Verify  user is not able to create a new order with empty quantity
     Given the API request for TC44 is sent
    When the response status code should be appeared
    Then expected error message
    
  @tc-45
  Scenario: Verify  user is not able to create a new order with invalid URL
    Given the API request for TC45 is sent
    When the response status code should be appeared
    Then expected error message
    
  @tc-46
  Scenario: Verify  user is able to create a new order with valid URL
     Given the API request for TC46 is sent
    When the response status code should be appeared
    Then expected error message
    
      @tc-47
  Scenario: Verify  user is not able to get order by ID with invalid URL
      Given the API request for TC47 is sent
    When the response status code should be appeared
    Then expected error message
    
      @tc-48
  Scenario: Verify  user is able to get order by ID with valid URL
     Given the API request for TC48 is sent
    When the response status code should be appeared
    Then expected error message
    
 