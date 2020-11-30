Feature:Salary types functionality
  Background:
    Given User on home page
    And   User login in to basqar
  @RegressionTest
Scenario:Salary types add, update and delete
  Given User navigate to salary types page
  When User create a new salary type name as "salry1230" and user type as "Teacher"
  And Success message should be displayed

  When User update the salary name "salry1230" to as "salry3210" user type as "Student"
  Then Update message should be displayed

  Then User delete the salary type name as "salry3210"
  And Delete message should be displayed

