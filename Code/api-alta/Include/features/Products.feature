@Product
Feature: Product 
  As a user, I want to see product so that I can purchase the product
  
		@tc-30
  Scenario: Verify  user is not able to retrieve all products with invalid URL
    Given the API request for TC30 is sent
    When the response status code should be displayed
    Then the response body is expected to have the specified error message
    
    @tc-31
  Scenario: Verify  user is able to retrieve all categories with invalid URL
     Given the API request for TC31 is sent
    When the response status code should be displayed
    Then the response body is expected to have the specified error message
    
  @tc-32
  Scenario: Verify  user is not able to create a new product with empty name
     Given the API request for TC32 is sent
    When the response status code should be displayed
    Then the response body is expected to have the specified error message
    
    @tc-33
  Scenario: Verify  user is not able to create a new product with empty description 
   Given the API request for TC33 is sent
    When the response status code should be displayed
    Then the response body is expected to have the specified error message
    
    
  @tc-34
  Scenario: Verify  user is not able to create a new product with empty price
   Given the API request for TC34 is sent
    When the response status code should be displayed
    Then the response body is expected to have the specified error message
    
    
  @tc-35
  Scenario: Verify  user is not able to create a new product with empty categories 
    Given the API request for TC35 is sent
    When the response status code should be displayed
    Then the response body is expected to have the specified error message
    
    
      @tc-36
  Scenario: Verify  user is not able to create a new product with invalid URL
      Given the API request for TC36 is sent
    When the response status code should be displayed
    Then the response body is expected to have the specified error message
    
      @tc-37
  Scenario: Verify  user is able to create a new product with valid URL
    Given the API request for TC37 is sent
    When the response status code should be displayed
    Then the response body is expected to have the specified error message
    
    
      @tc-38
  Scenario: Verify  user is not able to get product By ID with invalid URL
  Given the API request for TC38 is sent
    When the response status code should be displayed
    Then the response body is expected to have the specified error message
    
      @tc-39
  Scenario: Verify  user is able to get product By ID with valid URL
     Given the API request for TC39 is sent
    When the response status code should be displayed
    Then the response body is expected to have the specified error message
    
        
      @tc-40
  Scenario: Verify  user is not able to delete a product with invalid URL
     Given the API request for TC40 is sent
    When the response status code should be displayed
    Then the response body is expected to have the specified error message
    
    
        
      @tc-41
  Scenario: Verify  user is able to delete a product with valid URL
    Given the API request for TC41 is sent
    When the response status code should be displayed
    Then the response body is expected to have the specified error message
    
        