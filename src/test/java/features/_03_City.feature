Feature: City functionality

  Background:
    Given User on home page
    And   User login in to basqar


  Scenario: Create , edit and delete a new city
      Given User navigate to city page
      When User select index of 1 and create a new city name as "Ankara"
      And Success message should be displayed
      Then User delete the city "Ankara"
      And Delete message should be displayed


