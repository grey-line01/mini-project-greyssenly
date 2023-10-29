@Reset
Feature: Reset Item
  As a user, I want to reset the item so that I can update with the new data

  @reset-item
  Scenario: Verify user is able to reset the item 
    Given open App
    When I reset the items 
    Then The new data of the item should be displayed
