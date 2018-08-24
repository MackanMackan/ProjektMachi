Feature: As a customer I want to select a date and a time for the sport activity

  Scenario: search for a sportshall and check for available times
    Given I am logged in to Matchi
    When  I select boka
    And   I search for "Höno"
    And   I click a time
    Then  I see the available courts for that time 
    
     
      