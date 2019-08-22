Feature: Add TariffPlan Functionality
  I want to use this template for my feature file

  Scenario: Add TariffPlan details with valid data
    Given user should be telecom homepage
    And user should navigate to Addtariffplan page
    When user should enter plan details
   # And user reset the plan details
    And user should submit the plan details
   # Then user tariff plan details should get reset
    And user should not be displayed with congratulation you add tariffplan
