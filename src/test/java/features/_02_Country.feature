Feature:Country funktionality

  Background:
    Given User on home page
    And   User login in to basqar
  @RegressionTest
  Scenario:Create, edit, delete country
    Given Navigate to country
    When Create a country name as "Cad" and code as "90"
    Then Success message should be displayed

  And User edit the name "Cad" to "Egibt" and add new code as "49"
    Then Update message should be displayed

   When User delete the country name is "Egibt"
    Then Delete message should be displayed
