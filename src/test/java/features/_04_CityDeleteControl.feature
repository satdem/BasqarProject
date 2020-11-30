Feature: Country delete control

  Background:
    Given User on home page
    And   User login in to basqar

    Scenario:Country , city create and delete the country name,check if it is not deleted
      Given Navigate to country
      When Create a country name as "SOMECOUNTRY98" and code as "987"

    Given User navigate to city page
    When User select name of country "SOMECOUNTRY98" and create a new city name as "kerken"

    Given Navigate to country
    When User delete the country name is "SOMECOUNTRY98"
    Then Error message should be displayed

 # Scenario:Country , city create and delete the city and country
    Given User navigate to city page
    When User delete the city "kerken"
    Then Delete message should be displayed

    And Navigate to country
    Then User delete the country name is "SOMECOUNTRY98"
    And Delete message should be displayed