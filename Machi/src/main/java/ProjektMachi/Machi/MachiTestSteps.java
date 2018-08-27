package ProjektMachi.Machi;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MachiTestSteps {
	public MachiTestSteps() {
	}
	SeleniumTestMethods stm = new SeleniumTestMethods();
	
	@Given("^I am on the Machi site$")
	public void i_am_on_the_Machi_site() throws Throwable {
	    stm.goToPage();
	}

	@Given("^I have not logged in$")
	public void i_have_not_logged_in() throws Throwable {
	    
	}

	@When("^I use username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_use_username_and_password(String arg1, String arg2) throws Throwable {
	    stm.LogInAddUserandPass(arg1, arg2);
	}


	@When("^I click the log in button$")
	public void i_click_the_log_in_button() throws Throwable {
	    stm.clickByClassName("btn-lg");
	}

	@Then("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Given("^I am logged into Matchi$")
	public void i_am_logged_into_Matchi() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I have booked a sport hall$")
	public void i_have_booked_a_sport_hall() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I choose account/Credit card payment method$")
	public void i_choose_account_Credit_card_payment_method() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click the Book button$")
	public void i_click_the_Book_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^It appears the confirmation text\"([^\"]*)\"$")
	public void it_appears_the_confirmation_text(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I get a confirmation för my bok by email$")
	public void i_get_a_confirmation_för_my_bok_by_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I choose New account-/Credit card payment method$")
	public void i_choose_New_account_Credit_card_payment_method() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click Next button$")
	public void i_click_Next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I fill in the card number \"([^\"]*)\",name \"([^\"]*)\" and date of the card\"([^\"]*)\" and CVC \"([^\"]*)\"\\.$")
	public void i_fill_in_the_card_number_name_and_date_of_the_card_and_CVC(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click Final payment$")
	public void i_click_Final_payment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^It appears the confirmation text \"([^\"]*)\"$")
	public void it_appears_the_confirmation_text(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I get a confirmation for my booking by email$")
	public void i_get_a_confirmation_for_my_booking_by_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I choose Swish$")
	public void i_choose_Swish() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Enter a vaild phonenumber \"([^\"]*)\"$")
	public void enter_a_vaild_phonenumber(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click continue button$")
	public void i_click_continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}

