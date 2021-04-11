package SwiggyDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddLocationDefinitions {

	
	@Given("The user is on Swiggy url")
	public void the_user_is_on_swiggy_url() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The user is on Swiggy url");
	}
	@When("User selects required location as {string} from autosuggesstion")
	public void enterLocation(String location) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User selects required location as "+location+" from autosuggesstion");
	}
	@Then("Restaurants from {string} location are displayed")
	public void restaurants_from_location_are_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Restaurants from "+string+" location are displayed");
	}






}
