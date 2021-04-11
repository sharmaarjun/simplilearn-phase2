@tag
Feature: BDD TestNG
  I want to use this template for my feature file

  #@tag1
  #Scenario: Login 
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

  @tag2 @otp
  Scenario Outline: TestingAutomation
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  				| value 	| status  |
      | correctOTP 		|  584812 | success |
      | incorrectOTP 	|  908 		| Fail    |
