@tag
Feature: Onboarding
  I want to use this template for my feature file

Background: Url has been opened
Given Url for swiggy application is opened
And Cache is cleared

	@tag @otp
	Scenario Outline: OTP Screen
	Given User has entered valid sign up credentials
	And otp is delivered on the entered mobile number
	When User enters the correct mobile number
	And For the scenario <TestName>
	And User enters the <otp>
	Then The output of the scenario is <Expected>
	
	Examples:
		|		TestName	 	| otp			| Expected	|
		|	incorrectOtp	| 908			| Error			|
		|	CorrectOtp  	| 584812  | Login			|
		
	@tag @signup
	Scenario Outline: Sign Up
		Given: User is on signup page
		When Values enter by user are <ph number> , <name> , <email> , <password>
		And Press continue button
		Then The behaviour expected is <ExpectedStatus>
		
		Examples:
			| ph number 	| name    | email 							| password    | ExpectedStatus  |
			| 0						| null   	| null 								| null       	| fail						|
			| 908090			| a1@		 	| abc 								| qw 	  			| fail    				|
			| 9089089089	| Arjun   | arjun@yopmail.com 	| qwerty      | pass						|
		
  