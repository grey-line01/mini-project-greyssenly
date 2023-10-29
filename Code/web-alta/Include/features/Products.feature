@Produts
Feature: Products
  As a user, I want to see product so that I can purchase a product

#	Background:
#	Given user is logged in 
#	
  @select-category
  Scenario: Verify user is able to select categories of the product 
  	Given user is logged in 
    When I select category
    Then the category should be showed 
    
  @see-cart
  Scenario: Verify user is able to able to see the cart
    When I click cart
    Then the cart should be showed
    
  @detail-product
  Scenario: Verify user is able to see the detail of the product
    When I click detail
    Then the detail of the product should be showed
    
  @add-product
  Scenario: Verify user is able to  add product to cart
    When I click beli and click cart
    Then the cart item should be showed

  @increasing-the-quantity-of-the-product
  Scenario: Verify user is able to  increase the quantity of the product 
    When I click beli and click cart
    And I click plus sign
    Then the quantity of the product should be increased
  
  @decreasing-the-quantity-of-the-product
    Scenario: Verify user is able to  decrease the quantity of the product 
    When I click beli and click cart
    And I click minus sign
    Then the quantity of the product should be decreased

  @ordering-the-product-if-the-quantity-is-0
    Scenario:  Verify user is not able to order the product if the quantity is 0 
    When I click beli and click cart
    And I click minus sign until it reached 0
    Then the error message for empty order should be showed 
   
  @purchasing-a-product
    Scenario: Verify user is able to  purchase a product 
    When I click beli and click cart
    And I click Bayar 
    Then The transaction page should showed 
   
   
   
    