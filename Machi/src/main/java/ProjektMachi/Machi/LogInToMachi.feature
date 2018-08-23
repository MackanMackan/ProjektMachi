Feature: As a customer I want to log in to be able to get access to the bookingsystem

	Scenario: Log in to Machi website
		Given I am on the Machi site
		And 	I have not logged in
		When 	I use username "mjukvarutestare4@mailinator.com" and password "mjukvarutestare"
		And 	I click the log in button
		Then 	I am logged in