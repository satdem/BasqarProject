Feature: Excel template functionality


  Background:
    Given User on home page
    And   User login in to basqar
  Scenario:Create ,update and delete a new excel template
      Given User navigate to excel template page
      When User create a new budget template as "ET1239" and code as "1230"
      And Success message should be displayed

      Then Update the person in excel template name "ET1239" to "ET123456" and code as 011
      And Update message should be displayed

      Then User delete the excel template  "ET123456"
      And Delete message should be displayed