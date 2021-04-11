@tag
 Feature: On Adding location
  I want to add desired location
  
 @tag @login
Scenario: Locate me
Given The user is on Swiggy url
When User selects required location as "chandigarh,India" from autosuggesstion
Then Restaurants from "Chandigarh" location are displayed
