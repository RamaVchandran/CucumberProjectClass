Feature: Add Registration functionlity
  I want to use this template for my feature file

  Scenario: Register with valid data
    Given User should be in Airline homepage
    And User should click Register button
    When User enter the valid details
    And User should click the Submit button
    Then User should get displayed with Your user name is

    
  Scenario: Register with valid data
    Given User should be in Airline homepage
    And User should click Register button
    When User enter the valid details.
    |Rama|chandran|9002568965|ramav660@gmail.com|Tambaram|chennai|tamilnadu|600065|rama|rama@123|rama@123|
    And User should click the Submit button
    Then User should get displayed with Your user name is
    