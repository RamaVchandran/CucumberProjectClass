Feature: Add Registration functionlity
  I want to use this template for my feature file

  Scenario: Register with valid data

  #Given User should be in Airline homepage
  #And User should click Register button
  # When User enter the valid details
  # And User should click the Submit button
  # Then User should get displayed with Your user name is
  Scenario: Register with valid data

  # Given User should be in Airline homepage
  # And User should click Register button
  # When User enter the valid details.
  #  | Rama | chandran | 9002568965 | ramav660@gmail.com | Tambaram | chennai | tamilnadu | 600065 | rama | rama@123 | rama@123 |
  #And User should click the Submit button
  # Then User should get displayed with Your user name is
  Scenario: Register with valid data

  #Given User should be in Airline homepage
  #And User should click Register button
  # When User enter the valid detail
  # | fname    | rama              |
  # | lname    | chandran          |
  # | phno     |       23546525623 |
  # | email    | soundar@gmail.com |
  # | address  | coimbatore        |
  #  | city     | chennai           |
  #  | state    | tamilnadu         |
  # | pincode  |            600063 |
  #  | username | rama              |
  #| password | rama@123          |
  #| confirm  | rama@123          |
  #And User should click the Submit button
  # Then User should get displayed with Your user name is
  Scenario Outline: 
    Given User should be in Airline homepage
    And User should click Register button
    When User enter the valid detail"<fname>","<lname>","<phno>","<email>","<address>","<city>","<state>","<pincode>","<password>","<confirm>"
    And User should click the Submit button
    Then User should get displayed with Your user name is

    Examples: 
      | fname    | lname | phno       | email           | address   | city    | state     | pincode | password | confirm  |
      | java     | rama  | 2345689754 | ramav@gmail.com | tamabaram | chennai | tamilnadu |  600063 | rama@123 | rama@123 |
      | selenium | rama  | 2345689754 | ramav@gmail.com | tamabaram | chennai | tamilnadu |  600063 | rama@123 | rama@123 |
      | cucumber | rama  | 2345689754 | ramav@gmail.com | tamabaram | chennai | tamilnadu |  600063 | rama@123 | rama@123 |
      | testng   | rama  | 2345689754 | ramav@gmail.com | tamabaram | chennai | tamilnadu |  600063 | rama@123 | rama@123 |
      | junit    | rama  | 2345689754 | ramav@gmail.com | tamabaram | chennai | tamilnadu |  600063 | rama@123 | rama@123 |
