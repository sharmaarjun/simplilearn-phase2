package SwiggyDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks {
	
	@Before("@otp")
	public void launchBrowser() {
		System.out.println("\nBrowser is launched and URL is opened\n");
	}

	@After("@otp")
	public void closeBrowser() {
		System.out.println("\nBrowser needs to be closed\n");	 
	}
}
