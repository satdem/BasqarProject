Feature:Salary constans functionality
  Background:
    Given User on home page
    And   User login in to basqar

  Scenario:Salary constans add, update and delete
    Given User navigate to salary constans page
    When User create a new salary constans
      | name          | sati12334    |
      | validFormDate | 2019-01-10 |
      | key           | name123key |
      | value         | 100        |
    And Success message should be displayed

    When User update the salary constans name "sati12334"
      | name          | sati12445    |
      | validFormDate | 2020-05-10 |
      | key           | name124key |
      | value         | 200        |
    Then Update message should be displayed

    Then User delete the salary constans name as "sati12445"
    And Delete message should be displayed

