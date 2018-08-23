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
	    stm.goToPage("http://beta1.matchi.se");
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
	@Given("^I am logged in to Matchi$")
	public void i_am_logged_in_to_Matchi() throws Throwable {
	    stm.goToPage("http://beta1.matchi.se");
		stm.login();
	}

	@Given("^have chosen a sport hall\\.$")
	public void have_chosen_a_sport_hall() throws Throwable {
	    stm.goToPage("http://beta1.matchi.se/facilities/honots");
	}

	@When("^I search for available courts$")
	public void i_search_for_available_courts() throws Throwable {
	    
	}

	@When("^chosen a specific court$")
	public void chosen_a_specific_court() throws Throwable {
	    
	}

	@When("^chosen a specific time$")
	public void chosen_a_specific_time() throws Throwable {
	    stm.clickByXPath("//*[@class=\"courtLinks\"][4]");
	}

	@Then("^I can book a court$")
	public void i_can_book_a_court() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	

	@When("^click on the \"([^\"]*)\" button$")
	public void click_on_the_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I can book more than one court$")
	public void i_can_book_more_than_one_court() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}