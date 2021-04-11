package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {
	
//		@Given("I want to write a step with precondition")
//		public void i_want_to_write_a_step_with_precondition() {
//		    // Write code here that turns the phrase above into concrete actions
//		    System.out.println("Precondition is starting");
//		}

		// scenario outline

		@Given("I want to write a step with correctOTP")
		public void i_want_to_write_a_step_with_correct_otp() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("Entering the correct OTP");
		}

			@When("I check for the {int} in step")
			public void enterValue(Integer int1) {
			    // Write code here that turns the phrase above into concrete actions
			    System.out.println("Enter the value: "+int1);
			}
			@Then("I verify the success in step")
			public void i_verify_the_success_in_step() {
			    // Write code here that turns the phrase above into concrete actions
			    System.out.println("I verify the success in step");
			}
			
				@Given("I want to write a step with incorrectOTP")
				public void i_want_to_write_a_step_with_incorrect_otp() {
				    // Write code here that turns the phrase above into concrete actions
				    System.out.println("Entering the incorrectOTP");
				}


				@Then("I verify the Fail in step")
				public void i_verify_the_fail_in_step() {
				    // Write code here that turns the phrase above into concrete actions
					System.out.println("I verify the Fail in step");
				}



		
}
