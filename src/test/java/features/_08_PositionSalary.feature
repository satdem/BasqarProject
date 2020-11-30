Feature:Position salary

  Background:
    Given User on home page
    And   User login in to basqar

  @RegressionTest
  Scenario Outline: Add new position salary and delete position salary
    When Navigate to position salary
    Then Create a persen in position salary name  as "<positionName>"
    And Success message should be displayed
    And Update the person in position salary name "<oldName>" to "<newName>"
    And Update message should be displayed
    And Delete a position salary name as "<positionName1>"
    Then Delete message should be displayed
    Examples:
      | positionName | oldName     | newName      | positionName1 |
      | pasition1109  | pasition1109 | pasition209 | pasition209     |