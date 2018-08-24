Feature: As a customer i want to search for a sport hall so that i can book it

Scenario: Search for Sport Hall
	Given I am logged in to Matchi
	When I enter the "Hönö" of a Sport Hall
	And As I click the name of the Sport Hall
	Then Can choose the clicked Sport Hall for booking
	
	