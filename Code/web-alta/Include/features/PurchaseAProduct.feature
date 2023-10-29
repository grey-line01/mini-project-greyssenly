@Purchase-a-product
Feature: Transaction
  As a user, I am able to do transaction so that I can purchase a product

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
    
    
#product

 @select-category
  Scenario: Verify user is able to select categories of the product 
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
    
    #transaction
    
    @setting-the-rows-per-page-to-5
  Scenario: Verify user is able to set the rows per page (5)
  #	Given user is already purchased the product
    When the transaction page showed
    Then set the rows per page to 5

  @setting-the-rows-per-page-to-all
  Scenario: Verify user is able to set the rows per page (All)
  #	Given user is already purchased the product
    When the transaction page showed
    Then set the rows per page to all
    
  @choosing-next-page
  Scenario: Verify user is able to click next page 
  #	Given user is already purchased the product
    When the transaction page showed
    Then click the next page
 
   @choosing-previous-page
  Scenario: Verify user is able to click previous page 
  #	Given user is already purchased the product
    When the transaction page showed
    Then click the previous page
    
  @back
  Scenario: Verify user is able to return to the shopping page
  #	Given user is already purchased the product
    When the transaction page showed
    Then click back
    