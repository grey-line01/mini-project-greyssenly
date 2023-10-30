@Product-categories
Feature: Product Categories
  As a user, I want to see product categories so that I can select the product
  
  
  @tc-19
  Scenario: Verify  user is not able to create a category with all empty entries
    Given the API request for TC19 is sent
    When the response status code should be showed
    Then The expected error message should be present within the response body

    @tc-20
  Scenario: Verify  user is not able to create a category with empty name
 Given the API request for TC20 is sent
    When the response status code should be showed
    Then The expected error message should be present within the response body
    
  @tc-21
  Scenario: Verify  user is not able to create a category with empty description
   Given the API request for TC21 is sent
   When the response status code should be showed
    Then The expected error message should be present within the response body
    
  @tc-22
  Scenario: Verify  user is not able to create a category with unlimited characters of name 
    Given the API request for TC22 is sent
   When the response status code should be showed
    Then The expected error message should be present within the response body
    
      @tc-23
  Scenario: Verify  user is not able to create a category with unlimited characters of description
    Given the API request for TC23 is sent
   When the response status code should be showed
    Then The expected error message should be present within the response body
    
      @tc-24
  Scenario: Verify  user is not able to create a category with invalid URL
	Given the API request for TC24 is sent
    When the response status code should be showed
    Then The expected error message should be present within the response body
    
      @tc-25
  Scenario: Verify  user is able to create a category with valid entries
    Given the API request for TC25 is sent
    When the response status code should be showed
    Then The expected error message should be present within the response body
    
    
      @tc-26
  Scenario: Verify  user is not able to retrieve category by ID with invalid URL
  Given the API request for TC26 is sent
    When the response status code should be showed
    Then The expected error message should be present within the response body
    
      @tc-27
  Scenario: Verify  user is able to retrieve category by ID with URL
   Given the API request for TC27 is sent
    When the response status code should be showed
    Then The expected error message should be present within the response body
    
        
      @tc-28
  Scenario: Verify  user is not able to retrieve all categories with invalid URL
   Given the API request for TC28 is sent
    When the response status code should be showed
    Then The expected error message should be present within the response body
    
        
      @tc-29
  Scenario: Verify  user is able to retrieve all categories with valid URL
    Given the API request for TC29 is sent
    When the response status code should be showed
    Then The expected error message should be present within the response body
    
        