@delete
Feature: Delete Item
  As a user, I want to delete the item so that I can list the other item

  @delete-item
  Scenario: Verify user is able to delete an item
    Given open App
    When I enter and delete items
    Then the item should be deleted

  