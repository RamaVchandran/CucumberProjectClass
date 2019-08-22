Feature: Add Customer functionality
  I want to use this template for my feature file

  Scenario: add customer with valid data
   # Given user should be in telecom home page
   # And user click on add customer button
   # When user enters all the fields
   # And user click on submit button
  #  Then user should be displayed the customer id is generated

  Scenario: add customer with One Dimensional list
  #  Given user should be in telecom home page
  #  And user click on add customer button
  #  When user enters all the fields.
   #   | ajith | rajan | ramav@gmail.com | chennai | 12344556667 |
  #  And user click on submit button
   # Then user should be displayed the customer id is generated

  Scenario: add customer with One Dimensional list
   # Given user should be in telecom home page
   # And user click on add customer button
   # When user enters all the field
    #  | fname   | soundar           |
    #  | lname   | rajan             |
     # | email   | soundar@gmail.com |
    #  | address | coimbatore        |
    #  | phno    |         123456677 |
   # And user click on submit button
    #Then user should be displayed the customer id is generated

  Scenario Outline: 
    Given user should be in telecom home page
    And user click on add customer button
    When user enters all the fields"<fname>","<lname>","<email>","<address>","<phno>"
    And user click on submit button
   Then user should be displayed the customer id is generated

    Examples: 
      | fname    | lname | email           | address | phno        |
      | java     | rajan | ramav@gmail.com | chennai | 12344556667 |
      | selenium | rajan | ramav@gmail.com | chennai | 12344556667 |
      | cucumber | rajan | ramav@gmail.com | chennai | 12344556667 |
      | testng   | rajan | ramav@gmail.com | chennai | 12344556667 |
      | junit    | rajan | ramav@gmail.com | chennai | 12344556667 |
