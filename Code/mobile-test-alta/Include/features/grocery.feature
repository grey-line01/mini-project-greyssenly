@grocery
Feature: grocery
  As a user, I want to add a new item so that I am able to see it in dashboard

 @all-empty-entries 
  Scenario: Verify user is not able to add item with all empty entries 
  	Given open App
    When I click plus button and I clear all inputs
    And I click add item button
    Then The error message would be displayed
    
	@empty-name
  Scenario: Verify user is not able to add item with empty name  
    When I click plus button and I input quantity and item type
    And I click add item button
    Then The error message for empty name would be displayed
 
 	@empty-quantity
  Scenario: Verify user is not able to add item with empty quantity  
    When I click plus button and I input name and item type
    And I click add item button
    Then The error message for empty quantity would be displayed
        
   @50-characters-only-alphabets
  Scenario: Verify user is not able to add item within more than 50 characters (only alphabets)  
    When I click plus button and I input name with only alphabets
    And I click add item button
    Then The added item would be displayed
    
   @50-characters-only-numbers
  Scenario: Verify user is not able to add item within more than 50 characters (only numbers)  
    When I click plus button and I input name with only numbers
    And I click add item button
    Then The added item would be showed
    
  @quantity-valid-negative
  Scenario: Verify user is not able to add item with a valid negative   
    When I click plus button and I input name and negative value to quantity
    And I click add item button
    Then The error message for negative value should be displayed
     
  @quantity-float-number
  Scenario: Verify user is not able to add item with a float number   
    When I click plus button and I input name and float number to quantity
    And I click add item button
    Then The error message for float number should be displayed
   
  @reset-item
  Scenario: Verify user is able to reset the item 
    When I reset the items 
    Then The new data of the item should be displayed
   
  @delete-item
  Scenario: Verify user is able to delete an item
    Then the item should be deleted

   
    
   