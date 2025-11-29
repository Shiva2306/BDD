Feature: Registration Functionality

  @Smoke
  Scenario: To verify Registration functionality by entering valid credentials
    Given User has opened the browser and launched the application for registration
    When User enters valid First name
    And User enters valid Last name
    And User enters valid Email ID for Registration
    And User enters valid Telephone
    And User enters valid Password for Registration
    And User enters valid Confirm Password
    And User clicks on radion button no
    And User clicks on privacy policy checkbox
    And User clicks on continue button
    Then User should be Registered
