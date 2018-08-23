package ProjektMachi.Machi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
	
	//User story1
	
	@When("^I enter the \"([^\"]*)\" of a Sport Hall$")
	public void i_enter_the_of_a_Sport_Hall(String arg1) throws Throwable {
	     
		//WebElement element = webDriver.findElement(By.xpath("//a[contains(text(),'Anläggningar')]"));
		
	  //*[@id="navbar-collapse"]/ul[1]/li[2]/a
	    //#navbar-collapse > ul.nav.navbar-nav.navbar-left > li:nth-child(2) > a
	  //*[@id="navbar-collapse"]/ul[1]/li[3]/a      xpath- för matchning
	  //a[contains(text(),'Anläggningar')]
	  //*[@id="q"]
	}
	
	@When("^As I click the name of the Sport Hall$")
	public void as_I_click_the_name_of_the_Sport_Hall() throws Throwable {
	    
	    throw new PendingException();
	}

	@Then("^Can choose the clicked Sport Hall for booking$")
	public void can_choose_the_clicked_Sport_Hall_for_booking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
