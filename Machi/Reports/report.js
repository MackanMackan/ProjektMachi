$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ProjektMachi/Machi/BookACourt.feature");
formatter.feature({
  "line": 1,
  "name": "As customer I want to be able to book one or several courts.",
  "description": "",
  "id": "as-customer-i-want-to-be-able-to-book-one-or-several-courts.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Book a court.",
  "description": "",
  "id": "as-customer-i-want-to-be-able-to-book-one-or-several-courts.;book-a-court.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am logged in to Matchi",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "have chosen a sport hall.",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I search for available courts",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "chosen a specific court",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "chosen a specific time",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I can book a court",
  "keyword": "Then "
});
formatter.match({
  "location": "MachiTestSteps.i_am_logged_in_to_Matchi()"
});
formatter.result({
  "duration": 17874019988,
  "status": "passed"
});
formatter.match({
  "location": "MachiTestSteps.have_chosen_a_sport_hall()"
});
formatter.result({
  "duration": 5025901674,
  "status": "passed"
});
formatter.match({
  "location": "MachiTestSteps.i_search_for_available_courts()"
});
formatter.result({
  "duration": 38574,
  "status": "passed"
});
formatter.match({
  "location": "MachiTestSteps.chosen_a_specific_court()"
});
formatter.result({
  "duration": 35702,
  "status": "passed"
});
formatter.match({
  "location": "MachiTestSteps.chosen_a_specific_time()"
});
formatter.result({
  "duration": 817058713,
  "status": "passed"
});
formatter.match({
  "location": "MachiTestSteps.i_can_book_a_court()"
});
formatter.result({
  "duration": 2476167,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat ProjektMachi.Machi.MachiTestSteps.i_can_book_a_court(MachiTestSteps.java:76)\r\n\tat ✽.Then I can book a court(ProjektMachi/Machi/BookACourt.feature:10)\r\n",
  "status": "pending"
});
formatter.scenario({
  "line": 12,
  "name": "Book several courts",
  "description": "",
  "id": "as-customer-i-want-to-be-able-to-book-one-or-several-courts.;book-several-courts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I am logged in to Matchi",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "have chosen a sport hall",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I search for available courts",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click on the \"Boka flera\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "chosen a specific court",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "chosen a specific time",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I can book more than one court",
  "keyword": "Then "
});
formatter.match({
  "location": "MachiTestSteps.i_am_logged_in_to_Matchi()"
});
formatter.result({
  "duration": 16857935983,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "MachiTestSteps.i_search_for_available_courts()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Boka flera",
      "offset": 14
    }
  ],
  "location": "MachiTestSteps.click_on_the_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MachiTestSteps.chosen_a_specific_court()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MachiTestSteps.chosen_a_specific_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MachiTestSteps.i_can_book_more_than_one_court()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("ProjektMachi/Machi/LogInToMachi.feature");
formatter.feature({
  "line": 1,
  "name": "As a customer I want to log in to be able to get access to the bookingsystem",
  "description": "",
  "id": "as-a-customer-i-want-to-log-in-to-be-able-to-get-access-to-the-bookingsystem",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Log in to Machi website",
  "description": "",
  "id": "as-a-customer-i-want-to-log-in-to-be-able-to-get-access-to-the-bookingsystem;log-in-to-machi-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the Machi site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I have not logged in",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I use username \"mjukvarutestare4@mailinator.com\" and password \"mjukvarutestare\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click the log in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I am logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "MachiTestSteps.i_am_on_the_Machi_site()"
});
formatter.result({
  "duration": 8859717806,
  "status": "passed"
});
formatter.match({
  "location": "MachiTestSteps.i_have_not_logged_in()"
});
formatter.result({
  "duration": 39806,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mjukvarutestare4@mailinator.com",
      "offset": 16
    },
    {
      "val": "mjukvarutestare",
      "offset": 63
    }
  ],
  "location": "MachiTestSteps.i_use_username_and_password(String,String)"
});
formatter.result({
  "duration": 6528787594,
  "status": "passed"
});
formatter.match({
  "location": "MachiTestSteps.i_click_the_log_in_button()"
});
formatter.result({
  "duration": 4302313948,
  "status": "passed"
});
formatter.match({
  "location": "MachiTestSteps.i_am_logged_in()"
});
formatter.result({
  "duration": 503759596,
  "status": "passed"
});
formatter.uri("ProjektMachi/Machi/SearchMatchiSportHall.feature");
formatter.feature({
  "line": 1,
  "name": "As a customer i want to search for a sport hall so that i can book it",
  "description": "",
  "id": "as-a-customer-i-want-to-search-for-a-sport-hall-so-that-i-can-book-it",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search for Sport Hall",
  "description": "",
  "id": "as-a-customer-i-want-to-search-for-a-sport-hall-so-that-i-can-book-it;search-for-sport-hall",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am logged in to Matchi",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter the \"Hönö\" of a Sport Hall",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "As I click the name of the Sport Hall",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Can choose the clicked Sport Hall for booking",
  "keyword": "Then "
});
formatter.match({
  "location": "MachiTestSteps.i_am_logged_in_to_Matchi()"
});
formatter.result({
  "duration": 18757008590,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hönö",
      "offset": 13
    }
  ],
  "location": "MachiTestSteps.i_enter_the_of_a_Sport_Hall(String)"
});
formatter.result({
  "duration": 6214743246,
  "status": "passed"
});
formatter.match({
  "location": "MachiTestSteps.as_I_click_the_name_of_the_Sport_Hall()"
});
formatter.result({
  "duration": 9142105464,
  "status": "passed"
});
formatter.match({
  "location": "MachiTestSteps.can_choose_the_clicked_Sport_Hall_for_booking()"
});
formatter.result({
  "duration": 44320,
  "status": "passed"
});
formatter.uri("ProjektMachi/Machi/SelectActivityDate.feature");
formatter.feature({
  "line": 1,
  "name": "As a customer I want to select a date and a time for the sport activity",
  "description": "",
  "id": "as-a-customer-i-want-to-select-a-date-and-a-time-for-the-sport-activity",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "search for a sportshall and check for available times",
  "description": "",
  "id": "as-a-customer-i-want-to-select-a-date-and-a-time-for-the-sport-activity;search-for-a-sportshall-and-check-for-available-times",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am logged in to Matchi",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select boka",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I search for \"Höno\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click a time",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I see the available courts for that time",
  "keyword": "Then "
});
formatter.match({
  "location": "MachiTestSteps.i_am_logged_in_to_Matchi()"
});
formatter.result({
  "duration": 16887192013,
  "status": "passed"
});
formatter.match({
  "location": "MachiTestSteps.i_select_boka()"
});
formatter.result({
  "duration": 3815349526,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Höno",
      "offset": 14
    }
  ],
  "location": "MachiTestSteps.i_search_for(String)"
});
formatter.result({
  "duration": 1071059914,
  "status": "passed"
});
formatter.match({
  "location": "MachiTestSteps.i_click_a_time()"
});
formatter.result({
  "duration": 850329383,
  "status": "passed"
});
formatter.match({
  "location": "MachiTestSteps.i_see_the_available_courts_for_that_time()"
});
formatter.result({
  "duration": 627952862,
  "status": "passed"
});
});