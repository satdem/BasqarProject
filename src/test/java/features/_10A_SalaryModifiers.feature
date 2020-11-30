Feature:Salary modifiers functionality

  Background:
    Given User on home page
    And   User login in to basqar

  Scenario: Salary modifiers add, update and delete
    Given User navigate to salary modifiers page
    When User create a new salary modifiers
      | description          | description0231     |
      | variable             | variable           |
      | modifierType         | 1                  |
      | integrationCode      | integrationCode    |
      | valueType            | 1                  |
      | priority             | 101                |
      | amount               | 10                 |
      | formula              | BASE_SALARY * 0.15 |
      | name                 | name12             |
      | formulaVariable      | variable1          |
      | modifierVariableType | 0                  |

    And salary modifier schould be created

#    Then User update the salary modifier name "description0231"
#      | description          | description12      |
#      | variable             | variable2          |
#      | modifierType         | 2                  |
#      | integrationCode      | integrationCode1   |
#      | valueType            | 2                  |
#      | priority             | 102                |
#      | amount               | 10                 |
#      | formula              | BASE_SALARY * 0.15 |
#      | name                 | name123            |
#      | formulaVariable      | variable3          |
#      | modifierVariableType | 0                  |
#    And Update message should be displayed

    Then user delete the salary modifier name "description0231"
    And Delete message should be displayed