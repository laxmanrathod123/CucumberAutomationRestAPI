package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
        @Given("^user is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
    
        	System.out.println("user is on the home page");
        	
	    }

	    @When("^user login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	    	System.out.println("user is login with username and password");
	    }

	    @When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {

	    	System.out.println(strArg1);
	    	System.out.println(strArg2);
	    	
	    	
	    }
	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	
	    	System.out.println(" home page is displayed and validated ");
	    }

	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	    	System.out.println("card is dislayed and validated");
	    }

	}

