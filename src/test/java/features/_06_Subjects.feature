Feature: Subjects functionality
  Background:
    Given User on home page
    And   User login in to basqar


  Scenario: Create ,delete a new Subject
      Given User navigate to Subjects page
      When User create a new Subjects name as "Physics" and code as "PHY1" subject catagory index 1 and style index 1
      And Success message should be displayed
      Then User delete the subject "Physics"
      And Delete message should be displayed