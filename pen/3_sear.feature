Feature: Search Functionality

  Scenario: Verify product search after successful login
    Given User launches browser and the application
    When User enters valid Email ID
    And User enters valid Password
    And User clicks on Login 
    When User enters a product name in the search box
    And User clicks on the Search button
    Then User should see the relevant searched product
