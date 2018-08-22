Feature: As a customer I want to select a date for the sport activity

  Scenario: select a date
    Given I am on Matchi website
    When  I select a date in the future
    And   I select a sport
    And   I click smash
    Then  I see all the available time slots
   
      