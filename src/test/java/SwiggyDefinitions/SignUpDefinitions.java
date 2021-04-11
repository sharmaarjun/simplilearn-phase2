package SwiggyDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpDefinitions {
	
	// Background check
	
	@Given("Url for swiggy application is opened")
	public void url_for_swiggy_application_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Url for swiggy application is opened");
	}
	@Given("Cache is cleared")
	public void cache_is_cleared() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Cache is cleared");
	}




	// Incorrect otp
	
	@Given("User has entered valid sign up credentials")
	public void user_has_entered_valid_sign_up_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User has entered valid sign up credentials");
	}
	@Given("otp is delivered on the entered mobile number")
	public void otp_is_delivered_on_the_entered_mobile_number() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("otp is delivered on the entered mobile number");
	}
	@When("User enters the correct mobile number")
	public void user_enters_the_correct_mobile_number() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User enters the correct mobile number");
	}
	@When("For the scenario incorrectOtp")
	public void for_the_scenario_incorrect_otp() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("For the scenario incorrectOtp");
	}
	@When("User enters the {int}")
	public void otp(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("OTP entered is "+int1);
	}
	@Then("The output of the scenario is Error")
	public void the_output_of_the_scenario_is_error() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The output of the scenario is Error");
	}

	// Correct OTP
	
	@When("For the scenario CorrectOtp")
	public void for_the_scenario_correct_otp() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("For the scenario CorrectOtp");
	}
	@Then("The output of the scenario is Login")
	public void the_output_of_the_scenario_is_login() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The output of the scenario is Login");
	}

	// SignUp Null Case
	
	@When("Values enter by user are {int} , null , null , null")
	public void valuesnull(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Values enter by user are "+ int1 +" , null , null , null");
	}
	@When("Press continue button")
	public void press_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Press continue button");
	}
	@Then("The behaviour expected is fail")
	public void the_behaviour_expected_is_fail() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The behaviour expected is fail");
	}

// SignUp Invalid case
	
	@When("Values enter by user are {int} , a1@ , abc , qw")
	public void values_invalid(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Values enter by user are " +int1+" , a1@ , abc , qw");
	}

	// SignUp valid case

		@When("Values enter by user are {long} , Arjun , arjun@yopmail.com , qwerty")
		public void validCredentials(long int2) {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("Values enter by user are "+int2+" , Arjun , arjun@yopmail.com , qwerty");
		}

		@Then("The behaviour expected is pass")
		public void the_behaviour_expected_is_pass() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("The behaviour expected is pass");
		}

}
