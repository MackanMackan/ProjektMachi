package ProjektMachi.Machi;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MachiTestSteps {
	public MachiTestSteps() {
	}
	SeleniumTestMethods stm = new SeleniumTestMethods();
	 
	
	// Userstory6: Log in to Machi website//
	
	@Given("^I am on the Machi site$")
	public void i_am_on_the_Machi_site() throws Throwable {
	    stm.goToPage();
	}

	@Given("^I have not logged in$")
	public void i_have_not_logged_in() throws Throwable {
	    
	}

	@When("^I use username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_use_username_and_password(String arg1, String arg2) throws Throwable {
	    stm.logInAddUserAndPass(arg1, arg2);
	}


	@When("^I click the log in button$")
	public void i_click_the_log_in_button() throws Throwable {
	    stm.clickByClassName("btn-success");
	}

	@Then("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
	   if(!stm.getTextByXpath("//*[@id=\"wrap-content\"]/section[1]/div/div/div/div[1]/div[1]/div[2]/h4/a").equals("Mjuk Varutestare")) {
		   throw new Exception();
	   }
	}
	
	//Userstory2: Select activity date
	
	@Given("^I am on Matchi website$")
	public void i_am_on_Matchi_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I select a date in the future$")
	public void i_select_a_date_in_the_future() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I select a sport$")
	public void i_select_a_sport() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click smash$")
	public void i_click_smash() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I see all the available time slots$")
	public void i_see_all_the_available_time_slots() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}