Feature: Budget accounts functionality

  Background:
    Given User on home page
    And   User login in to basqar

    Scenario: Budget accounts add, update and delete

      Given User navigate to budget accounts page
      When User cretae a budget account
        | name               | sati123 |
        | code               | 1234    |
        | category           | 4       |
        | type               | Detail  |
        | parentAccountCode  | 1       |
        | closingAccountCode | 10      |
        | balanceType        | Credit  |
        | integrationCodes   | 1       |
        | currency           | EUR     |
      And Success message should be displayed


      Then User navigate to budget accounts page
      And User delete the budget accounts name "sati123" catagory 4
      Then Delete message should be displayed