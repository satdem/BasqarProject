Feature: SubjectCategories functionality
  Background:
    Given User on home page
    And   User login in to basqar
  @RegressionTest
  Scenario: Create and delete a  SubjectCategory
      Given User navigate to SubjectCategories page
      When User create a new SubjectCategories as "Art" and code as "123Art"
      And Success message should be displayed
      Then User delete the SubjectCategories "Art"
      And Delete message should be displayed