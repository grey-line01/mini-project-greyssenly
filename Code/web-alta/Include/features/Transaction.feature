@Transaction
Feature: Transaction
  As a user, I want to see the detail of the transaction so that I know the price of the all products purchased 

#	Background:
#	Given user is logged in 
#	
  @see-detail-of-the-transaction
  Scenario: Verify user is able to  see the detail of the transaction
  	Given user is logged in
    When I click beli and click cart
    And I click Bayar 
    Then The transaction page should showed 

  @setting-the-rows-per-page-to-5
  Scenario: Verify user is able to set the rows per page (5)
  	Given user is already purchased the product
    When the transaction page showed
    Then set the rows per page to 5

  @setting-the-rows-per-page-to-all
  Scenario: Verify user is able to set the rows per page (All)
  	Given user is already purchased the product
    When the transaction page showed
    Then set the rows per page to all
    
  @choosing-next-page
  Scenario: Verify user is able to click next page 
  	Given user is already purchased the product
    When the transaction page showed
    Then click the next page
 
   @choosing-previous-page
  Scenario: Verify user is able to click previous page 
  	Given user is already purchased the product
    When the transaction page showed
    Then click the previous page
    
  @back
  Scenario: Verify user is able to return to the shopping page
  	Given user is already purchased the product
    When the transaction page showed
    Then click back
    
 