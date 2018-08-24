Feature: As a customer I want to select a date for the sport activity

  Scenario: select a date
    Given I am logged in Matchi
    When  I select boka
    And   I select a sport
    And   I search for "Höno"
    And   I click a time
    Then  I see the available courts for that time 
    
     
      