@Regression
Feature: Budgets, Setup, Cost Centers operations

  Background:
    Given User on home page
    And   User login in to basqar
  Scenario: Cost Centers add, update and delete operations 1

    Given   User navigate to cost centers page
    When  User create a cost center
      | name    | sati123 |
      | code    | code123 |
      | type    | Service |
      | orderNo | 100     |
      | key     | key123  |
      | value   | 100     |
      | expense | 2       |

    Then  Success message should be displayed

    When  User update the cost center name as "sati123"
      | name    | sati124 |
      | code    | code124 |
      | type    | 2       |
      | orderNo | 99      |
      | key     | key124  |
      | value   | 99      |
      | expense | 3       |

    Then  Update message should be displayed

    When  User delete the cost center name as "sati124"
    Then  Delete message should be displayed